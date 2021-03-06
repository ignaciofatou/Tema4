/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Statics.A_Aparato;

import javax.swing.JButton;

/**
 *
 * @author Ignacio
 */
public class VentanaAparatos extends javax.swing.JFrame {

    private Aparato bombilla;
    private Aparato radiador;
    private Aparato plancha;

    public VentanaAparatos() {
        initComponents();
        
        //Generamos los Objetos de Aparatos
        generaAparatos();

        //Centramos la ventana
        setLocationRelativeTo(null);
    }
    
    private void generaAparatos(){
        bombilla = new Aparato("Bombilla", 100);
        radiador = new Aparato("Radiador", 2000);
        plancha  = new Aparato("Plancha" , 1200);
        jTFConsumo.setText(String.valueOf(Aparato.getConsumoTotal()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBOnRadia = new javax.swing.JButton();
        jBOffRadia = new javax.swing.JButton();
        jBOnPlancha = new javax.swing.JButton();
        jBOnBombi = new javax.swing.JButton();
        jBOffBombi = new javax.swing.JButton();
        jBOffPlancha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTFConsumo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aparatos");

        jLabel1.setText("Simulador de aparatos de hogar");

        jLabel2.setText("Bombilla");

        jLabel3.setText("Radiador");

        jLabel4.setText("Plancha");

        jBOnRadia.setText("Encender");
        jBOnRadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOnRadiaActionPerformed(evt);
            }
        });

        jBOffRadia.setText("Apagar");
        jBOffRadia.setEnabled(false);
        jBOffRadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOffRadiaActionPerformed(evt);
            }
        });

        jBOnPlancha.setText("Encender");
        jBOnPlancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOnPlanchaActionPerformed(evt);
            }
        });

        jBOnBombi.setText("Encender");
        jBOnBombi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOnBombiActionPerformed(evt);
            }
        });

        jBOffBombi.setText("Apagar");
        jBOffBombi.setEnabled(false);
        jBOffBombi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOffBombiActionPerformed(evt);
            }
        });

        jBOffPlancha.setText("Apagar");
        jBOffPlancha.setEnabled(false);
        jBOffPlancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOffPlanchaActionPerformed(evt);
            }
        });

        jLabel5.setText("Consumo Total");

        jTFConsumo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBOnBombi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBOffBombi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBOnPlancha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBOffPlancha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBOnRadia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBOffRadia))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTFConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBOnBombi)
                    .addComponent(jBOffBombi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBOnRadia)
                    .addComponent(jBOffRadia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBOnPlancha)
                    .addComponent(jBOffPlancha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOnBombiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOnBombiActionPerformed
        bombilla.enciendeAparato();
        botonPulsado(jBOnBombi, jBOffBombi);
    }//GEN-LAST:event_jBOnBombiActionPerformed

    private void jBOnRadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOnRadiaActionPerformed
        radiador.enciendeAparato();
        botonPulsado(jBOnRadia, jBOffRadia);
    }//GEN-LAST:event_jBOnRadiaActionPerformed

    private void jBOnPlanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOnPlanchaActionPerformed
        plancha.enciendeAparato();
        botonPulsado(jBOnPlancha, jBOffPlancha);
    }//GEN-LAST:event_jBOnPlanchaActionPerformed

    private void jBOffPlanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOffPlanchaActionPerformed
        plancha.apagaAparato();
        botonPulsado(jBOnPlancha, jBOffPlancha);
    }//GEN-LAST:event_jBOffPlanchaActionPerformed

    private void jBOffRadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOffRadiaActionPerformed
        radiador.apagaAparato();
        botonPulsado(jBOnRadia, jBOffRadia);
    }//GEN-LAST:event_jBOffRadiaActionPerformed

    private void jBOffBombiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOffBombiActionPerformed
        bombilla.apagaAparato();
        botonPulsado(jBOnBombi, jBOffBombi);
    }//GEN-LAST:event_jBOffBombiActionPerformed

    private void botonPulsado(JButton encendido, JButton apagado){
        apagado.setEnabled(!apagado.isEnabled());
        encendido.setEnabled(!encendido.isEnabled());
        jTFConsumo.setText(String.valueOf(Aparato.getConsumoTotal()));
    }
    
    
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
            java.util.logging.Logger.getLogger(VentanaAparatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAparatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAparatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAparatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAparatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOffBombi;
    private javax.swing.JButton jBOffPlancha;
    private javax.swing.JButton jBOffRadia;
    private javax.swing.JButton jBOnBombi;
    private javax.swing.JButton jBOnPlancha;
    private javax.swing.JButton jBOnRadia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTFConsumo;
    // End of variables declaration//GEN-END:variables
}
