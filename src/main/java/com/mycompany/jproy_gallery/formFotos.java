
package com.mycompany.jproy_gallery;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author olive
 */
public class formFotos extends javax.swing.JPanel {
    private int currentIndex;
    private ArrayList<BufferedImage> images;
    private JLabel imageLabel;
    private double zoomFactor = 1.0;
    private Point initialClick;
        
    /**
     * Creates new form formFotos
     */
    public formFotos() {
        initComponents();
         currentIndex = -1;
           imageLabel = new JLabel();
          images = new ArrayList<>();
          
        //IMPORTANTE configurar el panel como Gridlayout de lo contrario no muestra las imagenes
        panelFotos.setLayout(new java.awt.GridBagLayout());
      
        //tamaño del jdialog
         dialogoFotos.setSize(1100, 700);
         panel_dialogo.setSize(1100, 700);
        dialogoFotos.setLocationRelativeTo(null);
        //al ejecutar la barra de progreso no se visualice
        progressBar.setVisible(false);
        //color para el jdialog
        dialogoFotos.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoFotos = new javax.swing.JDialog();
        btnRetroceder = new javax.swing.JButton();
        btnAdelantar = new javax.swing.JButton();
        scrolDialogo = new javax.swing.JScrollPane();
        panel_dialogo = new javax.swing.JPanel();
        panelPrincipalFotos = new javax.swing.JPanel();
        scrol = new javax.swing.JScrollPane();
        panelFotos = new com.mycompany.jproy_gallery.PanelRound();
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new com.mycompany.jproy_gallery.PanelRound();
        jButton1 = new javax.swing.JButton();

        dialogoFotos.setPreferredSize(new java.awt.Dimension(1100, 493));

        btnRetroceder.setBackground(new java.awt.Color(0, 0, 0));
        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder-removebg-previeww.png"))); // NOI18N
        btnRetroceder.setBorder(null);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnAdelantar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdelantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelantar-removebg-previewww.png"))); // NOI18N
        btnAdelantar.setBorder(null);
        btnAdelantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelantarActionPerformed(evt);
            }
        });

        scrolDialogo.setBackground(new java.awt.Color(75, 76, 77));

        panel_dialogo.setBackground(new java.awt.Color(0, 0, 0));
        panel_dialogo.setLayout(new java.awt.GridBagLayout());
        scrolDialogo.setViewportView(panel_dialogo);

        javax.swing.GroupLayout dialogoFotosLayout = new javax.swing.GroupLayout(dialogoFotos.getContentPane());
        dialogoFotos.getContentPane().setLayout(dialogoFotosLayout);
        dialogoFotosLayout.setHorizontalGroup(
            dialogoFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoFotosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder)
                .addGap(18, 18, 18)
                .addComponent(scrolDialogo, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(btnAdelantar)
                .addContainerGap())
        );
        dialogoFotosLayout.setVerticalGroup(
            dialogoFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoFotosLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(dialogoFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdelantar)
                    .addComponent(btnRetroceder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoFotosLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(scrolDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipalFotos.setBackground(new java.awt.Color(55, 55, 56));

        scrol.setBackground(new java.awt.Color(55, 55, 56));
        scrol.setForeground(new java.awt.Color(55, 55, 56));
        scrol.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrol.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelFotos.setBackground(new java.awt.Color(55, 55, 56));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout panelFotosLayout = new javax.swing.GroupLayout(panelFotos);
        panelFotos.setLayout(panelFotosLayout);
        panelFotosLayout.setHorizontalGroup(
            panelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotosLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        panelFotosLayout.setVerticalGroup(
            panelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotosLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        scrol.setViewportView(panelFotos);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-fotos-30.png"))); // NOI18N
        jLabel1.setText("Todas las fotos");

        panelRound1.setBackground(new java.awt.Color(73, 75, 76));
        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setRoundTopLeft(100);
        panelRound1.setRoundTopRight(100);

        jButton1.setBackground(new java.awt.Color(73, 75, 76));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-40.png"))); // NOI18N
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
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalFotosLayout = new javax.swing.GroupLayout(panelPrincipalFotos);
        panelPrincipalFotos.setLayout(panelPrincipalFotosLayout);
        panelPrincipalFotosLayout.setHorizontalGroup(
            panelPrincipalFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalFotosLayout.createSequentialGroup()
                .addComponent(scrol, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPrincipalFotosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalFotosLayout.setVerticalGroup(
            panelPrincipalFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalFotosLayout.createSequentialGroup()
                .addGroup(panelPrincipalFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalFotosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalFotosLayout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(scrol, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelPrincipalFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectImages();
    }//GEN-LAST:event_jButton1ActionPerformed
  private void panelFotosMouseClicked(MouseEvent evt, ImageIcon imageIcon) {
        // Crear un JLabel con la imagen a tamaño completo
        imageLabel.setIcon(imageIcon);
         zoomFactor = 1.0;
          // Añadir el MouseWheelListener para el zoom
        imageLabel.addMouseWheelListener(e -> {
            Point viewportPosition = scrolDialogo.getViewport().getViewPosition();
            if (e.getPreciseWheelRotation() < 0) {
                zoomFactor *= 1.1;
            } else {
                zoomFactor /= 1.1;
            }
             
            updateZoom(imageIcon);  
            scrolDialogo.getViewport().setViewPosition(viewportPosition);
        });
        
         // Añadir MouseListener para arrastrar la imagen
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                  
            }
        });
        // MouseMotionListener para arrastrar la imagen
        imageLabel.addMouseMotionListener(new MouseMotionAdapter() {
             @Override
            public void mouseDragged(MouseEvent e) {
                  JViewport viewport = scrolDialogo.getViewport();
                //JViewport viewport = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, imageLabel);
                if (viewport != null) {
                     Point viewPosition = viewport.getViewPosition();
                    int deltaX = initialClick.x - e.getX();
                    int deltaY = initialClick.y - e.getY();
               
                    viewPosition.translate(deltaX, deltaY);
                    imageLabel.scrollRectToVisible(new Rectangle(viewPosition, viewport.getSize()));
                     initialClick = e.getPoint(); // Update initialClick for smooth dragging
                }
            }
        });

         // Mostrar la imagen en el panel del diálogo
         panel_dialogo.removeAll();
         panel_dialogo.add(imageLabel);

         panel_dialogo.revalidate();
         panel_dialogo.repaint();

        // Configurar el JDialog
        dialogoFotos.setVisible(true);
    }
    //Realizar zoom en la imagen
    private void updateZoom(ImageIcon imageIcon) {
        int newWidth = (int) (imageIcon.getIconWidth() * zoomFactor);
        int newHeight = (int) (imageIcon.getIconHeight() * zoomFactor);
        Image scaledImage = imageIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));
    }                           //comenzar con un zoom de menos
     private void mostrarImagen(double zoomInicial) {
        if (currentIndex >= 0 && currentIndex < images.size()) {
            zoomFactor = zoomInicial;
            ImageIcon icon = new ImageIcon(images.get(currentIndex));
           panelFotosMouseClicked(null, icon);
             
        }
    }
    private void adelantarImagen() {
        if (currentIndex < images.size() - 1) {
            currentIndex++;
            mostrarImagen(0.5);
        }
    }
    private void retrocederImagen() {
        if (currentIndex > 0) {
            currentIndex--;
            mostrarImagen(0.5);
        }
    }
    private void btnAdelantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelantarActionPerformed
        // TODO add your handling code here:
        adelantarImagen();
    }//GEN-LAST:event_btnAdelantarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        retrocederImagen();
    }//GEN-LAST:event_btnRetrocederActionPerformed
   //Funcion para el anticlick
    private JPopupMenu createPopupMenu(JLabel label, int index) {
        //crea el poppup menu
        JPopupMenu popupMenu = new JPopupMenu();
         JMenuItem ver = new JMenuItem("Abrir");
        JMenuItem deleteItem = new JMenuItem("Eliminar");
        popupMenu.setPreferredSize(new Dimension(120, 100));
        
        //color a sus items
        ver.setBackground(new Color(32,32,33));
        ver.setForeground(Color.white);
        deleteItem.setBackground(new Color(32,32,33));
        deleteItem.setForeground(Color.red);
        
        //agregar iconos a los items del popup
         ver.setIcon(new ImageIcon("src/main/resources/img/icons8-ver-20.png"));
       deleteItem.setIcon(new ImageIcon("src/main/resources/img/icons8-eliminar-20.png"));
         //para eliminar
        deleteItem.addActionListener(e -> {
            panelFotos.remove(label);
            images.remove(index);
            panelFotos.revalidate();
            panelFotos.repaint();
        });
            //para ver
        ver.addActionListener(e -> {
        //mostrar la imagen en el dialog
       // dialogoFotos.getContentPane().add(new JScrollPane(imageLabel));
        panel_dialogo.removeAll();
          panel_dialogo.add(imageLabel);
         panel_dialogo.revalidate();
         panel_dialogo.repaint();
        // Configurar el JDialog
        dialogoFotos.setVisible(true);
        });
          popupMenu.add(ver);
        popupMenu.add(deleteItem);
        return popupMenu;
    }
    /* metodo principal para seleccionar las imagenes desde el explorador de archivos y agregarlos a un label 
    para luego mostrarlos en el jpanel*/
    private void selectImages() {
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            progressBar.setMaximum(files.length);
            progressBar.setValue(0);
            progressBar.setVisible(true);
            images.clear();
       
          // panelFotos.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);  // Padding between images
        final int COLUMNS = 6;  // Number of columns in the grid
        
            SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                @Override
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i < files.length; i++) {
                        File file = files[i];
                        try {
                            BufferedImage img = ImageIO.read(file);
                            if (img != null) {
                                images.add(img);
                                int newWidth = 100;
                                int newHeight = (int) Math.round((double) img.getHeight() * newWidth / img.getWidth());
                                Image scaledImage = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                                ImageIcon icon = new ImageIcon(scaledImage);
                                // Crear un JLabel y agregarle un MouseListener
                                JLabel label = new JLabel(icon);
                                int index = images.size() - 1;
                                label.addMouseListener(new MouseAdapter() {
                                    @Override  
                                    public void mouseClicked(MouseEvent evt) {
                                          if (SwingUtilities.isLeftMouseButton(evt)) {//si click--> muestra la imagen en dialogo
                                            currentIndex = index;
                                            ImageIcon fullSizeIcon = new ImageIcon(images.get(currentIndex));
                                            panelFotosMouseClicked(evt, fullSizeIcon);
                                        } else if (SwingUtilities.isRightMouseButton(evt)) {//si anticlik-->muestra el popup
                                            // Crear y mostrar el menú emergente
                                            JPopupMenu popupMenu = createPopupMenu(label, index);
                                            popupMenu.show(label, evt.getX(), evt.getY());
                                        }
                                    
                                    }
                                });
                              // Agregar el panel al panelFotos usando GridBagConstraints
                            gbc.gridx = i % COLUMNS;
                            gbc.gridy = i / COLUMNS;
                            panelFotos.add(label,gbc);                                  
                                progressBar.setValue(i + 1);
                                publish(i + 1);
                                
                                Thread.sleep(100); // Simular retardo
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    return null;
                }
                @Override
                protected void process(java.util.List<Integer> chunks) {
                    int progress = chunks.get(chunks.size() - 1);
                    progressBar.setString("Cargando " + progress + " de " + files.length);
                }
                @Override
                protected void done() {
                    progressBar.setVisible(false);
                    panelFotos.revalidate();
                    panelFotos.repaint();
                }
            };
            worker.execute();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelantar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JDialog dialogoFotos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private com.mycompany.jproy_gallery.PanelRound panelFotos;
    private javax.swing.JPanel panelPrincipalFotos;
    private com.mycompany.jproy_gallery.PanelRound panelRound1;
    private javax.swing.JPanel panel_dialogo;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane scrol;
    private javax.swing.JScrollPane scrolDialogo;
    // End of variables declaration//GEN-END:variables
}
