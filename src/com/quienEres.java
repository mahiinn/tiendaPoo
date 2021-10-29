/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import com.app;

/**
 *
 * @author USER
 */
public class quienEres extends javax.swing.JFrame {

    int xMouse,yMouse;
    app app = new app();
    public quienEres() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        closePanel = new javax.swing.JPanel();
        closeButtonLabel = new javax.swing.JLabel();
        admiPanel = new javax.swing.JPanel();
        admiLabel = new javax.swing.JLabel();
        vendedorPanel = new javax.swing.JPanel();
        vendedorLabel = new javax.swing.JLabel();
        whoAreYouLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(800, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        closePanel.setBackground(new java.awt.Color(255, 255, 255));
        closePanel.setPreferredSize(new java.awt.Dimension(45, 40));

        closeButtonLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeButtonLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        closeButtonLabel.setForeground(new java.awt.Color(0, 0, 0));
        closeButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButtonLabel.setText("X");
        closeButtonLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButtonLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 760, Short.MAX_VALUE)
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        admiPanel.setBackground(new java.awt.Color(0, 0, 0));

        admiLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        admiLabel.setForeground(new java.awt.Color(255, 255, 255));
        admiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admiLabel.setText("Administrador");
        admiLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admiLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admiLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admiLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admiLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout admiPanelLayout = new javax.swing.GroupLayout(admiPanel);
        admiPanel.setLayout(admiPanelLayout);
        admiPanelLayout.setHorizontalGroup(
            admiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        admiPanelLayout.setVerticalGroup(
            admiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(admiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 260, 180, 50));

        vendedorPanel.setBackground(new java.awt.Color(255, 255, 255));
        vendedorPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        vendedorLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        vendedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendedorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendedorLabel.setText("Vendedor");
        vendedorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vendedorLabel.setPreferredSize(null);
        vendedorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendedorLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vendedorLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vendedorLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout vendedorPanelLayout = new javax.swing.GroupLayout(vendedorPanel);
        vendedorPanel.setLayout(vendedorPanelLayout);
        vendedorPanelLayout.setHorizontalGroup(
            vendedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        vendedorPanelLayout.setVerticalGroup(
            vendedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendedorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        background.add(vendedorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 260, 180, 50));

        whoAreYouLabel.setFont(new java.awt.Font("Poppins Medium", 0, 41)); // NOI18N
        whoAreYouLabel.setForeground(new java.awt.Color(0, 0, 0));
        whoAreYouLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whoAreYouLabel.setText("¿Quién eres?");
        whoAreYouLabel.setToolTipText("");
        whoAreYouLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        whoAreYouLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(whoAreYouLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 800, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        //nos ayuda a saber la posición de nuestro mouse 
        // para luego mover la barra a voluntad.
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //con esta acción podemos mover la barra a volundad
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged
                
    private void closeButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseClicked
        // Cerrar pestaña
        System.exit(0);
    }//GEN-LAST:event_closeButtonLabelMouseClicked

    private void closeButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseEntered
        closePanel.setBackground(Color.red);
        closeButtonLabel.setForeground(Color.white);
    }//GEN-LAST:event_closeButtonLabelMouseEntered

    private void closeButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseExited
        closePanel.setBackground(Color.white);
        closeButtonLabel.setForeground(Color.black);
    }//GEN-LAST:event_closeButtonLabelMouseExited

    private void admiLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admiLabelMouseEntered
        admiPanel.setBackground(new Color(106,105,105));
        admiLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_admiLabelMouseEntered

    private void admiLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admiLabelMouseExited
        admiPanel.setBackground(Color.BLACK);
        admiLabel.setForeground(Color.white);
    }//GEN-LAST:event_admiLabelMouseExited

    private void admiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admiLabelMouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            new loginAdmi().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_admiLabelMouseClicked

    private void vendedorLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedorLabelMouseEntered
        vendedorPanel.setBackground(new Color(106,105,105));
        vendedorLabel.setForeground(Color.BLACK);
        vendedorPanel.setBorder(BorderFactory.createLineBorder(new Color(106,105,105), 1));
    }//GEN-LAST:event_vendedorLabelMouseEntered

    private void vendedorLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedorLabelMouseExited
        vendedorPanel.setBackground(Color.white);
        vendedorLabel.setForeground(Color.black);
        vendedorPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_vendedorLabelMouseExited

    private void vendedorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendedorLabelMouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            new loginVendedor().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_vendedorLabelMouseClicked

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
            java.util.logging.Logger.getLogger(quienEres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quienEres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quienEres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quienEres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new quienEres().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admiLabel;
    private javax.swing.JPanel admiPanel;
    private javax.swing.JPanel background;
    private javax.swing.JLabel closeButtonLabel;
    private javax.swing.JPanel closePanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel vendedorLabel;
    private javax.swing.JPanel vendedorPanel;
    private javax.swing.JLabel whoAreYouLabel;
    // End of variables declaration//GEN-END:variables
}
