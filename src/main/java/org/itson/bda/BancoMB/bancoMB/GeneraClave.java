
package org.itson.bda.BancoMB.bancoMB;

import java.util.Random;
import javax.swing.JFrame;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;

public class GeneraClave extends javax.swing.JFrame {
 /**
 * La clase `GeneraClave` representa la interfaz gráfica para generar contraseñas y folios
 * relacionados con operaciones bancarias.
 */
 private final IClientesDAO clientesDAO;
    /**
    * Constructor de la clase `GeneraClave`.
    * @param clientesDAO Interfaz para acceder a la capa de acceso de datos relacionada con clientes.
    */
    public GeneraClave(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
  
    }
    /**
    * Establece el concepto en la etiqueta correspondiente.
    * @param concepto El concepto a establecer.
    */
    public void setConcepto(String concepto) {
        lblConcepto.setText(concepto);
    }
    /**
     * Establece el monto en la etiqueta correspondiente.
     * @param monto El monto a establecer.
     */
    public void setMonto(String monto) {
        lblMonto.setText(monto);
    }
    /**
    * Genera y establece una contraseña aleatoria en la etiqueta correspondiente.
    */
    public void setContrasenia() {
        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);
        int digito3 = random.nextInt(10);
        int digito4 = random.nextInt(10);

        String contrasenia = String.format("%d%d%d%d", digito1, digito2, digito3, digito4);

        lblContrasenia.setText(contrasenia);
    }
    /**
    * Genera y establece un folio aleatorio en la etiqueta correspondiente.
    */
    public void setFolio() {
        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);
        int digito3 = random.nextInt(10);
        int digito4 = random.nextInt(10);
        int digito5 = random.nextInt(10);
        int digito6 = random.nextInt(10);
        int digito7 = random.nextInt(10);
        int digito8 = random.nextInt(10);

        String folio = String.format("%d%d%d%d%d%d%d%d", digito1, digito2, digito3, digito4,digito5,digito6,digito7,digito8);

        lblFolio.setText(folio);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generaClave = new javax.swing.JPanel();
        lblRetiroDisponible = new javax.swing.JLabel();
        lblVencimiento = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar contraseña");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generaClave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRetiroDisponible.setText("Retiro disponible");
        generaClave.add(lblRetiroDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        lblVencimiento.setText("Vence en 10 minutos");
        generaClave.add(lblVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblContrasenia.setText("Contraseña");
        generaClave.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, -1));

        lblFolio.setText("Folio");
        generaClave.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, -1));

        lblMonto.setText("Monto");
        generaClave.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 80, -1));

        lblConcepto.setText("Concepto");
        generaClave.add(lblConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        generaClave.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel1.setText("Monto:");
        generaClave.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel2.setText("Concepto:");
        generaClave.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel3.setText("Contraseña:");
        generaClave.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setText("Folio:");
        generaClave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        getContentPane().add(generaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 328));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel generaClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblRetiroDisponible;
    private javax.swing.JLabel lblVencimiento;
    // End of variables declaration//GEN-END:variables
}
