
package Vista;

import java.awt.Font;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {
    
    private String usuario1;
    private String usuario2;
    
    
    public Inicio() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/tac.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setSize(600,600);
        btnComenzarJuego.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnComenzarJuego = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de Jugador 2:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 203, -1, -1));

        txtUser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUser2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUser2KeyTyped(evt);
            }
        });
        jPanel1.add(txtUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 204, 250, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre de Jugador 1:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 148, -1, -1));

        txtUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 149, 250, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("Establecer nombres");
        btnGuardar.setFocusable(false);
        btnGuardar.setRequestFocusEnabled(false);
        btnGuardar.setRolloverEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 265, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tres en Raya");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, -1));

        etiqueta1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 25));

        etiqueta2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Tic_Tac_Toe.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, 180));

        btnComenzarJuego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComenzarJuego.setText("Comenzar Juego");
        btnComenzarJuego.setFocusable(false);
        btnComenzarJuego.setRequestFocusEnabled(false);
        btnComenzarJuego.setRolloverEnabled(false);
        btnComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(btnComenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        usuario1=txtUser1.getText();
        usuario2=txtUser2.getText();
        
        btnGuardar.setVisible(false);
        etiqueta1.setText("("+usuario1+") jugara primero, su ficha (X)");
        etiqueta2.setText("("+usuario2+") jugara su ficha (O)");
        btnComenzarJuego.setVisible(true);
        txtUser1.setEditable(false);
        txtUser2.setEditable(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarJuegoActionPerformed
        Juego juego=new Juego(usuario1,usuario2);
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnComenzarJuegoActionPerformed

    private void txtUser2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser2KeyTyped
        
        if(evt.getKeyChar()=='\n'){
            usuario1=txtUser1.getText();
            usuario2=txtUser2.getText();

            btnGuardar.setVisible(false);
            etiqueta1.setText("("+usuario1+") jugara primero, su ficha (X)");
            etiqueta2.setText("("+usuario2+") jugara su ficha (O)");
            btnComenzarJuego.setVisible(true);
            txtUser1.setEditable(false);
            txtUser2.setEditable(false);
        }
        
    }//GEN-LAST:event_txtUser2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzarJuego;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUser1;
    private javax.swing.JTextField txtUser2;
    // End of variables declaration//GEN-END:variables
}
