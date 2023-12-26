import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author RIFAT
 */
public class srch_med extends javax.swing.JInternalFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public static int cnt=0,item=0;
    String text,items;
    public static String s1,s2;
    int itk,tkk;
    public srch_med() {
        try{
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
        initComponents();
        conn=DBC.ConnecrDb();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MedTypo = new javax.swing.JComboBox<>();
        fil_com = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Medicine"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 150, 210));

        jPanel4.setBackground(new java.awt.Color(217, 232, 251));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Med Name\n");

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Med Price");

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Med Type");

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setText("Company");

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel14.setText("Expired Date");

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 121, 153));
        jLabel16.setText("Here is your searched medicine details:");

        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 420, 380));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 20));

        jTextField1.setText("Search Meds");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_search_32px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 220, 50));

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
        jLabel4.setText("Filter");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
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
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fil_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fil_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedTypo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home3_4_720x550.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 552));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
//        Mname.setText("");
//        Mname1.setText("");
//        Price.setText("");
//        Ex_date.setText("");
//        Company.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        try{
            String sql="select * from Medicine_List where Med_Name=? ";
            pst=conn.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String value1=rs.getString("Med_Name");
                jLabel10.setText(value1);

                String value2=rs.getString("Med_Type");
                jLabel12.setText(value2);
                String value3=rs.getString("Med_Price");
                jLabel11.setText(value3);
                String value4=rs.getString("Expired_Date");
                jLabel14.setText(value4);
                String value5=rs.getString("Company");
                jLabel13.setText(value5);
                byte[] imagedata=rs.getBytes("iimage");
                format=new ImageIcon(imagedata);
                jLabel15.setIcon(format);
            }else{
                ImageIcon icon=new ImageIcon("C:\\Users\\RIFAT\\Documents\\NetBeansProjects\\Project_updated\\src\\not_found.png");//have to give full directory
                JOptionPane.showMessageDialog(null,"Retry","Not Found",JOptionPane.INFORMATION_MESSAGE,icon);
                //JOptionPane.showMessageDialog(this,"Item not found.","Oooops",JOptionPane.ERROR_MESSAGE);
            }
            rs.close(); pst.close();
        } catch(Exception e){
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
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        // TODO add your handling code here:
        //        String w=Mname.getText();
        //        if(w=="")  JOptionPane.showMessageDialog(null,"Sorry!The Med isn't available now.");
    }//GEN-LAST:event_jLabel8KeyPressed

    private void jLabel8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8KeyReleased

    private void MedTypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedTypoActionPerformed
        // TODO add your handling code here:
        //FilterProducts2();
    }//GEN-LAST:event_MedTypoActionPerformed

    private void fil_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fil_comActionPerformed
        // TODO add your handling code here:
        // FilterProducts();
    }//GEN-LAST:event_fil_comActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //this.dispose(); 
        //Filtr fwk=new Filtr();
       // fwk.setVisible(true);
        s1=MedTypo.getSelectedItem().toString();
        s2=fil_com.getSelectedItem().toString();
        Customer c=new Customer();
        //c.jDesktopPane1.add(fwk).setVisible(true);
        //new Customer((Filtr)this).setVisible(true);
        //c.op();
        String sql="SELECT Med_Name as Medicine from Medicine_List WHERE Med_Type LIKE ? AND Company LIKE ?";
        try{
            //JOptionPane.showMessageDialog(null,"Error");
            //            String s2=fil_com.getSelectedItem().toString();
            //            String s1=MedTypo.getSelectedItem().toString();

            //String sql="Select * from Medicine_List where Med_Type=? and Company=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,MedTypo.getSelectedItem().toString());
            pst.setString(2,fil_com.getSelectedItem().toString());
            //pst.setString(1,jTable1.getSelectedItem().toString());
            rs=pst.executeQuery();
            jTable1.setShowGrid(false);
            jTable1.setIntercellSpacing(new Dimension(0, 0));
            jTable1.setShowHorizontalLines(false);
            jTable1.setShowVerticalLines(false);
            //Color ivory = new Color(190,227,246);
            Color ivory = new Color(19,7,30);
            jTable1.setOpaque(true);
            jTable1.setFillsViewportHeight(true);
            jTable1.setBackground(ivory);
            JScrollPane jsp = new JScrollPane();
            jsp.setViewportBorder(null);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close(); rs.close();
        }catch(Exception e){
        }
         
    }//GEN-LAST:event_jLabel4MouseClicked
    private List<DataSearch> search(String search){
        List<DataSearch> list=new ArrayList<>();
        try{
            String sql="select Med_Name from Medicine_List where Med_Id like '%%' limit 7";
            pst.setString(1, "%" +search+"%");
            rs=pst.executeQuery();
            while(rs.next()){
                String text=rs.getString(1);
                boolean story=!rs.getString(2).equals("");
                list.add(new DataSearch(text,story));
            }
            pst.close(); rs.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
//        String str1=jLabel10.getText(); String str2=jLabel11.getText(); String str3=jLabel13.getText();
//        cartnew c=new cartnew();
//        c.AddData(str1,str2,str3);
//       DefaultTableModel model = (DefaultTableModel) cartnew.jTable1.getModel();
//        model.addRow(new Object[]{str1,str2,str3});
       // cartnew.AddData(new Object[]{str1,str2,str3});
        //cartnew.jTable1 = new JTable();
//        DefaultTableModel model = (DefaultTableModel) cartnew.jTable1.getModel();
//        model.addRow(new Object[]{str1,str2,str3});
        //cartnew.jTable1.setModel(new DefaultTableModel(data, columns));

// You can now safely call the getModel() method
        
        //Object[] rowData = {str1, str2, str3};
        //Object[] rowData={"d","dee","dddd"};
                
        //model.addRow(rowData);
        int sum=0;
          if(jLabel11.getText()=="Med Price") JOptionPane.showMessageDialog(null,"NO Med is Searched");
          else{
              //get selected image
              byte[] imagedata=null;
              try{
                  String sql="Select * from Medicine_List where Med_Name=?";
                   pst=conn.prepareStatement(sql);
                   pst.setString(1, jLabel10.getText());
                   rs=pst.executeQuery();
                   imagedata=rs.getBytes("iimage");
                   //format=new ImageIcon(imagedata);
                   //jLabel15.setIcon(format);
                   pst.close(); rs.close();
              }catch(Exception e){}
              //sum=Integer.parseInt(jLabel11.getText()); 
              String str1=jLabel10.getText(); String str2=jLabel11.getText();
              sum=Integer.valueOf(str2);
              //cartnew c=new cartnew();
              //c.AddData(str1,str2,str3);
              try{
                  String sql="INSERT INTO Profile_Info(Icon,Items,price) VALUES(?,?,?)";
                  pst=conn.prepareStatement(sql);
                  pst.setBytes(1,imagedata);
                  pst.setString(2, str1);
                  pst.setString(3, str2);
                  pst.execute();
                  pst.close(); //rs.close();
              }catch(Exception e){}
          }
         //String w = Price.getText();
         PathToLogReg ptlg=new PathToLogReg();
         String k=ptlg.st;
         Registration_form rf=new Registration_form();
         String l=rf.u;
         //int sum = Integer.parseInt(w);
         cnt+=sum;
         if(sum!=0) item++;
         int i=1; 
         int j=sum;
         items=Integer.toString(item);
         text=Integer. toString(cnt);
        try{
            String sql="select * from User where user_name=? ";
            pst=conn.prepareStatement(sql);
            if(l==null)pst.setString(1,k);
            else pst.setString(1,l);
            rs = pst.executeQuery();
            
             itk=rs.getInt("Items");
             tkk=rs.getInt("Expenditure");
             //System.out.println(itk);
             //System.out.println(tkk);
             rs.close(); pst.close();
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
        String tblName=tblmodel.getValueAt(jTable1.getSelectedRow(),0).toString();
        //int row=jTable1.getSelectedRow();
        //String choose=jTable1.getModel().getValueAt(row,0).toString();
        //String sql="select * from Medicine_List where Med_Name="+tblName;
        try{
            String sql="select * from Medicine_List where Med_Name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,tblName);
            rs=pst.executeQuery();
            jTable1.setShowGrid(false);
            jTable1.setIntercellSpacing(new Dimension(0, 0));
            jTable1.setShowHorizontalLines(false);
            jTable1.setShowVerticalLines(false);
            Color ivory = new Color(210,226,249);//background	[]
            jTable1.setOpaque(true);
            jTable1.setFillsViewportHeight(true);
            jTable1.setBackground(ivory);
//            JScrollPane sp = new JScrollPane(jTable2);
//            sp.setBorder(BorderFactory.createEmptyBorder());
            JScrollPane jsp = new JScrollPane();
            jsp.setViewportBorder(null);
            if(rs.next()){
                String value1=rs.getString("Med_Name");
                jLabel10.setText(value1);
                String value2=rs.getString("Med_Type");
                jLabel12.setText(value2);
                String value3=rs.getString("Med_Price");
                jLabel11.setText(value3);
                String value4=rs.getString("Expired_Date");
                jLabel14.setText(value4);
                String value5=rs.getString("Company");
                jLabel13.setText(value5);
                byte[] imagedata=rs.getBytes("iimage");
                format=new ImageIcon(imagedata);
                jLabel15.setIcon(format);
            }
            pst.close(); rs.close();
        }catch(Exception e){
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MedTypo;
    private javax.swing.JComboBox<String> fil_com;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;
String filename;
int s=0;
byte[] med_img=null;
}
