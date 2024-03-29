/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.mecanicas.turno;

import Interfaces.FachadaInterfacePrincipal;
import com.cliente.AccionableAtaque;
import com.cliente.AccionableCanjePorEjercitos;
import com.cliente.AccionableCanjePorMisil;
import com.cliente.AccionableCanjeTarjetas;
import com.cliente.AccionableLanzarMisil;
import com.cliente.AccionableMovimiento;
import cliente.ClienteManager;
import cliente.control.ControlRefuerzo;
import com.cliente.AccionableFinTurno;
import com.cliente.AccionableSolicitarTarjetaPais;
import java.util.List;
import juego.Juego;
import juego.estructura.Canjeable;
import juego.estructura.GestorPaises;
import juego.estructura.GestorTarjetas;
import juego.estructura.Jugador;
import juego.estructura.Pais;
import juego.mecanicas.ataque.ControlAtaque;
import juego.mecanicas.movimiento.ControlMovimiento;
import juego.mecanicas.movimiento.ControlMovimientosJugador;
import juego.mecanicas.situacion.Situacion;

/**
 *
 * @author Santi Nievas y Daniel Nievas
 */
public class GestorTurno {

    private static GestorTurno instance;

    public static final int ETAPA_SOLO_REFUERZOS = 5;
    public static final int FUERA_TURNO = 0;
    public static final int ETAPA_INCORPORAR_EJERCITOS = 1;
    public static final int ETAPA_ATACAR = 2;
    public static final int ETAPA_REAGRUPAR = 3;
    public static final int ETAPA_SOLICITAR_TARJETA = 4;

    public static final int ACCION_ATACAR = 0;
    public static final int ACCION_SOLICITAR_TARJETA = 1;
    public static final int ACCION_INCORPORAR_EJERCITOS = 2;
    public static final int ACCION_REAGRUPAR = 3;
    public static final int ACCION_CANJEAR_TARJETA = 4;
    public static final int ACCION_CANJEAR_EJERCITO_POR_MISIL = 5;
    public static final int ACCION_FINALIZAR_TURNO = 6;

    private int etapaActual;
    private int paisesConquistados;
    private boolean canjeRealizado;
    private boolean tarjetaSolicitada;
    private boolean[][] permisos;
    private Jugador jugadorActual;
    private ControlRefuerzo refuerzoActual;
    private ControlMovimientosJugador movimientosRealizados;

    public GestorTurno() {
        etapaActual = 0;
        paisesConquistados = 0;
        canjeRealizado = false;
        tarjetaSolicitada = false;
        refuerzoActual = null;
        jugadorActual = null;
        movimientosRealizados = new ControlMovimientosJugador();
        crearPermisos();
    }

    public static GestorTurno getInstance() {
        if (instance == null) {
            instance = new GestorTurno();
        }
        return instance;
    }

    private void crearPermisos() {
        permisos = new boolean[6][7];

        permisos[ETAPA_SOLO_REFUERZOS][ACCION_INCORPORAR_EJERCITOS] = true;
        permisos[ETAPA_SOLO_REFUERZOS][ACCION_FINALIZAR_TURNO] = true;

        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_INCORPORAR_EJERCITOS] = true;
        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_CANJEAR_EJERCITO_POR_MISIL] = true;
        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_CANJEAR_TARJETA] = true;
        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_ATACAR] = true;
        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_REAGRUPAR] = true;
        permisos[ETAPA_INCORPORAR_EJERCITOS][ACCION_FINALIZAR_TURNO] = true;

        permisos[ETAPA_ATACAR][ACCION_ATACAR] = true;
        permisos[ETAPA_ATACAR][ACCION_REAGRUPAR] = true;
        permisos[ETAPA_ATACAR][ACCION_SOLICITAR_TARJETA] = true;
        permisos[ETAPA_ATACAR][ACCION_FINALIZAR_TURNO] = true;

        permisos[ETAPA_REAGRUPAR][ACCION_REAGRUPAR] = true;
        permisos[ETAPA_REAGRUPAR][ACCION_SOLICITAR_TARJETA] = true;
        permisos[ETAPA_REAGRUPAR][ACCION_FINALIZAR_TURNO] = true;

        permisos[ETAPA_SOLICITAR_TARJETA][ACCION_FINALIZAR_TURNO] = true;
    }

    public void atacar(Pais origen, Pais destino) {
        if (accionPermitida(ACCION_ATACAR)) {
            ControlAtaque control = new ControlAtaque(origen, destino);
            if (control.ataqueValido()) {
                AccionableAtaque ataque = new AccionableAtaque(origen, destino);
                ClienteManager.getInstance().registrarSalida(ataque);
                etapaActual = ETAPA_ATACAR;
            }
        }
    }

    public void canjearEjercitosPorMisil(Pais pais, int cantidadMisiles) {
        if (accionPermitida(ACCION_CANJEAR_EJERCITO_POR_MISIL)) {
            if (pais.getCantidadEjercitos() > 6 * cantidadMisiles) {
                AccionableCanjePorMisil canje = new AccionableCanjePorMisil(pais, cantidadMisiles);
                ClienteManager.getInstance().registrarSalida(canje);
            }
        }
    }

    public void canjearMisilPorEjercito(Pais pais, int cantidadMisiles) {
        if (accionPermitida(ACCION_CANJEAR_EJERCITO_POR_MISIL)) {
            if (pais.getCantidadMisiles() >= cantidadMisiles) {
                AccionableCanjePorEjercitos canje = new AccionableCanjePorEjercitos(pais, cantidadMisiles);
                ClienteManager.getInstance().registrarSalida(canje);
            }
        }
    }

    public boolean reagruparEjercitos(Pais origen, Pais destino, int cantidadEjercitos, int cantidadMisiles) {
        if (accionPermitida(ACCION_REAGRUPAR)) {
            Situacion situacion = Juego.getInstancia().getSituacion();
            ControlMovimiento control = new ControlMovimiento(origen, destino, cantidadEjercitos, cantidadMisiles, situacion, movimientosRealizados);
            if (control.movimientoValido()) {
                if (movimientosRealizados != null) {
                    movimientosRealizados.registrarMovimiento(destino, cantidadEjercitos, cantidadMisiles);
                }
                AccionableMovimiento movimiento = new AccionableMovimiento(origen, destino, cantidadEjercitos, cantidadMisiles);
                ClienteManager.getInstance().registrarSalida(movimiento);
                etapaActual = ETAPA_REAGRUPAR;
                return true;
            }
        }
        return false;
    }

    public void lanzarMisil(Pais origen, Pais destino) {
        if (accionPermitida(ACCION_ATACAR)) {
            if (origen.getCantidadMisiles() > destino.getCantidadMisiles() && GestorPaises.calcularDistancia(origen, destino) <= 3 && GestorPaises.calcularDistancia(origen, destino) != 0 && Juego.getInstancia().getSituacion().puedeAtacar(origen.getJugador())) {
                AccionableLanzarMisil lanzamiento = new AccionableLanzarMisil(origen, destino);
                ClienteManager.getInstance().registrarSalida(lanzamiento);
                etapaActual = ETAPA_ATACAR;
            }
        }
    }

    public void canjearTarjetas(Jugador jugador, List<Canjeable> listaTarjetas) {
        if (accionPermitida(ACCION_CANJEAR_TARJETA) && !canjeRealizado) {
            if (GestorTarjetas.canjeValido(jugador, listaTarjetas)) {
                AccionableCanjeTarjetas canje = new AccionableCanjeTarjetas(jugador, listaTarjetas);
                ClienteManager.getInstance().registrarSalida(canje);
                canjeRealizado = true;
            }
        }
    }

    public void solicitarTarjeta() {
        Jugador jugador = getJugadorActual();
        if (puedePedirTarjetaPais()) {
            AccionableSolicitarTarjetaPais solicitar = new AccionableSolicitarTarjetaPais(jugador);
            ClienteManager.getInstance().registrarSalida(solicitar);
            tarjetaSolicitada = true;
            etapaActual = ETAPA_SOLICITAR_TARJETA;
            FachadaInterfacePrincipal.actualizarEstadoBotones();
        }
    }

    public boolean accionPermitida(int accion) {
        return permisos[etapaActual][accion];
    }

    public void finTurno() {
        etapaActual = 0;
        paisesConquistados = 0;
        canjeRealizado = false;
        tarjetaSolicitada = false;
        refuerzoActual = null;
        AccionableFinTurno accionable = new AccionableFinTurno();
        ClienteManager.getInstance().registrarSalida(accionable);
    }

    public void registrarPaisConquistado() {
        paisesConquistados++;
    }

    public ControlRefuerzo getRefuerzoActual() {
        return refuerzoActual;
    }

    public void setRefuerzoActual(ControlRefuerzo control) {
        refuerzoActual = control;
        FachadaInterfacePrincipal.iniciarAgregadoRefuerzo();
    }

    public void permitirAtaque() {
        etapaActual = ETAPA_ATACAR;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public int getEtapaActual() {
        return etapaActual;
    }

    public void setEtapaActual(int etapaActual) {
        this.etapaActual = etapaActual;
    }

    public ControlMovimientosJugador getMovimientosRealizados() {
        return movimientosRealizados;
    }

    public void setMovimientosRealizados(ControlMovimientosJugador movimientosRealizados) {
        this.movimientosRealizados = movimientosRealizados;
    }

    public void comenzarReagrupacion() {
        movimientosRealizados = new ControlMovimientosJugador();
        this.etapaActual = ETAPA_REAGRUPAR;
    }

    public void movimientoPaisGanado(Pais origen, Pais destino, int cantidadEjercitos) {
        AccionableMovimiento movimiento = new AccionableMovimiento(origen, destino, cantidadEjercitos, 0);
        ClienteManager.getInstance().registrarSalida(movimiento);
    }

    public boolean puedePedirTarjetaPais() {
        Jugador jugador = getJugadorActual();
        if (accionPermitida(ACCION_SOLICITAR_TARJETA) && !tarjetaSolicitada && jugador.getCantidadTarjetasPais() < 6 && Juego.getInstancia().getSituacion().puedeObtenerTarjetaPais(jugador)) {
            int canjesRealizados = jugador.getCantidadCanjes();
            boolean res = false;
            if (canjesRealizados < 3 && paisesConquistados > 0) {
                res = true;
            }
            if (canjesRealizados > 3 && paisesConquistados > 1) {
                res = true;
            }
            return res;
        }
        return false;
    }

}
