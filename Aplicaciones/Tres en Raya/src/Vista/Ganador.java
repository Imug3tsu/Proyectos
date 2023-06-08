
package Vista;

public class Ganador extends javax.swing.JDialog {
    
    private String usuario;
    
    public Ganador(java.awt.Frame parent, boolean modal,String user) {
        super(parent, modal);
        this.usuario=user;
        initComponents();
        this.setSize(510, 330);
        this.setLocationRelativeTo(null);
        Felicitaciones.setText("Felicitaciones "+usuario);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Felicitaciones = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnJugarDeNuevo = new javax.swing.JButton();
        etiquetaIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Felicitaciones.setBackground(new java.awt.Color(0, 0, 0));
        Felicitaciones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Felicitaciones.setForeground(new java.awt.Color(255, 255, 255));
        Felicitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Felicitaciones.setText("Felicitaciones!");
        Felicitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Felicitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Felicitaciones.setOpaque(true);
        jPanel1.add(Felicitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 420, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GANASTE!");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, -1));

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn3.jpg"))); // NOI18N
        btnSalir.setRequestFocusEnabled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn2.jpg"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 23));

        btnJugarDeNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnJugarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1.jpg"))); // NOI18N
        btnJugarDeNuevo.setText("Jugar de nuevo");
        btnJugarDeNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnJugarDeNuevo.setFocusable(false);
        btnJugarDeNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJugarDeNuevo.setMargin(new java.awt.Insets(2, 17, 2, 14));
        btnJugarDeNuevo.setPreferredSize(new java.awt.Dimension(153, 28));
        btnJugarDeNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn3.jpg"))); // NOI18N
        btnJugarDeNuevo.setRequestFocusEnabled(false);
        btnJugarDeNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn2.jpg"))); // NOI18N
        btnJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDeNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 241, 110, 24));

        etiquetaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/win (1).gif"))); // NOI18N
        etiquetaIMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(etiquetaIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDeNuevoActionPerformed
        /*Juego juego=new Juego(user1,user2);
        juego.setVisible(true);*/
        this.dispose();
    }//GEN-LAST:event_btnJugarDeNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ganador dialog = new Ganador(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Felicitaciones;
    private javax.swing.JButton btnJugarDeNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaIMG;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
