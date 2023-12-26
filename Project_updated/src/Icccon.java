import java.awt.Font;
import java.awt.Image;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author RIFAT
 */
public class Icccon extends javax.swing.JFrame {

    /**
     * Creates new form Icccon
     */
//    public Icccon() {
//        initComponents();
//       ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\RIFAT\\Pictures\\1.jpg").getImage().getScaledInstance(220, 390, Image.SCALE_DEFAULT));
//       jLabel1.setIcon(imageIcon);
//       jLabel1.setVisible(true);
//    }
//    Font font = new Font("helvetica", Font.PLAIN, 12);
//    Map  attributes = font.getAttributes();
//    //attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
//    Font newFont = new Font(attributes); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("JAVA PROJECT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(92, 113, 144, 54);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3-4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 320, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Icccon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Icccon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Icccon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Icccon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Icccon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
