/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 * Ventana de Simulacion de Juego de Marcianitos
 * Los Marcianitos se iran moviendo por un eje de coordenadas
 * hasta que colisionen entre si
 * @author Ignacio
 */
public class VentanaMarcianos extends javax.swing.JFrame {

    //Cremos los atributos
    Marciano marciano1;
    Marciano marciano2;
    
    //Posicion Inicial del Marciano 2
    public final int POS_MARC2_X = 20;
    public final int POS_MARC2_Y = 32;
    
    /**
     * Creates new form VentanaMarcianos
     */
    public VentanaMarcianos() {
        initComponents();
        
        //Generamos el Marciano 1
        generaMarciano1();
        
        //Generamos el Marciano 2
        generaMarciano2();
        
        //Muestra la posicion Inicial del Marciano 1
        refrescaPosicion1();
        
        //Muestra la posicion Inicial del Marciano 2
        refrescaPosicion2();
        
        //Centramos la ventana
        setLocationRelativeTo(null);
    }

    /**
     * Genera el Marciano Numero 1
     */
    private void generaMarciano1(){
        //Creamos el Objeto marciano1 con los siguiente parametros
        marciano1 = new Marciano("Grijander", Marciano.TIPO_ACRUX);
        
        //Incluimos en el titulo del Panel 1 el Nombre del Marciano 1
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(marciano1.getNombreMarciano()));
    }
    /**
     * Genera el Marciano Numero 2
     */
    private void generaMarciano2(){
        //Creamos el Objeto marciano2 con los siguiente parametros
        marciano2 = new Marciano("Candemor", Marciano.TIPO_ELNATH, POS_MARC2_X, POS_MARC2_Y);
        
        //Incluimos en el titulo del Panel 2 el Nombre del Marciano 2
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(marciano2.getNombreMarciano()));
    }
    
    /**
     * Muestra en la ventana el numero de movimientos totales de los Marcianos
     */
    private void muestraNumMovimientos(){
        jTFNumMovimientos.setText(String.valueOf(Marciano.getNumMovimientos()));
    }
 
    /**
     * Una vez movido el marcianito 1 refresca el numero de movimientos
     * el Text Area y comprueba si se ha producido alguna colision
     */
    private void refrescaPosicion1(){
        //Muestra el Numero de Movimientos totales
        muestraNumMovimientos();
        
        //Muestra la Posicion del Marciano 1
        jTAScreen.append(marciano1.getPosicionMarciano() + "\n");
        
        //Comprueba si han chocado
        controlaChoque();
    }

    /**
     * Una vez movido el marcianito 2 refresca el numero de movimientos
     * el Text Area y comprueba si se ha producido alguna colision
     */
    private void refrescaPosicion2(){
        //Muestra el Numero de Movimientos totales
        muestraNumMovimientos();
        
        //Muestra la Posicion del Marciano 2
        jTAScreen.append(marciano2.getPosicionMarciano() + "\n");
        
        //Comprueba si han chocado
        controlaChoque();
    }
    
    /**
     * Comprueba si se ha producido algun choque entre marcianitos
     */
    private void controlaChoque(){
        //Si los 2 marcianos se encuentran en la misma Posicion -> Choque
        if ((marciano1.getCoordenadaX() == marciano2.getCoordenadaX()) && (marciano1.getCoordenadaY() == marciano2.getCoordenadaY())){
            jTAScreen.append("!!!COLISION!!!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBArribaMarc2 = new javax.swing.JButton();
        jBIzquierdaMarc2 = new javax.swing.JButton();
        jBDerechaMarc2 = new javax.swing.JButton();
        jBAbajoMarc2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAScreen = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTFNumMovimientos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBArribaMarc1 = new javax.swing.JButton();
        jBIzquierdaMarc1 = new javax.swing.JButton();
        jBDerechaMarc1 = new javax.swing.JButton();
        jBAbajoMarc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcianitos de los Remedios");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Marciano 2"));

        jBArribaMarc2.setText("Arriba");
        jBArribaMarc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArribaMarc2ActionPerformed(evt);
            }
        });

        jBIzquierdaMarc2.setText("Izquierda");
        jBIzquierdaMarc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIzquierdaMarc2ActionPerformed(evt);
            }
        });

        jBDerechaMarc2.setText("Derecha");
        jBDerechaMarc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDerechaMarc2ActionPerformed(evt);
            }
        });

        jBAbajoMarc2.setText("Abajo");
        jBAbajoMarc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbajoMarc2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAbajoMarc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBArribaMarc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBIzquierdaMarc2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBDerechaMarc2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBArribaMarc2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIzquierdaMarc2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDerechaMarc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAbajoMarc2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Screen");

        jTAScreen.setEditable(false);
        jTAScreen.setColumns(20);
        jTAScreen.setRows(5);
        jScrollPane1.setViewportView(jTAScreen);

        jLabel2.setText("Movimientos:");

        jTFNumMovimientos.setEditable(false);
        jTFNumMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumMovimientosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Marciano 1"));

        jBArribaMarc1.setText("Arriba");
        jBArribaMarc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArribaMarc1ActionPerformed(evt);
            }
        });

        jBIzquierdaMarc1.setText("Izquierda");
        jBIzquierdaMarc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIzquierdaMarc1ActionPerformed(evt);
            }
        });

        jBDerechaMarc1.setText("Derecha");
        jBDerechaMarc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDerechaMarc1ActionPerformed(evt);
            }
        });

        jBAbajoMarc1.setText("Abajo");
        jBAbajoMarc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbajoMarc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAbajoMarc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBArribaMarc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBIzquierdaMarc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBDerechaMarc1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBArribaMarc1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIzquierdaMarc1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDerechaMarc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAbajoMarc1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNumMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTFNumMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNumMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumMovimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumMovimientosActionPerformed

    private void jBArribaMarc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArribaMarc1ActionPerformed
        marciano1.moveUpMarciano();
        refrescaPosicion1();
        
        //Activamos Desactivamos los Botones
        jBAbajoMarc1.setEnabled(true);
        if (marciano1.getCoordenadaY() == Marciano.MAX_POS_Y)
            jBArribaMarc1.setEnabled(false);
    }//GEN-LAST:event_jBArribaMarc1ActionPerformed

    private void jBDerechaMarc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDerechaMarc1ActionPerformed
        marciano1.moveRightMarciano();
        refrescaPosicion1();
        
        //Activamos Desactivamos los Botones
        jBIzquierdaMarc1.setEnabled(true);
        if (marciano1.getCoordenadaX() == Marciano.MAX_POS_X)
            jBDerechaMarc1.setEnabled(false);
    }//GEN-LAST:event_jBDerechaMarc1ActionPerformed

    private void jBIzquierdaMarc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIzquierdaMarc1ActionPerformed
        marciano1.moveLeftMarciano();
        refrescaPosicion1();
        
        //Activamos Desactivamos los Botones
        jBDerechaMarc1.setEnabled(true);
        if (marciano1.getCoordenadaX() == 0)
            jBIzquierdaMarc1.setEnabled(false);
    }//GEN-LAST:event_jBIzquierdaMarc1ActionPerformed

    private void jBAbajoMarc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbajoMarc1ActionPerformed
        marciano1.moveDownMarciano();
        refrescaPosicion1();
        
        //Activamos Desactivamos los Botones
        jBArribaMarc1.setEnabled(true);
        if (marciano1.getCoordenadaY() == 0)
            jBAbajoMarc1.setEnabled(false);
    }//GEN-LAST:event_jBAbajoMarc1ActionPerformed

    private void jBArribaMarc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArribaMarc2ActionPerformed
        marciano2.moveUpMarciano();
        refrescaPosicion2();
        
        //Activamos Desactivamos los Botones
        jBAbajoMarc2.setEnabled(true);
        if (marciano2.getCoordenadaY() == Marciano.MAX_POS_Y)
            jBArribaMarc2.setEnabled(false);
    }//GEN-LAST:event_jBArribaMarc2ActionPerformed

    private void jBIzquierdaMarc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIzquierdaMarc2ActionPerformed
        marciano2.moveLeftMarciano();
        refrescaPosicion2();
        
        //Activamos Desactivamos los Botones
        jBDerechaMarc2.setEnabled(true);
        if (marciano2.getCoordenadaX() == 0)
            jBIzquierdaMarc2.setEnabled(false);
    }//GEN-LAST:event_jBIzquierdaMarc2ActionPerformed

    private void jBDerechaMarc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDerechaMarc2ActionPerformed
        marciano2.moveRightMarciano();
        refrescaPosicion2();
        
        //Activamos Desactivamos los Botones
        jBIzquierdaMarc2.setEnabled(true);
        if (marciano2.getCoordenadaX() == Marciano.MAX_POS_X)
            jBDerechaMarc2.setEnabled(false);
    }//GEN-LAST:event_jBDerechaMarc2ActionPerformed

    private void jBAbajoMarc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbajoMarc2ActionPerformed
        marciano2.moveDownMarciano();
        refrescaPosicion2();
        
        //Activamos Desactivamos los Botones
        jBArribaMarc2.setEnabled(true);
        if (marciano2.getCoordenadaY() == 0)
            jBAbajoMarc2.setEnabled(false);
    }//GEN-LAST:event_jBAbajoMarc2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMarcianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMarcianos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMarcianos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbajoMarc1;
    private javax.swing.JButton jBAbajoMarc2;
    private javax.swing.JButton jBArribaMarc1;
    private javax.swing.JButton jBArribaMarc2;
    private javax.swing.JButton jBDerechaMarc1;
    private javax.swing.JButton jBDerechaMarc2;
    private javax.swing.JButton jBIzquierdaMarc1;
    private javax.swing.JButton jBIzquierdaMarc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAScreen;
    private javax.swing.JTextField jTFNumMovimientos;
    // End of variables declaration//GEN-END:variables
}
