
package Vista;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ver_Compras extends javax.swing.JPanel {
    
    
    private DefaultTableModel modelo=new DefaultTableModel();
    
    public Ver_Compras() {
        General datos=ModeloTransferencia.transferencia_de_datos;
        initComponents();
        txtId.setText(datos.getId());
        txtTitulo.setText(datos.getTitulo());
        txtCategoria.setText(datos.getCategoria());
        txtCantidad.setText(String.valueOf(datos.getCantidad()));
        txtAutor.setText(datos.getAutor());
        lbIMG.setIcon(datos.getPortada());
        txtPrecio.setText(String.valueOf(datos.getPrecio()));
        txtFecha.setText(datos.getFecha());
        txtNumPag.setText(String.valueOf(datos.getNumPag()));
        crearDatos();
        NOVisible();
        bloquearTabla(TablaDeCompras);
        tamañoColumnas();
    }
    
    private void NOVisible(){
        lbIMG.setVisible(false);
        txtAutor.setVisible(false);
        txtCantidad.setVisible(false);
        txtCategoria.setVisible(false);
        txtFecha.setVisible(false);
        txtId.setVisible(false);
        txtNumPag.setVisible(false);
        txtPrecio.setVisible(false);
        txtTitulo.setVisible(false);
        txtRestar.setVisible(false);
        
        lbIMG.setEnabled(false);
        txtAutor.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtCategoria.setEnabled(false);
        txtFecha.setEnabled(false);
        txtId.setEnabled(false);
        txtNumPag.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtTitulo.setEnabled(false);
        txtRestar.setEnabled(false);
    }
    
    private void crearDatos(){
        Object añadir[]={txtId.getText(),txtAutor.getText(),txtTitulo.getText(),txtCategoria.getText(),Double.parseDouble(txtPrecio.getText()),
        Integer.parseInt(txtCantidad.getText()),Integer.parseInt(txtNumPag.getText()),txtFecha.getText()};
        modelo.addRow(añadir);
    }
    
    private void tamañoColumnas(){
        TablaDeCompras.getColumnModel().getColumn(0).setPreferredWidth(1);
        TablaDeCompras.getColumnModel().getColumn(0).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(1).setPreferredWidth(60);
        TablaDeCompras.getColumnModel().getColumn(1).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(2).setPreferredWidth(110);
        TablaDeCompras.getColumnModel().getColumn(2).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaDeCompras.getColumnModel().getColumn(3).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(4).setPreferredWidth(1);
        TablaDeCompras.getColumnModel().getColumn(4).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(5).setPreferredWidth(1);
        TablaDeCompras.getColumnModel().getColumn(5).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(6).setPreferredWidth(1);
        TablaDeCompras.getColumnModel().getColumn(6).setResizable(false);
        TablaDeCompras.getColumnModel().getColumn(7).setPreferredWidth(35);
        TablaDeCompras.getColumnModel().getColumn(7).setResizable(false);
    }
    
    private void bloquearTabla(JTable table){
        modelo=(DefaultTableModel)TablaDeCompras.getModel();
        String columnas[]=new String[modelo.getColumnCount()];
        Object datos[][]=new Object[modelo.getRowCount()][modelo.getColumnCount()];
        for (int i=0;i<modelo.getColumnCount();i++){
            columnas[i]=TablaDeCompras.getColumnName(i);
        }
        for (int i=0;i<modelo.getRowCount();i++){
            for (int j=0;j<modelo.getColumnCount();j++){
                datos[i][j]=TablaDeCompras.getValueAt(i,j);
            }
        }
        DefaultTableModel modelo2=new DefaultTableModel(datos,columnas){
          @Override
          public boolean isCellEditable(int datos,int columnas){
              return false;
          }
        };
        TablaDeCompras.setModel(modelo2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtNumPag = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtRestar = new javax.swing.JTextField();
        lbIMG = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tablaIMG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeCompras = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, -1));
        add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, -1));
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, -1));
        add(txtNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 60, -1));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 60, -1));
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, -1));
        add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, -1));
        add(txtRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        lbIMG.setBackground(new java.awt.Color(255, 51, 153));
        lbIMG.setOpaque(true);
        add(lbIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTA DE COMPRA");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));
        add(tablaIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 710, 510));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        TablaDeCompras.setModel(modelo);
        TablaDeCompras.setFocusable(false);
        modelo.addColumn("ID");
        modelo.addColumn("Autor");
        modelo.addColumn("Titulo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Nº Pag");
        modelo.addColumn("FPublicacion");
        jScrollPane1.setViewportView(TablaDeCompras);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 711, 505));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeCompras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIMG;
    private javax.swing.JLabel tablaIMG;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNumPag;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRestar;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
