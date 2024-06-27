
package com.mycompany.jproy_gallery;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author olive
 */
public class form extends javax.swing.JFrame {

    formFotos fotos= new formFotos();//crea un objeto global 
    public form() {
        initComponents();
           //iniciar en el centro
          this.setLocationRelativeTo(null);
          //color del JFrame
          this.getContentPane().setBackground(new Color(32,32,33));
          
          //agregar el JpanelForm ->formFotos por defecto al ejecutar
          ShowPanel(fotos);
          //ventana maximizada
          configurarVentana();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        panelBuscar = new com.mycompany.jproy_gallery.PanelRound();
        btnFotos = new javax.swing.JButton();
        btnFavoritos = new javax.swing.JButton();
        btnCarpeta = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelPadre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTogle = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(32, 32, 33));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menú-30.png"))); // NOI18N
        btnMenu.setBorder(null);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 28));

        panelBuscar.setBackground(new java.awt.Color(55, 55, 56));
        panelBuscar.setRoundBottomLeft(20);
        panelBuscar.setRoundBottomRight(20);
        panelBuscar.setRoundTopLeft(20);
        panelBuscar.setRoundTopRight(20);

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 6, 550, 30));

        btnFotos.setBackground(new java.awt.Color(32, 32, 33));
        btnFotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-fotos2-30.png"))); // NOI18N
        btnFotos.setBorder(null);
        btnFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotosActionPerformed(evt);
            }
        });
        getContentPane().add(btnFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 28));

        btnFavoritos.setBackground(new java.awt.Color(32, 32, 33));
        btnFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-favorito-30.png"))); // NOI18N
        btnFavoritos.setBorder(null);
        btnFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(btnFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 28));

        btnCarpeta.setBackground(new java.awt.Color(32, 32, 33));
        btnCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-carpeta-30.png"))); // NOI18N
        btnCarpeta.setBorder(null);
        btnCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarpetaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarpeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 28));

        btnConfiguracion.setBackground(new java.awt.Color(32, 32, 33));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-30.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 28));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-fotosColor-30.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 28));

        panelPadre.setBackground(new java.awt.Color(55, 55, 56));

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(panelPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1000, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-línea-horizontal-30.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-línea-horizontal-30.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btnTogle.setBackground(new java.awt.Color(32, 32, 33));
        btnTogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/claro-30.png"))); // NOI18N
        btnTogle.setBorder(null);
        btnTogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTogleActionPerformed(evt);
            }
        });
        getContentPane().add(btnTogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void configurarVentana(){
    this.setSize(500,500);
    this.setExtendedState(form.MAXIMIZED_BOTH);
}

    private void btnFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotosActionPerformed

    //llamada al metodo ShowPanel
          ShowPanel(fotos);
    }//GEN-LAST:event_btnFotosActionPerformed

    private void btnFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritosActionPerformed

        formFavoritos favoritos= new formFavoritos(); 
        ShowPanel(favoritos);
        
    }//GEN-LAST:event_btnFavoritosActionPerformed
 private void ShowPanel(JPanel p){
        p.setSize(1000, 510);
        p.setLocation(0, 0);
        //remover el panel padre para reemplazarlo por el nuevo JPANEL
        panelPadre.removeAll();
        panelPadre.add(p, BorderLayout.CENTER); //agregar el nuevo jpanel llamado p
        panelPadre.revalidate();
        panelPadre.repaint();
    }
    private void btnCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpetaActionPerformed
       
           formCarpeta carpeta= new formCarpeta(); 
          ShowPanel(carpeta);
    }//GEN-LAST:event_btnCarpetaActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed

        formAjustes ajustes = new formAjustes();
        ShowPanel(ajustes);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnTogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTogleActionPerformed
        // TODO add your handling code here:
          ImageIcon oscuro = new ImageIcon("src/main/resources/img/oscuro-30.png");
            if (btnTogle.isSelected()) {//si se seleciona modo claro
                
                btnTogle.setSelectedIcon(oscuro);
                this.getContentPane().setBackground(Color.gray);
                btnMenu.setBackground(Color.gray);
                btnCarpeta.setBackground(Color.gray);
                btnFavoritos.setBackground(Color.gray);
                btnConfiguracion.setBackground(Color.gray);
                btnFotos.setBackground(Color.gray);
                } else {//modo oscuro
                
                    this.getContentPane().setBackground(new Color(32,32,33));
                    btnMenu.setBackground(new Color(32,32,33));
                    btnCarpeta.setBackground(new Color(32,32,33));
                    btnFavoritos.setBackground(new Color(32,32,33));
                    btnConfiguracion.setBackground(new Color(32,32,33));
                    btnFotos.setBackground(new Color(32,32,33));
                }
        
    }//GEN-LAST:event_btnTogleActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarpeta;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnFavoritos;
    private javax.swing.JButton btnFotos;
    private javax.swing.JButton btnMenu;
    private javax.swing.JToggleButton btnTogle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.mycompany.jproy_gallery.PanelRound panelBuscar;
    private javax.swing.JPanel panelPadre;
    // End of variables declaration//GEN-END:variables
}
