/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import theatergui.Login;

/**
 *
 * @author DANIEL FAILADONA
 */
public class U_Admin extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public U_Admin() {
        initComponents();
        displayData();
    }

    public void displayData()
    {
        try
        {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT u_lname, u_fname, u_username, "
                                        + "u_type, u_phone, u_status FROM tbl_accounts");
            account_table.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Navigation = new javax.swing.JPanel();
        ManagerStartup2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        account_table = new javax.swing.JTable();
        ManagerStartup = new javax.swing.JButton();
        ManagerStartup3 = new javax.swing.JButton();
        ManagerStartup4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(39, 39, 39));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1310, 40));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 100));

        Navigation.setBackground(new java.awt.Color(51, 51, 51));
        Navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManagerStartup2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManagerStartup2.setText("Back");
        ManagerStartup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerStartup2ActionPerformed(evt);
            }
        });
        Navigation.add(ManagerStartup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 130, 40));

        Main.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 540));

        account_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(account_table);

        Main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 1020, 430));

        ManagerStartup.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManagerStartup.setText("DELETE");
        ManagerStartup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerStartupActionPerformed(evt);
            }
        });
        Main.add(ManagerStartup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 130, 40));

        ManagerStartup3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManagerStartup3.setText("UPDATE");
        ManagerStartup3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerStartup3ActionPerformed(evt);
            }
        });
        Main.add(ManagerStartup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, 40));

        ManagerStartup4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManagerStartup4.setText("ADD");
        ManagerStartup4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerStartup4ActionPerformed(evt);
            }
        });
        Main.add(ManagerStartup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerStartupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerStartupActionPerformed
        Login ml = new Login();
        ml.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManagerStartupActionPerformed

    private void ManagerStartup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerStartup2ActionPerformed
        AdminDashboard as = new AdminDashboard();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManagerStartup2ActionPerformed

    private void ManagerStartup3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerStartup3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManagerStartup3ActionPerformed

    private void ManagerStartup4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerStartup4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManagerStartup4ActionPerformed

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
            java.util.logging.Logger.getLogger(U_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JButton ManagerStartup;
    private javax.swing.JButton ManagerStartup2;
    private javax.swing.JButton ManagerStartup3;
    private javax.swing.JButton ManagerStartup4;
    private javax.swing.JPanel Navigation;
    private javax.swing.JTable account_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
