/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import javax.swing.JOptionPane;
import juego.estructura.Pais;

/**
 *
 * @author Emanuel
 */
public class Canjear extends javax.swing.JDialog {
    private boolean canje;   
    InterfacePrincipal padre;
    /**
     * Creates new form Canjear
     */
    public Canjear(java.awt.Frame parent, boolean modal, InterfacePrincipal padre) {
        super(parent, modal);
        initComponents();
        rbTropaXmisil.setSelected(true);
        this.padre = padre;        
    }
    
    public void canjear(Pais pais){
        if(rbTropaXmisil.isSelected()){
            if(pais.getCantidadEjercitos()>6){
                FachadaInterface.canjearTropasPorMisil(pais);
            }
            else{
                JOptionPane.showMessageDialog(null,"No posee la cantidad de tropas suficientes","Canje Tropas por Misil",JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            if(pais.getCantidadMisiles()>0){
                FachadaInterface.canjearMisilPorTropas(pais);
            }
            else{
                JOptionPane.showMessageDialog(null,"No posee misiles para canjear","Canje Misil por Tropas",JOptionPane.WARNING_MESSAGE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbMisilXtropa = new javax.swing.JRadioButton();
        rbTropaXmisil = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Canjear");
        setIconImage(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        buttonGroup1.add(rbMisilXtropa);
        rbMisilXtropa.setForeground(new java.awt.Color(51, 51, 255));
        rbMisilXtropa.setText("Misil por Tropas");
        rbMisilXtropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMisilXtropaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTropaXmisil);
        rbTropaXmisil.setForeground(new java.awt.Color(51, 102, 0));
        rbTropaXmisil.setText("Tropas por Misil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMisilXtropa)
                    .addComponent(rbTropaXmisil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMisilXtropa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTropaXmisil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMisilXtropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMisilXtropaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMisilXtropaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      padre.cerrarVentanaCanjear();
        
    }//GEN-LAST:event_formWindowClosed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton rbMisilXtropa;
    private javax.swing.JRadioButton rbTropaXmisil;
    // End of variables declaration//GEN-END:variables
}
