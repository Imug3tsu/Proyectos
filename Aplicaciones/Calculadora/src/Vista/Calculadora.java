
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {
    
    private String cadenaNumero="";
    private double numero1;  // servira para guardar y convertir la cadena en numero.
    private String operacion="escribir",operacion2="raiz";
    private double mostrarResultado;
    private boolean punto=true,activado=true,raiz=true;
    
    public Calculadora() {
        initComponents();
        this.setSize(330,450);
        this.setLocationRelativeTo(null);
        cambiarColorLetra();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/346399 (1).png")).getImage());
    }
    
    private void teclado(String numero){
        if (operacion.equals("nula") || operacion.equals("raiz")){
            txtMuestra.getText();
        }else if (operacion.equals("escribir")){
            if (txtMuestra.getText().length()<=10){
                if (txtMuestra.getText().equals("0")){
                    cadenaNumero=numero;
                }else{
                    cadenaNumero+=numero;
                }
                txtMuestra.setText(cadenaNumero);
                activado=true;
            }
        }else{
            if (txtMuestra.getText().length()<=10){
                if (txtMuestra.getText().equals("0")){
                    cadenaNumero=numero;
                }else{
                    cadenaNumero+=numero;
                }
                txtMuestra.setText(cadenaNumero);
                activado=true;
            }
        }
    }
    
    private void redimensionartxtMuestra(){
        if (txtMuestra.getText().length()>10){
            txtMuestra.setFont(new Font("Segoe UI",1,25));
        }
    }
    
    private void cambiarColorLetra(){
        MouseAdapter accion1=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnMultiplicacion.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnMultiplicacion.setForeground(color);
            }
        };
        btnMultiplicacion.addMouseListener(accion1);
        MouseAdapter accion2=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDivision.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnDivision.setForeground(color);
            }
        };
        btnDivision.addMouseListener(accion2);
        
        MouseAdapter accion3=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSuma.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnSuma.setForeground(color);
            }
        };
        btnSuma.addMouseListener(accion3);
        
        MouseAdapter accion4=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnResta.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnResta.setForeground(color);
            }
        };
        btnResta.addMouseListener(accion4);
        
        MouseAdapter accion5=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnRaiz.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnRaiz.setForeground(color);
            }
        };
        btnRaiz.addMouseListener(accion5);
        
        MouseAdapter accion6=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnBorrar.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,185,1);
                btnBorrar.setForeground(color);
            }
        };
        btnBorrar.addMouseListener(accion6);
        
        MouseAdapter accion7=new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnIgual.setForeground(Color.BLACK);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                Color color=new Color(255,255,255);
                btnIgual.setForeground(color);
            }
        };
        btnIgual.addMouseListener(accion7);
    }
    
    private void Cuenta(String simbolo,String cuenta){
        if (activado==true){
            numero1=Double.parseDouble(cadenaNumero);
            if (numero1%1!=0){
                txtResultado.setText(cadenaNumero+simbolo);
            }else{
                txtResultado.setText(String.format("%.0f",numero1)+simbolo);
            }
            operacion=cuenta;
            cadenaNumero="";
            activado=false;
            punto=true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnMasMenos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txtMuestra = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Estandar = new javax.swing.JMenuItem();
        Divisas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(34, 36, 51));
        setMinimumSize(new java.awt.Dimension(330, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 450));

        jPanel2.setBackground(new java.awt.Color(34, 36, 51));

        jPanel3.setBackground(new java.awt.Color(34, 36, 51));
        jPanel3.setLayout(new java.awt.GridLayout(5, 4));

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnReset.setText("C");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReset.setDisabledIcon(null);
        btnReset.setFocusable(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setMaximumSize(new java.awt.Dimension(78, 48));
        btnReset.setMinimumSize(new java.awt.Dimension(78, 48));
        btnReset.setPreferredSize(new java.awt.Dimension(78, 48));
        btnReset.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btnReset.setRequestFocusEnabled(false);
        btnReset.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset);

        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 185, 1));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDivision.setDisabledIcon(null);
        btnDivision.setFocusable(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setMaximumSize(new java.awt.Dimension(78, 48));
        btnDivision.setMinimumSize(new java.awt.Dimension(78, 48));
        btnDivision.setOpaque(true);
        btnDivision.setPreferredSize(new java.awt.Dimension(78, 48));
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnDivision.setRequestFocusEnabled(false);
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel3.add(btnDivision);

        btnRaiz.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 185, 1));
        btnRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnRaiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRaiz.setDisabledIcon(null);
        btnRaiz.setFocusable(false);
        btnRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaiz.setMaximumSize(new java.awt.Dimension(78, 48));
        btnRaiz.setMinimumSize(new java.awt.Dimension(78, 48));
        btnRaiz.setPreferredSize(new java.awt.Dimension(78, 48));
        btnRaiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnRaiz.setRequestFocusEnabled(false);
        btnRaiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel3.add(btnRaiz);

        btnBorrar.setBackground(new java.awt.Color(44, 47, 66));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 185, 1));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnBorrar.setText("DEL");
        btnBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.setFocusable(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setMaximumSize(new java.awt.Dimension(78, 48));
        btnBorrar.setMinimumSize(new java.awt.Dimension(78, 48));
        btnBorrar.setPreferredSize(new java.awt.Dimension(78, 48));
        btnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnBorrar.setRequestFocusEnabled(false);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar);

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setDisabledIcon(null);
        btn7.setFocusable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setMaximumSize(new java.awt.Dimension(78, 48));
        btn7.setMinimumSize(new java.awt.Dimension(78, 48));
        btn7.setPreferredSize(new java.awt.Dimension(78, 48));
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn7.setRequestFocusEnabled(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setDisabledIcon(null);
        btn8.setFocusable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setMaximumSize(new java.awt.Dimension(78, 48));
        btn8.setMinimumSize(new java.awt.Dimension(78, 48));
        btn8.setPreferredSize(new java.awt.Dimension(78, 48));
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn8.setRequestFocusEnabled(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setDisabledIcon(null);
        btn9.setFocusable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setMaximumSize(new java.awt.Dimension(78, 48));
        btn9.setMinimumSize(new java.awt.Dimension(78, 48));
        btn9.setPreferredSize(new java.awt.Dimension(78, 48));
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn9.setRequestFocusEnabled(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn9);

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 185, 1));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnMultiplicacion.setText("X");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnMultiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultiplicacion.setDisabledIcon(null);
        btnMultiplicacion.setFocusable(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setMaximumSize(new java.awt.Dimension(78, 48));
        btnMultiplicacion.setMinimumSize(new java.awt.Dimension(78, 48));
        btnMultiplicacion.setPreferredSize(new java.awt.Dimension(78, 48));
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnMultiplicacion.setRequestFocusEnabled(false);
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel3.add(btnMultiplicacion);

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setDisabledIcon(null);
        btn4.setFocusable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setMaximumSize(new java.awt.Dimension(78, 48));
        btn4.setMinimumSize(new java.awt.Dimension(78, 48));
        btn4.setPreferredSize(new java.awt.Dimension(78, 48));
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn4.setRequestFocusEnabled(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setDisabledIcon(null);
        btn5.setFocusable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setMaximumSize(new java.awt.Dimension(78, 48));
        btn5.setMinimumSize(new java.awt.Dimension(78, 48));
        btn5.setPreferredSize(new java.awt.Dimension(78, 48));
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn5.setRequestFocusEnabled(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setDisabledIcon(null);
        btn6.setFocusable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setMaximumSize(new java.awt.Dimension(78, 48));
        btn6.setMinimumSize(new java.awt.Dimension(78, 48));
        btn6.setPreferredSize(new java.awt.Dimension(78, 48));
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn6.setRequestFocusEnabled(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn6);

        btnResta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 185, 1));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnResta.setDisabledIcon(null);
        btnResta.setFocusable(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setMaximumSize(new java.awt.Dimension(78, 48));
        btnResta.setMinimumSize(new java.awt.Dimension(78, 48));
        btnResta.setPreferredSize(new java.awt.Dimension(78, 48));
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnResta.setRequestFocusEnabled(false);
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel3.add(btnResta);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setDisabledIcon(null);
        btn1.setFocusable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setMaximumSize(new java.awt.Dimension(78, 48));
        btn1.setMinimumSize(new java.awt.Dimension(78, 48));
        btn1.setPreferredSize(new java.awt.Dimension(78, 48));
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn1.setRequestFocusEnabled(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setDisabledIcon(null);
        btn2.setFocusable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setMaximumSize(new java.awt.Dimension(78, 48));
        btn2.setMinimumSize(new java.awt.Dimension(78, 48));
        btn2.setPreferredSize(new java.awt.Dimension(78, 48));
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn2.setRequestFocusEnabled(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setDisabledIcon(null);
        btn3.setFocusable(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setMaximumSize(new java.awt.Dimension(78, 48));
        btn3.setMinimumSize(new java.awt.Dimension(78, 48));
        btn3.setPreferredSize(new java.awt.Dimension(78, 48));
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn3.setRequestFocusEnabled(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn3);

        btnSuma.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 185, 1));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSuma.setDisabledIcon(null);
        btnSuma.setFocusable(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setMaximumSize(new java.awt.Dimension(78, 48));
        btnSuma.setMinimumSize(new java.awt.Dimension(78, 48));
        btnSuma.setPreferredSize(new java.awt.Dimension(78, 48));
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnSuma.setRequestFocusEnabled(false);
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAmarilloFocus.jpg"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSuma);

        btnMasMenos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnMasMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnMasMenos.setText("±");
        btnMasMenos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnMasMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMasMenos.setDisabledIcon(null);
        btnMasMenos.setFocusable(false);
        btnMasMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMasMenos.setMaximumSize(new java.awt.Dimension(78, 48));
        btnMasMenos.setMinimumSize(new java.awt.Dimension(78, 48));
        btnMasMenos.setPreferredSize(new java.awt.Dimension(78, 48));
        btnMasMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btnMasMenos.setRequestFocusEnabled(false);
        btnMasMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btnMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMenosActionPerformed(evt);
            }
        });
        jPanel3.add(btnMasMenos);

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn0.setDisabledIcon(null);
        btn0.setFocusable(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setMaximumSize(new java.awt.Dimension(78, 48));
        btn0.setMinimumSize(new java.awt.Dimension(78, 48));
        btn0.setPreferredSize(new java.awt.Dimension(78, 48));
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btn0.setRequestFocusEnabled(false);
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel3.add(btn0);

        btnPunto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn.jpg"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPunto.setDisabledIcon(null);
        btnPunto.setFocusable(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setMaximumSize(new java.awt.Dimension(78, 48));
        btnPunto.setMinimumSize(new java.awt.Dimension(78, 48));
        btnPunto.setPreferredSize(new java.awt.Dimension(78, 48));
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFinal.jpg"))); // NOI18N
        btnPunto.setRequestFocusEnabled(false);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnFocus.jpg"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPunto);

        btnIgual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgual.jpg"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIgual.setDisabledIcon(null);
        btnIgual.setFocusable(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setMaximumSize(new java.awt.Dimension(78, 48));
        btnIgual.setMinimumSize(new java.awt.Dimension(78, 48));
        btnIgual.setPreferredSize(new java.awt.Dimension(78, 48));
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgualPresionado.jpg"))); // NOI18N
        btnIgual.setRequestFocusEnabled(false);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIgualFocus.jpg"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel3.add(btnIgual);

        txtMuestra.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        txtMuestra.setForeground(new java.awt.Color(255, 255, 255));
        txtMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtMuestra.setText("0");
        txtMuestra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMuestraKeyTyped(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(153, 153, 153));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(txtResultado)
                .addGap(26, 26, 26)
                .addComponent(txtMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 0, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(34, 36, 51)));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(34, 36, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jMenu1.setFocusable(false);
        jMenu1.setOpaque(true);
        jMenu1.setRequestFocusEnabled(false);
        jMenu1.setRolloverEnabled(false);

        Estandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora1.png"))); // NOI18N
        Estandar.setText("Calculadora estandar");
        Estandar.setOpaque(true);
        Estandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstandarActionPerformed(evt);
            }
        });
        jMenu1.add(Estandar);

        Divisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moneda1.png"))); // NOI18N
        Divisas.setText("Conversor de Divisas");
        Divisas.setOpaque(true);
        Divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisasActionPerformed(evt);
            }
        });
        jMenu1.add(Divisas);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(34, 36, 51));
        jMenu2.setForeground(new java.awt.Color(34, 36, 51));
        jMenu2.setEnabled(false);
        jMenu2.setFocusable(false);
        jMenu2.setMaximumSize(new java.awt.Dimension(300, 32767));
        jMenu2.setOpaque(true);
        jMenu2.setPreferredSize(new java.awt.Dimension(305, 22));
        jMenu2.setRequestFocusEnabled(false);
        jMenu2.setRolloverEnabled(false);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cadenaNumero="0";
        txtMuestra.setText(cadenaNumero);
        cadenaNumero="";
        txtResultado.setText("");
        operacion="escribir";
        punto=true;
        activado=true;
        txtMuestra.setFont(new Font("Segoe UI",1,40));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        Cuenta("/", "division");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        numero1=Double.parseDouble(cadenaNumero);
        txtResultado.setText("√("+cadenaNumero+")");
        mostrarResultado=Math.sqrt(numero1);
        if (mostrarResultado%1==0){
            txtMuestra.setText(String.format("%.0f",mostrarResultado));
        }else{
            txtMuestra.setText(String.format("%.2f",mostrarResultado));
        }
        cadenaNumero=String.valueOf(mostrarResultado);
        operacion="raiz";
        raiz=true;
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (operacion.equals("nula") || operacion.equals("raiz")){
            txtMuestra.getText();
        }else{
            if (cadenaNumero.length()>0){
                if (cadenaNumero.length()==1){
                    cadenaNumero="0";
                }else{
                    cadenaNumero=cadenaNumero.substring(0,cadenaNumero.length()-1);
                }
                txtMuestra.setText(cadenaNumero);
            }
        }
        punto=true;
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        teclado("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        teclado("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        teclado("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        Cuenta("X", "multiplicacion");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        teclado("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        teclado("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        teclado("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        Cuenta("-", "resta");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        teclado("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        teclado("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        teclado("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        Cuenta("+", "suma");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMenosActionPerformed
        if (cadenaNumero.charAt(0)!='-') {
            cadenaNumero="-"+cadenaNumero;
            numero1=Double.parseDouble(cadenaNumero);
            if (numero1%1==0){
                cadenaNumero=String.format("%.0f",numero1);
            }
        }else{
            cadenaNumero=cadenaNumero.replaceAll("-","");
            //cadenaNumero=cadenaNumero.replaceAll(".0","");
        }
        txtMuestra.setText(cadenaNumero);
        redimensionartxtMuestra();
    }//GEN-LAST:event_btnMasMenosActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        teclado("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (operacion.equals("nula") || operacion.equals("raiz")){
            txtMuestra.getText();
        }else{
            if (punto==true){
                if (cadenaNumero!=""){
                    cadenaNumero+=".";
                }else{
                    cadenaNumero="0.";
                }
            }
            txtMuestra.setText(cadenaNumero);
            punto=false;
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        double numero2;
        numero2=Double.parseDouble(cadenaNumero);
        
        if (operacion.equals("nula")){
            txtMuestra.setText(cadenaNumero);
        }else if (operacion.equals("suma")){
            IgualSuma(numero2);
            
        }else if (operacion.equals("resta")){
            IgualResta(numero2);
            
        }else if (operacion.equals("multiplicacion")){
            IgualMultiplicacion(numero2);
            
        }else if (operacion.equals("division")){
            IgualDivision(numero2);
        }
        operacion="nula";
        txtResultado.setText("");
        activado=true;
    }//GEN-LAST:event_btnIgualActionPerformed

    private void IgualDivision(double numero2) {
        if (numero2==0){
            txtMuestra.setText("Error");
        }else{
            if ((numero1/numero2)%1!=0){
                mostrarResultado=numero1/numero2;
                txtMuestra.setText(String.format("%.2f",mostrarResultado));
            }else{
                mostrarResultado=numero1/numero2;
                txtMuestra.setText(String.format("%.0f",mostrarResultado));
            }
        }
        cadenaNumero=String.valueOf(mostrarResultado);
    }

    private void IgualMultiplicacion(double numero2) {
        if ((numero1*numero2)%1!=0){
            mostrarResultado=numero1*numero2;
            txtMuestra.setText(String.format("%.2f",mostrarResultado));
        }else{
            mostrarResultado=numero1*numero2;
            txtMuestra.setText(String.format("%.0f",mostrarResultado));
        }
        cadenaNumero=String.valueOf(mostrarResultado);
    }

    private void IgualResta(double numero2) {
        if ((numero1-numero2)%1!=0){
            mostrarResultado=numero1-numero2;
            txtMuestra.setText(String.format("%.2f",mostrarResultado));
        }else{
            mostrarResultado=numero1-numero2;
            txtMuestra.setText(String.format("%.0f",mostrarResultado));
        }
        cadenaNumero=String.valueOf(mostrarResultado);
    }

    private void IgualSuma(double numero2) {
        if ((numero1+numero2)%1!=0){
            mostrarResultado=numero1+numero2;
            txtMuestra.setText(String.format("%.2f",mostrarResultado));
        }else{
            mostrarResultado=numero1+numero2;
            txtMuestra.setText(String.format("%.0f",mostrarResultado));
        }
        cadenaNumero=String.valueOf(mostrarResultado);
    }

    private void DivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisasActionPerformed
        Divisas div=new Divisas();
        div.setVisible(true);
        dispose();  //  sirve para cerrar otra JFrame que abrimos y abrimos otro.
    }//GEN-LAST:event_DivisasActionPerformed

    private void EstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstandarActionPerformed

    private void txtMuestraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMuestraKeyTyped
        
    }//GEN-LAST:event_txtMuestraKeyTyped

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Divisas;
    private javax.swing.JMenuItem Estandar;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMasMenos;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtMuestra;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
