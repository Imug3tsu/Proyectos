
package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ComprarLibroVentana extends javax.swing.JDialog {
    
    private DefaultTableModel modelo=new DefaultTableModel();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Conexion conexion=new Conexion();
    private General datos=new General();
    private JTable tabla=new JTable();
    
    public ComprarLibroVentana(java.awt.Frame parent, boolean modal,General datos) {
        super(parent, modal);
        this.datos=datos;
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/carrito.png")).getImage());
        txtId.setText(datos.getId());
        lbTitulo.setText(datos.getTitulo());
        lbCategoria.setText(datos.getCategoria());
        lbCantidad.setText(String.valueOf(datos.getCantidad()));
        //txtRestar.setText(String.valueOf(datos.getCantidad()));
        txtAutor.setText(datos.getAutor());
        caratula.setIcon(datos.getPortada());
        lbPrecio.setText(String.valueOf(datos.getPrecio()));
        lbFecha.setText(datos.getFecha());
        lbNumPag.setText(String.valueOf(datos.getNumPag()));
        this.setSize(490, 550);
        this.setLocationRelativeTo(null);
    }
    
    public void LibroComprado(){
        int resultado=Integer.parseInt(txtRestar.getText())-Integer.parseInt(lbCantidad.getText());
        General datos1=ModeloTransferencia.transferencia_de_datos;
        datos1.setId(txtId.getText());
        datos1.setAutor(txtAutor.getText());
        datos1.setTitulo(lbTitulo.getText());
        datos1.setCategoria(lbCategoria.getText());
        datos1.setPrecio(Double.parseDouble(lbPrecio.getText()));
        datos1.setCantidad(Integer.parseInt(txtRestar.getText()));
        datos1.setNumPag(Integer.parseInt(lbNumPag.getText()));
        datos1.setFecha(lbFecha.getText());
        datos1.setPortada((ImageIcon) caratula.getIcon());
    }
    
    public boolean agregarCarritoLibros(DefaultTableModel model){
        boolean correcto=false;
        if (Integer.parseInt(txtRestar.getText())<=Integer.parseInt(lbCantidad.getText())){
            correcto=true;
        }
        return correcto;
    }
    
    private void restarCantidad(){
        int resultado=Integer.parseInt(lbCantidad.getText())-Integer.parseInt(txtRestar.getText());
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("update Libros set cantidad=? where id=?");
            ps.setInt(1,resultado);
            ps.setString(2,txtId.getText());
            //ps.executeUpdate();  // no declarar antes de tiempo porque se aplicara si cumple o no las condiciones de abajo.
            if (Integer.parseInt(txtRestar.getText())==0){
                JOptionPane.showMessageDialog(null,"La cantidad a comprar no puede ser (0) CERO");
            }else if (Integer.parseInt(txtRestar.getText())>Integer.parseInt(lbCantidad.getText())){
                JOptionPane.showMessageDialog(null,"No puedes comprar mas Stock del establecido en el libro");
            }else if (Integer.parseInt(txtRestar.getText())<=Integer.parseInt(lbCantidad.getText())){
                LibroComprado();
                ps.executeUpdate();  // recuerda que esto es para aplicar los cambios y es por esto que lo definimos si se cumple esta condicion.
                JOptionPane.showMessageDialog(null,"Compra exitosa!");
                this.dispose();
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRestar = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        lbSinCaratula = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        caratula = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        lbNumPag = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carrito");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 220, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARRITO");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        txtRestar.setBackground(new java.awt.Color(245, 247, 255));
        txtRestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRestar.setForeground(new java.awt.Color(0, 0, 0));
        txtRestar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRestar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRestar.setName(""); // NOI18N
        txtRestar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRestarKeyTyped(evt);
            }
        });
        jPanel1.add(txtRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 90, 26));

        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        btnComprar.setFocusable(false);
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnComprar.setRequestFocusEnabled(false);
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnComprar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 90, 30));

        lbSinCaratula.setBackground(new java.awt.Color(0, 116, 123));
        lbSinCaratula.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbSinCaratula.setForeground(new java.awt.Color(0, 0, 0));
        lbSinCaratula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSinCaratula.setText("Sin Caratula");
        lbSinCaratula.setVisible(false);
        jPanel1.add(lbSinCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("INGRESE CANTIDAD");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 10, 0, new java.awt.Color(153, 204, 255)));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 490, 180));

        caratula.setBackground(new java.awt.Color(0, 153, 153));
        caratula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caratula.setForeground(new java.awt.Color(0, 0, 0));
        caratula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caratula.setOpaque(true);
        jPanel1.add(caratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 210));

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(233, 238, 252));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l1.setText("- Titulo:");
        l1.setOpaque(true);
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 20));

        txtAutor.setBackground(new java.awt.Color(0, 0, 0));
        txtAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(233, 238, 252));
        txtAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAutor.setOpaque(true);
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 25));

        lbCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 130, 180, 20));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 230, 20));

        lbPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lbPrecio.setText(null);
        jPanel1.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 160, 200, 20));

        lbFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 140, 20));

        l2.setBackground(new java.awt.Color(0, 0, 0));
        l2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(233, 238, 252));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l2.setText("- Categoria:");
        l2.setOpaque(true);
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        l5.setBackground(new java.awt.Color(0, 0, 0));
        l5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(233, 238, 252));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l5.setText("- Numero de Paginas:");
        l5.setOpaque(true);
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        l6.setBackground(new java.awt.Color(0, 0, 0));
        l6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l6.setForeground(new java.awt.Color(233, 238, 252));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l6.setText("- Fecha de Publicacion:");
        l6.setOpaque(true);
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        l3.setBackground(new java.awt.Color(0, 0, 0));
        l3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(233, 238, 252));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l3.setText("- Precio:");
        l3.setOpaque(true);
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        l4.setBackground(new java.awt.Color(0, 0, 0));
        l4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(233, 238, 252));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l4.setText("- Cantidad:");
        l4.setOpaque(true);
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        lbCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lbCantidad.setText(null);
        jPanel1.add(lbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, 20));

        lbNumPag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNumPag.setForeground(new java.awt.Color(0, 0, 0));
        lbNumPag.setText(null);
        jPanel1.add(lbNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 140, 20));

        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setVisible(false);
        txtId.setEnabled(false);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (txtRestar.getText().matches("^[0-9]*$")){
            restarCantidad();
        }else{
            JOptionPane.showMessageDialog(null,"Solo Numeros");
        }
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void txtRestarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRestarKeyTyped
        if (txtRestar.getText().length()>=5){
            evt.consume();
        }
        if (evt.getKeyChar()=='\n'){
            if(txtRestar.getText().matches("^[0-9]*$")){
                restarCantidad();
            }else{
                JOptionPane.showMessageDialog(null,"Solo Numeros");
            }
        }
    }//GEN-LAST:event_txtRestarKeyTyped

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
            java.util.logging.Logger.getLogger(ComprarLibroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarLibroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarLibroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarLibroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ComprarLibroVentana dialog = new ComprarLibroVentana(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel caratula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbNumPag;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbSinCaratula;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtRestar;
    // End of variables declaration//GEN-END:variables
}
