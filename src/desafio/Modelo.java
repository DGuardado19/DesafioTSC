/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author David
 */
public class Modelo extends javax.swing.JFrame {

    /**
     * Creates new form Dominio
     */
    JFrame frame;
    ImageIcon icon;
    int x1, y1;

    public Modelo() {
        initComponents();
        icon = new ImageIcon(getClass().getResource("/resources/imagenes/icono.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
       // ImageIcon imagen = new ImageIcon(getClass().getResource("/resources/gif/kakashi.gif"));
        //Icon img = new ImageIcon(imagen.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_DEFAULT));
        //L1.setIcon(img);
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L2.getWidth(), L2.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgb);
        ImageIcon imagenb1 = new ImageIcon(getClass().getResource("/resources/fondos/FondoMod.png"));
        Icon imgb1 = new ImageIcon(imagenb1.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH));
        b1.setIcon(imgb1);
// rsscalelabel.RSScaleLabel.setScaleLabel(L1, "/resources/gif/kakashi.gif");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L1MouseDragged(evt);
            }
        });
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L1MousePressed(evt);
            }
        });
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 80, 80));

        L2.setText("jLabel1");
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L2MousePressed(evt);
            }
        });
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 100));

        b1.setText("jLabel2");
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseEntered
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b2.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L2.getWidth(), L2.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgb);
    }//GEN-LAST:event_L2MouseEntered

    private void L2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseExited
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L2.getWidth(), L2.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgb);
    }//GEN-LAST:event_L2MouseExited

    private void L2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MousePressed
        // TODO add your handling code here:
        new NewJFrame().show();
        dispose();
    }//GEN-LAST:event_L2MousePressed

    private void L1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen() - this.getX();
        int y = evt.getYOnScreen() - this.getY();
        L1.setLocation(x - x1, y - y1);
        System.out.println(L1);
        System.out.println(y1);
    }//GEN-LAST:event_L1MouseDragged

    private void L1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MousePressed
        // TODO add your handling code here:
        x1 = evt.getX();
        y1 = evt.getY();

    }//GEN-LAST:event_L1MousePressed

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
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel b1;
    // End of variables declaration//GEN-END:variables
}
