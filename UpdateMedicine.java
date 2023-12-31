
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class UpdateMedicine extends javax.swing.JFrame {
public String numberPattern="^[0-9]*$";
    /**
     * Creates new form UpdateMedicine
     */
    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textMedicineId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textCompanyname = new javax.swing.JTextField();
        textQuantity = new javax.swing.JTextField();
        textAddQuantity = new javax.swing.JTextField();
        textPriceperunit = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("Update Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 850, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 6, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 231, -1, -1));
        getContentPane().add(textMedicineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 237, 27));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 100, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 187, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 255, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 351, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Add Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 165, -1, -1));
        getContentPane().add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 250, 32));
        getContentPane().add(textCompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 250, 33));
        getContentPane().add(textQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 250, 34));
        getContentPane().add(textAddQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 408, 110, -1));
        getContentPane().add(textPriceperunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 250, 32));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Medicine Id");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 105, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Company Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("Quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Price per unit");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int checkMedicineExist=0;
        String uniqueId=textMedicineId.getText();
        if(uniqueId.equals("")){
            JOptionPane.showMessageDialog(null,"Medicine ID field is required");
        }else{
            try{
                Connection con=Myconnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select *from medicine where uniqueId="+uniqueId+"");
                while(rs.next()){
                    textMedicineId.setEditable(false);
                    textName.setText(rs.getString("Name"));
                    textCompanyname.setText(rs.getString("CompanyName"));
                    textQuantity.setText(rs.getString("Quantity"));
                    textPriceperunit.setText(rs.getString("Priceperunit"));
                    textQuantity.setEditable(false );
                    checkMedicineExist=1;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            if (checkMedicineExist==0){
                JOptionPane.showMessageDialog(null,"Medicine ID does not exist");
            }
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String uniqueId=textMedicineId.getText();
        String Name=textName.getText();
        String CompanyName=textCompanyname.getText();
        String Quantity=textQuantity.getText();
        String Priceperunit=textPriceperunit.getText();
        String AddQuantity=textAddQuantity.getText();
        
        int totalQuantity = 0;
        if(AddQuantity.equals("")){
            totalQuantity=Integer.parseInt(Quantity);
        }else{
            totalQuantity=Integer.parseInt(Quantity) + Integer.parseInt(AddQuantity);
        }
        
        if(uniqueId.equals("")){
           JOptionPane.showMessageDialog(null,"Medicine ID field is required");
        }else if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"Name field is required");
        }else if(CompanyName.equals("")){
            JOptionPane.showMessageDialog(null,"Company Name field is required");
        }else if(!AddQuantity.matches(numberPattern)){
            JOptionPane.showMessageDialog(null,"Add Quantity field is invalid");
        }else if(Priceperunit.equals("")){
            JOptionPane.showMessageDialog(null,"Price per unit field is required");
        }else if(!Priceperunit.matches(numberPattern)){
            JOptionPane.showMessageDialog(null,"Price per unit field is invalid");
        }else{
            try{
            Connection con=Myconnection.getConnection();
            PreparedStatement ps=con.prepareStatement("update medicine set Name=?,CompanyName=?,Quantity=?,Priceperunit=? where uniqueId=?");
           ps.setString(1,Name);
           ps.setString(2,CompanyName);
           ps.setInt(3,totalQuantity);
           ps.setString(4,Priceperunit);
           ps.setInt(5,Integer.parseInt(uniqueId));
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Medicine Updated Successfully");
           setVisible(false);
           new UpdateMedicine().setVisible(true);
            
         }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textAddQuantity;
    private javax.swing.JTextField textCompanyname;
    private javax.swing.JTextField textMedicineId;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPriceperunit;
    private javax.swing.JTextField textQuantity;
    // End of variables declaration//GEN-END:variables
}
