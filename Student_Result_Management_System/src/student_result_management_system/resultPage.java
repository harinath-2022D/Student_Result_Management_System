/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Harinath
 */
public class resultPage extends javax.swing.JFrame {

    /**
     * Creates new form resultPage
     */
    public resultPage() {
        initComponents();
    }
    public resultPage(String pin, String c, String y) {
        initComponents();
        String pin_no=pin;
        jTextField3.setText(pin_no);
        jTextField2.setText(c);
        jTextField5.setText(y);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, 37, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 18, 120, 30));

        jLabel2.setText("COURSE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 74, 37, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 63, 120, 30));

        jLabel3.setText("PIN NO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 21, 60, 20));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 18, 100, 30));

        jLabel4.setText("BRANCH");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 74, 37, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 63, 100, 30));

        jLabel5.setText("YEAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 21, 37, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 18, 71, 30));

        jLabel6.setText("FATHER NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 74, 60, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 63, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("SUBJECT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 152, 60, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("MARKS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 70, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 70, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 50, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 206, 43, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 264, 43, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 313, 43, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 363, 43, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 680, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 690, 10));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String pin_no =jTextField3.getText();
       String course = (String)jTextField2.getText();
        String year = (String)jTextField5.getText();
        String result ="";
       if(course.equals("B TECH") && year.equals("1")){
           result = "btech1";
       }else if(course.equals("B TECH") && year.equals("2")){
           result = "btech2";
       }else if(course.equals("B TECH") && year.equals("3")){
           result = "btech3";
       }else if(course.equals("M TECH") && year.equals("1")){
           result = "mtech1";
       }else if(course.equals("M TECH") && year.equals("2")){
           result = "mtech2";
       }else if(course.equals("MBA") && year.equals("1")){
           result = "mba1";
       }else if(course.equals("MBA") && year.equals("2")){
           result = "mba2";
       }
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms","root","Harinath@321");
            
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery("select * from student inner join "+result+" where student.pin_no='"+pin_no+"' and "+result+".pin_no='"+pin_no+"'");
            if(rs.next()){
                String branch = rs.getString(3);
                jTextField4.setText(branch);
                if(course.equals("B TECH") && branch.equals("CSE") && year.equals("1")){
            jLabel9.setText("AP");
            jLabel10.setText("M1");
            jLabel11.setText("CIT");
            jLabel12.setText("ED"); 
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
            
        }else if(course.equals("B TECH") && branch.equals("CSE") && year.equals("2")){
            jLabel9.setText("DSA");
            jLabel10.setText("DBMS");
            jLabel11.setText("OS");
            jLabel12.setText("CN");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("M TECH") && branch.equals("CSE") && year.equals("1")){
            jLabel9.setText("DAA");
            jLabel10.setText("CNT");
            jLabel11.setText("DW");
            jLabel12.setText("DIP");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("M TECH") && branch.equals("CSE") && year.equals("2")){
            jLabel9.setText("PR");
            jLabel10.setText("CD");
            jLabel11.setText("DS");
            jLabel12.setText("CC");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("B TECH") && branch.equals("ECE") && year.equals("1")){
            jLabel9.setText("AP");
            jLabel10.setText("M1");
            jLabel11.setText("BEE");
            jLabel12.setText("ED");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(12));
            jLabel16.setText(rs.getString(13));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("B TECH") && branch.equals("ECE") && year.equals("2")){
            jLabel9.setText("EE");
            jLabel10.setText("M2");
            jLabel11.setText("TD");
            jLabel12.setText("PH");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("M TECH") && branch.equals("ECE") && year.equals("1")){
            jLabel9.setText("ICT");
            jLabel10.setText("ADCS");
            jLabel11.setText("DE");
            jLabel12.setText("BEE");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("M TECH") && branch.equals("ECE") && year.equals("2")){
            jLabel9.setText("AN");
            jLabel10.setText("WN");
            jLabel11.setText("TAC");
            jLabel12.setText("OE");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("MBA") && branch.equals("MBA(GENERAL)") && year.equals("1")){
            jLabel9.setText("AFA");
            jLabel10.setText("BMS");
            jLabel11.setText("ECD");
            jLabel12.setText("WE");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("MBA") && branch.equals("MBA(GENERAL)") && year.equals("2")){
            jLabel9.setText("AFA2");
            jLabel10.setText("BMS2");
            jLabel11.setText("ECD2");
            jLabel12.setText("WE2");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("MBA") && branch.equals("MBA(HR)") && year.equals("1")){
            jLabel9.setText("HRM");
            jLabel10.setText("BM");
            jLabel11.setText("CS");
            jLabel12.setText("SS");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("MBA") && branch.equals("MBA(HR)") && year.equals("2")){
            jLabel9.setText("HRM2");
            jLabel10.setText("BM2");
            jLabel11.setText("CS2");
            jLabel12.setText("SS2");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("B TECH") && branch.equals("CSE") && year.equals("3")){
            jLabel9.setText("DSA3");
            jLabel10.setText("DBMS3");
            jLabel11.setText("OS3");
            jLabel12.setText("CN3");
            jLabel13.setText(rs.getString(9));
            jLabel14.setText(rs.getString(10));
            jLabel15.setText(rs.getString(11));
            jLabel16.setText(rs.getString(12));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }else if(course.equals("B TECH") && branch.equals("ECE") && year.equals("3")){
            jLabel9.setText("AN3");
            jLabel10.setText("WN3");
            jLabel11.setText("TAC3");
            jLabel12.setText("OE3");
            jLabel13.setText(rs.getString(13));
            jLabel14.setText(rs.getString(14));
            jLabel15.setText(rs.getString(15));
            jLabel16.setText(rs.getString(16));
            jTextField1.setText(rs.getString(5));
            jTextField6.setText(rs.getString(6));
        }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new searchPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
