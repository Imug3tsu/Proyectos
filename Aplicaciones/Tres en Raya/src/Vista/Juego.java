
package Vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Juego extends javax.swing.JFrame {
    
    private boolean casilla[][]=new boolean[3][3];
    private String turno="usuario1";
    private int matriz[][]=new int[3][3];
    private String usuarioP1,usuarioP2;
    private int countP1=0,countP2=0,empate=0;
    
    public Juego(String user1,String user2) {
        this.usuarioP1=user1;
        this.usuarioP2=user2;
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/tac.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setSize(700,655);
        llenarCasilla();
        llenarMatriz();
    }
    
    private void llenarCasilla(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                casilla[i][j]=true;
            }
        }
    }
    
    private void llenarMatriz(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matriz[i][j]=0;
            }
        }
    }
    
   private void dibujarX(JButton boton){
       boton.setIcon(new ImageIcon(getClass().getResource("/IMG/xx1.png")));
   }
   
   private void dibujarO(JButton boton){
       boton.setIcon(new ImageIcon(getClass().getResource("/IMG/oo1.png")));
   }
   
   private void comprobarGanador(){
       boolean usuario1=false;
       boolean usuario2=false;
       int casillaEmpate=0;
       
       usuario1=comprobar(1);
       usuario2=comprobar(2);
       
       if (usuario1==true){
           countP1++;
           Ganador win=new Ganador(this,true,usuarioP1);
           win.setVisible(true);
           reiniciarJuego();
           Turno primero=new Turno(this,true,usuarioP1,usuarioP2);
            primero.setVisible(true);
            turno=primero.getTurno();
       }else if (usuario2==true){
           countP2++;
           Ganador win=new Ganador(this,true,usuarioP2);
           win.setVisible(true);
           reiniciarJuego();
           Turno primero=new Turno(this,true,usuarioP1,usuarioP2);
            primero.setVisible(true);
            turno=primero.getTurno();
       }else{
           for (int i=0;i<3;i++){
               for (int j=0;j<3;j++){
                   if (matriz[i][j]!=0){
                       casillaEmpate++;
                   }
               }
           }
           if (casillaEmpate==9){
               empate++;
               Empate empate=new Empate(this, true);
               empate.setVisible(true);
               reiniciarJuego();
               Turno primero=new Turno(this,true,usuarioP1,usuarioP2);
               primero.setVisible(true);
               turno=primero.getTurno();
           }else{
               casillaEmpate=0;
           }
       }
   }
   
   private void reiniciarJuego(){
       llenarCasilla();
       llenarMatriz();
       btnArribaIzquierda.setIcon(null);
       btnArribaCentro.setIcon(null);
       btnArribaDerecha.setIcon(null);
       btnIzquierdaCentro.setIcon(null);
       btnCentro.setIcon(null);
       btnDerechaCentro.setIcon(null);
       btnAbajoIzquierda.setIcon(null);
       btnAbajoCentro.setIcon(null);
       btnAbajoDerecha.setIcon(null);
       
       
       
    }
   
   private boolean comprobar(int num){
       boolean ganador=false;
       
       if (matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
           ganador=true;
       }else if (matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
           ganador=true;
       }else if (matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
           ganador=true;
       }else if (matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
           ganador=true;
       }else if (matriz[2][0]==num && matriz[1][1]==num && matriz[0][2]==num){
           ganador=true;
       }else if (matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
           ganador=true;
       }else if (matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
           ganador=true;
       }else if (matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
           ganador=true;
       }
       return ganador;
   }
    
   private void QuienJuegaPrimero(){
       Turno primero=new Turno(this,true,usuarioP1,usuarioP2);
       primero.setVisible(true);
       turno=primero.getTurno();
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArribaIzquierda = new javax.swing.JButton();
        btnArribaCentro = new javax.swing.JButton();
        btnArribaDerecha = new javax.swing.JButton();
        btnIzquierdaCentro = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnDerechaCentro = new javax.swing.JButton();
        btnAbajoIzquierda = new javax.swing.JButton();
        btnAbajoCentro = new javax.swing.JButton();
        btnAbajoDerecha = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ComenzarDeNuevo = new javax.swing.JMenuItem();
        Resultados = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btnArribaIzquierda.setFocusable(false);
        btnArribaIzquierda.setRequestFocusEnabled(false);
        btnArribaIzquierda.setRolloverEnabled(false);
        btnArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArribaIzquierda);

        btnArribaCentro.setFocusable(false);
        btnArribaCentro.setRequestFocusEnabled(false);
        btnArribaCentro.setRolloverEnabled(false);
        btnArribaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnArribaCentro);

        btnArribaDerecha.setFocusable(false);
        btnArribaDerecha.setRequestFocusEnabled(false);
        btnArribaDerecha.setRolloverEnabled(false);
        btnArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArribaDerecha);

        btnIzquierdaCentro.setFocusable(false);
        btnIzquierdaCentro.setRequestFocusEnabled(false);
        btnIzquierdaCentro.setRolloverEnabled(false);
        btnIzquierdaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnIzquierdaCentro);

        btnCentro.setFocusable(false);
        btnCentro.setRequestFocusEnabled(false);
        btnCentro.setRolloverEnabled(false);
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCentro);

        btnDerechaCentro.setFocusable(false);
        btnDerechaCentro.setRequestFocusEnabled(false);
        btnDerechaCentro.setRolloverEnabled(false);
        btnDerechaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnDerechaCentro);

        btnAbajoIzquierda.setFocusable(false);
        btnAbajoIzquierda.setRequestFocusEnabled(false);
        btnAbajoIzquierda.setRolloverEnabled(false);
        btnAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajoIzquierda);

        btnAbajoCentro.setFocusable(false);
        btnAbajoCentro.setRequestFocusEnabled(false);
        btnAbajoCentro.setRolloverEnabled(false);
        btnAbajoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajoCentro);

        btnAbajoDerecha.setFocusable(false);
        btnAbajoDerecha.setRequestFocusEnabled(false);
        btnAbajoDerecha.setRolloverEnabled(false);
        btnAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajoDerecha);

        jMenu1.setText("Juego");

        ComenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reinicio1 (1).png"))); // NOI18N
        ComenzarDeNuevo.setText("Comenzar de nuevo");
        ComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarDeNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(ComenzarDeNuevo);

        Resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/res (1).png"))); // NOI18N
        Resultados.setText("Ver Resultados");
        Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadosActionPerformed(evt);
            }
        });
        jMenu1.add(Resultados);

        jMenuBar1.add(jMenu1);

        ayuda.setText("Ayuda");
        ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudaMouseClicked(evt);
            }
        });
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaIzquierdaActionPerformed
        if (casilla[0][0]==true){  // verificando si aun no se a dado click en el boton.
            if (turno.equals("usuario1")){
                dibujarX(btnArribaIzquierda);
                matriz[0][0]=1;
                turno="usuario2";
            }else{  //  turno usuario2.
                dibujarO(btnArribaIzquierda);
                matriz[0][0]=2;
                turno="usuario1";
            }
            casilla[0][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaIzquierdaActionPerformed

    private void btnArribaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaCentroActionPerformed
        if (casilla[0][1]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnArribaCentro);
                matriz[0][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnArribaCentro);
                matriz[0][1]=2;
                turno="usuario1";
            }
            casilla[0][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaCentroActionPerformed

    private void btnArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaDerechaActionPerformed
        if (casilla[0][2]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnArribaDerecha);
                matriz[0][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnArribaDerecha);
                matriz[0][2]=2;
                turno="usuario1";
            }
            casilla[0][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaDerechaActionPerformed

    private void btnIzquierdaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaCentroActionPerformed
        if (casilla[1][0]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnIzquierdaCentro);
                matriz[1][0]=1;
                turno="usuario2";
            }else{
                dibujarO(btnIzquierdaCentro);
                matriz[1][0]=2;
                turno="usuario1";
            }
            casilla[1][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnIzquierdaCentroActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        if (casilla[1][1]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnCentro);
                matriz[1][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnCentro);
                matriz[1][1]=2;
                turno="usuario1";
            }
            casilla[1][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnDerechaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaCentroActionPerformed
        if (casilla[1][2]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnDerechaCentro);
                matriz[1][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnDerechaCentro);
                matriz[1][2]=2;
                turno="usuario1";
            }
            casilla[1][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDerechaCentroActionPerformed

    private void btnAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoIzquierdaActionPerformed
        if (casilla[2][0]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnAbajoIzquierda);
                matriz[2][0]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajoIzquierda);
                matriz[2][0]=2;
                turno="usuario1";
            }
            casilla[2][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoIzquierdaActionPerformed

    private void btnAbajoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoCentroActionPerformed
        if (casilla[2][1]==true){
            if (turno.equals("usuario1")){
                dibujarX(btnAbajoCentro);
                matriz[2][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajoCentro);
                matriz[2][1]=2;
                turno="usuario1";
            }
            casilla[2][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoCentroActionPerformed

    private void btnAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoDerechaActionPerformed
        if (casilla[2][2]==true){ 
            if (turno.equals("usuario1")){
                dibujarX(btnAbajoDerecha);
                matriz[2][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajoDerecha);
                matriz[2][2]=2;
                turno="usuario1";
            }
            casilla[2][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoDerechaActionPerformed

    private void ComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarDeNuevoActionPerformed
        countP1=0;
        countP2=0;
        empate=0;
        llenarCasilla();
        llenarMatriz();
        reiniciarJuego();
    }//GEN-LAST:event_ComenzarDeNuevoActionPerformed

    private void ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadosActionPerformed
        Resultados res=new Resultados(this, true, usuarioP1, usuarioP2, countP1, countP2, empate);
        res.setVisible(true);
    }//GEN-LAST:event_ResultadosActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaActionPerformed

    private void ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaMouseClicked
        try{
            Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/"));
        }catch (URISyntaxException|IOException ex){
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ayudaMouseClicked

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ComenzarDeNuevo;
    private javax.swing.JMenuItem Resultados;
    private javax.swing.JMenu ayuda;
    private javax.swing.JButton btnAbajoCentro;
    private javax.swing.JButton btnAbajoDerecha;
    private javax.swing.JButton btnAbajoIzquierda;
    private javax.swing.JButton btnArribaCentro;
    private javax.swing.JButton btnArribaDerecha;
    private javax.swing.JButton btnArribaIzquierda;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnDerechaCentro;
    private javax.swing.JButton btnIzquierdaCentro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
