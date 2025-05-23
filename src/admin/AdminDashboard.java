/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Startups.LoginForm;
import java.awt.Color;
import Startups.startingpanel;
import config.Session;
import config.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
public class AdminDashboard extends javax.swing.JFrame {

    private Color H;
    Color h = new Color(51,51,255);
    private Color D;
    Color d = new Color(240,240,240);
    public AdminDashboard() {
        initComponents();
    }
    
    
    public void logEvent(int userId, String username, String action) {
        dbConnect dbc = new dbConnect();
        Connection con = dbc.getConnection();
        PreparedStatement pstmt = null;
        Timestamp time = new Timestamp(new Date().getTime());

        try {
            String sql = "INSERT INTO tbl_logs (u_id, u_username, action_time, log_action) "
                    + "VALUES ('" + userId + "', '" + username + "', '" + time + "', '" + action + "')";
            pstmt = con.prepareStatement(sql);

            /*            pstmt.setInt(1, userId);
            pstmt.setString(2, username);
            pstmt.setTimestamp(3, new Timestamp(new Date().getTime()));
            pstmt.setString(4, userType);*/
            pstmt.executeUpdate();
            System.out.println("Login log recorded successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error recording log: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
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

        Main = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Navigation = new javax.swing.JPanel();
        acc_fname = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        acc_uname = new javax.swing.JLabel();
        acc_type = new javax.swing.JLabel();
        acc_phone = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        users1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        users2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        users3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        users4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Main.setBackground(new java.awt.Color(103, 10, 10));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(103, 10, 10));
        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 40));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        Navigation.setBackground(new java.awt.Color(103, 10, 10));
        Navigation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_fname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_fname.setForeground(new java.awt.Color(255, 255, 255));
        acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fname.setText("First Name");
        Navigation.add(acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 30));

        acc_lname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("Last Name");
        Navigation.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 30));

        acc_uname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_uname.setForeground(new java.awt.Color(255, 255, 255));
        acc_uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_uname.setText("User Name");
        Navigation.add(acc_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 30));

        acc_type.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_type.setForeground(new java.awt.Color(255, 255, 255));
        acc_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_type.setText("Type");
        Navigation.add(acc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 30));

        acc_phone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_phone.setForeground(new java.awt.Color(255, 255, 255));
        acc_phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_phone.setText("Phone");
        Navigation.add(acc_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 30));

        acc_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        Navigation.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 30));
        Navigation.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -90, 310, 160));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red_wolf_logo_200x200.png"))); // NOI18N
        Navigation.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3271640.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        Navigation.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 300, 640));

        Main.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 540));

        users1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users1MouseExited(evt);
            }
        });
        users1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Change Pass");
        users1.add(jLabel14);
        jLabel14.setBounds(0, 25, 160, 22);

        Main.add(users1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 160, 70));

        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Users");
        users.add(jLabel12);
        jLabel12.setBounds(0, 25, 160, 20);

        Main.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 160, 70));

        users2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users2MouseExited(evt);
            }
        });
        users2.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Logs");
        users2.add(jLabel15);
        jLabel15.setBounds(0, 25, 160, 22);

        Main.add(users2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 160, 70));

        users3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users3MouseExited(evt);
            }
        });
        users3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Add Password");
        users3.add(jLabel16);
        jLabel16.setBounds(0, 10, 160, 22);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Recovery");
        users3.add(jLabel17);
        jLabel17.setBounds(0, 40, 160, 22);

        Main.add(users3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 160, 70));

        users4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users4MouseExited(evt);
            }
        });
        users4.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Manage Movies");
        users4.add(jLabel18);
        jLabel18.setBounds(0, 25, 160, 22);

        Main.add(users4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 160, 70));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Logout");
        logout.add(jLabel10);
        jLabel10.setBounds(40, 20, 80, 30);

        Main.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 160, 70));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 130, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3271640.jpg"))); // NOI18N
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 550, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dbConnect connector = new dbConnect();
        dbConnect dbc = new dbConnect();
        Session sess = Session.getInstance();
        int userId = 0;
        String uname = null;
        try {
            String query2 = "SELECT * FROM tbl_accounts WHERE u_id = '" + sess.getUid() + "'";
            PreparedStatement pstmt = connector.getConnection().prepareStatement(query2);

            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                userId = resultSet.getInt("u_id");   // Update the outer `userId` correctly
                uname = resultSet.getString("u_username");
            }
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex);
        }

        logEvent(userId, uname, "Logged Out");
        startingpanel sp = new startingpanel();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(h);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(d);
    }//GEN-LAST:event_logoutMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        U_Admin ua = new U_Admin();
        ua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBackground(h);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(d);
    }//GEN-LAST:event_usersMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
       if(sess.getUid() == 0)
       {
           JOptionPane.showMessageDialog(null,"No Account, Login FIrst");
           LoginForm l = new LoginForm();
           l.setVisible(true);
           this.dispose();
       }else
       {
           acc_fname.setText("" + sess.getFname());
           acc_lname.setText("" + sess.getLname());
           acc_uname.setText("" + sess.getUname());
           acc_type.setText("" + sess.getType());
           acc_phone.setText("" + sess.getPhone());
           acc_id.setText("" + sess.getUid());
       }
    }//GEN-LAST:event_formWindowActivated

    private void users1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users1MouseClicked
    Admin_ChangePass acp = new Admin_ChangePass();
    acp.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_users1MouseClicked

    private void users1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users1MouseEntered
        users1.setBackground(h);
    }//GEN-LAST:event_users1MouseEntered

    private void users1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users1MouseExited
        users1.setBackground(d);
    }//GEN-LAST:event_users1MouseExited

    private void users2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users2MouseClicked
        Logs_Admin la = new Logs_Admin();
        la.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_users2MouseClicked

    private void users2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users2MouseEntered
        users2.setBackground(h);
    }//GEN-LAST:event_users2MouseEntered

    private void users2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users2MouseExited
        users2.setBackground(d);
    }//GEN-LAST:event_users2MouseExited

    private void users3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users3MouseClicked
    Admin_Add_Recovery aar = new Admin_Add_Recovery();
    aar.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_users3MouseClicked

    private void users3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users3MouseEntered
        users3.setBackground(h);
    }//GEN-LAST:event_users3MouseEntered

    private void users3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users3MouseExited
        users3.setBackground(d);
    }//GEN-LAST:event_users3MouseExited

    private void users4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users4MouseClicked
        Addmovie pf = new Addmovie();
        pf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_users4MouseClicked

    private void users4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users4MouseEntered
        users4.setBackground(h);
    }//GEN-LAST:event_users4MouseEntered

    private void users4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users4MouseExited
        users4.setBackground(d);
    }//GEN-LAST:event_users4MouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
total_sale ts = new total_sale();
ts.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Navigation;
    private javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_phone;
    private javax.swing.JLabel acc_type;
    private javax.swing.JLabel acc_uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel users;
    private javax.swing.JPanel users1;
    private javax.swing.JPanel users2;
    private javax.swing.JPanel users3;
    private javax.swing.JPanel users4;
    // End of variables declaration//GEN-END:variables
}
