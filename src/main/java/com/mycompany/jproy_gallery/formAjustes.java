
package com.mycompany.jproy_gallery;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author olive
 */
public class formAjustes extends javax.swing.JPanel {

    /**
     * Creates new form formAjustes
     */
    FormAbaut abaut= new FormAbaut();
    public formAjustes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAjustes = new com.mycompany.jproy_gallery.PanelRound();
        panelRound1 = new com.mycompany.jproy_gallery.PanelRound();
        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnAbaut = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 55, 56));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAjustes.setBackground(new java.awt.Color(55, 55, 56));
        panelAjustes.setRoundBottomLeft(40);
        panelAjustes.setRoundBottomRight(40);
        panelAjustes.setRoundTopLeft(40);
        panelAjustes.setRoundTopRight(40);

        panelRound1.setBackground(new java.awt.Color(75, 78, 79));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jButton1.setBackground(new java.awt.Color(75, 78, 79));
        jButton1.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir-30.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1084, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        btnAbaut.setBackground(new java.awt.Color(55, 55, 56));
        btnAbaut.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnAbaut.setForeground(new java.awt.Color(255, 255, 255));
        btnAbaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-25.png"))); // NOI18N
        btnAbaut.setText("Sobre nosotros");
        btnAbaut.setBorder(null);
        btnAbaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbautActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAjustesLayout = new javax.swing.GroupLayout(panelAjustes);
        panelAjustes.setLayout(panelAjustesLayout);
        panelAjustesLayout.setHorizontalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjustesLayout.createSequentialGroup()
                .addContainerGap(805, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnAbaut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAjustesLayout.setVerticalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnAbaut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 590));

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-30.png"))); // NOI18N
        jLabel11.setText("Ajustes");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAbautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbautActionPerformed
        // TODO add your handling code here:
        ShowPanel(abaut);
        
    }//GEN-LAST:event_btnAbautActionPerformed
private void ShowPanel(JPanel p){
        p.setSize(1100, 590);
        p.setLocation(0, 0);
        //remover el panel padre para reemplazarlo por el nuevo JPANEL
        panelAjustes.removeAll();
        panelAjustes.add(p, BorderLayout.CENTER); //agregar el nuevo jpanel llamado p
        panelAjustes.revalidate();
        panelAjustes.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbaut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private keeptoo.KGradientPanel kGradientPanel1;
    private com.mycompany.jproy_gallery.PanelRound panelAjustes;
    private com.mycompany.jproy_gallery.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
