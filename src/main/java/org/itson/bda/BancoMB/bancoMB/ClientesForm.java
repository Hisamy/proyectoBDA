package org.itson.bda.BancoMB.bancoMB;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.RetirosSinCuentaDAO;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;

public class ClientesForm extends javax.swing.JFrame {

    public float monto;
    public String concepto;
    private Acciones opcion;
    private final IClientesDAO clientesDAO;
    private List<RetiroSinCuentaNuevoDTO> listaRetiros = new ArrayList<>();


    public ClientesForm(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;

        if (opcion == Acciones.CANCELAR) {
            btnCancelar.setText("Cancelar");

        } else if (opcion == Acciones.ACEPTAR) {
            btnAceptar.setText("Aceptar");
            btnAceptar.setText(txtConcepto.getText());
            btnAceptar.setText(txtOtraCifra.getText());
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

        jPanel1 = new javax.swing.JPanel();
        LblImporte = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOtraCifra = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retiro sin cuenta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblImporte.setText("Importe");
        jPanel1.add(LblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });
        jPanel1.add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 260, -1));

        jLabel1.setText("Solo múltiplos de 100");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtOtraCifra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtraCifraActionPerformed(evt);
            }
        });
        jPanel1.add(txtOtraCifra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 260, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel2.setText("Cifra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setText("Concepto(opcional):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
        txtConcepto.getText();
    
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtOtraCifraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtraCifraActionPerformed
        txtOtraCifra.getText();
    }//GEN-LAST:event_txtOtraCifraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     String concepto = txtConcepto.getText();
     String otraCifra = txtOtraCifra.getText();
      GeneraClave claveFrame = new GeneraClave(clientesDAO);
  
     
    try {
        float monto = Float.parseFloat(otraCifra);
        
        if (monto % 100 == 0) {
        RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo = new RetiroSinCuentaNuevoDTO();
        retiroSinCuentaNuevo.setMonto(monto);

        agregarRetiro(retiroSinCuentaNuevo);

         claveFrame.setConcepto(concepto);  
        
        claveFrame.setMonto(String.valueOf(monto));
        claveFrame.setContrasenia();
        claveFrame.setFolio();

        claveFrame.setVisible(true);

        
        }else {
            // Muestra un mensaje de error si el monto no es un múltiplo de 100
            JOptionPane.showMessageDialog(this, "El monto debe ser un múltiplo de 100", "No es múltiplo", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // La entrada no es un número, muestra un mensaje de error 
        JOptionPane.showMessageDialog(this, "ERROR: La cifra ingresada no es válida.", "Cifra inválida", JOptionPane.ERROR_MESSAGE);
    }
    if (claveFrame.isVisible()) {
            dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
private void agregarRetiro(RetiroSinCuentaNuevoDTO retiro) {
        listaRetiros.add(retiro);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImporte;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtOtraCifra;
    // End of variables declaration//GEN-END:variables
}
