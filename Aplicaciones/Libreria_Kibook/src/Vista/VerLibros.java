
package Vista;

import DemoLibros.Animales;
import DemoLibros.Cthulhu;
import DemoLibros.Diseno;
import DemoLibros.Divina_Comedia;
import DemoLibros.Dune;
import DemoLibros.ImperioFinal;
import DemoLibros.The_Hobbit;
import DemoLibros.Nietzsche;
import DemoLibros.Tronos;


import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VerLibros extends javax.swing.JPanel {
    
            
    private JMenuItem verDemo=new JMenuItem("Ver Demo");
    private DefaultTableModel modelo=new DefaultTableModel();
    private Conexion conexion=new Conexion();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public VerLibros() {
        initComponents();
        this.setSize(496,480);
        bloquearEdicionTabla(TablaCompra);
        tamañoColumnas();
        clickDerecho();
        celdaSeleccionada();
    }
    
    
    private void celdaSeleccionada(){
        List<String> libroNombre=new ArrayList<>();
        libroNombre.add("Dune");
        libroNombre.add("Divine Comedy");
        libroNombre.add("The Hobbit");
        libroNombre.add("The Call of the Cthulhu");
        libroNombre.add("Beyond Good and Evil");
        libroNombre.add("The Empire Final");
        libroNombre.add("The Cementery of the Animals");
        libroNombre.add("The Grand Design");
        libroNombre.add("Game of Thrones");
        
        ListSelectionListener dune=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(0))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Dune leerDemoLibro=new Dune(null, true);
                                leerDemoLibro.setVisible(true);
                                Cthulhu cerrar1=new Cthulhu(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Nietzsche cerrar2=new Nietzsche(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Animales cerrar4=new Animales(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar7=new Divina_Comedia(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                The_Hobbit cerrar8=new The_Hobbit(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(dune);
        
        ListSelectionListener comedia=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(1))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Divina_Comedia leerDemoLibro=new Divina_Comedia(null, true);
                                leerDemoLibro.setVisible(true);
                                Cthulhu cerrar1=new Cthulhu(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Nietzsche cerrar2=new Nietzsche(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Animales cerrar4=new Animales(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                The_Hobbit cerrar8=new The_Hobbit(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(comedia);
        
        ListSelectionListener hobbit=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(2))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                The_Hobbit leerDemoLibro=new The_Hobbit(null, true);
                                leerDemoLibro.setVisible(true);
                                Cthulhu cerrar1=new Cthulhu(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Nietzsche cerrar2=new Nietzsche(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Animales cerrar4=new Animales(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(hobbit);
        
        ListSelectionListener cthulhu=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(3))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Cthulhu leerDemoLibro=new Cthulhu(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Nietzsche cerrar2=new Nietzsche(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Animales cerrar4=new Animales(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(cthulhu);
        
        ListSelectionListener bienMal=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(4))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Nietzsche leerDemoLibro=new Nietzsche(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Animales cerrar4=new Animales(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(bienMal);
        
        ListSelectionListener imperio=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(5))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ImperioFinal leerDemoLibro=new ImperioFinal(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                Animales cerrar3=new Animales(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Nietzsche cerrar4=new Nietzsche(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(imperio);
        
        ListSelectionListener animales=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(6))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Animales leerDemoLibro=new Animales(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Nietzsche cerrar4=new Nietzsche(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(animales);
        
        ListSelectionListener diseño=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(7))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Diseno leerDemoLibro=new Diseno(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Nietzsche cerrar4=new Nietzsche(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Animales cerrar5=new Animales(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Tronos cerrar6=new Tronos(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(diseño);
        
        ListSelectionListener tronos=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada, 2);
                    if (titulo.equalsIgnoreCase(libroNombre.get(8))){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Tronos leerDemoLibro=new Tronos(null, true);
                                leerDemoLibro.setVisible(true);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                ImperioFinal cerrar3=new ImperioFinal(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Nietzsche cerrar4=new Nietzsche(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Animales cerrar5=new Animales(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Dune cerrar7=new Dune(null, true);
                                cerrar7.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                                Divina_Comedia cerrar8=new Divina_Comedia(null, true);
                                cerrar8.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(tronos);
        
        ListSelectionListener noDemo=new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()){
                    int filaSeleccionada=TablaCompra.getSelectedRow();
                    int id=(int) TablaCompra.getValueAt(filaSeleccionada,0);
                    String titulo=(String)TablaCompra.getValueAt(filaSeleccionada,2);
                    if (!titulo.equalsIgnoreCase(libroNombre.toString())){
                        ActionListener celda=new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null,"Demo no Disponible");
                                
                                ImperioFinal leerDemoLibro=new ImperioFinal(null, true);
                                leerDemoLibro.setDefaultCloseOperation(leerDemoLibro.EXIT_ON_CLOSE);
                                The_Hobbit cerrar1=new The_Hobbit(null, true);
                                cerrar1.setDefaultCloseOperation(cerrar1.EXIT_ON_CLOSE);
                                Cthulhu cerrar2=new Cthulhu(null, true);
                                cerrar2.setDefaultCloseOperation(cerrar2.EXIT_ON_CLOSE);
                                Animales cerrar3=new Animales(null, true);
                                cerrar3.setDefaultCloseOperation(cerrar3.EXIT_ON_CLOSE);
                                Nietzsche cerrar4=new Nietzsche(null, true);
                                cerrar4.setDefaultCloseOperation(cerrar4.EXIT_ON_CLOSE);
                                Tronos cerrar5=new Tronos(null, true);
                                cerrar5.setDefaultCloseOperation(cerrar5.EXIT_ON_CLOSE);
                                Diseno cerrar6=new Diseno(null, true);
                                cerrar6.setDefaultCloseOperation(cerrar6.EXIT_ON_CLOSE);
                            }
                        };
                        verDemo.addActionListener(celda);
                    }
                }
            }
        };
        TablaCompra.getSelectionModel().addListSelectionListener(noDemo);         
    }
    
    private void clickDerecho(){
        verDemo.setIcon(new ImageIcon(getClass().getResource("/IMG/libro_1.png")));
        opcion.add(verDemo);
        TablaCompra.setComponentPopupMenu(opcion);
    }
    
    private void tamañoColumnas(){
        TablaCompra.getColumnModel().getColumn(0).setPreferredWidth(1);
        TablaCompra.getColumnModel().getColumn(0).setResizable(false);
        TablaCompra.getColumnModel().getColumn(1).setPreferredWidth(60);
        TablaCompra.getColumnModel().getColumn(1).setResizable(false);
        TablaCompra.getColumnModel().getColumn(2).setPreferredWidth(110);
        TablaCompra.getColumnModel().getColumn(2).setResizable(false);
        TablaCompra.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaCompra.getColumnModel().getColumn(3).setResizable(false);
        TablaCompra.getColumnModel().getColumn(4).setPreferredWidth(1);
        TablaCompra.getColumnModel().getColumn(4).setResizable(false);
        TablaCompra.getColumnModel().getColumn(5).setPreferredWidth(1);
        TablaCompra.getColumnModel().getColumn(5).setResizable(false);
        TablaCompra.getColumnModel().getColumn(6).setPreferredWidth(1);
        TablaCompra.getColumnModel().getColumn(6).setResizable(false);
        TablaCompra.getColumnModel().getColumn(7).setPreferredWidth(35);
        TablaCompra.getColumnModel().getColumn(7).setResizable(false);
    }
    
    public void bloquearEdicionTabla(JTable tabla) {
        modelo=(DefaultTableModel)TablaCompra.getModel();
        String columnas[]=new String[modelo.getColumnCount()];
        Object datos[][]=new Object[modelo.getRowCount()][modelo.getColumnCount()];
        
        for (int i=0;i<modelo.getColumnCount();i++){
            columnas[i]=modelo.getColumnName(i);
        }
        
        for (int i=0;i<modelo.getRowCount();i++){
            for (int j=0;j<modelo.getColumnCount();j++){
                datos[i][j]=modelo.getValueAt(i, j);
            }
        }
        
        DefaultTableModel modelo2=new DefaultTableModel(datos,columnas){
            @Override
            public boolean isCellEditable(int datos,int columnas){
                return false;
            }
        };
        TablaCompra.setModel(modelo2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion = new javax.swing.JPopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompra = new javax.swing.JTable();

        opcion.setToolTipText("");

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTA LIBROS");
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        TablaCompra.setModel(modelo);
        TablaCompra.setFocusable(false);
        TablaCompra.setName(""); // NOI18N
        TablaCompra.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaCompra.setShowGrid(true);
        try{
            con=conexion.Conectar();
            ps=con.prepareStatement("select*from Libros");
            rs=ps.executeQuery();
            ResultSetMetaData remd=(ResultSetMetaData) rs.getMetaData();
            int cant=remd.getColumnCount();
            Object filas[]=new Object[cant];
            modelo.addColumn("ID");
            modelo.addColumn("Autor");
            modelo.addColumn("Titulo");
            modelo.addColumn("Categoria");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
            modelo.addColumn("Nº Pag");
            modelo.addColumn("FPublicacion");

            while(rs.next()){
                for (int i=0;i<cant;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        TablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TablaCompraMouseExited(evt);
            }
        });
        TablaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TablaCompraKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCompra);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 710, 505));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaCompraKeyTyped
        
    }//GEN-LAST:event_TablaCompraKeyTyped

    private void TablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCompraMouseClicked
        
    }//GEN-LAST:event_TablaCompraMouseClicked

    private void TablaCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCompraMouseExited
        
    }//GEN-LAST:event_TablaCompraMouseExited

    private void TablaCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCompraMouseEntered
        
    }//GEN-LAST:event_TablaCompraMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCompra;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu opcion;
    // End of variables declaration//GEN-END:variables
}
