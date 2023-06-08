
package Modo_Oscuro;

import Vista.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Comprar1 extends javax.swing.JPanel {
    
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private ImageIcon portada;
    private String titulo;
    private String autor;
    private int cantidad;
    private double precio;
    private String categoria;
    private String fecha;
    private int numPag;
    private String id;
    private Conexion conexion=new Conexion();
    private General datos=new General();
    
    public Comprar1() {
        initComponents();
        TextPrompt placeHolder1=new TextPrompt("Ingrese Titulo del Libro", txtTitulo);
        placeHolder1.setForeground(Color.GRAY);
        noVisible();
    }
    
    private void verificarCaratula(){
        List<String> listaTitulos=new ArrayList<>();
        listaTitulos.add("The Cats of Ulthar");
        listaTitulos.add("The Call of the Cthulhu");
        listaTitulos.add("The Necronomicon");
        listaTitulos.add("Beyond Good and Evil");
        listaTitulos.add("God is Dead");
        listaTitulos.add("So Speak Zaratustra");
        listaTitulos.add("The antichrist");
        listaTitulos.add("The Empire Final");
        listaTitulos.add("The Road of the Kings");
        listaTitulos.add("White Sand");
        listaTitulos.add("The Raven");
        listaTitulos.add("The Black Cat");
        listaTitulos.add("Annabel Lee");
        listaTitulos.add("It");
        listaTitulos.add("Cujo");
        listaTitulos.add("The Cementery of the Animals");
        listaTitulos.add("The Hobbit");
        listaTitulos.add("The Sir of the Rings");
        listaTitulos.add("The Fall of Gondolin");
        listaTitulos.add("The Songs of the Húrin");
        listaTitulos.add("The Grand Design");
        listaTitulos.add("Theory About Relativity");
        listaTitulos.add("Divine Comedy");
        listaTitulos.add("Dune");
        listaTitulos.add("Game of Thrones");
        
        
        if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(0))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/ll.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(1))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/asd.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(2))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/necronomicon.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(3))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/good.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(4))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/god is dead.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(5))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/zaratustra.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(6))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/anticristo.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(7))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/empire.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(8))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/reyes.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(9))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/white.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(10))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/cuervo.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(11))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/gato_negro.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(12))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/annabel_lee.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(13))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/it.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(14))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/cujo.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(15))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/cementerio_animales.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(16))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/hobbit.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(17))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/anillos_señor.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(18))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/gondolin.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(19))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/hurin.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(20))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/diseño.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(21))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/relatividad.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(22))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/comedia.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(23))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/dune.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText().equalsIgnoreCase(listaTitulos.get(24))){
            caratula.setIcon(new ImageIcon(getClass().getResource("/IMG/thrones.jpg")));
            btnComprar.setEnabled(true);
            noEncontrado.setVisible(false);
        }else if (txtTitulo.getText()!=listaTitulos.toString()){
            caratula.setIcon(new ImageIcon("none"));
            lbSinCaratula.setVisible(true);
            btnComprar.setVisible(true);
            noEncontrado.setVisible(false);
        }
    }
    
    private void noVisible(){
        btnComprar.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        lbAutor.setVisible(false);
        caratula.setVisible(false);
        mostrarLibro.setVisible(false);
    }
    
    private void noVisible2(){
        btnComprar.setEnabled(false);
        lbAutor.setVisible(false);
        lbCantidad.setVisible(false);
        lbCategoria.setVisible(false);
        lbFecha.setVisible(false);
        lbNumPag.setVisible(false);
        lbPrecio.setVisible(false);
        lbTitulo.setVisible(false);
    }
    
    private void Visible2(){
        btnComprar.setEnabled(true);
        lbAutor.setVisible(true);
        lbCantidad.setVisible(true);
        lbCategoria.setVisible(true);
        lbFecha.setVisible(true);
        lbNumPag.setVisible(true);
        lbPrecio.setVisible(true);
        lbTitulo.setVisible(true);
    }
    
    private void Visible(){
        btnComprar.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(true);
        lbAutor.setVisible(true);
        caratula.setVisible(true);
        mostrarLibro.setVisible(true);
    }
    
    private void buscarLibro(){
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("select*from Libros where titulo=?");
            ps.setString(1,txtTitulo.getText());
            rs=ps.executeQuery();
            Visible();
            Visible2();
            verificarCaratula();
            
            if (rs.next()){
                lbAutor.setText(rs.getString("autor"));
                lbTitulo.setText(rs.getString("titulo"));
                lbCategoria.setText(rs.getString("categoria"));
                lbPrecio.setText(rs.getString("precio"));
                lbCantidad.setText(rs.getString("cantidad"));
                lbNumPag.setText(rs.getString("numPag"));
                lbFecha.setText(rs.getString("fecha_de_publicacion"));
                lbId.setText(rs.getString("id"));
            }else{
                lbSinCaratula.setVisible(false);
                noEncontrado.setVisible(true);
                noVisible();
                noVisible2();
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

        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbNumPag = new javax.swing.JLabel();
        lbAutor = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        noEncontrado = new javax.swing.JLabel();
        lbSinCaratula = new javax.swing.JLabel();
        caratula = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        mostrarLibro = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(90, 94, 130));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COMPRAR");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        txtTitulo.setBackground(new java.awt.Color(245, 247, 255));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(63, 65, 96)));
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTitulo.setName(""); // NOI18N
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
        });
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
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 320, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Titulo:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel1.setBackground(new java.awt.Color(124, 128, 164));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese Titulo de Libro");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 430, 40));

        lbNumPag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNumPag.setForeground(new java.awt.Color(0, 0, 0));
        add(lbNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 140, 20));

        lbAutor.setBackground(new java.awt.Color(0, 0, 0));
        lbAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAutor.setForeground(new java.awt.Color(233, 238, 252));
        lbAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAutor.setOpaque(true);
        add(lbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 150, 25));

        lbFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(0, 0, 0));
        add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 150, 20));

        lbCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCantidad.setForeground(new java.awt.Color(0, 0, 0));
        add(lbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 110, 20));

        lbCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        add(lbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 260, 20));

        lbPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(0, 0, 0));
        add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 130, 20));

        noEncontrado.setBackground(new java.awt.Color(0, 0, 0));
        noEncontrado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        noEncontrado.setForeground(new java.awt.Color(233, 238, 252));
        noEncontrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noEncontrado.setText("LIBRO NO ENCONTRADO");
        noEncontrado.setOpaque(true);
        noEncontrado.setVisible(false);
        add(noEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 360, 50));

        lbSinCaratula.setBackground(new java.awt.Color(0, 116, 123));
        lbSinCaratula.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbSinCaratula.setForeground(new java.awt.Color(0, 0, 0));
        lbSinCaratula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSinCaratula.setText("Sin Caratula");
        lbSinCaratula.setVisible(false);
        add(lbSinCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 130, -1));

        caratula.setBackground(new java.awt.Color(0, 153, 153));
        caratula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caratula.setForeground(new java.awt.Color(0, 0, 0));
        caratula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caratula.setOpaque(true);
        add(caratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 150, 210));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 270, 20));

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(233, 238, 252));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l1.setText("- Titulo:");
        l1.setOpaque(true);
        add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        l2.setBackground(new java.awt.Color(0, 0, 0));
        l2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(233, 238, 252));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l2.setText("- Categoria:");
        l2.setOpaque(true);
        add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        l3.setBackground(new java.awt.Color(0, 0, 0));
        l3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(233, 238, 252));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l3.setText("- Precio:");
        l3.setOpaque(true);
        add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        l4.setBackground(new java.awt.Color(0, 0, 0));
        l4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(233, 238, 252));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l4.setText("- Cantidad:");
        l4.setOpaque(true);
        add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        l5.setBackground(new java.awt.Color(0, 0, 0));
        l5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(233, 238, 252));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l5.setText("- Numero de Paginas:");
        l5.setOpaque(true);
        add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        l6.setBackground(new java.awt.Color(0, 0, 0));
        l6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l6.setForeground(new java.awt.Color(233, 238, 252));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l6.setText("- Fecha de Publicacion:");
        l6.setOpaque(true);
        add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        lbId.setVisible(false);
        lbId.setEnabled(false);
        add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 50, 30));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 68, 96)));
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnBuscar.setRequestFocusEnabled(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 90, 30));

        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro1.jpg"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 68, 96)));
        btnComprar.setFocusable(false);
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro3.jpg"))); // NOI18N
        btnComprar.setRequestFocusEnabled(false);
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/oscuro2.jpg"))); // NOI18N
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 90, 30));

        mostrarLibro.setBackground(new java.awt.Color(106, 107, 129));
        mostrarLibro.setOpaque(true);
        add(mostrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 590, 300));

        label.setBackground(new java.awt.Color(151, 154, 182));
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setOpaque(true);
        add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 140, 710, 410));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarLibro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        datos.setId(lbId.getText());
        datos.setAutor(lbAutor.getText());
        datos.setTitulo(lbTitulo.getText());
        datos.setCategoria(lbCategoria.getText());
        datos.setPrecio(Double.parseDouble(lbPrecio.getText()));
        datos.setCantidad(Integer.parseInt(lbCantidad.getText()));
        datos.setNumPag(Integer.parseInt(lbNumPag.getText()));
        datos.setFecha(lbFecha.getText());
        datos.setPortada((ImageIcon) caratula.getIcon());
        ComprarLibroVentana1 com=new ComprarLibroVentana1(null, true,datos);
        com.setVisible(true);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        if (txtTitulo.getText().length()>=40){
            evt.consume();
        }
        if (evt.getKeyChar()=='\n'){
            buscarLibro();
        }
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        
    }//GEN-LAST:event_txtTituloFocusGained

    private void txtTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMouseClicked
        
    }//GEN-LAST:event_txtTituloMouseClicked
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel caratula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNumPag;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbSinCaratula;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel mostrarLibro;
    private javax.swing.JLabel noEncontrado;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
