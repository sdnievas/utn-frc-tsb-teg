/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servidor;

import Interfaces.FachadaInterfacePrincipal;
import cliente.ClienteManager;
import com.Accionable;
import juego.Juego;
import juego.mecanicas.situacion.Situacion;
import logger.LogItem;
import servidor.ServerManager;

/**
 *
 * @author Daniel
 */
public class AccionableSituacion implements Accionable {

    private final Situacion situacion;

    public AccionableSituacion(Situacion situacion) {
        this.situacion = situacion;
        ServerManager.getInstance().getLogger().addLogItem(new LogItem(situacion.toString()));
    }

    @Override
    public void accionar() {
        ClienteManager.getInstance().getJuego().setSituacion(situacion);
        FachadaInterfacePrincipal.mostrarTarjetaSituacion();
    }
}
