/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.bda.BancoMB.bancoMB;

import javax.swing.table.DefaultTableModel;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;

/**
 *
 * @author hisam
 */
public class ClientesForm extends javax.swing.JFrame {
 private final IClientesDAO clientesDAO;
    DefaultTableModel modelo;
    public ClientesForm(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        btn400 = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        LblImporte = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retiro sin cuenta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn100.setText("$100");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        getContentPane().add(btn100, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        btn200.setText("$200");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });
        getContentPane().add(btn200, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        btn300.setText("$300");
        getContentPane().add(btn300, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        btn400.setText("$400");
        btn400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn400ActionPerformed(evt);
            }
        });
        getContentPane().add(btn400, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        btn500.setText("$500");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });
        getContentPane().add(btn500, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btn1000.setText("$1000");
        getContentPane().add(btn1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        LblImporte.setText("Importe");
        getContentPane().add(LblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jTextField1.setText("Concepto (opcional)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 260, -1));

        jLabel1.setText("Solo múltiplos de 100");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jTextField2.setText("Otra Cifra");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 260, -1));

        jButton1.setText("Aceptar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jButton2.setText("Cancelar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn400ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn400ActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn100ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImporte;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btn400;
    private javax.swing.JButton btn500;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
