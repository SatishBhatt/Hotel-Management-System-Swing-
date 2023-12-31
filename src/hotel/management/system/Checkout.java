/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Checkout extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    Statement st;
    
    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
          //______________this will show the current date in check out text field______________ 
        SimpleDateFormat obj =new SimpleDateFormat ("dd-MM-YYYY");
        Date date = new Date();
        txtOutDate.setText(obj.format(date));
       //__________________________________________________________________________________
        
        
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
             con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/desktophotel" , "root" , "");
        } catch (SQLException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtIdNumber = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        txtCheckInDate = new javax.swing.JTextField();
        txtOutDate = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtRemainingPayment = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(80, 80, 1100, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout.jpg"))); // NOI18N
        jButton4.setText("Customer Checkout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 272, 79));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 31, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 159, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 211, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 324, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price per Day");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 375, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of days");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 437, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check in date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 159, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Check out Date ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 211, -1, -1));

        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 156, 71, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 208, 149, -1));
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 267, 149, -1));
        getContentPane().add(txtIdNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 321, 149, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 372, 149, -1));
        getContentPane().add(txtDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 434, 149, -1));
        getContentPane().add(txtCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 156, 122, -1));
        getContentPane().add(txtOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 208, 122, -1));
        getContentPane().add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 122, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 156, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Check out Now");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setText("Discount");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        txtDiscount.setText("0");
        getContentPane().add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 120, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton6.setText("Apply");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 70, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setText("Remaining Payment");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));
        getContentPane().add(txtRemainingPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 320, 100, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CheckoutBackground (1).jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
            
            ps = con.prepareStatement("Select status from room where roomNumber = ?");
            ps.setString(1,txtRoomNumber.getText());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String status = rs.getString("status");
                if(status.equals("Available"))
                JOptionPane.showMessageDialog(this, "Room Status is Available");
                
                else{
                ps = con.prepareStatement("Select * from customer where roomNumber = ?");
            ps.setString(1,txtRoomNumber.getText());
             rs = ps.executeQuery();
            
            if(rs.next()){
                    txtName.setText(rs.getString("name"));
                    txtMobile.setText(rs.getString("mobile"));
                    txtIdNumber.setText(rs.getString("idNumber"));
                    txtPrice.setText(rs.getString("price"));
                    txtCheckInDate.setText(rs.getString("joinDate"));
                    
                    double a = Double.parseDouble(rs.getString("advancePayment"));
                    double b = Double.parseDouble(rs.getString("price"));
                    String remainingPayment = String.valueOf(b-a);
                    txtRemainingPayment.setText(remainingPayment);

            }
//             double discount= Double.parseDouble(txtDiscount.getText());
                        
            
                    String a = txtOutDate.getText();
                    String b = txtCheckInDate.getText();
                    
                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
                    
                    try {
                        Date d1=format.parse(a);
                        Date d2=format.parse(b);
                        
                        long diff = d1.getTime() - d2.getTime();
                        int days = (int)diff/(24*60*60*1000);
                       
                        
                        
                        if(days==0){
                            days=1;
                        
                            txtDays.setText(String.valueOf(days));
                            double price = Double.parseDouble(rs.getString("price"))*days ;
                            txtAmount.setText(String.valueOf(price));
                        }
                        
                        else{
                            txtDays.setText(String.valueOf(days));
                            double price = Double.parseDouble(rs.getString("price"))*days ;
                            txtAmount.setText(String.valueOf(price));
                        }
                          
                    } catch (ParseException ex) {
                        Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
                    }

            }
            }
            
            
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
          
            ps = con.prepareStatement("update  customer set  totalAmount=? , checkOutDate= ? , numberOfDays = ? ,status= ? where roomNumber = ?" );
            ps.setString(1,txtAmount.getText());
            ps.setString(2,txtOutDate.getText());
            ps.setString(3,txtDays.getText());
            ps.setString(4,"Checkedout");
            
            ps.setString(5,txtRoomNumber.getText());
            ps.executeUpdate();
            
           
            JOptionPane.showMessageDialog(this, "Check out Successfull");
            ps = con.prepareStatement("Update room set status='Available' where roomNumber = ?" );    
            ps.setString(1,txtRoomNumber.getText());
            ps.executeUpdate();
            
            
                    txtRoomNumber.setText("");
                    txtName.setText("");
                    txtMobile.setText("");
                    txtIdNumber.setText("");
                    txtPrice.setText("");
                    txtCheckInDate.setText("");
                    txtDays.setText("");
                    txtAmount.setText("");
                    txtRemainingPayment.setText("");
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                    txtRoomNumber.setText("");
                    txtName.setText("");
                    txtMobile.setText("");
                    txtIdNumber.setText("");
                    txtPrice.setText("");
                    txtCheckInDate.setText("");
                    txtDays.setText("");
                    txtAmount.setText("");  
                    txtRemainingPayment.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            ps = con.prepareStatement("update  customer set  discount=?,totalAmount=?  where roomNumber = ?" );
            
            ps.setString(1,txtDiscount.getText());
            ps.setString(3,txtRoomNumber.getText());
            
            ps.setString(2,txtAmount.getText());
            double discount= Double.parseDouble(txtDiscount.getText());
            double price= Double.parseDouble(txtAmount.getText());
            double newprice = price-discount ;
            txtAmount.setText(String.valueOf(newprice));
            JOptionPane.showMessageDialog(this, "Discount Applied");
            
            txtDiscount.setText(" ");
            ps.executeUpdate();
            
            
            
            ps = con.prepareStatement("Select * from customer where roomNumber = ?" );
            ps.setString(1,txtRoomNumber.getText());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                    double a = Double.parseDouble(rs.getString("advancePayment"));
                    double b = Double.parseDouble(rs.getString("price"));
                    String remainingPayment = String.valueOf((b-a)-discount);
                    txtRemainingPayment.setText(remainingPayment);
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCheckInDate;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOutDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRemainingPayment;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
