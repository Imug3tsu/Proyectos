package DemoLibros;

import javax.swing.ImageIcon;

public class Tronos extends javax.swing.JDialog {
    
    
    
    public Tronos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/iconoDemo2.png")).getImage());
        this.setLocationRelativeTo(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Game of Thrones - Demo");
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\t\t\tGEORGE R.R. MARTIN\n\n\t\t\t    Juego de tronos \n\t\t               SAGA Canción de Hielo y Fuego 01\n\n\t                      ************************************************************\n\n\n\n\tPRÓLOGO\n\n\t—Deberíamos volver ya —instó Gared mientras los bosques se tornaban más y más\n\toscuros a su alrededor—. Los salvajes están muertos.\n\t—¿Te dan miedo los muertos? —preguntó Ser Waymar Royce, insinuando apenas\n\tuna sonrisa.\n\t—Los muertos están muertos —contestó Gared. No había mordido el anzuelo. Era\n\tun anciano de más de cincuenta años, y había visto ir y venir a muchos jóvenes\n\tseñores—. No tenemos nada que tratar con ellos.\n\t—¿Y de veras están muertos? —preguntó Royce delicadamente—. ¿Qué prueba\n\ttenemos?\n\t—Will los vio —respondió Gared—. Si él dice que están muertos, no necesito\n\tmás pruebas.\n\t—Mi madre me dijo que los muertos no cantan canciones —intervino Will. Sabía\n\tque lo iban a meter en la disputa tarde o temprano. Le habría gustado que fuera más\n\ttarde que temprano.\n\t—Mi ama de cría me dijo lo mismo, Will —replicó Royce—. Nunca creas nada\n\tde lo que te diga una mujer cuando estás junto a su teta. Hasta de los muertos se pueden\n\taprender cosas. —Su voz resonó demasiado alta en el anochecer del bosque.\n\t—Tenemos un largo camino por delante —señaló Gared—. Ocho días, hasta\n\tpuede que nueve. Y se está haciendo de noche.\n\n\t—Como todos los días alrededor de esta hora —dijo Ser Waymar Royce después\n\tde echar una mirada indiferente al cielo—. ¿La oscuridad te atemoriza, Gared?\n\tWill percibió la tensión en torno a la boca de Gared y la ira apenas contenida en\n\tlos ojos, bajo la gruesa capucha negra de la capa. Gared llevaba cuarenta años en la\n\tGuardia de la Noche, buena parte de su infancia y toda su vida de adulto, y no estaba\n\tacostumbrado a que se burlaran de él. Pero eso no era todo. Will presentía algo más en\n\tel anciano aparte del orgullo herido. Casi se palpaba en él una tensión demasiado\n\tparecida al miedo.\n\n\tWill compartía aquella intranquilidad. Llevaba cuatro años en el Muro. La\n\tprimera vez que lo habían enviado al otro lado, recordó todas las viejas historias y se le\n\trevolvieron las tripas. Después se había reído de aquello. Ahora era ya veterano de cien\n\texpediciones, y la interminable extensión de selva oscura que los sureños llamaban el\n\tBosque Encantado no le resultaba aterradora.\n\n\tHasta aquella noche. Aquella noche había algo diferente. La oscuridad tenía un\n\tmatiz que le erizaba el vello. Llevaban nueve días cabalgando hacia el norte, hacia el\n\tnoroeste y hacia el norte otra vez, siempre alejándose del Muro, tras la pista de unos\n\tasaltantes salvajes. Cada día había sido peor que el anterior, y aquél era el peor de\n\ttodos. Soplaba un viento gélido del norte, que hacía que los árboles susurraran como si\n\ttuvieran vida propia. Durante toda la jornada Will se había sentido observado, vigilado\n\tpor algo frío e implacable que no le deseaba nada bueno. Gared también lo había\n\tpercibido. No había nada que Will deseara más que cabalgar a toda velocidad hacia la\n\tseguridad que ofrecía el Muro, pero no era un sentimiento que pudiera compartir con un\n\tcomandante.\n\n\tY menos con un comandante como aquél. \n\n\tSer Waymar Royce era el hijo menor de una antigua casa con demasiados\n\therederos. Era un joven de dieciocho años, atractivo, con ojos grises, gallardo y esbelto\n\tcomo un cuchillo. A lomos de su enorme corcel negro, se alzaba muy por encima de\n\tWill y Gared, montados en caballos pequeños y recios adecuados para el terreno.\n\tCalzaba botas de cuero negro y vestía pantalones negros de lana, guantes negros de piel\n\tde topo, y una buena chaquetilla ceñida de brillante cota de malla sobre varias prendas\n\tde lana negra y cuero tratado. Ser Waymar llevaba menos de medio año como Hermano\n\tJuramentado en la Guardia de la Noche, pero sin duda se había preparado bien para su\n\tvocación. Al menos en lo que a la ropa respectaba.\n\tLa capa era su mayor orgullo: de marta cibelina, gruesa, suave y negra como el\n\tcarbón.\n\n\t—Apuesto a que las mató a todas con sus propias manos —había comentado\n\tGared en los barracones, mientras bebían vino—. Seguro que nuestro gran guerrero les\n\tarrancó las cabecitas él mismo.\n\tTodos se habían reído.\n\t«Es difícil aceptar órdenes de un hombre del que te burlas cuando bebes»,\n\treflexionó Will mientras tiritaba a lomos de su montura. Gared debía de estar pensando\n\tlo mismo.\n\n\t—Mormont dijo que siguiéramos sus huellas, y ya lo hemos hecho —dijo\n\tGared—. Están muertos. No volverán a molestarnos. Nos queda un camino duro por\n\tdelante. No me gusta este clima. Si empieza a nevar, tardaremos quince días en volver,\n\ty la nieve es lo mejor que podemos encontrarnos. ¿Habéis visto alguna tormenta de\n\thielo, mi señor?\n\tEl joven señor no parecía escucharlo. Observaba la creciente oscuridad del\n\tcrepúsculo con aquella mirada suya, entre aburrida y distraída. Will había cabalgado el\n\ttiempo suficiente junto al caballero para saber que era mejor no interrumpirlo cuando\n\tmostraba aquella expresión.\n\n\t—Vuelve a contarme lo que viste, Will. Con todo detalle. No te dejes nada.\n\tWill había sido cazador antes de unirse a la Guardia de la Noche. Bueno, en\n\trealidad había sido furtivo. Los jinetes libres de los Mallister lo habían atrapado con las\n\tmanos manchadas de sangre en los bosques de los Mallister, mientras despellejaba un\n\tciervo de los Mallister, y tuvo que elegir entre vestir el negro o perder una mano. No\n\thabía nadie capaz de moverse por los bosques tan sigilosamente como Will, y los\n\thermanos negros no tardaron en explotar su talento.\n\n\t—El campamento está tres kilómetros más adelante, pasado aquel risco, justo al\n\tlado de un arroyo —dijo Will—. Me acerqué tanto como me atreví. Eran ocho, hombres\n\ty mujeres. Niños no, al menos no vi ninguno. Habían puesto una especie de tienda\n\tcontra la roca. La nieve ya la había cubierto casi del todo, pero la vi. No había ninguna\n\thoguera, aunque el lugar donde habían encendido una se distinguía claramente.\n\tNinguno se movía, los observé un buen rato. Ningún ser vivo ha estado jamás tan\n\tquieto.\n\n\t—¿Viste sangre?\n\t—La verdad es que no —admitió Will.\n\t—¿Y armas?\n\t—Algunas espadas, unos cuantos arcos... Uno de los hombres tenía un hacha. De\n\tdoble filo, parecía muy pesada, un buen trozo de hierro. Estaba en el suelo, junto a su\n\tmano.\n\t—¿Recuerdas en qué postura se encontraban los cuerpos?\n\t—Un par de ellos estaban sentados con la espalda contra la roca —contestó Will\n\tencogiéndose de hombros—. La mayoría, tendidos en el suelo. Como caídos. \n\n\t—O dormidos —sugirió Royce.\n\t—Caídos —insistió Will—. Había una mujer en la copa de un tamarindo, medio\n\tescondida entre las ramas. Una vigía. —Esbozó una sonrisa—. Tuve buen cuidado de\n\tque no me viera. Cuando me acerqué, vi que ella tampoco se movía. —Muy a su pesar,\n\tse estremeció.\n\t—¿Tienes frío? —preguntó Royce.\n\t—Un poco —murmuró Will—. El viento, mi señor.\n\n\tEl joven caballero se volvió hacia el guardia de pelo cano. Las hojas que la\n\tescarcha había hecho caer de los árboles pasaron susurrantes junto a ellos, y el corcel de\n\tRoyce se movió, inquieto.\n\t—¿Qué crees que pudo matar a esos hombres, Gared? —preguntó Ser Waymar en\n\ttono despreocupado. Se ajustó el pliegue de la larga capa de marta.\n\t—El frío —replicó Gared con certeza férrea—. Vi a hombres morir congelados el\n\tpasado invierno, y también el anterior, cuando era casi un niño. Todo el mundo habla de\n\tnieve de quince metros de espesor, y de cómo el viento gélido llega aullando del norte,\n\tpero el verdadero enemigo es el frío. Se echa encima de uno más sigiloso que Will, al\n\tprincipio se tirita y castañetean los dientes, se dan pisotones contra el suelo, y se sueña\n\tcon vino caliente y con una buena hoguera. Y quema, vaya si quema. No hay nada que\n\tqueme como el frío. Pero sólo durante un tiempo. Luego se mete dentro y empieza a\n\tinvadirlo todo, y al final no se tienen fuerzas para combatirlo. Es más fácil sentarse, o\n\techarse a dormir. Dicen que al final no se siente ningún dolor. Primero se está débil y\n\tamodorrado, y todo se vuelve nebuloso, y luego es como hundirse en un mar de leche\n\ttibia. Como muy tranquilo todo.\n\t—Qué elocuencia, Gared —observó Ser Waymar—. No me imaginaba que te\n\texpresaras así.\n\n\t—Yo también he tenido el frío dentro, joven señor. —Gared se echó la capucha\n\thacia atrás para que Ser Waymar le viera bien los muñones donde había tenido las\n\torejas—. Las dos orejas, tres dedos de los pies, y el meñique de la mano izquierda. Salí\n\tbien parado. A mi hermano lo encontramos congelado en su turno de guardia, con una\n\tsonrisa en los labios.\n\t—Tendrías que usar ropa más abrigada —dijo Ser Waymar encogiéndose de\n\thombros.\n\n\tGared miró al joven señor y se le enrojecieron las cicatrices en torno a los oídos,\n\tallí donde el maestre Aemon le había amputado las orejas.\n\t—Ya veremos hasta qué punto podéis abrigaros cuando llegue el invierno. —Se\n\tsubió la capucha y se encorvó sobre su montura, silencioso y hosco.\n\t—Si Gared dice que fue el frío... —empezó Will.\n\t—¿Has hecho alguna guardia esta semana pasada, Will?\n\t—Sí, mi señor. —No había semana en que no hiciera una docena de guardias de\n\tmierda. ¿Adónde quería llegar con aquello?\n\t—¿Y cómo estaba el Muro?\n\t—Lloraba —dijo Will con el ceño fruncido. Ahora que el joven señor lo señalaba,\n\testaba claro—. Si el Muro lloraba, no se pudieron congelar. No hacía suficiente frío.\n\t—Muy perspicaz —asintió Royce—. La semana pasada hemos tenido unas\n\tcuantas heladas ligeras, y algunas ráfagas de nieve, pero en ningún momento hizo tanto\n\tfrío para que ocho adultos murieran congelados. Y te recuerdo que eran hombres con\n\tropas de piel y cuero, que estaban cerca de un refugio y que sabían cómo encender una\n\thoguera. —La sonrisa del caballero no podía ser más confiada—. Llévanos hasta ese\n\tlugar, Will. Quiero ver a los muertos con mis propios ojos.\n\n\tY ya no hubo más que hablar. La orden estaba dada, y el honor los obligaba a \n\tobedecerla.\n\tWill abrió la marcha con su montura desgreñada, eligiendo cauteloso el camino\n\tentre la maleza. La noche anterior había caído una ligera nevada, y había piedras, raíces\n\ty depresiones ocultas al acecho del descuidado y el imprudente. A continuación iba Ser\n\tWaymar Royce sobre el gran corcel negro que pifiaba impaciente. Un corcel no era\n\tmontura adecuada para una expedición de exploración, pero cualquiera se lo decía al\n\tjoven señor. Gared cerraba la marcha. El anciano guardia iba murmurando para sus\n\tadentros mientras cabalgaba.\n\n\tCaía la noche. El cielo despejado se volvió de un tono púrpura oscuro, el color de\n\tun moretón viejo, y se fue tornando negro. Empezaron a aparecer las estrellas y una\n\tmedia luna. Will agradeció la luz en su fuero interno.\n\t—Seguro que podemos ir a mejor paso —dijo Royce cuando la luna brilló en el\n\tcielo.\n\t—Con este caballo, no —replicó Will. El miedo lo había vuelto insolente—.\n\t¿Quiere mi señor abrir la marcha?\n\tSer Waymar Royce no se dignó a responder.\n\tEn algún lugar del bosque, un lobo aulló.\n\tWill hizo que su caballo se situara bajo un viejo tamarindo nudoso, y desmontó.\n\t—¿Por qué te detienes? —preguntó Ser Waymar.\n\t—Mejor vamos a pie el resto del camino, mi señor. Está cerca, tras aquel risco.\n\tRoyce se detuvo un instante, mirando a lo lejos con gesto reflexivo. El viento frío\n\tsoplaba entre los árboles. La larga capa de marta se agitó tras él como una cosa\n\tsemiviva.\n\n\t—Aquí falla algo —murmuró Gared.\n\t—¿De verdad? —dijo el joven caballero con una sonrisa desdeñosa.\n\t—¿No lo notáis? —preguntó Gared—. Escuchad la oscuridad.\n\tWill sí lo notaba. Llevaba cuatro años en la Guardia de la Noche, y nunca había\n\ttenido tanto miedo. ¿Qué pasaba?\n\t—Viento. El susurro de los árboles. Un lobo. ¿Cuál de esos ruidos es el que asusta\n\ttanto, Gared?\n\n\tAl ver que Gared no respondía, Royce se bajó del caballo con gesto elegante. Ató\n\tel corcel a una rama baja, a buena distancia de los otros caballos, y desenvainó la espada\n\tlarga. La empuñadura refulgía con el brillo de las piedras preciosas, y la luz de la luna\n\tparecía fluir por el acero pulido. Era un arma magnífica, forjada en Castillo; y estaba\n\tnueva. Will pensó que nadie la había blandido jamás con ira.\n\t—Aquí los árboles están muy juntos —avisó—. La espada se os va a enredar con\n\tlas ramas, mi señor. Es mejor llevar un cuchillo.\n\t—Cuando necesite consejos, los pediré —replicó el joven señor—. Tú quédate\n\taquí, Gared, vigila los caballos.\n\t—Nos hará falta una hoguera. —Gared desmontó—. Yo me encargo.\n\t—¿Eres completamente idiota, viejo? Si hay enemigos al acecho en este bosque,\n\tlo que menos falta nos hace es una hoguera.\n\t—El fuego mantendría alejados a algunos enemigos —señaló Gared—. Osos,\n\tlobos huargo y... y otras cosas.\n\n\t—Nada de hogueras. —Ser Waymar apretó los labios.\n\tLa capucha de Gared le ensombrecía el rostro, pero Will advirtió que tenía un\n\tbrillo duro en los ojos al mirar al caballero. Durante un momento temió que el anciano\n\tfuera a desenvainar la espada. Era un arma corta y fea, con la empuñadura descolorida\n\tpor el sudor y melladuras en la hoja tras muchos años de uso frecuente, pero Will no\n\thabría apostado nada por la vida del joven señor si Gared llegaba a esgrimirla. \n");
        jTextArea1.setCaretPosition(1);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tronos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tronos dialog = new Tronos(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
