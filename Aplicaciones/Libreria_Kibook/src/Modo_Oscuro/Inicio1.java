
package Modo_Oscuro;

import Vista.AnadirLibros;
import Vista.Comprar;
import Vista.Inicio;
import Vista.VerLibros;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Inicio1 extends javax.swing.JFrame {

    
    
    public Inicio1() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/icono.png")).getImage());
        this.setLocationRelativeTo(null);
    }
    
    private void nuevoPanel(JPanel panel){
        jPanel2.removeAll();
        jPanel2.add(panel);
        jPanel2.repaint();
        jPanel2.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        btnVerLibros = new javax.swing.JButton();
        btnAñadirLibros = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnModoClaro = new javax.swing.JButton();
        IMGLibro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setVisible(false);
        BarraMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kibook!");
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setFocusable(false);
        btnPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrincipal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnPrincipal.setRequestFocusEnabled(false);
        btnPrincipal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnPrincipal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 198, 50));

        btnVerLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnVerLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnVerLibros.setText("Ver Libros");
        btnVerLibros.setFocusable(false);
        btnVerLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerLibros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnVerLibros.setRequestFocusEnabled(false);
        btnVerLibros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnVerLibros.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnVerLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 198, 50));

        btnAñadirLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAñadirLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnAñadirLibros.setText("Agregar Libros");
        btnAñadirLibros.setFocusable(false);
        btnAñadirLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAñadirLibros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnAñadirLibros.setRequestFocusEnabled(false);
        btnAñadirLibros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnAñadirLibros.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnAñadirLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 198, 50));

        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setFocusable(false);
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnComprar.setRequestFocusEnabled(false);
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnComprar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 198, 50));

        btnModoClaro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModoClaro.setForeground(new java.awt.Color(255, 255, 255));
        btnModoClaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnModoClaro.setText("Modo Claro");
        btnModoClaro.setFocusable(false);
        btnModoClaro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModoClaro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnModoClaro.setRequestFocusEnabled(false);
        btnModoClaro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnModoClaro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnModoClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoClaroActionPerformed(evt);
            }
        });
        jPanel1.add(btnModoClaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 198, 50));

        IMGLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMGLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/libro1 (1).png"))); // NOI18N
        jPanel1.add(IMGLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 150, 150));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kibook!");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 494, 198, 50));

        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnCarrito.setText("Compras");
        btnCarrito.setFocusable(false);
        btnCarrito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarrito.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnCarrito.setRequestFocusEnabled(false);
        btnCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnCarrito.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 198, 50));

        jLabel15.setBackground(new java.awt.Color(0, 173, 222));
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 300));

        BarraMenu.setBackground(new java.awt.Color(44, 46, 66));
        BarraMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        BarraMenu.setOpaque(true);
        jPanel1.add(BarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 199, 544));

        VentanaPrincipal1 vp=new VentanaPrincipal1();
        nuevoPanel(vp);
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(70, 73, 101));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, "card16");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 0, 708, 544));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        VentanaPrincipal1 vp=new VentanaPrincipal1();
        nuevoPanel(vp);
        btnPrincipal.setSelected(true);
        btnVerLibros.setSelected(false);
        btnComprar.setSelected(false);
        btnAñadirLibros.setSelected(false);
        btnCarrito.setSelected(false);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnVerLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLibrosActionPerformed
        VerLibros1 vComprar=new VerLibros1();
        nuevoPanel(vComprar);
        btnVerLibros.setSelected(true);
        btnPrincipal.setSelected(false);
        btnComprar.setSelected(false);
        btnAñadirLibros.setSelected(false);
        btnCarrito.setSelected(false);
    }//GEN-LAST:event_btnVerLibrosActionPerformed

    private void btnAñadirLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirLibrosActionPerformed
        AnadirLibros1 al=new AnadirLibros1();
        nuevoPanel(al);
        btnAñadirLibros.setSelected(true);
        btnPrincipal.setSelected(false);
        btnComprar.setSelected(false);
        btnVerLibros.setSelected(false);
        btnCarrito.setSelected(false);
    }//GEN-LAST:event_btnAñadirLibrosActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        Ver_Compras1 Compras=new Ver_Compras1();
        nuevoPanel(Compras);
        btnCarrito.setSelected(true);
        btnAñadirLibros.setSelected(false);
        btnPrincipal.setSelected(false);
        btnComprar.setSelected(false);
        btnVerLibros.setSelected(false);
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnModoClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoClaroActionPerformed
        Inicio modoClaro=new Inicio();
        modoClaro.setVisible(true);
        btnComprar.setSelected(false);
        btnCarrito.setSelected(false);
        btnAñadirLibros.setSelected(false);
        btnPrincipal.setSelected(false);
        btnVerLibros.setSelected(false);
        this.dispose();
    }//GEN-LAST:event_btnModoClaroActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        Comprar1 buscar=new Comprar1();
        nuevoPanel(buscar);
        
        btnComprar.setSelected(true);
        btnCarrito.setSelected(false);
        btnAñadirLibros.setSelected(false);
        btnPrincipal.setSelected(false);
        btnVerLibros.setSelected(false);
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraMenu;
    private javax.swing.JLabel IMGLibro;
    private javax.swing.JButton btnAñadirLibros;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnModoClaro;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnVerLibros;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
