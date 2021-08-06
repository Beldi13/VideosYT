package Validaciones;

/**
 * En esta clase aprenderás a validar un JtextField para que haga una acción si
 * está vacío o lleno. La acción será mostrar un mensaje en un JLabel para este
 * caso, usa tu creatividad y dale el uso que quieras. Recuerda que este es un
 * ejemplo y una de muchas formas de hacerlo.
 *
 * @author Diego Robles
 * @since 2021-07-27
 */
public class CamposVacios extends javax.swing.JFrame {

    public CamposVacios() {
        initComponents();
    }

    /**
     * Evalua si el contenido del jTextfield esta vacío, SI.. hace una acción...
     * NO hace otra acción.
     *
     * Link del video: https://youtu.be/VZuZwx2Leto
     */
    private void estaVacio() {
        if (JTFCampo1.getText().trim().isEmpty()) {
            JLMensaje.setText("El campo esta vacio o tiene caracteres en blanco...");
        } else {
            JLMensaje.setText("El campo tiene contenido");
        }
    }

    /**
     * Evalua si el contenido del jTextfield, caracter por caracter si contiene
     * una letra,si evalua por true.. hace una acción... false hace otra acción.
     *
     * link del video: https://youtu.be/HSVYi2m89fA
     */
    private void soloNumeros() {
        for (int i = 0; i < JTFCampo2.getText().length(); i++) {
            if (!Character.isDigit(JTFCampo2.getText().charAt(i))) {
                JLMensaje1.setText("No se permiten letras usuario-kun...");
            } else {
                JLMensaje1.setText("Correcto, es un número...");
            }
        }
    }

    /**
     * Evalua si el contenido del jTextfield es una cedula valida o no,si evalua
     * por true.. hace una acción... false hace otra acción.
     *
     * link del video: https://youtu.be/lISJfOQLZs8
     */
    private void validarCedula() {
        if (Validar.cedula(JTFCampo3.getText())) {
            JLMensaje2.setText("cedula correcta");
        } else {
            JLMensaje2.setText("cedula incorrecta");
        }
    }

    /**
     * Llamado al metodo de validacion de correo para mostrar un mensaje en un
     * jLabel.
     */
    private void validarCorreo() {
        JLMensaje3.setText((Validar.correo(JTFCampo4.getText().trim())) ? "correo valido" : "correo invalido");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPContenedor = new javax.swing.JPanel();
        JPPie = new javax.swing.JPanel();
        JLwsp = new javax.swing.JLabel();
        JLfb = new javax.swing.JLabel();
        JLyt = new javax.swing.JLabel();
        JBTValidarCampos = new javax.swing.JButton();
        JTFCampo1 = new javax.swing.JTextField();
        JLMensaje = new javax.swing.JLabel();
        JL1 = new javax.swing.JLabel();
        JTFCampo2 = new javax.swing.JTextField();
        JL2 = new javax.swing.JLabel();
        JLMensaje1 = new javax.swing.JLabel();
        JTFCampo3 = new javax.swing.JTextField();
        JL3 = new javax.swing.JLabel();
        JLMensaje2 = new javax.swing.JLabel();
        JTFCampo4 = new javax.swing.JTextField();
        JL4 = new javax.swing.JLabel();
        JLMensaje3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Validar campos vacíos");

        JPContenedor.setBackground(new java.awt.Color(255, 255, 255));
        JPContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPPie.setBackground(new java.awt.Color(87, 111, 194));
        JPPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLwsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLwsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp.png"))); // NOI18N
        JPPie.add(JLwsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 40, 40));

        JLfb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLfb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook.png"))); // NOI18N
        JPPie.add(JLfb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 40, 40));

        JLyt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLyt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/youtube.png"))); // NOI18N
        JPPie.add(JLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 40, 40));

        JPContenedor.add(JPPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 502, 40));

        JBTValidarCampos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JBTValidarCampos.setText("Validar Campos");
        JBTValidarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTValidarCamposActionPerformed(evt);
            }
        });
        JPContenedor.add(JBTValidarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 200, 40));

        JTFCampo1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JTFCampo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFCampo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFCampo1KeyReleased(evt);
            }
        });
        JPContenedor.add(JTFCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, 40));

        JLMensaje.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JLMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMensaje.setText("mensaje");
        JPContenedor.add(JLMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 502, 40));

        JL1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL1.setText("Campo a validar");
        JPContenedor.add(JL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 40));

        JTFCampo2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JTFCampo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFCampo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFCampo2KeyTyped(evt);
            }
        });
        JPContenedor.add(JTFCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 40));

        JL2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL2.setText("Solo números");
        JPContenedor.add(JL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 40));

        JLMensaje1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JLMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMensaje1.setText("mensaje");
        JPContenedor.add(JLMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 502, 40));

        JTFCampo3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JTFCampo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFCampo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFCampo3KeyTyped(evt);
            }
        });
        JPContenedor.add(JTFCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 200, 40));

        JL3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL3.setText("Cédula a validar");
        JPContenedor.add(JL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 40));

        JLMensaje2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JLMensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMensaje2.setText("mensaje");
        JPContenedor.add(JLMensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 502, 40));

        JTFCampo4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JTFCampo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPContenedor.add(JTFCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 200, 40));

        JL4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL4.setText("Validar sintaxis email");
        JPContenedor.add(JL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 40));

        JLMensaje3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        JLMensaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLMensaje3.setText("mensaje");
        JPContenedor.add(JLMensaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 502, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBTValidarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTValidarCamposActionPerformed
        //estaVacio();
        //soloNumeros();
        //validarCedula();
        validarCorreo();
    }//GEN-LAST:event_JBTValidarCamposActionPerformed
    /**
     * Se ejecuta cada vez que terminas de presionar una tecla, mientras el
     * componente este en foco.
     */
    private void JTFCampo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCampo1KeyReleased
        estaVacio();
    }//GEN-LAST:event_JTFCampo1KeyReleased
    /**
     * Se ejecuta cada vez que escribes un caracter en el jTextField, evalua si
     * es una letra o un número, si es true omite el caracter de letra o espacio
     * "\b".... si es false hace otra acción.
     *
     * link del video: https://youtu.be/HSVYi2m89fA
     */
    private void JTFCampo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCampo2KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0' || caracter > '9')) & (caracter != '\b')) {
            JLMensaje1.setText("No se permiten letras o caracteres vacíos, usuario-kun...");
            evt.consume();
        } else {
            JLMensaje1.setText("Correcto, es un número...");
        }
    }//GEN-LAST:event_JTFCampo2KeyTyped
    /**
     * Establece un limite de caracteres para el jTextField y se ejecuta cada
     * vez que escribes un caracter en el jTextField ademas solo permitira el
     * ingreso de numeros con un limite de 10 caracteres.
     *
     * link del video: https://youtu.be/lISJfOQLZs8
     */
    private void JTFCampo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCampo3KeyTyped
        char car = evt.getKeyChar();
        if (JTFCampo3.getText().length() == 10 || (car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFCampo3KeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CamposVacios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamposVacios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamposVacios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamposVacios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CamposVacios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTValidarCampos;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JL3;
    private javax.swing.JLabel JL4;
    private javax.swing.JLabel JLMensaje;
    private javax.swing.JLabel JLMensaje1;
    private javax.swing.JLabel JLMensaje2;
    private javax.swing.JLabel JLMensaje3;
    private javax.swing.JLabel JLfb;
    private javax.swing.JLabel JLwsp;
    private javax.swing.JLabel JLyt;
    private javax.swing.JPanel JPContenedor;
    private javax.swing.JPanel JPPie;
    private javax.swing.JTextField JTFCampo1;
    private javax.swing.JTextField JTFCampo2;
    private javax.swing.JTextField JTFCampo3;
    private javax.swing.JTextField JTFCampo4;
    // End of variables declaration//GEN-END:variables
}
