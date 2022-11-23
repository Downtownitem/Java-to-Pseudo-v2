package Interface;

import Utilities.Animations;
import Utilities.AnimationsUnique;

import java.awt.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        superiorBar.setBackground(new Color(0, 0, 0, 0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new CustomSwing.PanelRound();
        menu = new CustomSwing.PanelRound();
        menuTitle1 = new javax.swing.JLabel();
        logoutButtonHitbox = new javax.swing.JLabel();
        logoutButtonPanel = new CustomSwing.PanelRound();
        logoutButtonLabel = new javax.swing.JLabel();
        menuButton = new CustomSwing.PanelRound();
        menuLabel = new javax.swing.JLabel();
        superiorBar = new CustomSwing.PanelRound();
        exitButton = new CustomSwing.PanelRound();
        exitButtonLabel = new javax.swing.JLabel();
        minimizeButton = new CustomSwing.PanelRound();
        minimizeButtonLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(253, 253, 255));
        background.setRoundBottomLeft(25);
        background.setRoundBottomRight(25);
        background.setRoundTopLeft(25);
        background.setRoundTopRight(25);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(21, 30, 63));
        menu.setRoundBottomLeft(25);
        menu.setRoundBottomRight(25);
        menu.setRoundTopLeft(25);
        menu.setRoundTopRight(25);
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTitle1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        menuTitle1.setForeground(new java.awt.Color(253, 253, 255));
        menuTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle1.setText("¡Welcome!");
        menu.add(menuTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 120));

        logoutButtonHitbox.setBackground(new java.awt.Color(3, 0, 39));
        logoutButtonHitbox.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        logoutButtonHitbox.setForeground(new java.awt.Color(255, 255, 255));
        logoutButtonHitbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButtonHitbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButtonHitbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonHitboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonHitboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonHitboxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutButtonHitboxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutButtonHitboxMouseReleased(evt);
            }
        });
        menu.add(logoutButtonHitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 50));

        logoutButtonPanel.setBackground(new java.awt.Color(3, 0, 39));
        logoutButtonPanel.setRoundBottomLeft(25);
        logoutButtonPanel.setRoundBottomRight(25);
        logoutButtonPanel.setRoundTopLeft(25);
        logoutButtonPanel.setRoundTopRight(25);
        logoutButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButtonLabel.setBackground(new java.awt.Color(3, 0, 39));
        logoutButtonLabel.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        logoutButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButtonLabel.setText("Import File");
        logoutButtonPanel.add(logoutButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 50));

        menu.add(logoutButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 50));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 700));

        menuButton.setBackground(new java.awt.Color(21, 30, 63));
        menuButton.setRoundBottomLeft(25);
        menuButton.setRoundBottomRight(25);
        menuButton.setRoundTopLeft(25);
        menuButton.setRoundTopRight(25);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuButtonMouseReleased(evt);
            }
        });
        menuButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/menuIcon.png"))); // NOI18N
        menuLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        background.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        superiorBar.setBackground(new java.awt.Color(51, 51, 51));
        superiorBar.setRoundTopLeft(25);
        superiorBar.setRoundTopRight(25);
        superiorBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorBarMouseDragged(evt);
            }
        });
        superiorBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorBarMousePressed(evt);
            }
        });
        superiorBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(253, 253, 255));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setRoundTopRight(25);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        exitButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButtonLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        exitButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        exitButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonLabel.setText("X");
        exitButton.add(exitButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        superiorBar.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 30));

        minimizeButton.setBackground(new java.awt.Color(253, 253, 255));
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setRoundBottomLeft(25);
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseReleased(evt);
            }
        });
        minimizeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButtonLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        minimizeButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        minimizeButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButtonLabel.setText("-");
        minimizeButton.add(minimizeButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        superiorBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 60, 30));

        background.add(superiorBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Exit button events
    boolean exitButtonFocused = false;

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButtonFocused = true;
        exitButton.setBackground(new Color(255, 0, 0));
        exitButtonLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButtonFocused = false;
        exitButton.setBackground(new Color(253, 253, 255));
        exitButtonLabel.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMousePressed
        if (exitButtonFocused) {
            exitButton.setBackground(new Color(180, 0, 0, 255));
            exitButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_exitButtonMousePressed

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
        if (exitButtonFocused) {
            exitButton.setBackground(new Color(255, 0, 0));
            exitButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_exitButtonMouseReleased

    // Minimize Button Events
    boolean minimizeButtonFocused = false;

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButtonFocused = true;
        minimizeButton.setBackground(new Color(161, 161, 161));
        minimizeButtonLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_minimizeButtonMouseEntered

    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButtonFocused = false;
        minimizeButton.setBackground(new Color(253, 253, 255));
        minimizeButtonLabel.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_minimizeButtonMouseExited

    private void minimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMousePressed
        if (minimizeButtonFocused) {
            minimizeButton.setBackground(new Color(87, 87, 87));
            minimizeButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_minimizeButtonMousePressed

    private void minimizeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseReleased
        if (minimizeButtonFocused) {
            minimizeButton.setBackground(new Color(161, 161, 161));
            minimizeButtonLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_minimizeButtonMouseReleased

    // Superior Bar Events
    int mouseX, mouseY;

    private void superiorBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_superiorBarMouseDragged

    private void superiorBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_superiorBarMousePressed

    // Menu Button Event
    boolean menuButtonFocused = false;

    private void menuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseEntered
        menuButtonFocused = true;
        menuButton.setBackground(new Color(30, 43, 89));
    }//GEN-LAST:event_menuButtonMouseEntered

    private void menuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseExited
        menuButtonFocused = false;
        menuButton.setBackground(new Color(21, 30, 63));
    }//GEN-LAST:event_menuButtonMouseExited

    private void menuButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMousePressed
        if (menuButtonFocused) {
            menuButton.setBackground(new Color(40, 57, 117));
            Animations menuAnimation = new Animations();
            menuAnimation.jPanelXRight(10, 330, 1, 5, menuButton);
            menuAnimation.jPanelXRight(-310, 10, 1, 5, menu);

            menuAnimation.jPanelXLeft(330, 10, 1, 5, menuButton);
            menuAnimation.jPanelXLeft(10, -310, 1, 5, menu);
        }
    }//GEN-LAST:event_menuButtonMousePressed

    private void menuButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseReleased
        if (menuButtonFocused) {
            menuButton.setBackground(new Color(30, 43, 89));
        }
    }//GEN-LAST:event_menuButtonMouseReleased

    /*
    Normal color = 3, 0, 39
    Entered color = 13, 11, 72
    Pressed color = 29, 28, 87
     */
    // Logout Button Event
    boolean logoutButtonFocused = false;

    private void logoutButtonHitboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonHitboxMouseClicked
        
    }//GEN-LAST:event_logoutButtonHitboxMouseClicked

    private void logoutButtonHitboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonHitboxMouseEntered
        logoutButtonFocused = true;
        logoutButtonPanel.setBackground(new Color(16, 8, 51));
        new AnimationsUnique().animButtonUp(logoutButtonPanel, 150);
    }//GEN-LAST:event_logoutButtonHitboxMouseEntered

    private void logoutButtonHitboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonHitboxMouseExited
        logoutButtonFocused = false;
        logoutButtonPanel.setBackground(new Color(3, 0, 39));
        new AnimationsUnique().animButtonDown(logoutButtonPanel, 150);
    }//GEN-LAST:event_logoutButtonHitboxMouseExited

    private void logoutButtonHitboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonHitboxMousePressed
        if (logoutButtonFocused) {
            logoutButtonPanel.setBackground(new Color(29, 28, 87));
            new AnimationsUnique().quickAnimButtonDown(logoutButtonPanel, 150);
        }
    }//GEN-LAST:event_logoutButtonHitboxMousePressed

    private void logoutButtonHitboxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonHitboxMouseReleased
        if (logoutButtonFocused) {
            logoutButtonPanel.setBackground(new Color(13, 11, 72));
            new AnimationsUnique().quickAnimButtonUp(logoutButtonPanel, 150);
        }
    }//GEN-LAST:event_logoutButtonHitboxMouseReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.PanelRound background;
    private CustomSwing.PanelRound exitButton;
    private javax.swing.JLabel exitButtonLabel;
    private javax.swing.JLabel logoutButtonHitbox;
    private javax.swing.JLabel logoutButtonLabel;
    private CustomSwing.PanelRound logoutButtonPanel;
    private CustomSwing.PanelRound menu;
    private CustomSwing.PanelRound menuButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel menuTitle1;
    private CustomSwing.PanelRound minimizeButton;
    private javax.swing.JLabel minimizeButtonLabel;
    private CustomSwing.PanelRound superiorBar;
    // End of variables declaration//GEN-END:variables

}
