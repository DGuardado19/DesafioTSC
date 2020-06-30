/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pasos;

import desafio.Mef;
import desafio.Mef2;
import desafio.NewJFrame;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class M3 extends javax.swing.JFrame {

    /**
     * Creates new form Paso1
     */
    public M3() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L1.setIcon(imgb);
        ImageIcon imagenn = new ImageIcon(getClass().getResource("/resources/iconos/Next.png"));
        Icon imgn = new ImageIcon(imagenn.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgn);
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/resources/fondos/FondoPasos.png"));
        Icon img1 = new ImageIcon(imagen1.getImage().getScaledInstance(L3.getWidth(), L3.getHeight(), Image.SCALE_SMOOTH));
        L3.setIcon(img1);
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/resources/imagenes/3.png"));
        Icon img2 = new ImageIcon(imagen2.getImage().getScaledInstance(L4.getWidth(), L4.getHeight(), Image.SCALE_SMOOTH));
        L4.setIcon(img2);
        ImageIcon imagens = new ImageIcon(getClass().getResource("/resources/imagenes/Smef1.png"));
        Icon imgs = new ImageIcon(imagens.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L5.setIcon(imgs);
        ImageIcon im1 = new ImageIcon(getClass().getResource("/desafio/proceso/Paso3.png"));
        Icon imgi = new ImageIcon(im1.getImage().getScaledInstance(i1.getWidth(), i1.getHeight(), Image.SCALE_SMOOTH));
        i1.setIcon(imgi);
     

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
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setText("jLabel1");
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L1MousePressed(evt);
            }
        });
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 100, 100));

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
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 100, 100));

        L4.setText("jLabel1");
        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, 200, 200));

        L5.setText("jLabel1");
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L5MousePressed(evt);
            }
        });
        getContentPane().add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 100, 100));

        i1.setText("jLabel1");
        getContentPane().add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 500, 400));

        L3.setText("jLabel1");
        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1000, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseEntered
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b2.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L1.setIcon(imgb);
    }//GEN-LAST:event_L1MouseEntered

    private void L1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseExited
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L1.setIcon(imgb);
    }//GEN-LAST:event_L1MouseExited

    private void L1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MousePressed
        // TODO add your handling code here:
        new M2().show();
        dispose();
    }//GEN-LAST:event_L1MousePressed

    private void L2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseEntered
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/Next2.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgb);
    }//GEN-LAST:event_L2MouseEntered

    private void L2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseExited
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/Next.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L2.setIcon(imgb);
    }//GEN-LAST:event_L2MouseExited

    private void L2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MousePressed
        // TODO add your handling code here:
        new M4().show();
        dispose();
    }//GEN-LAST:event_L2MousePressed

    private void L5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MousePressed
        // TODO add your handling code here:
        new Mef().show();
       dispose();
    }//GEN-LAST:event_L5MousePressed

    private void L5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseEntered
        // TODO add your handling code here:
         ImageIcon imagens = new ImageIcon(getClass().getResource("/resources/imagenes/Smef2.png"));
        Icon imgs = new ImageIcon(imagens.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L5.setIcon(imgs);
    }//GEN-LAST:event_L5MouseEntered

    private void L5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseExited
        // TODO add your handling code here:
        ImageIcon imagens = new ImageIcon(getClass().getResource("/resources/imagenes/Smef1.png"));
        Icon imgs = new ImageIcon(imagens.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L5.setIcon(imgs);
        
    }//GEN-LAST:event_L5MouseExited

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
            java.util.logging.Logger.getLogger(M3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel i1;
    // End of variables declaration//GEN-END:variables
}
