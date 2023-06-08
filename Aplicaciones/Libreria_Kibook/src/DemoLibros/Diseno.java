package DemoLibros;

import javax.swing.ImageIcon;

public class Diseno extends javax.swing.JDialog {
    
    
    
    public Diseno(java.awt.Frame parent, boolean modal) {
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
        setTitle("The Grand Design - Demo");
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\t\t\t    El Gran Diseño\n\n\t\t\t   Stephen Hawking\n\t\t\ty Leonard Mlodinow\n\n\t                     **************************************************************\n\n\n\t1\n\n\tEl misterio del ser.\n\n\tCada uno de nosotros existe durante un tiempo\n\tmuy breve, y en dicho intervalo tan sólo explora una parte\n\tdiminuta del conjunto del universo. Pero los humanos somos una\n\tespecie marcada por la curiosidad. Nos preguntamos, buscamos\n\trespuestas. Viviendo en este vasto mundo, que a veces es amable y\n\ta veces cruel, y contemplando la inmensidad del firmamento encima de \n\tnosotros, nos hemos hecho siempre una multitud de preguntas. \n\t¿Cómo podemos comprender el mundo en que nos hallamos? \n\t¿Cómo se comporta el universo? ¿Cuál es la naturaleza de la\n\trealidad? ¿De dónde viene todo lo que nos rodea? ¿Necesitó el\n\tuniverso un Creador? La mayoría de nosotros no pasa la mayor\n\tparte de su tiempo preocupándose por esas cuestiones, pero casi\n\ttodos nos preocupamos por ellas en algún instante.\n\tTradicionalmente, ésas son cuestiones para la filosofía, pero la\n\tfilosofía ha muerto. La filosofía no se ha mantenido al corriente de\n\tlos desarrollos modernos de la ciencia, en particular de la física. Los\n\tcientíficos se han convertido en los portadores de la antorcha del\n\tdescubrimiento en nuestra búsqueda de conocimiento.\n\tEl objetivo de este libro es proporcionar las respuestas sugeridas por los\n\tdescubrimientos y los progresos teóricos recientes, que nos conducen a una \n\tnueva imagen del universo y de nuestro lugar en él,\n\tmuy diferente de la tradicional, e incluso de la imagen que nos\n\thabíamos formado hace tan sólo una o dos décadas. Aun así, los\n\tprimeros bosquejos de esos nuevos conceptos se remontan a hace casi un siglo.\n\n\tSegún la concepción tradicional del universo, los objetos se\n\tmueven a lo largo de caminos bien definidos y tienen historias \n\tbien definidas. Podemos especificar sus posiciones precisas en\n\tcada instante. Aunque esa descripción es suficientemente satisfactoria para \n\tlos propósitos cotidianos, se descubrió en la década de\n\t1920 que esta imagen «clásica» no podía describir el comportamiento \n\taparentemente extraño observado a escalas atómica y\n\tsubatómica de la existencia. Fue necesario adoptar, en su lugar, un\n\tmarco diferente, denominado física cuántica. Las teorías cuánticas\n\than resultado ser notablemente precisas en la predicción de acontecimientos \n\ta dichas escalas, y también reproducen las predicciones\n\tde las viejas teorías clásicas cuando son aplicadas al mundo macroscópico de \n\tla vida corriente. Pero la física clásica y la cuántica\n\testán basadas en concepciones de la realidad física muy diferentes.\n\tLas teorías cuánticas pueden ser formuladas de muchas maneras diferentes, \n\tpero la descripción probablemente más intuitiva\n\tfue elaborada por Richard (Dick) Feynman (1918-1988), todo un\n\tpersonaje, que trabajó en el Instituto Tecnológico de California y\n\tque tocaba los bongos en una sala de fiestas de carretera. Según\n\tFeynman, un sistema no tiene una sola historia, sino todas las historias posibles. \n\tCuando profundicemos en las respuestas, explicaremos la formulación de Feynman \n\tcon detalle y la utilizaremos para explorar la idea de que el propio universo \n\tno tiene una sola historia, ni tan siquiera una existencia independiente. \n\n\tEso parece una idea radical, incluso a muchos físicos. En efecto, como muchas \n\totras nociones de la ciencia actual, parece violar el sentido común. \n\tPero el sentido común está basado en la experiencia cotidiana y no en el universo \n\ttal como nos lo revelan las maravillas tecnológicas que nos permiten observar la \n\tprofundidad de los átomos o el universo primitivo.\n\n\tHasta la llegada de la física moderna se acostumbraba a pensar\n\tque todo el conocimiento sobre el mundo podría ser obtenido mediante \n\tobservación directa, y que las cosas son lo que parecen, tal como las percibimos \n\ta través de los sentidos. Pero los éxitos espectaculares de la física moderna, que \n\testá basada en conceptos, como por ejemplo los de Feynman, que chocan con la \n\texperiencia cotidiana, han demostrado que no es así. Por lo tanto, la visión ingenua \n\tde la realidad no es compatible con la física moderna. \n\tPara tratar con esas paradojas, adoptaremos una posición que denominamos \n\t«realismo dependiente del modelo», basada en la idea de que nuestros cerebros \n\tinterpretan los datos de los órganos sensoriales elaborando un modelo del mundo. \n\tCuando el modelo explica satisfactoriamente los acontecimientos tendemos a atribuirle, a\n\tél y a los elementos y conceptos que lo integran, la calidad de realidad o verdad absoluta.\n\tPero podría haber otras maneras de construir un modelo de la misma situación física, \n\templeando en cada una de ellas conceptos y elementos fundamentales diferentes. Si\n\tdos de esas teorías o modelos predicen con exactitud los mismos acontecimientos, \n\tno podemos decir que uno sea más real que el otro, y somos libres para utilizar \n\tel modelo que nos resulte más\n\tconveniente.\n\tEn la historia de la ciencia hemos ido descubriendo una serie de teorías o modelos c\n\tada vez mejores, desde Platón a la teoría clásica de Newton y a las modernas teorías cuánticas. \n\tResulta natural preguntarse si esta serie llegará finalmente a un punto definitivo, \n\tuna teoría última del universo que incluya todas las fuerzas y prediga\n\tcada una de las observaciones que podamos hacer o si, por el contrario, \n\tcontinuaremos descubriendo teorías cada vez mejores, pero nunca una teoría definitiva\n\tque ya no pueda ser mejorada.\n\n\tPor el momento, carecemos de respuesta a esta pregunta, pero conocemos \n\tuna candidata a teoría última de todo, si realmente existe tal teoría, \n\tdenominada teoría M. La teoría M es el único modelo que posee todas las \n\tpropiedades que creemos debería poseer la teoría final, y es la teoría sobre la cual \n\tbasaremos la mayor parte de las reflexiones ulteriores.\n\n\tLa teoría M no es una teoría en el sentido habitual del término, sino toda una familia\n\tde teorías distintas, cada una de las cuales proporciona una buena descripción de\n\tlas observaciones pero sólo en un cierto dominio de situaciones físicas.\n\tViene a ser como un mapamundi: como es bien sabido, no podemos representar la \n\tsuperficie de toda la Tierra en un solo mapa. La proyección Mercator utilizada \n\thabitualmente en los mapamundis hace que las regiones del mundo parezcan tener \n\táreas cada vez mayores a medida que se aproximan al norte y al sur, \n\ty no cubre los polos Norte o Sur.\n\n\tPara representar fielmente toda la Tierra se debe utilizar una colección de mapas,\n\tcada uno de los cuales cubre una región limitada. \n\tLos mapas se solapan entre sí y, donde lo hacen, muestran el mismo paisaje. \n\tLa teoría M es parecida a eso. Las diferentes teorías que constituyen la familia de la teoría M\n\tpueden parecer muy diferentes, pero todas ellas pueden ser consideradas como \n\taspectos de la misma teoría subyacente. \n\tSon versiones de la teoría aplicables tan sólo en dominios limitados, por ejemplo \n\tcuando ciertas magnitudes como la energía son pequeñas. Tal como ocurre con \n\tlos mapas que se solapan en una proyección Mercator, allí donde los dominios de \n\tvalidez de las diferentes teorías se solapan, éstas predicen los mismos fenómenos.\n\tPero así como no hay ningún mapa plano que represente bien el conjunto\n\tde la superficie terrestre, tampoco hay una teoría que proporcione\n\tpor sí sola una buena representación de las observaciones físicas en todas las situaciones.\n\tDescribiremos cómo la teoría M puede ofrecer respuestas a la pregunta de la creación. \n\tSegún las predicciones de la teoría M, nuestro universo no es el único, sino que \n\tmuchísimos otros universos fueron creados de la nada. Su creación, sin embargo, no\n\trequiere la intervención de ningún Dios o Ser Sobrenatural, sino\n\tque dicha multitud de universos surge naturalmente de la ley física: \n\tson una predicción científica. Cada universo tiene muchas historias posibles y \n\tmuchos estados posibles en instantes posteriores, es decir, en instantes como el actual, \n\ttranscurrido mucho tiempo desde su creación. \n\n\tLa mayoría de tales estados será muy diferente del universo que observamos y \n\tresultará inadecuada para la existencia de cualquier forma de vida. \n\tSólo unos pocos de ellos permitirían la existencia de criaturas como nosotros. \n\tAsí pues, nuestra presencia selecciona de este vasto conjunto sólo aquellos universos \n\tque son compatibles con nuestra existencia. Aunque somos pequeños e insignificantes a\n\tescala cósmica, ello nos hace en un cierto sentido señores de la creación.\n\tPara comprender el universo al nivel más profundo, necesitamos saber no tan sólo \n\tcómo se comporta el universo, sino también por qué.\n\t¿Por qué hay algo en lugar de no haber nada?\n\t¿Por qué existimos?\n\t¿Por qué este conjunto particular de leyes y no otro?\n\tÉsta es la cuestión última de la vida, el universo y el Todo. \n\tIntentaremos responderla en este libro. A diferencia de la respuesta\n\tofrecida en la Guía de la galaxia, de Hitchhiker, nuestra respuesta no será, simple.\n");
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
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Diseno dialog = new Diseno(new javax.swing.JFrame(), true);
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
