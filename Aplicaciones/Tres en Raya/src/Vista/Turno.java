
package Vista;

public class Turno extends javax.swing.JDialog {
    
    private String usuario1,usuario2;
    private String turno;
    
    public Turno(java.awt.Frame parent, boolean modal,String user1,String user2) {
        super(parent, modal);
        this.usuario1=user1;
        this.usuario2=user2;
        initComponents();
        btnUser1.setText(usuario1);
        btnUser2.setText(usuario2);
        this.setLocationRelativeTo(null);
    }

    public String getTurno() {
        return turno;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnUser1 = new javax.swing.JButton();
        btnUser2 = new javax.swing.JButton();
        IMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quien Juega Primero?");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 300, -1));

        btnUser1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUser1.setForeground(new java.awt.Color(255, 255, 255));
        btnUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1.jpg"))); // NOI18N
        btnUser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnUser1.setFocusable(false);
        btnUser1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn3.jpg"))); // NOI18N
        btnUser1.setRequestFocusEnabled(false);
        btnUser1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn2.jpg"))); // NOI18N
        btnUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 24));

        btnUser2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUser2.setForeground(new java.awt.Color(255, 255, 255));
        btnUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1.jpg"))); // NOI18N
        btnUser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnUser2.setFocusable(false);
        btnUser2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn3.jpg"))); // NOI18N
        btnUser2.setRequestFocusEnabled(false);
        btnUser2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn2.jpg"))); // NOI18N
        btnUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 110, 24));

        IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/l (1).gif"))); // NOI18N
        IMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser1ActionPerformed
        turno="usuario1";
        this.dispose();
    }//GEN-LAST:event_btnUser1ActionPerformed

    private void btnUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser2ActionPerformed
        turno="usuario2";
        this.dispose();
    }//GEN-LAST:event_btnUser2ActionPerformed

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
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Turno dialog = new Turno(new javax.swing.JFrame(), true,null,null);
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
    private javax.swing.JLabel IMG;
    private javax.swing.JButton btnUser1;
    private javax.swing.JButton btnUser2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
