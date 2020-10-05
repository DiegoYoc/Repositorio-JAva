/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion6;

import java.awt.Color;
import parcialjavadiegoyoc.JFrmMenu;

/**
 *
 * @author ChocoChiwi
 */
public class JFrmSolucion6 extends javax.swing.JFrame {

    /**
     * Creates new form JFrmSolucion6
     */
    ProcesosSolucion6 objeto=new ProcesosSolucion6();
    public JFrmSolucion6() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblTitulo = new javax.swing.JLabel();
        jLblNumero1 = new javax.swing.JLabel();
        jTxtNum1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstEnunciado6 = new javax.swing.JList<>();
        jBtnRegresar = new javax.swing.JButton();
        jLblEtiquetaResultado = new javax.swing.JLabel();
        jLblResultado1 = new javax.swing.JLabel();
        jBtnOpcion1 = new javax.swing.JButton();
        jBtnOpcion2 = new javax.swing.JButton();
        jBtnOpcion3 = new javax.swing.JButton();
        jBtnOpcion4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("solución 6");
        setResizable(false);

        jLblTitulo.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Solución 6");

        jLblNumero1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblNumero1.setForeground(new java.awt.Color(255, 255, 255));
        jLblNumero1.setText("Ingrese valor decimal");

        jTxtNum1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNum1ActionPerformed(evt);
            }
        });
        jTxtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNum1KeyTyped(evt);
            }
        });

        jLstEnunciado6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Convertir un numero entero de base 10 (decimal) y realizar lo siguiente:", "1) Convertirlo a binario", "2) Convertirlo a octal", "3) Convertirlo a hexadecimal", "4) Convertirlo a base 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLstEnunciado6);

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnRegresar.setText("Regresar al Menú");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jLblEtiquetaResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblEtiquetaResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLblEtiquetaResultado.setText("Resultado: ");

        jLblResultado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblResultado1.setForeground(new java.awt.Color(255, 255, 255));
        jLblResultado1.setText(" ");

        jBtnOpcion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion1.setText("Opción 1");
        jBtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion1ActionPerformed(evt);
            }
        });

        jBtnOpcion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion2.setText("Opción 2");
        jBtnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion2ActionPerformed(evt);
            }
        });

        jBtnOpcion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion3.setText("Opción 3");
        jBtnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion3ActionPerformed(evt);
            }
        });

        jBtnOpcion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion4.setText("Opción 4");
        jBtnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jBtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblTitulo))
                            .addComponent(jLblEtiquetaResultado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBtnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLblNumero1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtNum1)
                                            .addComponent(jBtnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNumero1)
                    .addComponent(jTxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion1)
                    .addComponent(jBtnOpcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion3)
                    .addComponent(jBtnOpcion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLblEtiquetaResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblResultado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNum1ActionPerformed

    private void jTxtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNum1KeyTyped
        // TODO add your handling code here:
        jTxtNum1.setText(jTxtNum1.getText().trim()); //evita los espacios

        char validar=evt.getKeyChar(); //evt es un Key Event
        if (!Character.isDigit(validar)) {

            evt.consume(); //Consume este evento para que la fuente que lo originó no lo procese de manera predeterminada.
            //JOptionPane.showMessageDialog(rootPane, "Solo se permite el uso de números"); //rootPane crear ventanas
        }
    }//GEN-LAST:event_jTxtNum1KeyTyped

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        JFrmMenu Menu = new JFrmMenu();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jBtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion1ActionPerformed
        // TODO add your handling code here:
        if (jTxtNum1.getText().isEmpty()) {
            jLblResultado1.setText(objeto.vacio());
        }
        else{
            objeto.setNum(Integer.valueOf(jTxtNum1.getText()));
            jLblResultado1.setText(objeto.base2());
        }
        
    }//GEN-LAST:event_jBtnOpcion1ActionPerformed

    private void jBtnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion2ActionPerformed
        // TODO add your handling code here:
        if (jTxtNum1.getText().isEmpty()) {
            jLblResultado1.setText(objeto.vacio());
        }
        else{
            objeto.setNum(Integer.valueOf(jTxtNum1.getText()));
            jLblResultado1.setText(objeto.base8());
        }
    }//GEN-LAST:event_jBtnOpcion2ActionPerformed

    private void jBtnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion3ActionPerformed
        // TODO add your handling code here:
        if (jTxtNum1.getText().isEmpty()) {
            jLblResultado1.setText(objeto.vacio());
        }
        else{
            objeto.setNum(Integer.valueOf(jTxtNum1.getText()));
            jLblResultado1.setText(objeto.base16().toUpperCase());
        }
    }//GEN-LAST:event_jBtnOpcion3ActionPerformed

    private void jBtnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion4ActionPerformed
        // TODO add your handling code here:
        if (jTxtNum1.getText().isEmpty()) {
            jLblResultado1.setText(objeto.vacio());
        }
        else{
            objeto.setNum(Integer.valueOf(jTxtNum1.getText()));
            jLblResultado1.setText(objeto.base4());
        }
    }//GEN-LAST:event_jBtnOpcion4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmSolucion6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnOpcion1;
    private javax.swing.JButton jBtnOpcion2;
    private javax.swing.JButton jBtnOpcion3;
    private javax.swing.JButton jBtnOpcion4;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLblEtiquetaResultado;
    private javax.swing.JLabel jLblNumero1;
    private javax.swing.JLabel jLblResultado1;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JList<String> jLstEnunciado6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtNum1;
    // End of variables declaration//GEN-END:variables
}