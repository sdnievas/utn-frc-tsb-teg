package Interfaces;


import java.awt.Color;
import java.awt.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import juego.estructura.Pais;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emanuel
 */
public class Mapa extends javax.swing.JPanel {
    private ImageIcon imagen;
    private InterfacePrincipal principal;
    /**
     * Creates new form Mapa
     */
    public Mapa(InterfacePrincipal principal) {
        initComponents();  
        panelCentroAmerica.setSize(200, 115);
        this.principal = principal;
       
      
   }
   private void cargarFichaEnPais(JLabel label, Color col, int cantidad){
        String color;        
        String rutaImagen;
        if(cantidad == 0){
            rutaImagen = "/imagenes/fichas/fichaGenericaTransparente.png";
        }
        else{
            if(col.equals(Color.RED)){
            color = "Roja";
            }
            else{
                if(col.equals(Color.BLUE)){
                    color = "Azul";
                }
                else{
                    if(col.equals(Color.black)){
                        color = "Negra";
                    }
                    else{
                        if(col.equals(Color.WHITE)){
                            color = "Blanca";                    
                        }
                        else{
                            if(col.equals(Color.green)){
                                color = "Verde";
                            }
                            else{
                                color = "Amarilla";
                            }
                        }
                    }
                }
            }
            rutaImagen= "/imagenes/fichas/ficha"+color+cantidad+".png";
        }
        try{
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagen)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
  
    public void actualizarFichas(ArrayList<Pais> paises){
        Component[] componentes = this.getComponents();        
        for(Pais pais : paises){
            for(int i=0; i<componentes.length;i++){ 
              
                Component[] hijos = new Component[0];
                if(componentes[i] instanceof JLabel) 
                { 
                    JLabel label = ((JLabel) componentes[i]);
                    if(label.getName()!=null && pais.getNombre().trim().equalsIgnoreCase(label.getName().trim())){
                           cargarFichaEnPais(label, pais.getJugador().getColor(), pais.getCantidadEjercitos());
                    }
                } 
                else{
                    if(componentes[i] instanceof JPanel){
                        JPanel panel = ((JPanel) componentes[i]);
                        hijos = panel.getComponents();
                    } 
                }
                for(int j = 0 ; j<hijos.length; j++){      
                     
                    if(hijos[j] instanceof JLabel) {                      
                         JLabel label2= ((JLabel) hijos[j]);
                         if(label2.getName()!=null && pais.getNombre().trim().equalsIgnoreCase(label2.getName().trim())){
                               cargarFichaEnPais(label2, pais.getJugador().getColor(), pais.getCantidadEjercitos());
                         }
                    }
                    
                }
               
            }
        }

    }
    private Pais obtenerPais(ArrayList<Pais> paises,String nombre){
        for(Pais pais : paises){
            if(pais.getNombre().equalsIgnoreCase(nombre))return pais;
        }
        return null;
    }
    private void mostrarFichas(){
        Component[] componentes = this.getComponents();        
         for(int i=0; i<componentes.length;i++){ 
                Component[] hijos = new Component[0];
                if(componentes[i] instanceof JLabel) 
                { 
                    JLabel label = ((JLabel) componentes[i]);
                    if(label.getName()!= null){
                           label.setVisible(true);
                    }
                } 
                else{
                    if(componentes[i] instanceof JPanel){
                        JPanel panel = ((JPanel) componentes[i]);
                        hijos = panel.getComponents();
                    } 
                }
                for(int j = 0 ; j<hijos.length; j++){      
                     
                    if(hijos[j] instanceof JLabel) {                      
                         JLabel label2= ((JLabel) hijos[j]);
                         if(label2.getName()!= null){
                               label2.setVisible(true);
                         }
                    }
                    
                }
               
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAmericaDelNorrte = new javax.swing.JPanel();
        lblLabrador = new javax.swing.JLabel();
        lblAlaska = new javax.swing.JLabel();
        lblTerranova = new javax.swing.JLabel();
        lblNewYork = new javax.swing.JLabel();
        lblGroenlandia = new javax.swing.JLabel();
        lblCanada = new javax.swing.JLabel();
        lblIslaVictoria = new javax.swing.JLabel();
        lblLasVegas = new javax.swing.JLabel();
        lblOregon = new javax.swing.JLabel();
        lblChicago = new javax.swing.JLabel();
        lblCalifornia = new javax.swing.JLabel();
        lblFlorida = new javax.swing.JLabel();
        lblFichaAlaska = new javax.swing.JLabel();
        lblFichaCanda = new javax.swing.JLabel();
        lblFichaOregon = new javax.swing.JLabel();
        lblFichaTerranova = new javax.swing.JLabel();
        lblFichaIslaVictoria = new javax.swing.JLabel();
        lblFichaLabrador = new javax.swing.JLabel();
        lblFichaGroenlandia = new javax.swing.JLabel();
        lblFichaNuevaYork = new javax.swing.JLabel();
        lblFichaChicago = new javax.swing.JLabel();
        lblFichaLasVegas = new javax.swing.JLabel();
        lblFichaFlorida = new javax.swing.JLabel();
        lblFichaCalifornia = new javax.swing.JLabel();
        lblFichaIslandia = new javax.swing.JLabel();
        lblFichaNoruega = new javax.swing.JLabel();
        lblFichaBielorrusia = new javax.swing.JLabel();
        lblFichaIrlanda = new javax.swing.JLabel();
        lblFichaGranBretaña = new javax.swing.JLabel();
        lblFichaFrancia = new javax.swing.JLabel();
        lblFichaEspaña = new javax.swing.JLabel();
        lblFichaPortugal = new javax.swing.JLabel();
        lblFichaUcrania = new javax.swing.JLabel();
        lblFichaCroacia = new javax.swing.JLabel();
        lblFichaItalia = new javax.swing.JLabel();
        lblFichaPolonia = new javax.swing.JLabel();
        lblFichaAlemania = new javax.swing.JLabel();
        lblFichaSerbia = new javax.swing.JLabel();
        lblFichaAlbania = new javax.swing.JLabel();
        lblFichaFinlandia = new javax.swing.JLabel();
        lblIslandia = new javax.swing.JLabel();
        panelCentroAmerica = new javax.swing.JPanel();
        lblMexico = new javax.swing.JLabel();
        lblHonduras = new javax.swing.JLabel();
        lblElSalvador = new javax.swing.JLabel();
        lblNicaragua = new javax.swing.JLabel();
        lblCuba = new javax.swing.JLabel();
        lblJamaica = new javax.swing.JLabel();
        lblFichaMexico = new javax.swing.JLabel();
        lblFichaHonduras = new javax.swing.JLabel();
        lblFichaElSalvador = new javax.swing.JLabel();
        lblFichaNicaragua = new javax.swing.JLabel();
        lblFichaJamaica = new javax.swing.JLabel();
        lblFichaCuba = new javax.swing.JLabel();
        panelAmericaDelSur = new javax.swing.JPanel();
        lblColombia = new javax.swing.JLabel();
        lblArgentina = new javax.swing.JLabel();
        lblVenezuela = new javax.swing.JLabel();
        lblBrasil = new javax.swing.JLabel();
        lblBolivia = new javax.swing.JLabel();
        lblParaguay = new javax.swing.JLabel();
        lblChile = new javax.swing.JLabel();
        lblUruguay = new javax.swing.JLabel();
        lblFichaColombia = new javax.swing.JLabel();
        lblFichaVenezuela = new javax.swing.JLabel();
        lblFichaBrasil = new javax.swing.JLabel();
        lblFichaParaguay = new javax.swing.JLabel();
        lblFichaUruguay = new javax.swing.JLabel();
        lblFichaArgentina = new javax.swing.JLabel();
        lblFichaBolivia = new javax.swing.JLabel();
        lblFichaChile = new javax.swing.JLabel();
        panelAfrica = new javax.swing.JPanel();
        lblSahara = new javax.swing.JLabel();
        lblEgipto = new javax.swing.JLabel();
        lblEtiopia = new javax.swing.JLabel();
        lblNigeria = new javax.swing.JLabel();
        lblAngola = new javax.swing.JLabel();
        lblMauritania = new javax.swing.JLabel();
        lblSudafrica = new javax.swing.JLabel();
        lblMadagascar = new javax.swing.JLabel();
        lblFichaSahara = new javax.swing.JLabel();
        lblFichaEgipto = new javax.swing.JLabel();
        lblFichaEtiopia = new javax.swing.JLabel();
        lblFichaNigeria = new javax.swing.JLabel();
        lblFichaAngola = new javax.swing.JLabel();
        lblFichaMauritania = new javax.swing.JLabel();
        lblFichaSudafrica = new javax.swing.JLabel();
        lblFichaMadagascar = new javax.swing.JLabel();
        panelAsia = new javax.swing.JPanel();
        lblIndia = new javax.swing.JLabel();
        lblVietnam = new javax.swing.JLabel();
        lblMalasia = new javax.swing.JLabel();
        lblCorea = new javax.swing.JLabel();
        lblJapon = new javax.swing.JLabel();
        lblKamtchatka = new javax.swing.JLabel();
        lblChukchi = new javax.swing.JLabel();
        lblChina = new javax.swing.JLabel();
        lblTurquia = new javax.swing.JLabel();
        lblArabia = new javax.swing.JLabel();
        lblIsrael = new javax.swing.JLabel();
        lblIran = new javax.swing.JLabel();
        lblRusia = new javax.swing.JLabel();
        lblChechenia = new javax.swing.JLabel();
        lblSiberia = new javax.swing.JLabel();
        lblFichaChukChi = new javax.swing.JLabel();
        lblFichaKamtchatcka = new javax.swing.JLabel();
        lblFichaSiberia = new javax.swing.JLabel();
        lblFichaChina = new javax.swing.JLabel();
        lblFichaChechenia = new javax.swing.JLabel();
        lblFichaCorea = new javax.swing.JLabel();
        lblFichaMalasia = new javax.swing.JLabel();
        lblFichaRusia = new javax.swing.JLabel();
        lblFichaIran = new javax.swing.JLabel();
        lblFichaTurquia = new javax.swing.JLabel();
        lblFichaVietnam = new javax.swing.JLabel();
        lblFichaIndia = new javax.swing.JLabel();
        lblFichaIsrael = new javax.swing.JLabel();
        lblFichaArabia = new javax.swing.JLabel();
        lblFichaJapon = new javax.swing.JLabel();
        panelOceania = new javax.swing.JPanel();
        lblSumatra = new javax.swing.JLabel();
        lblFilipinas = new javax.swing.JLabel();
        lblTonga = new javax.swing.JLabel();
        lblAustralia = new javax.swing.JLabel();
        lblTasmania = new javax.swing.JLabel();
        lblNuevaZelandia = new javax.swing.JLabel();
        lblFichaSumatra = new javax.swing.JLabel();
        lblFichaFilipinas = new javax.swing.JLabel();
        lblFichaTonga = new javax.swing.JLabel();
        lblFichaAustralia = new javax.swing.JLabel();
        lblFichaTasmania = new javax.swing.JLabel();
        lblFichaNuevaZelandia = new javax.swing.JLabel();
        panelAsia2 = new javax.swing.JPanel();
        lblIrak = new javax.swing.JLabel();
        lblFichaIrak = new javax.swing.JLabel();
        lblUcrania = new javax.swing.JLabel();
        lblPolonia = new javax.swing.JLabel();
        lblSerbia = new javax.swing.JLabel();
        lblFinlandia = new javax.swing.JLabel();
        lblNoruega = new javax.swing.JLabel();
        lblGranBretaña = new javax.swing.JLabel();
        lblIrlanda = new javax.swing.JLabel();
        lblAlemania = new javax.swing.JLabel();
        lblFrancia = new javax.swing.JLabel();
        lblEspaña = new javax.swing.JLabel();
        lblPortugal = new javax.swing.JLabel();
        lblItalia = new javax.swing.JLabel();
        lblCroacia = new javax.swing.JLabel();
        lblAlbania = new javax.swing.JLabel();
        lblBielorrusia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAmericaDelNorrte.setEnabled(false);
        panelAmericaDelNorrte.setOpaque(false);
        panelAmericaDelNorrte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelNorrte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLabrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLabradorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLabradorMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblLabrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 70, 20));

        lblAlaska.setToolTipText("");
        lblAlaska.setName(""); // NOI18N
        lblAlaska.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlaskaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlaskaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblAlaska, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        lblTerranova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTerranovaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTerranovaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblTerranova, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 90, 80, 76));

        lblNewYork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewYorkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewYorkMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblNewYork, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 94, 60));

        lblGroenlandia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGroenlandiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGroenlandiaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblGroenlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 106, 50));

        lblCanada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanadaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCanadaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblCanada, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 60, 80, 59));

        lblIslaVictoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIslaVictoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIslaVictoriaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblIslaVictoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 83, 37));

        lblLasVegas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLasVegasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLasVegasMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblLasVegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 77, 41));

        lblOregon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOregonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOregonMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblOregon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 88, 56));

        lblChicago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChicagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChicagoMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblChicago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 48, 34));

        lblCalifornia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCaliforniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCaliforniaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblCalifornia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));

        lblFlorida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFloridaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFloridaMouseEntered(evt);
            }
        });
        panelAmericaDelNorrte.add(lblFlorida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 61, 19));

        lblFichaAlaska.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja6.png"))); // NOI18N
        lblFichaAlaska.setName("Alaska"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaAlaska, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 15, 30, 30));

        lblFichaCanda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFichaCanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja5.png"))); // NOI18N
        lblFichaCanda.setToolTipText("");
        lblFichaCanda.setName("Canada"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaCanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblFichaOregon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja4.png"))); // NOI18N
        lblFichaOregon.setName("Oregon"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaOregon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 145, -1, 40));

        lblFichaTerranova.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja3.png"))); // NOI18N
        lblFichaTerranova.setName("Terranova"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaTerranova, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 115, 40, 40));

        lblFichaIslaVictoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja2.png"))); // NOI18N
        lblFichaIslaVictoria.setName("IslaVictoria"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaIslaVictoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 5, 40, 40));

        lblFichaLabrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja1.png"))); // NOI18N
        lblFichaLabrador.setName("Labrador"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaLabrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 30, 30));

        lblFichaGroenlandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja10.png"))); // NOI18N
        lblFichaGroenlandia.setName("Groenlandia"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaGroenlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lblFichaNuevaYork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja9.png"))); // NOI18N
        lblFichaNuevaYork.setName("NuevaYork"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaNuevaYork, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        lblFichaChicago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja6.png"))); // NOI18N
        lblFichaChicago.setName("Chicago"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaChicago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 165, 30, 40));

        lblFichaLasVegas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja3.png"))); // NOI18N
        lblFichaLasVegas.setName("LasVegas"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaLasVegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, 30, 40));

        lblFichaFlorida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja2.png"))); // NOI18N
        lblFichaFlorida.setName("Florida"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaFlorida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, -1, 30));

        lblFichaCalifornia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja1.png"))); // NOI18N
        lblFichaCalifornia.setName("California"); // NOI18N
        panelAmericaDelNorrte.add(lblFichaCalifornia, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 235, 30, 40));

        add(panelAmericaDelNorrte, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 21, 360, 270));

        lblFichaIslandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaGenericaTransparente.png"))); // NOI18N
        lblFichaIslandia.setName("Islandia"); // NOI18N
        add(lblFichaIslandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 40, 40));

        lblFichaNoruega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde4.png"))); // NOI18N
        lblFichaNoruega.setName("Noruega"); // NOI18N
        add(lblFichaNoruega, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 105, 70, 60));

        lblFichaBielorrusia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde3.png"))); // NOI18N
        lblFichaBielorrusia.setName("Bielorrusia"); // NOI18N
        add(lblFichaBielorrusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        lblFichaIrlanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde6.png"))); // NOI18N
        lblFichaIrlanda.setName("Irlanda"); // NOI18N
        add(lblFichaIrlanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 205, 30, 40));

        lblFichaGranBretaña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde7.png"))); // NOI18N
        lblFichaGranBretaña.setName("GranBretaña"); // NOI18N
        add(lblFichaGranBretaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        lblFichaFrancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde1.png"))); // NOI18N
        lblFichaFrancia.setName("Francia"); // NOI18N
        add(lblFichaFrancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 295, -1, 30));

        lblFichaEspaña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde2.png"))); // NOI18N
        lblFichaEspaña.setName("España"); // NOI18N
        add(lblFichaEspaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 355, 50, 30));

        lblFichaPortugal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde5.png"))); // NOI18N
        lblFichaPortugal.setName("Portugal"); // NOI18N
        add(lblFichaPortugal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 30, -1));

        lblFichaUcrania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde7.png"))); // NOI18N
        lblFichaUcrania.setName("Ucrania"); // NOI18N
        add(lblFichaUcrania, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 185, -1, 50));

        lblFichaCroacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde8.png"))); // NOI18N
        lblFichaCroacia.setName("Croacia"); // NOI18N
        add(lblFichaCroacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 305, 30, 50));

        lblFichaItalia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde9.png"))); // NOI18N
        lblFichaItalia.setName("Italia"); // NOI18N
        add(lblFichaItalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 335, 30, 40));

        lblFichaPolonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde3.png"))); // NOI18N
        lblFichaPolonia.setName("Polonia"); // NOI18N
        add(lblFichaPolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 215, 30, 40));

        lblFichaAlemania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde10.png"))); // NOI18N
        lblFichaAlemania.setName("Alemania"); // NOI18N
        add(lblFichaAlemania, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 235, 30, 50));

        lblFichaSerbia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde7.png"))); // NOI18N
        lblFichaSerbia.setName("Serbia"); // NOI18N
        add(lblFichaSerbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 255, 30, 40));

        lblFichaAlbania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde4.png"))); // NOI18N
        lblFichaAlbania.setName("Albania"); // NOI18N
        add(lblFichaAlbania, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 275, 30, 40));

        lblFichaFinlandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaVerde7.png"))); // NOI18N
        lblFichaFinlandia.setName("Finlandia"); // NOI18N
        add(lblFichaFinlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 30, 40));

        lblIslandia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIslandiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIslandiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblIslandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 70, 64));

        panelCentroAmerica.setOpaque(false);
        panelCentroAmerica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMexico.setName(""); // NOI18N
        lblMexico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMexicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMexicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblMexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        lblHonduras.setName(""); // NOI18N
        lblHonduras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHondurasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHondurasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblHonduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 30, 30));

        lblElSalvador.setName(""); // NOI18N
        lblElSalvador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElSalvadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblElSalvadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblElSalvador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 40, 20));

        lblNicaragua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNicaraguaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNicaraguaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblNicaragua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 40));

        lblCuba.setName(""); // NOI18N
        lblCuba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCubaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCubaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblCuba, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 20));

        lblJamaica.setName(""); // NOI18N
        lblJamaica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJamaicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJamaicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelCentroAmerica.add(lblJamaica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, 40));

        lblFichaMexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul7.png"))); // NOI18N
        lblFichaMexico.setName("Mexico"); // NOI18N
        panelCentroAmerica.add(lblFichaMexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, 30));

        lblFichaHonduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul6.png"))); // NOI18N
        lblFichaHonduras.setName("Honduras"); // NOI18N
        panelCentroAmerica.add(lblFichaHonduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        lblFichaElSalvador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul4.png"))); // NOI18N
        lblFichaElSalvador.setName("ElSalvador"); // NOI18N
        panelCentroAmerica.add(lblFichaElSalvador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 30, -1));

        lblFichaNicaragua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul7.png"))); // NOI18N
        lblFichaNicaragua.setName("Nicaragua"); // NOI18N
        panelCentroAmerica.add(lblFichaNicaragua, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, 30, 40));

        lblFichaJamaica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul4.png"))); // NOI18N
        lblFichaJamaica.setName("Jamaica"); // NOI18N
        panelCentroAmerica.add(lblFichaJamaica, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 65, 30, 40));

        lblFichaCuba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul8.png"))); // NOI18N
        lblFichaCuba.setName("Cuba"); // NOI18N
        panelCentroAmerica.add(lblFichaCuba, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -5, -1, 40));

        add(panelCentroAmerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 217, 140));

        panelAmericaDelSur.setOpaque(false);
        panelAmericaDelSur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblColombia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblColombiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblColombiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblColombiaMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblColombia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 100, 50));

        lblArgentina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArgentinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblArgentinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblArgentina, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 30, 80));

        lblVenezuela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVenezuelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVenezuelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblColombiaMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblVenezuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 50));

        lblBrasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBrasilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBrasilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblColombiaMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblBrasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, 50));

        lblBolivia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBoliviaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBoliviaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblBolivia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 40, 40));

        lblParaguay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblParaguayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParaguayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblParaguay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 40, 40));

        lblChile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblChile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 30, 90));

        lblUruguay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUruguayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUruguayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAmericaDelSur.add(lblUruguay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 30));

        lblFichaColombia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla1.png"))); // NOI18N
        lblFichaColombia.setName("Colombia"); // NOI18N
        panelAmericaDelSur.add(lblFichaColombia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 15, 30, 50));

        lblFichaVenezuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla10.png"))); // NOI18N
        lblFichaVenezuela.setName("Venezuela"); // NOI18N
        panelAmericaDelSur.add(lblFichaVenezuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 40, 30));

        lblFichaBrasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla3.png"))); // NOI18N
        lblFichaBrasil.setName("Brasil"); // NOI18N
        panelAmericaDelSur.add(lblFichaBrasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, 40, 40));

        lblFichaParaguay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla6.png"))); // NOI18N
        lblFichaParaguay.setName("Paraguay"); // NOI18N
        panelAmericaDelSur.add(lblFichaParaguay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 125, 30, 40));

        lblFichaUruguay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla5.png"))); // NOI18N
        lblFichaUruguay.setName("Uruguay"); // NOI18N
        panelAmericaDelSur.add(lblFichaUruguay, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 165, 30, 40));

        lblFichaArgentina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla2.png"))); // NOI18N
        lblFichaArgentina.setName("Argentina"); // NOI18N
        panelAmericaDelSur.add(lblFichaArgentina, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 175, 30, 40));

        lblFichaBolivia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla4.png"))); // NOI18N
        lblFichaBolivia.setName("Bolivia"); // NOI18N
        panelAmericaDelSur.add(lblFichaBolivia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 30, -1));

        lblFichaChile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla9.png"))); // NOI18N
        lblFichaChile.setName("Chile"); // NOI18N
        panelAmericaDelSur.add(lblFichaChile, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 135, -1, 40));

        add(panelAmericaDelSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 430, 240, 280));

        panelAfrica.setOpaque(false);
        panelAfrica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSahara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaharaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSaharaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblSahara, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 70, 80));

        lblEgipto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEgiptoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEgiptoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblEgipto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 16, 100, 40));

        lblEtiopia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEtiopiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEtiopiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblEtiopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 64, 100, 30));

        lblNigeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNigeriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNigeriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblNigeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, 40));

        lblAngola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAngolaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAngolaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblAngola, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 70, 30));

        lblMauritania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMauritaniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMauritaniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblMauritania, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 70, 30));

        lblSudafrica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSudafricaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSudafricaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblSudafrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 50, 50));

        lblMadagascar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMadagascarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMadagascarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAfrica.add(lblMadagascar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 50));

        lblFichaSahara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra10.png"))); // NOI18N
        lblFichaSahara.setName("Sahara"); // NOI18N
        panelAfrica.add(lblFichaSahara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, 30, 40));

        lblFichaEgipto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra8.png"))); // NOI18N
        lblFichaEgipto.setName("Egipto"); // NOI18N
        panelAfrica.add(lblFichaEgipto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblFichaEtiopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra7.png"))); // NOI18N
        lblFichaEtiopia.setName("Etiopia"); // NOI18N
        panelAfrica.add(lblFichaEtiopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lblFichaNigeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra6.png"))); // NOI18N
        lblFichaNigeria.setName("Nigeria"); // NOI18N
        panelAfrica.add(lblFichaNigeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, -1, 40));

        lblFichaAngola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra8.png"))); // NOI18N
        lblFichaAngola.setName("Angola"); // NOI18N
        panelAfrica.add(lblFichaAngola, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, -1, 40));

        lblFichaMauritania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra10.png"))); // NOI18N
        lblFichaMauritania.setName("Mauritania"); // NOI18N
        panelAfrica.add(lblFichaMauritania, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 30, -1));

        lblFichaSudafrica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra7.png"))); // NOI18N
        lblFichaSudafrica.setName("Sudafrica"); // NOI18N
        panelAfrica.add(lblFichaSudafrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 180, 30, 30));

        lblFichaMadagascar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra9.png"))); // NOI18N
        lblFichaMadagascar.setName("Madagascar"); // NOI18N
        panelAfrica.add(lblFichaMadagascar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 165, 30, 30));

        add(panelAfrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 280, 240));

        panelAsia.setOpaque(false);
        panelAsia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIndia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIndiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIndiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 36, 58));

        lblVietnam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVietnamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVietnamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblVietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 70, 70));

        lblMalasia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMalasiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMalasiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblMalasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 264, 50, 50));

        lblCorea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCoreaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCoreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblCorea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 50, 80));

        lblJapon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJaponMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJaponMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblJapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 20, 90));

        lblKamtchatka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKamtchatkaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKamtchatkaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblKamtchatka, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, 100));

        lblChukchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChukchiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChukchiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblChukchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 40));

        lblChina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblChina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 130));

        lblTurquia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTurquiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTurquiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblTurquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 40, 50));

        lblArabia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArabiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblArabiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblArabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 50, 50));

        lblIsrael.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIsraelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIsraelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblIsrael, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 40, 50));

        lblIran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblIran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 30, 40));

        lblRusia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRusiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRusiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblRusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 70));

        lblChechenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChecheniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChecheniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblChechenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, 50));

        lblSiberia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiberiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSiberiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelAsia.add(lblSiberia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        lblFichaChukChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul5.png"))); // NOI18N
        lblFichaChukChi.setName("Chukchi"); // NOI18N
        panelAsia.add(lblFichaChukChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 30));

        lblFichaKamtchatcka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul6.png"))); // NOI18N
        lblFichaKamtchatcka.setName("Kamtchatcka"); // NOI18N
        panelAsia.add(lblFichaKamtchatcka, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        lblFichaSiberia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAzul7.png"))); // NOI18N
        lblFichaSiberia.setName("Siberia"); // NOI18N
        panelAsia.add(lblFichaSiberia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 30, 40));

        lblFichaChina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla4.png"))); // NOI18N
        lblFichaChina.setName("China"); // NOI18N
        panelAsia.add(lblFichaChina, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 155, -1, 40));

        lblFichaChechenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla9.png"))); // NOI18N
        lblFichaChechenia.setName("Chechenia"); // NOI18N
        panelAsia.add(lblFichaChechenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 30, -1));

        lblFichaCorea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla7.png"))); // NOI18N
        lblFichaCorea.setName("Corea"); // NOI18N
        panelAsia.add(lblFichaCorea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 30, -1));

        lblFichaMalasia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca2.png"))); // NOI18N
        lblFichaMalasia.setName("Malasia"); // NOI18N
        panelAsia.add(lblFichaMalasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 265, 30, 40));

        lblFichaRusia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaNegra4.png"))); // NOI18N
        lblFichaRusia.setName("Rusia"); // NOI18N
        panelAsia.add(lblFichaRusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 135, -1, 30));

        lblFichaIran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja5.png"))); // NOI18N
        lblFichaIran.setName("Iran"); // NOI18N
        panelAsia.add(lblFichaIran, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 195, 30, 50));

        lblFichaTurquia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja5.png"))); // NOI18N
        lblFichaTurquia.setName("Turquia"); // NOI18N
        panelAsia.add(lblFichaTurquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 295, 30, 40));

        lblFichaVietnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja7.png"))); // NOI18N
        lblFichaVietnam.setName("Vietnam"); // NOI18N
        panelAsia.add(lblFichaVietnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 315, 30, 40));

        lblFichaIndia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja9.png"))); // NOI18N
        lblFichaIndia.setName("India"); // NOI18N
        panelAsia.add(lblFichaIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 335, -1, 40));

        lblFichaIsrael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca4.png"))); // NOI18N
        lblFichaIsrael.setName("Israel"); // NOI18N
        panelAsia.add(lblFichaIsrael, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, 40));

        lblFichaArabia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca9.png"))); // NOI18N
        lblFichaArabia.setName("Arabia"); // NOI18N
        panelAsia.add(lblFichaArabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, -1, 30));

        lblFichaJapon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaAmarilla3.png"))); // NOI18N
        lblFichaJapon.setName("Japon"); // NOI18N
        panelAsia.add(lblFichaJapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 175, 30, 30));

        add(panelAsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 280, 430));

        panelOceania.setOpaque(false);
        panelOceania.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSumatra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSumatraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSumatraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblSumatra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 49, 36));

        lblFilipinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFilipinasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFilipinasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblFilipinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 1, 50, 40));

        lblTonga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTongaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTongaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblTonga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, 45));

        lblAustralia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAustraliaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAustraliaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblAustralia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 131, 71));

        lblTasmania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTasmaniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTasmaniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblTasmania, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 60, 23));

        lblNuevaZelandia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevaZelandiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevaZelandiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        panelOceania.add(lblNuevaZelandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 205, 100, 35));

        lblFichaSumatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca8.png"))); // NOI18N
        lblFichaSumatra.setName("Sumatra"); // NOI18N
        panelOceania.add(lblFichaSumatra, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 45, 30, 30));

        lblFichaFilipinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca8.png"))); // NOI18N
        lblFichaFilipinas.setName("Filipinas"); // NOI18N
        panelOceania.add(lblFichaFilipinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 5, -1, 40));

        lblFichaTonga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca9.png"))); // NOI18N
        lblFichaTonga.setName("Tonga"); // NOI18N
        panelOceania.add(lblFichaTonga, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 35, -1, 40));

        lblFichaAustralia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca5.png"))); // NOI18N
        lblFichaAustralia.setName("Australia"); // NOI18N
        panelOceania.add(lblFichaAustralia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 30, -1));

        lblFichaTasmania.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca7.png"))); // NOI18N
        lblFichaTasmania.setName("Tasmania"); // NOI18N
        panelOceania.add(lblFichaTasmania, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, 30, 50));

        lblFichaNuevaZelandia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaBlanca5.png"))); // NOI18N
        lblFichaNuevaZelandia.setName("NuevaZelandia"); // NOI18N
        panelOceania.add(lblFichaNuevaZelandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, -1, 30));

        add(panelOceania, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 230, 240));

        panelAsia2.setOpaque(false);

        lblIrak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIrakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIrakMouseEntered(evt);
            }
        });

        lblFichaIrak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichas/fichaRoja8.png"))); // NOI18N
        lblFichaIrak.setName("Irak"); // NOI18N

        javax.swing.GroupLayout panelAsia2Layout = new javax.swing.GroupLayout(panelAsia2);
        panelAsia2.setLayout(panelAsia2Layout);
        panelAsia2Layout.setHorizontalGroup(
            panelAsia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsia2Layout.createSequentialGroup()
                .addGroup(panelAsia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIrak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichaIrak))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelAsia2Layout.setVerticalGroup(
            panelAsia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIrak, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFichaIrak)
                .addGap(31, 31, 31))
        );

        add(panelAsia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 40, 80));

        lblUcrania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUcraniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUcraniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblUcrania, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 40, 60));

        lblPolonia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPoloniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPoloniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblPolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 50, 40));

        lblSerbia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSerbiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSerbiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblSerbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 50, 30));

        lblFinlandia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinlandiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFinlandiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblFinlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 50, 60));

        lblNoruega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoruegaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNoruegaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblNoruega, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, 80));

        lblGranBretaña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGranBretañaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGranBretañaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblGranBretaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 40, 70));

        lblIrlanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIrlandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIrlandaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblIrlanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 40, 40));

        lblAlemania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlemaniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlemaniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblAlemania, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 70));

        lblFrancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFranciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFranciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblFrancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 40, 60));

        lblEspaña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEspañaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEspañaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblEspaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 60, 60));

        lblPortugal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPortugalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPortugalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblPortugal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 20, 70));

        lblItalia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItaliaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblItaliaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblItalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 30, 70));

        lblCroacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCroaciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCroaciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblCroacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 30, 50));

        lblAlbania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlbaniaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlbaniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblAlbania, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 40, 70));

        lblBielorrusia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBielorrusiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBielorrusiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJaponMouseExited(evt);
            }
        });
        add(lblBielorrusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 30, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teg3.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAlaskaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlaskaMouseClicked
         JOptionPane.showMessageDialog(this,"Alaska gil");
    }//GEN-LAST:event_lblAlaskaMouseClicked

    private void lblCanadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanadaMouseClicked
        JOptionPane.showMessageDialog(this,"Canada gil");
    }//GEN-LAST:event_lblCanadaMouseClicked

    private void lblIslaVictoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIslaVictoriaMouseClicked
        JOptionPane.showMessageDialog(this,"Isla Victoria gil");
    }//GEN-LAST:event_lblIslaVictoriaMouseClicked

    private void lblGroenlandiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGroenlandiaMouseClicked
       JOptionPane.showMessageDialog(this,"Groenlandia gil");
    }//GEN-LAST:event_lblGroenlandiaMouseClicked

    private void lblIslandiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIslandiaMouseClicked
        JOptionPane.showMessageDialog(this,"Islandia gil");
    }//GEN-LAST:event_lblIslandiaMouseClicked

    private void lblLabradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLabradorMouseClicked
        JOptionPane.showMessageDialog(this,"Labrador gil");
    }//GEN-LAST:event_lblLabradorMouseClicked

    private void lblNewYorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewYorkMouseClicked
        JOptionPane.showMessageDialog(this,"New York gil");
    }//GEN-LAST:event_lblNewYorkMouseClicked

    private void lblTerranovaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerranovaMouseClicked
        JOptionPane.showMessageDialog(this,"Terranova gil");
    }//GEN-LAST:event_lblTerranovaMouseClicked

    private void lblOregonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOregonMouseClicked
        JOptionPane.showMessageDialog(this,"Oregon gil");
    }//GEN-LAST:event_lblOregonMouseClicked

    private void lblLasVegasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLasVegasMouseClicked
        JOptionPane.showMessageDialog(this,"Las Vegas gil");
    }//GEN-LAST:event_lblLasVegasMouseClicked

    private void lblChicagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChicagoMouseClicked
        JOptionPane.showMessageDialog(this,"Chicago gil");
    }//GEN-LAST:event_lblChicagoMouseClicked

    private void lblCaliforniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCaliforniaMouseClicked
        JOptionPane.showMessageDialog(this,"California gil");
    }//GEN-LAST:event_lblCaliforniaMouseClicked

    private void lblFloridaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFloridaMouseClicked
        JOptionPane.showMessageDialog(this,"Florida gil");
    }//GEN-LAST:event_lblFloridaMouseClicked

    private void lblMexicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMexicoMouseClicked
        JOptionPane.showMessageDialog(this,"Mexico gil");
    }//GEN-LAST:event_lblMexicoMouseClicked

    private void lblHondurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHondurasMouseClicked
        JOptionPane.showMessageDialog(this,"Honduras gil");
    }//GEN-LAST:event_lblHondurasMouseClicked

    private void lblElSalvadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElSalvadorMouseClicked
         JOptionPane.showMessageDialog(this,"El Salvador gil");
    }//GEN-LAST:event_lblElSalvadorMouseClicked

    private void lblNicaraguaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNicaraguaMouseClicked
         JOptionPane.showMessageDialog(this,"Nicaragua gil");
    }//GEN-LAST:event_lblNicaraguaMouseClicked

    private void lblCubaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCubaMouseClicked
         JOptionPane.showMessageDialog(this,"Cuba gil");
    }//GEN-LAST:event_lblCubaMouseClicked

    private void lblJamaicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJamaicaMouseClicked
        JOptionPane.showMessageDialog(this,"Jamaica gil");
    }//GEN-LAST:event_lblJamaicaMouseClicked

    private void lblColombiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColombiaMouseClicked
        JOptionPane.showMessageDialog(this,"Colombia gil");
    }//GEN-LAST:event_lblColombiaMouseClicked

    private void lblVenezuelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVenezuelaMouseClicked
        JOptionPane.showMessageDialog(this,"Venezuela gil");
    }//GEN-LAST:event_lblVenezuelaMouseClicked

    private void lblBrasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBrasilMouseClicked
        JOptionPane.showMessageDialog(this,"Brasil gil");
    }//GEN-LAST:event_lblBrasilMouseClicked

    private void lblBoliviaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBoliviaMouseClicked
       JOptionPane.showMessageDialog(this,"Bolivia gil");
    }//GEN-LAST:event_lblBoliviaMouseClicked

    private void lblParaguayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParaguayMouseClicked
        JOptionPane.showMessageDialog(this,"Paraguay gil");
    }//GEN-LAST:event_lblParaguayMouseClicked

    private void lblChileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChileMouseClicked
        JOptionPane.showMessageDialog(this,"Chile gil");
    }//GEN-LAST:event_lblChileMouseClicked

    private void lblArgentinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArgentinaMouseClicked
        JOptionPane.showMessageDialog(this,"Argentina gil");
    }//GEN-LAST:event_lblArgentinaMouseClicked

    private void lblUruguayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUruguayMouseClicked
        JOptionPane.showMessageDialog(this,"Uruguay gil");
    }//GEN-LAST:event_lblUruguayMouseClicked

    private void lblSaharaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaharaMouseClicked
        JOptionPane.showMessageDialog(this,"Sahara gil");
    }//GEN-LAST:event_lblSaharaMouseClicked

    private void lblEgiptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEgiptoMouseClicked
        JOptionPane.showMessageDialog(this,"Egipto gil");
    }//GEN-LAST:event_lblEgiptoMouseClicked

    private void lblEtiopiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEtiopiaMouseClicked
        JOptionPane.showMessageDialog(this,"Etiopia gil");
    }//GEN-LAST:event_lblEtiopiaMouseClicked

    private void lblNigeriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNigeriaMouseClicked
        JOptionPane.showMessageDialog(this,"Nigeria gil");
    }//GEN-LAST:event_lblNigeriaMouseClicked

    private void lblAngolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAngolaMouseClicked
       JOptionPane.showMessageDialog(this,"Angola gil");
    }//GEN-LAST:event_lblAngolaMouseClicked

    private void lblMauritaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMauritaniaMouseClicked
        JOptionPane.showMessageDialog(this,"Mauritania gil");
    }//GEN-LAST:event_lblMauritaniaMouseClicked

    private void lblSudafricaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSudafricaMouseClicked
        JOptionPane.showMessageDialog(this,"Sudafrica gil");
    }//GEN-LAST:event_lblSudafricaMouseClicked

    private void lblMadagascarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMadagascarMouseClicked
        JOptionPane.showMessageDialog(this,"Madagascar gil");
    }//GEN-LAST:event_lblMadagascarMouseClicked

    private void lblSumatraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSumatraMouseClicked
        JOptionPane.showMessageDialog(this,"Sumatra gil");
    }//GEN-LAST:event_lblSumatraMouseClicked

    private void lblFilipinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFilipinasMouseClicked
        JOptionPane.showMessageDialog(this,"Filipinas gil"); 
    }//GEN-LAST:event_lblFilipinasMouseClicked

    private void lblTongaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongaMouseClicked
        JOptionPane.showMessageDialog(this,"Tonga gil"); 
    }//GEN-LAST:event_lblTongaMouseClicked

    private void lblAustraliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAustraliaMouseClicked
         JOptionPane.showMessageDialog(this,"Australia gil"); 
    }//GEN-LAST:event_lblAustraliaMouseClicked

    private void lblTasmaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTasmaniaMouseClicked
         JOptionPane.showMessageDialog(this,"Tasmania gil"); 
    }//GEN-LAST:event_lblTasmaniaMouseClicked

    private void lblNuevaZelandiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaZelandiaMouseClicked
        JOptionPane.showMessageDialog(this,"Nueva Zelandia gil"); 
    }//GEN-LAST:event_lblNuevaZelandiaMouseClicked

    private void lblIndiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIndiaMouseClicked
        JOptionPane.showMessageDialog(this,"India gil"); 
    }//GEN-LAST:event_lblIndiaMouseClicked

    private void lblVietnamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVietnamMouseClicked
        JOptionPane.showMessageDialog(this,"Vietnam gil"); 
    }//GEN-LAST:event_lblVietnamMouseClicked

    private void lblMalasiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMalasiaMouseClicked
        JOptionPane.showMessageDialog(this,"Malasia gil"); 
    }//GEN-LAST:event_lblMalasiaMouseClicked

    private void lblCoreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoreaMouseClicked
        JOptionPane.showMessageDialog(this,"Corea gil"); 
    }//GEN-LAST:event_lblCoreaMouseClicked

    private void lblJaponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJaponMouseClicked
        JOptionPane.showMessageDialog(this,"Japon gil"); 
    }//GEN-LAST:event_lblJaponMouseClicked

    private void lblKamtchatkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKamtchatkaMouseClicked
        JOptionPane.showMessageDialog(this,"Kamtchatka gil"); 
    }//GEN-LAST:event_lblKamtchatkaMouseClicked

    private void lblChukchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChukchiMouseClicked
        JOptionPane.showMessageDialog(this,"Chukchi gil"); 
    }//GEN-LAST:event_lblChukchiMouseClicked

    private void lblChinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChinaMouseClicked
        JOptionPane.showMessageDialog(this,"China gil"); 
    }//GEN-LAST:event_lblChinaMouseClicked

    private void lblTurquiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTurquiaMouseClicked
        JOptionPane.showMessageDialog(this,"Turquia gil");
    }//GEN-LAST:event_lblTurquiaMouseClicked

    private void lblArabiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabiaMouseClicked
        JOptionPane.showMessageDialog(this,"Arabia gil");
    }//GEN-LAST:event_lblArabiaMouseClicked

    private void lblIsraelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIsraelMouseClicked
         JOptionPane.showMessageDialog(this,"Israel gil");
    }//GEN-LAST:event_lblIsraelMouseClicked

    private void lblIrakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrakMouseClicked
         JOptionPane.showMessageDialog(this,"Irak gil");
    }//GEN-LAST:event_lblIrakMouseClicked

    private void lblIranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIranMouseClicked
       JOptionPane.showMessageDialog(this,"Iran gil");
    }//GEN-LAST:event_lblIranMouseClicked

    private void lblRusiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRusiaMouseClicked
        JOptionPane.showMessageDialog(this,"Rusia gil");
    }//GEN-LAST:event_lblRusiaMouseClicked

    private void lblChecheniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChecheniaMouseClicked
       JOptionPane.showMessageDialog(this,"Chechenia gil");
    }//GEN-LAST:event_lblChecheniaMouseClicked

    private void lblSiberiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiberiaMouseClicked
        JOptionPane.showMessageDialog(this,"Siberia gil");
    }//GEN-LAST:event_lblSiberiaMouseClicked

    private void lblUcraniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUcraniaMouseClicked
        JOptionPane.showMessageDialog(this,"Ucrania gil");
    }//GEN-LAST:event_lblUcraniaMouseClicked

    private void lblPoloniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoloniaMouseClicked
        JOptionPane.showMessageDialog(this,"Polonia gil");
    }//GEN-LAST:event_lblPoloniaMouseClicked

    private void lblSerbiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSerbiaMouseClicked
        JOptionPane.showMessageDialog(this,"Serbia gil");
    }//GEN-LAST:event_lblSerbiaMouseClicked

    private void lblFinlandiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinlandiaMouseClicked
        JOptionPane.showMessageDialog(this,"Finlandia gil");
    }//GEN-LAST:event_lblFinlandiaMouseClicked

    private void lblNoruegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoruegaMouseClicked
        JOptionPane.showMessageDialog(this,"Noruega gil");
    }//GEN-LAST:event_lblNoruegaMouseClicked

    private void lblGranBretañaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGranBretañaMouseClicked
        JOptionPane.showMessageDialog(this,"Gran Bretaña gil");
    }//GEN-LAST:event_lblGranBretañaMouseClicked

    private void lblIrlandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrlandaMouseClicked
        JOptionPane.showMessageDialog(this,"Irlanda gil");
    }//GEN-LAST:event_lblIrlandaMouseClicked

    private void lblAlemaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlemaniaMouseClicked
        JOptionPane.showMessageDialog(this,"Alemania gil");
    }//GEN-LAST:event_lblAlemaniaMouseClicked

    private void lblFranciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFranciaMouseClicked
        JOptionPane.showMessageDialog(this,"Francia gil");
    }//GEN-LAST:event_lblFranciaMouseClicked

    private void lblEspañaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspañaMouseClicked
        JOptionPane.showMessageDialog(this,"España gil");
    }//GEN-LAST:event_lblEspañaMouseClicked

    private void lblPortugalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPortugalMouseClicked
        JOptionPane.showMessageDialog(this,"Portugal gil");
    }//GEN-LAST:event_lblPortugalMouseClicked

    private void lblItaliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItaliaMouseClicked
        JOptionPane.showMessageDialog(this,"Italia gil");
    }//GEN-LAST:event_lblItaliaMouseClicked

    private void lblCroaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCroaciaMouseClicked
        JOptionPane.showMessageDialog(this,"Croacia gil");
    }//GEN-LAST:event_lblCroaciaMouseClicked

    private void lblAlbaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlbaniaMouseClicked
        JOptionPane.showMessageDialog(this,"Albania gil");
    }//GEN-LAST:event_lblAlbaniaMouseClicked

    private void lblBielorrusiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBielorrusiaMouseClicked
        JOptionPane.showMessageDialog(this,"BieloRrusia gil");
    }//GEN-LAST:event_lblBielorrusiaMouseClicked

    private void lblAlaskaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlaskaMouseEntered
        principal.cargarInformacionPais("ALASKA");
        lblFichaAlaska.setVisible(false);
    }//GEN-LAST:event_lblAlaskaMouseEntered

    private void lblCanadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanadaMouseEntered
        principal.cargarInformacionPais("CANADA");
        lblFichaCanda.setVisible(false);
    }//GEN-LAST:event_lblCanadaMouseEntered

    private void lblTerranovaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerranovaMouseEntered
        principal.cargarInformacionPais("TERRANOVA");
        lblFichaTerranova.setVisible(false);
    }//GEN-LAST:event_lblTerranovaMouseEntered

    private void lblOregonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOregonMouseEntered
        principal.cargarInformacionPais("OREGON");
        lblFichaOregon.setVisible(false);
    }//GEN-LAST:event_lblOregonMouseEntered

    private void lblFloridaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFloridaMouseEntered
        principal.cargarInformacionPais("FLORIDA");
        lblFichaFlorida.setVisible(false);
    }//GEN-LAST:event_lblFloridaMouseEntered

    private void lblGroenlandiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGroenlandiaMouseEntered
        principal.cargarInformacionPais("GROENLANDIA");
        lblFichaGroenlandia.setVisible(false);
    }//GEN-LAST:event_lblGroenlandiaMouseEntered

    private void lblNewYorkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewYorkMouseEntered
        principal.cargarInformacionPais("NEW YORK");
        lblFichaNuevaYork.setVisible(false);
    }//GEN-LAST:event_lblNewYorkMouseEntered

    private void lblLasVegasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLasVegasMouseEntered
       principal.cargarInformacionPais("LAS VEGAS");
       lblFichaLasVegas.setVisible(false);
    }//GEN-LAST:event_lblLasVegasMouseEntered

    private void lblIslaVictoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIslaVictoriaMouseEntered
        principal.cargarInformacionPais("ISLA VICTORIA");
        lblFichaIslaVictoria.setVisible(false);
    }//GEN-LAST:event_lblIslaVictoriaMouseEntered

    private void lblChicagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChicagoMouseEntered
        principal.cargarInformacionPais("CHICAGO");
        lblFichaChicago.setVisible(false);
    }//GEN-LAST:event_lblChicagoMouseEntered

    private void lblCaliforniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCaliforniaMouseEntered
       principal.cargarInformacionPais("CALIFORNIA");
       lblFichaCalifornia.setVisible(false);
    }//GEN-LAST:event_lblCaliforniaMouseEntered

    private void lblLabradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLabradorMouseEntered
        principal.cargarInformacionPais("LABRADOR");
        lblFichaLabrador.setVisible(false);
    }//GEN-LAST:event_lblLabradorMouseEntered

    private void lblMexicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMexicoMouseEntered
        principal.cargarInformacionPais("MEXICO");
        lblFichaMexico.setVisible(false);
    }//GEN-LAST:event_lblMexicoMouseEntered

    private void lblHondurasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHondurasMouseEntered
        principal.cargarInformacionPais("HONDURAS");
        lblFichaHonduras.setVisible(false);
    }//GEN-LAST:event_lblHondurasMouseEntered

    private void lblElSalvadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElSalvadorMouseEntered
        principal.cargarInformacionPais("EL SALVADOR");
        lblFichaElSalvador.setVisible(false);
    }//GEN-LAST:event_lblElSalvadorMouseEntered

    private void lblNicaraguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNicaraguaMouseEntered
        principal.cargarInformacionPais("NICARAGUA");
        lblFichaNicaragua.setVisible(false);
    }//GEN-LAST:event_lblNicaraguaMouseEntered

    private void lblCubaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCubaMouseEntered
       principal.cargarInformacionPais("CUBA");
       lblFichaCuba.setVisible(false);
    }//GEN-LAST:event_lblCubaMouseEntered

    private void lblJamaicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJamaicaMouseEntered
        principal.cargarInformacionPais("JAMAICA");
        lblFichaJamaica.setVisible(false);
    }//GEN-LAST:event_lblJamaicaMouseEntered

    private void lblVenezuelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVenezuelaMouseEntered
         principal.cargarInformacionPais("Venezuela");
         lblFichaVenezuela.setVisible(false);
    }//GEN-LAST:event_lblVenezuelaMouseEntered

    private void lblSaharaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaharaMouseEntered
        principal.cargarInformacionPais("Sahara");
        lblFichaSahara.setVisible(false);
    }//GEN-LAST:event_lblSaharaMouseEntered

    private void lblSumatraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSumatraMouseEntered
        principal.cargarInformacionPais("Sumatra");
        lblFichaSumatra.setVisible(false);
    }//GEN-LAST:event_lblSumatraMouseEntered

    private void lblPortugalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPortugalMouseEntered
       principal.cargarInformacionPais("Portugal");
       lblFichaPortugal.setVisible(false);
    }//GEN-LAST:event_lblPortugalMouseEntered

    private void lblIrakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrakMouseEntered
         principal.cargarInformacionPais("Irak");
         lblFichaIrak.setVisible(false);
    }//GEN-LAST:event_lblIrakMouseEntered

    private void lblIslandiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIslandiaMouseEntered
        principal.cargarInformacionPais("Islandia");
        lblFichaIslandia.setVisible(false);
    }//GEN-LAST:event_lblIslandiaMouseEntered

    private void lblNoruegaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoruegaMouseEntered
       principal.cargarInformacionPais("Noruega");
       lblFichaNoruega.setVisible(false);
    }//GEN-LAST:event_lblNoruegaMouseEntered

    private void lblIrlandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIrlandaMouseEntered
        principal.cargarInformacionPais("Irlanda");
        lblFichaIrlanda.setVisible(false);
    }//GEN-LAST:event_lblIrlandaMouseEntered

    private void lblGranBretañaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGranBretañaMouseEntered
        principal.cargarInformacionPais("Gran Bretaña");
        lblFichaGranBretaña.setVisible(false);
    }//GEN-LAST:event_lblGranBretañaMouseEntered

    private void lblEspañaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspañaMouseEntered
        principal.cargarInformacionPais("España");
        lblFichaEspaña.setVisible(false);
    }//GEN-LAST:event_lblEspañaMouseEntered

    private void lblFranciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFranciaMouseEntered
        principal.cargarInformacionPais("Francia");
        lblFichaFrancia.setVisible(false);
    }//GEN-LAST:event_lblFranciaMouseEntered

    private void lblAlemaniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlemaniaMouseEntered
        principal.cargarInformacionPais("Alemania");
        lblFichaAlemania.setVisible(false);
    }//GEN-LAST:event_lblAlemaniaMouseEntered

    private void lblSerbiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSerbiaMouseEntered
        principal.cargarInformacionPais("Serbia");
        lblFichaSerbia.setVisible(false);
    }//GEN-LAST:event_lblSerbiaMouseEntered

    private void lblCroaciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCroaciaMouseEntered
        principal.cargarInformacionPais("Croacia");
        lblFichaCroacia.setVisible(false);
    }//GEN-LAST:event_lblCroaciaMouseEntered

    private void lblItaliaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItaliaMouseEntered
        principal.cargarInformacionPais("Italia");
        lblFichaItalia.setVisible(false);
    }//GEN-LAST:event_lblItaliaMouseEntered

    private void lblPoloniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoloniaMouseEntered
        principal.cargarInformacionPais("Polonia");
        lblFichaPolonia.setVisible(false);
    }//GEN-LAST:event_lblPoloniaMouseEntered

    private void lblUcraniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUcraniaMouseEntered
        principal.cargarInformacionPais("Ucrania");
        lblFichaUcrania.setVisible(false);
    }//GEN-LAST:event_lblUcraniaMouseEntered

    private void lblBielorrusiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBielorrusiaMouseEntered
        principal.cargarInformacionPais("Bielorrusia");
        lblFichaBielorrusia.setVisible(false);
    }//GEN-LAST:event_lblBielorrusiaMouseEntered

    private void lblFinlandiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinlandiaMouseEntered
        principal.cargarInformacionPais("Finlandia");
        lblFichaFinlandia.setVisible(false);
    }//GEN-LAST:event_lblFinlandiaMouseEntered

    private void lblAlbaniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlbaniaMouseEntered
        principal.cargarInformacionPais("Albania");
        lblFichaAlbania.setVisible(false);
    }//GEN-LAST:event_lblAlbaniaMouseEntered

    private void lblIsraelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIsraelMouseEntered
        principal.cargarInformacionPais("Israel");
        lblFichaIsrael.setVisible(false);
    }//GEN-LAST:event_lblIsraelMouseEntered

    private void lblArabiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabiaMouseEntered
        principal.cargarInformacionPais("Arabia");
        lblFichaArabia.setVisible(false);
    }//GEN-LAST:event_lblArabiaMouseEntered

    private void lblTurquiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTurquiaMouseEntered
        principal.cargarInformacionPais("Turquia");
        lblFichaTurquia.setVisible(false);
    }//GEN-LAST:event_lblTurquiaMouseEntered

    private void lblMalasiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMalasiaMouseEntered
        principal.cargarInformacionPais("Malasia");
        lblFichaMalasia.setVisible(false);
    }//GEN-LAST:event_lblMalasiaMouseEntered

    private void lblIndiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIndiaMouseEntered
        principal.cargarInformacionPais("India");
        lblFichaIndia.setVisible(false);
    }//GEN-LAST:event_lblIndiaMouseEntered

    private void lblVietnamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVietnamMouseEntered
        principal.cargarInformacionPais("Vietnam");
        lblFichaVietnam.setVisible(false);
    }//GEN-LAST:event_lblVietnamMouseEntered

    private void lblCoreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoreaMouseEntered
        principal.cargarInformacionPais("Corea");
        lblFichaCorea.setVisible(false);
    }//GEN-LAST:event_lblCoreaMouseEntered

    private void lblJaponMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJaponMouseEntered
        principal.cargarInformacionPais("Japon");
        lblFichaJapon.setVisible(false);
    }//GEN-LAST:event_lblJaponMouseEntered

    private void lblKamtchatkaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKamtchatkaMouseEntered
        principal.cargarInformacionPais("Kamtchatka");
        lblFichaKamtchatcka.setVisible(false);
    }//GEN-LAST:event_lblKamtchatkaMouseEntered

    private void lblChukchiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChukchiMouseEntered
        principal.cargarInformacionPais("Chukchi");
        lblFichaChukChi.setVisible(false);
    }//GEN-LAST:event_lblChukchiMouseEntered

    private void lblChecheniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChecheniaMouseEntered
        principal.cargarInformacionPais("Chechenia");
        lblFichaChechenia.setVisible(false);
    }//GEN-LAST:event_lblChecheniaMouseEntered

    private void lblSiberiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiberiaMouseEntered
        principal.cargarInformacionPais("Siberia");
        lblFichaSiberia.setVisible(false);
    }//GEN-LAST:event_lblSiberiaMouseEntered

    private void lblRusiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRusiaMouseEntered
        principal.cargarInformacionPais("Rusia");
        lblFichaRusia.setVisible(false);
    }//GEN-LAST:event_lblRusiaMouseEntered

    private void lblIranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIranMouseEntered
        principal.cargarInformacionPais("Iran");
        lblFichaIran.setVisible(false);
    }//GEN-LAST:event_lblIranMouseEntered

    private void lblChinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChinaMouseEntered
        principal.cargarInformacionPais("China");
        lblFichaChina.setVisible(false);
    }//GEN-LAST:event_lblChinaMouseEntered

    private void lblFilipinasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFilipinasMouseEntered
        principal.cargarInformacionPais("Filipinas");
        lblFichaFilipinas.setVisible(false);
    }//GEN-LAST:event_lblFilipinasMouseEntered

    private void lblTongaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongaMouseEntered
        principal.cargarInformacionPais("Tonga");
        lblFichaTonga.setVisible(false);
    }//GEN-LAST:event_lblTongaMouseEntered

    private void lblAustraliaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAustraliaMouseEntered
        principal.cargarInformacionPais("Australia");
        lblFichaAustralia.setVisible(false);
    }//GEN-LAST:event_lblAustraliaMouseEntered

    private void lblTasmaniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTasmaniaMouseEntered
        principal.cargarInformacionPais("Tasmania");
        lblFichaTasmania.setVisible(false);
    }//GEN-LAST:event_lblTasmaniaMouseEntered

    private void lblNuevaZelandiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaZelandiaMouseEntered
        principal.cargarInformacionPais("Nueva Zelanda");
        lblFichaNuevaZelandia.setVisible(false);
    }//GEN-LAST:event_lblNuevaZelandiaMouseEntered

    private void lblMadagascarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMadagascarMouseEntered
        principal.cargarInformacionPais("Madagascar");
        lblFichaMadagascar.setVisible(false);
    }//GEN-LAST:event_lblMadagascarMouseEntered

    private void lblSudafricaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSudafricaMouseEntered
        principal.cargarInformacionPais("Sudafrica");
        lblFichaSudafrica.setVisible(false);
    }//GEN-LAST:event_lblSudafricaMouseEntered

    private void lblMauritaniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMauritaniaMouseEntered
        principal.cargarInformacionPais("Mauritania");
        lblFichaMauritania.setVisible(false);
    }//GEN-LAST:event_lblMauritaniaMouseEntered

    private void lblAngolaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAngolaMouseEntered
        principal.cargarInformacionPais("Angola");
        lblFichaAngola.setVisible(false);
    }//GEN-LAST:event_lblAngolaMouseEntered

    private void lblEtiopiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEtiopiaMouseEntered
        principal.cargarInformacionPais("Etipia");
        lblFichaEtiopia.setVisible(false);
    }//GEN-LAST:event_lblEtiopiaMouseEntered

    private void lblEgiptoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEgiptoMouseEntered
        principal.cargarInformacionPais("Egipto");
        lblFichaEgipto.setVisible(false);
    }//GEN-LAST:event_lblEgiptoMouseEntered

    private void lblNigeriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNigeriaMouseEntered
        principal.cargarInformacionPais("Nigeria");
        lblFichaNigeria.setVisible(false);
    }//GEN-LAST:event_lblNigeriaMouseEntered

    private void lblBrasilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBrasilMouseEntered
        principal.cargarInformacionPais("Brasil");
        lblFichaBrasil.setVisible(false);
    }//GEN-LAST:event_lblBrasilMouseEntered

    private void lblColombiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColombiaMouseEntered
        principal.cargarInformacionPais("Colombia");
        lblFichaColombia.setVisible(false);
    }//GEN-LAST:event_lblColombiaMouseEntered

    private void lblBoliviaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBoliviaMouseEntered
        principal.cargarInformacionPais("Bolivia");
        lblFichaBolivia.setVisible(false);
    }//GEN-LAST:event_lblBoliviaMouseEntered

    private void lblChileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChileMouseEntered
        principal.cargarInformacionPais("Chile");
        lblFichaChile.setVisible(false);
    }//GEN-LAST:event_lblChileMouseEntered

    private void lblParaguayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParaguayMouseEntered
        principal.cargarInformacionPais("Paraguay");
        lblFichaParaguay.setVisible(false);
    }//GEN-LAST:event_lblParaguayMouseEntered

    private void lblArgentinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArgentinaMouseEntered
        principal.cargarInformacionPais("Argentina");
        lblFichaArgentina.setVisible(false);
    }//GEN-LAST:event_lblArgentinaMouseEntered

    private void lblUruguayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUruguayMouseEntered
        principal.cargarInformacionPais("Uruguay");
        lblFichaUruguay.setVisible(false);
    }//GEN-LAST:event_lblUruguayMouseEntered

    private void lblColombiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColombiaMouseExited
        lblFichaColombia.setVisible(true);
    }//GEN-LAST:event_lblColombiaMouseExited

    private void lblJaponMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJaponMouseExited
        mostrarFichas();
    }//GEN-LAST:event_lblJaponMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlaska;
    private javax.swing.JLabel lblAlbania;
    private javax.swing.JLabel lblAlemania;
    private javax.swing.JLabel lblAngola;
    private javax.swing.JLabel lblArabia;
    private javax.swing.JLabel lblArgentina;
    private javax.swing.JLabel lblAustralia;
    private javax.swing.JLabel lblBielorrusia;
    private javax.swing.JLabel lblBolivia;
    private javax.swing.JLabel lblBrasil;
    private javax.swing.JLabel lblCalifornia;
    private javax.swing.JLabel lblCanada;
    private javax.swing.JLabel lblChechenia;
    private javax.swing.JLabel lblChicago;
    private javax.swing.JLabel lblChile;
    private javax.swing.JLabel lblChina;
    private javax.swing.JLabel lblChukchi;
    private javax.swing.JLabel lblColombia;
    private javax.swing.JLabel lblCorea;
    private javax.swing.JLabel lblCroacia;
    private javax.swing.JLabel lblCuba;
    private javax.swing.JLabel lblEgipto;
    private javax.swing.JLabel lblElSalvador;
    private javax.swing.JLabel lblEspaña;
    private javax.swing.JLabel lblEtiopia;
    private javax.swing.JLabel lblFichaAlaska;
    private javax.swing.JLabel lblFichaAlbania;
    private javax.swing.JLabel lblFichaAlemania;
    private javax.swing.JLabel lblFichaAngola;
    private javax.swing.JLabel lblFichaArabia;
    private javax.swing.JLabel lblFichaArgentina;
    private javax.swing.JLabel lblFichaAustralia;
    private javax.swing.JLabel lblFichaBielorrusia;
    private javax.swing.JLabel lblFichaBolivia;
    private javax.swing.JLabel lblFichaBrasil;
    private javax.swing.JLabel lblFichaCalifornia;
    private javax.swing.JLabel lblFichaCanda;
    private javax.swing.JLabel lblFichaChechenia;
    private javax.swing.JLabel lblFichaChicago;
    private javax.swing.JLabel lblFichaChile;
    private javax.swing.JLabel lblFichaChina;
    private javax.swing.JLabel lblFichaChukChi;
    private javax.swing.JLabel lblFichaColombia;
    private javax.swing.JLabel lblFichaCorea;
    private javax.swing.JLabel lblFichaCroacia;
    private javax.swing.JLabel lblFichaCuba;
    private javax.swing.JLabel lblFichaEgipto;
    private javax.swing.JLabel lblFichaElSalvador;
    private javax.swing.JLabel lblFichaEspaña;
    private javax.swing.JLabel lblFichaEtiopia;
    private javax.swing.JLabel lblFichaFilipinas;
    private javax.swing.JLabel lblFichaFinlandia;
    private javax.swing.JLabel lblFichaFlorida;
    private javax.swing.JLabel lblFichaFrancia;
    private javax.swing.JLabel lblFichaGranBretaña;
    private javax.swing.JLabel lblFichaGroenlandia;
    private javax.swing.JLabel lblFichaHonduras;
    private javax.swing.JLabel lblFichaIndia;
    private javax.swing.JLabel lblFichaIrak;
    private javax.swing.JLabel lblFichaIran;
    private javax.swing.JLabel lblFichaIrlanda;
    private javax.swing.JLabel lblFichaIslaVictoria;
    private javax.swing.JLabel lblFichaIslandia;
    private javax.swing.JLabel lblFichaIsrael;
    private javax.swing.JLabel lblFichaItalia;
    private javax.swing.JLabel lblFichaJamaica;
    private javax.swing.JLabel lblFichaJapon;
    private javax.swing.JLabel lblFichaKamtchatcka;
    private javax.swing.JLabel lblFichaLabrador;
    private javax.swing.JLabel lblFichaLasVegas;
    private javax.swing.JLabel lblFichaMadagascar;
    private javax.swing.JLabel lblFichaMalasia;
    private javax.swing.JLabel lblFichaMauritania;
    private javax.swing.JLabel lblFichaMexico;
    private javax.swing.JLabel lblFichaNicaragua;
    private javax.swing.JLabel lblFichaNigeria;
    private javax.swing.JLabel lblFichaNoruega;
    private javax.swing.JLabel lblFichaNuevaYork;
    private javax.swing.JLabel lblFichaNuevaZelandia;
    private javax.swing.JLabel lblFichaOregon;
    private javax.swing.JLabel lblFichaParaguay;
    private javax.swing.JLabel lblFichaPolonia;
    private javax.swing.JLabel lblFichaPortugal;
    private javax.swing.JLabel lblFichaRusia;
    private javax.swing.JLabel lblFichaSahara;
    private javax.swing.JLabel lblFichaSerbia;
    private javax.swing.JLabel lblFichaSiberia;
    private javax.swing.JLabel lblFichaSudafrica;
    private javax.swing.JLabel lblFichaSumatra;
    private javax.swing.JLabel lblFichaTasmania;
    private javax.swing.JLabel lblFichaTerranova;
    private javax.swing.JLabel lblFichaTonga;
    private javax.swing.JLabel lblFichaTurquia;
    private javax.swing.JLabel lblFichaUcrania;
    private javax.swing.JLabel lblFichaUruguay;
    private javax.swing.JLabel lblFichaVenezuela;
    private javax.swing.JLabel lblFichaVietnam;
    private javax.swing.JLabel lblFilipinas;
    private javax.swing.JLabel lblFinlandia;
    private javax.swing.JLabel lblFlorida;
    private javax.swing.JLabel lblFrancia;
    private javax.swing.JLabel lblGranBretaña;
    private javax.swing.JLabel lblGroenlandia;
    private javax.swing.JLabel lblHonduras;
    private javax.swing.JLabel lblIndia;
    private javax.swing.JLabel lblIrak;
    private javax.swing.JLabel lblIran;
    private javax.swing.JLabel lblIrlanda;
    private javax.swing.JLabel lblIslaVictoria;
    private javax.swing.JLabel lblIslandia;
    private javax.swing.JLabel lblIsrael;
    private javax.swing.JLabel lblItalia;
    private javax.swing.JLabel lblJamaica;
    private javax.swing.JLabel lblJapon;
    private javax.swing.JLabel lblKamtchatka;
    private javax.swing.JLabel lblLabrador;
    private javax.swing.JLabel lblLasVegas;
    private javax.swing.JLabel lblMadagascar;
    private javax.swing.JLabel lblMalasia;
    private javax.swing.JLabel lblMauritania;
    private javax.swing.JLabel lblMexico;
    private javax.swing.JLabel lblNewYork;
    private javax.swing.JLabel lblNicaragua;
    private javax.swing.JLabel lblNigeria;
    private javax.swing.JLabel lblNoruega;
    private javax.swing.JLabel lblNuevaZelandia;
    private javax.swing.JLabel lblOregon;
    private javax.swing.JLabel lblParaguay;
    private javax.swing.JLabel lblPolonia;
    private javax.swing.JLabel lblPortugal;
    private javax.swing.JLabel lblRusia;
    private javax.swing.JLabel lblSahara;
    private javax.swing.JLabel lblSerbia;
    private javax.swing.JLabel lblSiberia;
    private javax.swing.JLabel lblSudafrica;
    private javax.swing.JLabel lblSumatra;
    private javax.swing.JLabel lblTasmania;
    private javax.swing.JLabel lblTerranova;
    private javax.swing.JLabel lblTonga;
    private javax.swing.JLabel lblTurquia;
    private javax.swing.JLabel lblUcrania;
    private javax.swing.JLabel lblUruguay;
    private javax.swing.JLabel lblVenezuela;
    private javax.swing.JLabel lblVietnam;
    private javax.swing.JPanel panelAfrica;
    private javax.swing.JPanel panelAmericaDelNorrte;
    private javax.swing.JPanel panelAmericaDelSur;
    private javax.swing.JPanel panelAsia;
    private javax.swing.JPanel panelAsia2;
    private javax.swing.JPanel panelCentroAmerica;
    private javax.swing.JPanel panelOceania;
    // End of variables declaration//GEN-END:variables
}
