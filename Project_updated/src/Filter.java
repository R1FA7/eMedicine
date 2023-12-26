
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author RIFAT
 */
public class Filter extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public static int tk=0,tot=0;
    int itk,tkk;
    
    public Filter() {
        initComponents();
        conn=DBC.ConnecrDb();
        ShowProducts();
        //FilterProducts();
    }
    
    private void FilterProducts(){
        try{
            String sql=null;
        if(fil_com.getSelectedItem().equals("Incepta")){
            sql="select * from Medicine_List where Company='"+fil_com.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        if(fil_com.getSelectedItem().equals("Square")){
            sql="select * from Medicine_List where Company='"+fil_com.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        if(fil_com.getSelectedItem().equals("Parma")){
            sql="select * from Medicine_List where Company='"+fil_com.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close(); rs.close();
        }catch(Exception e){
        }
//        try{
//            rs.close(); pst.close();
//        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 //e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                //e.printStackTrace();
//            }
//        }
//    }
//        }finally{
//            try{
//                rs.close();
//                pst.close();
//            }catch(Exception e){}
//        }

        
    }
    public void FilterProducts2(){
        try{
            String sql=null;
            if(MedTypo.getSelectedItem().equals("Capsule")){
            sql="select * from Medicine_List where Med_Type='"+MedTypo.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        if(MedTypo.getSelectedItem().equals("Tablet")){
            sql="select * from Medicine_List where Med_Type='"+MedTypo.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        if(MedTypo.getSelectedItem().equals("Injection")){
            sql="select * from Medicine_List where Med_Type='"+MedTypo.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        if(MedTypo.getSelectedItem().equals("Syrup")){
            sql="select * from Medicine_List where Med_Type='"+MedTypo.getSelectedItem().toString()+"'";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close(); rs.close();
        }catch(Exception e){
        }
        try{
            rs.close(); pst.close();
        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
        
    }
    
    public void ShowProducts(){
        String sql="select * from Medicine_List";
        try{
            pst=conn.prepareStatement(sql);
            //pst.setString(1,jTextField1.getText());
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close(); rs.close();
            
        } catch(Exception e){
        } 
//        try{
//            rs.close(); pst.close();
//        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MedTypo = new javax.swing.JComboBox<>();
        fil_com = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(498, 180, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,50));

        jLabel6.setFont(new java.awt.Font("Vivaldi", 1, 14)); // NOI18N
        jLabel6.setText("Back");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 40, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Med_ID", "Med_Name", "Expired_Date", "Med_Price", "Med_Type", "Company"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 510, 270));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 50));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Medicine Type");

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Company");

        MedTypo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Capsule", "Injection", "Syrup" }));
        MedTypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedTypoActionPerformed(evt);
            }
        });

        fil_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incepta", "Square", "Beximco", "Parma" }));
        fil_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fil_comActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Search");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("New Search");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(MedTypo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fil_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fil_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(MedTypo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 390, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIFAT\\Documents\\NetBeansProjects\\Project_updated\\src\\filter_720x550.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fil_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fil_comActionPerformed
        // TODO add your handling code here:
        FilterProducts();
    }//GEN-LAST:event_fil_comActionPerformed

    private void MedTypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedTypoActionPerformed
        // TODO add your handling code here:
        FilterProducts2();
    }//GEN-LAST:event_MedTypoActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String sql="SELECT * from Medicine_List WHERE Med_Type LIKE ? AND Company LIKE ?";
        try{
            //JOptionPane.showMessageDialog(null,"Error");
//            String s2=fil_com.getSelectedItem().toString();
//            String s1=MedTypo.getSelectedItem().toString();
   
        //String sql="Select * from Medicine_List where Med_Type=? and Company=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1,MedTypo.getSelectedItem().toString());
        pst.setString(2,fil_com.getSelectedItem().toString());
        rs=pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close(); rs.close();
        }catch(Exception e){
        }
//        try{
//            rs.close(); pst.close();
//        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        ShowProducts();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row=jTable2.getSelectedRow();
        String choose=jTable2.getModel().getValueAt(row,0).toString();
        String sql="select * from Medicine_List where Med_ID="+choose;
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                tot++;
                Customer cast=new Customer(); cast.jLabel19.setText(Integer.toString(tot));
                String s=(rs.getString("Med_Price"));
                tk+=Integer.parseInt(s);
                int im=1,pc=0;
                pc=Integer.parseInt(s);
//                System.out.println(tot);
//                System.out.println(tk);
                calc(im,pc);
            }
           pst.close(); rs.close();
            
        }catch(Exception e){
        }
//        try{
//            rs.close(); pst.close();
//        }catch(Exception e){}
//        finally{
//            try{
//                rs.close();
//                pst.close();
//            }catch(Exception e){}
//        }
    }//GEN-LAST:event_jTable2MouseClicked
    private void calc(int i,int j){
        PathToLogReg ptlg=new PathToLogReg();
        String k=ptlg.st;
        Registration_form rf=new Registration_form();
        String l=rf.u;
        try{
            String sql="select * from User where user_name=? ";
            pst=conn.prepareStatement(sql);
            
            if(l==null) pst.setString(1,k);
            else pst.setString(1,l);
            rs = pst.executeQuery();
            
             itk=rs.getInt("Items");
             tkk=rs.getInt("Expenditure");
             pst.close(); rs.close();
        }catch(Exception e){ 
        }
//        try{
//            pst.close(); rs.close();
//        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
          String sql = "UPDATE User SET Items = ? , "
                + "Expenditure = ? "
                + "WHERE user_name = ?";
          int kk=i+itk; 
          int ww=j+tkk;
         //String sql="UPDATE  User WHERE user_name=k(Items,Expenditure) VALUES(?,?)";
        try{
            pst=conn.prepareStatement(sql);
            
            pst.setInt(1,kk);
            pst.setInt(2,ww); 
            if(l==null) pst.setString(3,k);
            else pst.setString(3,l);
            pst.execute();
            pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
//        try{
//            pst.close(); //rs.close();
//        }catch(Exception e){}
//        finally {
//        if(rs != null){
//             try{
//                  rs.close();
//             } catch(Exception e){
//                 e.printStackTrace();
//             }
//        }
//        if(pst != null){
//            try{
//                pst.close();
//            } catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               // new Filter().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MedTypo;
    private javax.swing.JComboBox<String> fil_com;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
