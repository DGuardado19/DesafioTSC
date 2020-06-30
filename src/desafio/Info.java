/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Info
     */
    JFrame frame;
    ImageIcon icon;

    public Info() {
        initComponents();
        icon = new ImageIcon(getClass().getResource("/resources/imagenes/icono.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/resources/fondos/FondoIn.png"));
        Icon img = new ImageIcon(imagen.getImage().getScaledInstance(L1.getWidth(), L1.getHeight(), Image.SCALE_SMOOTH));
        L1.setIcon(img);
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L3.getWidth(), L3.getHeight(), Image.SCALE_SMOOTH));
        L3.setIcon(imgb);
         ImageIcon imagenp = new ImageIcon(getClass().getResource("/resources/imagenes/Inf.png"));
        Icon imgp = new ImageIcon(imagenp.getImage().getScaledInstance(P.getWidth(), P.getHeight(), Image.SCALE_SMOOTH));
        P.setIcon(imgp);
//         ImageIcon imagenc = new ImageIcon(getClass().getResource("/resources/imagenes/Creditos.png"));
//        Icon imgc = new ImageIcon(imagenc.getImage().getScaledInstance(C.getWidth(), C.getHeight(), Image.SCALE_SMOOTH));
//        C.setIcon(imgc);
         ImageIcon imagene = new ImageIcon(getClass().getResource("/resources/imagenes/Excel.png"));
        Icon imge = new ImageIcon(imagene.getImage().getScaledInstance(C1.getWidth(), C1.getHeight(), Image.SCALE_SMOOTH));
        C1.setIcon(imge);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L3 = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L3.setText("jLabel1");
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L3MousePressed(evt);
            }
        });
        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 100));

        P.setText("jLabel1");
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 240));

        C1.setText("jLabel1");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                C1MousePressed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 250, 250));

        L1.setText("jLabel1");
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MousePressed
        // TODO add your handling code here:
        new NewJFrame().show();
        dispose();
    }//GEN-LAST:event_L3MousePressed

    private void L3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseEntered
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b2.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L3.getWidth(), L3.getHeight(), Image.SCALE_SMOOTH));
        L3.setIcon(imgb);
    }//GEN-LAST:event_L3MouseEntered

    private void L3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseExited
        // TODO add your handling code here:
        ImageIcon imagenb = new ImageIcon(getClass().getResource("/resources/iconos/b1.png"));
        Icon imgb = new ImageIcon(imagenb.getImage().getScaledInstance(L3.getWidth(), L3.getHeight(), Image.SCALE_SMOOTH));
        L3.setIcon(imgb);
    }//GEN-LAST:event_L3MouseExited

    private void C1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Necesitas internet");

        try{
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1-mehLqTVtrKYPQyxmLotgFkun37ZCrd9/view?usp=sharing"));
        }catch(IOException | URISyntaxException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_C1MousePressed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel P;
    // End of variables declaration//GEN-END:variables
}
