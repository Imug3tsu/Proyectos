
package Vista;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AnadirLibros extends javax.swing.JPanel {
    
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Conexion conexion=new Conexion();
    private Date fecha=new Date();
    private SimpleDateFormat fechaFormat=new SimpleDateFormat("yyyy-mm-dd");
    
    public AnadirLibros() {
        initComponents();
        placeholder();
        this.setLocation(0,0);
    }
    
    private void limpiarCajas(){
        txtAutor.setText(null);
        txtCantidad.setText(null);
        txtCategoria.setText(null);
        txtRestar.setText(null);
        txtPrecio.setText(null);
        txtTitulo.setText(null);
        txtNumPag.setText(null);
        txtId.setText(null);
        txtFecha.setText(null);
    }
    
    private void placeholder(){
        TextPrompt placeHolder1=new TextPrompt("Ingrese Autor", txtAutor);
        TextPrompt placeHolder2=new TextPrompt("Ingrese Titulo", txtTitulo);
        TextPrompt placeHolder3=new TextPrompt("Ingrese Precio", txtPrecio);
        TextPrompt placeHolder4=new TextPrompt("Ingrese Stock", txtCantidad);
        TextPrompt placeHolder5=new TextPrompt("Ingrese Genero", txtCategoria);
        TextPrompt placeHolder6=new TextPrompt("Ingrese cantidad de paginas", txtNumPag);
        TextPrompt placeHolder7=new TextPrompt("Ingrese Fecha", txtFecha);
        placeHolder1.setForeground(Color.GRAY);
        placeHolder2.setForeground(Color.GRAY);
        placeHolder3.setForeground(Color.GRAY);
        placeHolder4.setForeground(Color.GRAY);
        placeHolder5.setForeground(Color.GRAY);
        placeHolder6.setForeground(Color.GRAY);
        placeHolder7.setForeground(Color.GRAY);
    }
    
    public void BuscarLibro(){
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("select*from Libros where id=?");
            ps.setString(1,txtId.getText());
            rs=ps.executeQuery();

            if (rs.next()){
                txtAutor.setText(rs.getString("autor"));
                txtTitulo.setText(rs.getString("titulo"));
                txtCategoria.setText(rs.getString("categoria"));
                txtPrecio.setText(rs.getString("precio"));
                txtCantidad.setText(rs.getString("cantidad"));
                txtNumPag.setText(rs.getString("numPag"));
                txtFecha.setText(rs.getString("fecha_de_publicacion"));
                txtRestar.setText(rs.getString("restar"));
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el Libro");
            }
            ps.executeQuery();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRestar = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtNumPag = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(245, 247, 255));
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtId.setName(""); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 60, 26));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("ID:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 50, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnBuscar.setRequestFocusEnabled(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 435, 90, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("o eliminar libro.");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("para modificar");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Buscar por");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Autor:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, -1));

        txtAutor.setBackground(new java.awt.Color(245, 247, 255));
        txtAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAutor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 204, 255)));
        txtAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAutor.setName(""); // NOI18N
        txtAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutorMouseClicked(evt);
            }
        });
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });
        add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 26));
        txtAutor.getAccessibleContext().setAccessibleName("");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Categoria:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        txtCategoria.setBackground(new java.awt.Color(245, 247, 255));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCategoria.setName(""); // NOI18N
        txtCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCategoriaMouseClicked(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 26));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Precio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 70, -1));

        txtPrecio.setBackground(new java.awt.Color(245, 247, 255));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecio.setName(""); // NOI18N
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioMouseClicked(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 190, 26));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cantidad:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 110, -1));

        txtCantidad.setBackground(new java.awt.Color(245, 247, 255));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCantidad.setName(""); // NOI18N
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 190, 26));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Fecha de Publicacion:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 190, -1));

        txtRestar.setBackground(new java.awt.Color(245, 247, 255));
        txtRestar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRestar.setText("0");
        txtRestar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 204, 255)));
        txtRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRestar.setName(""); // NOI18N
        txtRestar.setVisible(false);
        txtRestar.setEnabled(false);
        add(txtRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 60, 24));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnLimpiar.setText("Limpiar Cajas");
        btnLimpiar.setBorder(null);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnLimpiar.setRequestFocusEnabled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 494, 190, 50));

        btnAñadir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setBorder(null);
        btnAñadir.setFocusable(false);
        btnAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAñadir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnAñadir.setRequestFocusEnabled(false);
        btnAñadir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnAñadir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 494, 180, 50));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnModificar.setRequestFocusEnabled(false);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnModificar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 494, 170, 50));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnEliminar.setRequestFocusEnabled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Focus.jpg"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btn1Bib2Final.jpg"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 494, 170, 50));

        jLabel11.setBackground(new java.awt.Color(233, 238, 252));
        jLabel11.setOpaque(true);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 350, 80));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INSERTE DATOS DEL LIBRO");
        jLabel9.setOpaque(true);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(233, 238, 252));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" \n    En este apartado podra agregar los diferentes parametros\n    que ofrece el software \"Kibook\" y con ello añadir, modificar, eliminar libros.\n\n\n    Abajo se encuentra la funcion de buscar el libro por (ID) de manera mas \n    sencilla, para modificar sus parametros.    ");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 510, 180));

        txtNumPag.setBackground(new java.awt.Color(245, 247, 255));
        txtNumPag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumPag.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 204, 255)));
        txtNumPag.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumPag.setName(""); // NOI18N
        txtNumPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumPagMouseClicked(evt);
            }
        });
        txtNumPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPagKeyTyped(evt);
            }
        });
        add(txtNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 190, 26));

        txtFecha.setBackground(new java.awt.Color(245, 247, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setToolTipText("Orden para ingresar fecha YYYY-MM-DD");
        txtFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 204, 255)));
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFecha.setName(""); // NOI18N
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 26));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Numero de Paginas:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 160, -1));

        jLabel2.setBackground(new java.awt.Color(0, 173, 222));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 499, 710, 50));

        txtTitulo.setBackground(new java.awt.Color(245, 247, 255));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 204, 255)));
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTitulo.setName(""); // NOI18N
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTituloMouseClicked(evt);
            }
        });
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 190, 26));
        txtTitulo.getAccessibleContext().setAccessibleName("");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Titulo:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/libro2 (1).png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 180));

        jLabel3.setBackground(new java.awt.Color(217, 232, 252));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 710, 470));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(233, 238, 252));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText(" En este apartado\n podra agregar los\n diferentes parametros\n que ofrece el software\n Cuspide y con ello\n añadir, modificar,\n eliminar libros.");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 144, 223));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("insert into Libros(autor,titulo,categoria,precio,cantidad,numPag,fecha_de_publicacion,restar)values(?,?,?,?,?,?,?,?)");
            ps.setString(1,txtAutor.getText());
            ps.setString(2,txtTitulo.getText());
            ps.setString(3,txtCategoria.getText());
            ps.setDouble(4,Double.parseDouble(txtPrecio.getText()));
            ps.setInt(5,Integer.parseInt(txtCantidad.getText()));
            ps.setInt(6,Integer.parseInt(txtNumPag.getText()));
            ps.setString(7,txtFecha.getText());
            ps.setInt(8,Integer.parseInt(txtRestar.getText()));
            //ps.setDate(7,fechaFormat.format(fecha));
            int resultado=ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null,"Libro Agregado");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al agregar Libro");
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("update Libros set autor=?,titulo=?,categoria=?,precio=?,cantidad=?,numPag=?,fecha_de_publicacion=?,restar=? where id=?");
            ps.setString(1,txtAutor.getText());
            ps.setString(2,txtTitulo.getText());
            ps.setString(3,txtCategoria.getText());
            ps.setDouble(4,Double.parseDouble(txtPrecio.getText()));
            ps.setInt(5,Integer.parseInt(txtCantidad.getText()));
            ps.setInt(6,Integer.parseInt(txtNumPag.getText()));
            ps.setString(7,txtFecha.getText());
            ps.setInt(8,Integer.parseInt(txtRestar.getText()));
            ps.setString(9,txtId.getText());
            int resultado=ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null,"Libro Modificado");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar Libro");
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("delete from Libros where id=?");
            ps.setString(1,txtId.getText());
            int resultado=ps.executeUpdate();
            if (resultado>0){
                JOptionPane.showMessageDialog(null,"Libro Eliminado");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar Libro");
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutorMouseClicked
        //cajaSelected(txtAutor);
    }//GEN-LAST:event_txtAutorMouseClicked

    private void txtCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCategoriaMouseClicked
        //cajaSelected(txtCategoria);
    }//GEN-LAST:event_txtCategoriaMouseClicked

    private void txtPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMouseClicked
        //cajaSelected(txtPrecio);
    }//GEN-LAST:event_txtPrecioMouseClicked

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
        //cajaSelected(txtCantidad);
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        //cajaSelected(txtFecha);
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtNumPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumPagMouseClicked
        //cajaSelected(txtNumPag);
    }//GEN-LAST:event_txtNumPagMouseClicked

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        //cajaSelected(txtAutor);
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        //cajaSelected(txtCategoria);
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //cajaSelected(txtPrecio);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //cajaSelected(txtCantidad);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        //cajaSelected(txtFecha);
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtNumPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPagKeyTyped
        //cajaSelected(txtNumPag);
    }//GEN-LAST:event_txtNumPagKeyTyped

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        //cajaSelected(txtTitulo);
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMouseClicked
        //cajaSelected(txtTitulo);
    }//GEN-LAST:event_txtTituloMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarLibro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        if(evt.getKeyChar()=='\n'){
            BuscarLibro();
        }
    }//GEN-LAST:event_txtIdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
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
