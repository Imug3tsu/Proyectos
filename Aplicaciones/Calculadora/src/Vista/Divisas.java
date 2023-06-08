
package Vista;

import javax.swing.ImageIcon;

public class Divisas extends javax.swing.JFrame {
    
    private String cantidad="";
    private double dinero,cambio;
    private boolean punto=true,seleccionado=true;
    private String de="",a="";
    
    public Divisas() {
        initComponents();
        this.setSize(407, 550);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/346399 (1).png")).getImage());
    }

    private void Teclado(String numero){
        if (txtCambio1.getText().length()<=10){
            if (txtCambio1.getText().equals("0")){
                cantidad=numero;
            }else{
                cantidad+=numero;
            }
            txtCambio1.setText(cantidad);
            obtenerConversion();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        simbolo1 = new javax.swing.JLabel();
        txtCambio1 = new javax.swing.JLabel();
        cbx1 = new javax.swing.JComboBox<>();
        cbx2 = new javax.swing.JComboBox<>();
        simbolo2 = new javax.swing.JLabel();
        txtCambio2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Calculadora = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(34, 36, 51));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(34, 36, 51));

        jPanel1.setBackground(new java.awt.Color(34, 36, 51));

        simbolo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        simbolo1.setForeground(new java.awt.Color(255, 255, 255));
        simbolo1.setText("$");

        txtCambio1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCambio1.setForeground(new java.awt.Color(255, 255, 255));
        txtCambio1.setText("0");

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EE.UU - Dolar", "Europa - Euro", "Argentina - Peso", "Cuba - Peso", "China - Yuan", "Japon - Yen", "Egipto - Libra", "Mexico - Peso" }));
        cbx1.setFocusable(false);
        cbx1.setVerifyInputWhenFocusTarget(false);
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EE.UU - Dolar", "Europa - Euro", "Argentina - Peso", "Cuba - Peso", "China - Yuan", "Japon - Yen", "Egipto - Libra", "Mexico - Peso" }));
        cbx2.setFocusable(false);
        cbx2.setVerifyInputWhenFocusTarget(false);
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        simbolo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        simbolo2.setForeground(new java.awt.Color(255, 255, 255));
        simbolo2.setText("$");

        txtCambio2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCambio2.setForeground(new java.awt.Color(255, 255, 255));
        txtCambio2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simbolo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCambio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simbolo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCambio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolo1)
                    .addComponent(txtCambio1))
                .addGap(18, 18, 18)
                .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolo2)
                    .addComponent(txtCambio2))
                .addGap(18, 18, 18)
                .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(34, 36, 51));
        jPanel4.setLayout(new java.awt.GridLayout(5, 3));

        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jPanel4.add(jButton1);

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btnReset.setText("C");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnReset.setFocusable(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btnReset.setRequestFocusEnabled(false);
        btnReset.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset);

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btnBorrar.setText("DEL");
        btnBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnBorrar.setFocusable(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btnBorrar.setRequestFocusEnabled(false);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar);

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn7.setFocusable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn7.setRequestFocusEnabled(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn8.setFocusable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn8.setRequestFocusEnabled(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn9.setFocusable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn9.setRequestFocusEnabled(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9);

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn4.setFocusable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn4.setRequestFocusEnabled(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn5.setFocusable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn5.setRequestFocusEnabled(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn6.setFocusable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn6.setRequestFocusEnabled(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn1.setFocusable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn1.setRequestFocusEnabled(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn2.setFocusable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn2.setRequestFocusEnabled(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn3.setFocusable(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn3.setRequestFocusEnabled(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3);

        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setEnabled(false);
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setRequestFocusEnabled(false);
        jButton14.setRolloverEnabled(false);
        jPanel4.add(jButton14);

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btn0.setFocusable(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btn0.setRequestFocusEnabled(false);
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(btn0);

        btnPunto.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV1.jpg"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(34, 36, 51)));
        btnPunto.setFocusable(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV3.jpg"))); // NOI18N
        btnPunto.setRequestFocusEnabled(false);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnDIV2.jpg"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel4.add(btnPunto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(34, 36, 51)));

        jMenu2.setBackground(new java.awt.Color(34, 36, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jMenu2.setOpaque(true);
        jMenu2.setRequestFocusEnabled(false);
        jMenu2.setRolloverEnabled(false);

        Calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora1.png"))); // NOI18N
        Calculadora.setText("Calculadora Estandar");
        Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraActionPerformed(evt);
            }
        });
        jMenu2.add(Calculadora);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moneda1.png"))); // NOI18N
        jMenuItem2.setText("Conversor de Divisas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(34, 36, 51));
        jMenu1.setForeground(new java.awt.Color(34, 36, 51));
        jMenu1.setEnabled(false);
        jMenu1.setFocusable(false);
        jMenu1.setOpaque(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(360, 22));
        jMenu1.setRequestFocusEnabled(false);
        jMenu1.setRolloverEnabled(false);
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (cantidad!=""){
            if (txtCambio1.getText().length()<=10){
                if (cantidad!=""){
                    if (txtCambio1.getText().equals("0")){
                        cantidad="0";
                    }else{
                        cantidad+="0";
                    }
                    txtCambio1.setText(cantidad);
                    obtenerConversion();
                }
            }
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Teclado("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Teclado("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Teclado("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Teclado("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Teclado("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Teclado("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Teclado("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Teclado("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Teclado("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cantidad="0";
        txtCambio1.setText(cantidad);
        txtCambio2.setText(cantidad);
        cantidad="";
        punto=true;
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (cantidad.length()>0){
            if (cantidad.length()==1){
                cantidad="0";
            }else{
                cantidad=cantidad.substring(0,cantidad.length()-1);
            }
            txtCambio1.setText(cantidad);
            txtCambio2.setText(cantidad);
        }
        punto=true;
        obtenerConversion();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (punto==true){
            if (cantidad!=""){
                cantidad=cantidad+".";
            }else{
                cantidad="0.";
            }
        }
        txtCambio1.setText(cantidad);
        punto=false;
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        de=cbx1.getSelectedItem().toString();
        
        if (de.equals("EE.UU - Dolar")){  
            simbolo1.setText("$");
            
        }else if (de.equals("Europa - Euro")){
            simbolo1.setText("€");
            
        }else if (de.equals("Argentina - Peso")){
            simbolo1.setText("$");
            
        }else if (de.equals("Cuba - Peso")){
            simbolo1.setText("$");
            
        }else if (de.equals("China - Yuan")){
            simbolo1.setText("¥");
            
        }else if (de.equals("Japon - Yen")){
            simbolo1.setText("¥");
            
        }else if (de.equals("Egipto - Libra")){
            simbolo1.setText("ج.م");
            
        }else if (de.equals("Mexico - Peso")){
            simbolo1.setText("$");
        }
        obtenerConversion();
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        a=cbx2.getSelectedItem().toString();
        
        if (a.equals("EE.UU - Dolar")){  
            simbolo2.setText("$");
            
        }else if (a.equals("Europa - Euro")){
            simbolo2.setText("€");
            
        }else if (a.equals("Argentina - Peso")){
            simbolo2.setText("$");
            
        }else if (a.equals("Cuba - Peso")){
            simbolo2.setText("$");
            
        }else if (a.equals("China - Yuan")){
            simbolo2.setText("¥");
            
        }else if (a.equals("Japon - Yen")){
            simbolo2.setText("¥");
            
        }else if (a.equals("Egipto - Libra")){
            simbolo2.setText("ج.م");
            
        }else if (a.equals("Mexico - Peso")){
            simbolo2.setText("$");
        }
        obtenerConversion();
    }//GEN-LAST:event_cbx2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraActionPerformed
        Calculadora cal=new Calculadora();
        cal.setVisible(true);
        dispose();
    }//GEN-LAST:event_CalculadoraActionPerformed
    
    private void obtenerConversion(){
        cantidad=txtCambio1.getText();
        dinero=Double.parseDouble(cantidad);
            
        if (seleccionado==true){
            cbx1.setSelectedItem("EE.UU - Dolar");
            cbx2.setSelectedItem("EE.UU - Dolar");
            seleccionado=false;
        }
        Conversiones();
        
        dinero*=cambio;
        if (dinero%1==0){
            txtCambio2.setText(String.format("%.0f",dinero));
        }else{
            txtCambio2.setText(String.format("%.2f",dinero));
        }
    }

    private void Conversiones() {
        if (de.equals(a)){
            cambio=1;
        }else if (de.equals("EE.UU - Dolar") && a.equals("Argentina - Peso")){
            cambio=159.7100;
        }else if (de.equals("EE.UU - Dolar") && a.equals("Europa - Euro")){
            cambio=0.9908;
        }else if (de.equals("Europa - Euro")  && a.equals("Argentina - Peso")){
            cambio=161.1929;
        }else if (de.equals("Europa - Euro")  && a.equals("EE.UU - Dolar")){
            cambio=1.0092;
        }else if (de.equals("Argentina - Peso")  && a.equals("EE.UU - Dolar")){
            cambio=0.0062;
        }else if (de.equals("Argentina - Peso")  && a.equals("Europa - Euro")){
            cambio=0.0062;
        }else if (de.equals("EE.UU - Dolar")  && a.equals("Japon - Yen")){
            cambio=139.7100;
        }else if (de.equals("EE.UU - Dolar")  && a.equals("China - Yuan")){
            cambio=7.1108;
        }else if (de.equals("EE.UU - Dolar")  && a.equals("Egipto - Libra")){
            cambio=24.3400;
        }else if (de.equals("EE.UU - Dolar")  && a.equals("Cuba - Peso")){
            cambio=24.0000;
        }else if (de.equals("Europa - Euro")  && a.equals("Japon - Yen")){
            cambio=144.0309;
        }else if (de.equals("Europa - Euro")  && a.equals("China - Yuan")){
            cambio=7.3307;
        }else if (de.equals("Europa - Euro")  && a.equals("Egipto - Libra")){
            cambio=25.0927;
        }else if (de.equals("Europa - Euro")  && a.equals("Cuba - Peso")){
            cambio=24.7422;
        }else if (de.equals("Argentina - Peso")  && a.equals("Japon - Yen")){
            cambio=0.8719;
        }else if (de.equals("Argentina - Peso")  && a.equals("China - Yuan")){
            cambio=0.0443;
        }else if (de.equals("Argentina - Peso")  && a.equals("Egipto - Libra")){
            cambio=0.1519;
        }else if (de.equals("Argentina - Peso")  && a.equals("Cuba - Peso")){
            cambio=0.1497;
        }else if (de.equals("Japon - Yen")  && a.equals("EE.UU - Dolar")){
            cambio=0.0071;
        }else if (de.equals("Japon - Yen")  && a.equals("Europa - Euro")){
            cambio=0.0069;
        }else if (de.equals("Japon - Yen")  && a.equals("Argentina - Peso")){
            cambio=1.1468;
        }else if (de.equals("Japon - Yen")  && a.equals("China - Yuan")){
            cambio=0.0512;
        }else if (de.equals("Japon - Yen")  && a.equals("Egipto - Libra")){
            cambio=0.1756;
        }else if (de.equals("Japon - Yen")  && a.equals("Cuba - Peso")){
            cambio=0.1717;
        }else if (de.equals("China - Yuan")  && a.equals("EE.UU - Dolar")){
            cambio=0.1407;
        }else if (de.equals("China - Yuan")  && a.equals("Europa - Euro")){
            cambio=0.1364;
        }else if (de.equals("China - Yuan")  && a.equals("Argentina - Peso")){
            cambio=22.5333;
        }else if (de.equals("China - Yuan")  && a.equals("Japon - Yen")){
            cambio=19.6475;
        }else if (de.equals("China - Yuan")  && a.equals("Egipto - Libra")){
            cambio=3.4252;
        }else if (de.equals("China - Yuan")  && a.equals("Cuba - Peso")){
            cambio=3.3774;
        }else if (de.equals("Egipto - Libra")  && a.equals("EE.UU - Dolar")){
            cambio=0.0410;
        }else if (de.equals("Egipto - Libra")  && a.equals("Europa - Euro")){
            cambio=0.0398;
        }else if (de.equals("Egipto - Libra")  && a.equals("Argentina - Peso")){
            cambio=6.5829;
        }else if (de.equals("Egipto - Libra")  && a.equals("Japon - Yen")){
            cambio=5.7251;
        }else if (de.equals("Egipto - Libra")  && a.equals("China - Yuan")){
            cambio=0.2919;
        }else if (de.equals("Egipto - Libra")  && a.equals("Cuba - Peso")){
            cambio=0.9860;
        }else if (de.equals("Cuba - Peso")  && a.equals("EE.UU - Dolar")){
            cambio=0.0416;
        }else if (de.equals("Cuba - Peso")  && a.equals("Europa - Euro")){
            cambio=0.0404;
        }else if (de.equals("Cuba - Peso")  && a.equals("Argentina - Peso")){
            cambio=6.6891;
        }else if (de.equals("Cuba - Peso")  && a.equals("Japon - Yen")){
            cambio=5.8062;
        }else if (de.equals("Cuba - Peso")  && a.equals("China - Yuan")){
            cambio=0.2960;
        }else if (de.equals("Cuba - Peso")  && a.equals("Egipto - Libra")){
            cambio=1.0141;
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Calculadora;
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
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel simbolo1;
    private javax.swing.JLabel simbolo2;
    private javax.swing.JLabel txtCambio1;
    private javax.swing.JLabel txtCambio2;
    // End of variables declaration//GEN-END:variables
}
