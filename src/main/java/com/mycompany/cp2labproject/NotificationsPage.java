/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cp2labproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class NotificationsPage extends javax.swing.JFrame {
    // DefaultListModel nesneleri, JList bileşenleri için veri modelini temsil eder
    public static DefaultListModel registermodel = new DefaultListModel();
    public static DefaultListModel notificationListModel = new DefaultListModel();
    public static DefaultListModel applyListModel = new DefaultListModel();

    /**
     * Creates new form NotificationsPage
     */
    public NotificationsPage() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taxeslist = new javax.swing.JList<>();
        okbtn = new javax.swing.JButton();
        taxcombo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        registerList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        applyList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        moveupbtn = new javax.swing.JButton();
        movedownbtn = new javax.swing.JButton();
        applicatebtn = new javax.swing.JButton();
        refreshforreg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notifications Page");

        jScrollPane1.setViewportView(taxeslist);

        okbtn.setBackground(new java.awt.Color(0, 102, 102));
        okbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setText("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        taxcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one action", "Refresh", "Delete" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(taxcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(okbtn)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(taxcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tax Check", jPanel1);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane4.setViewportView(registerList);

        jSplitPane1.setLeftComponent(jScrollPane4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jSplitPane1.setRightComponent(jScrollPane5);

        jScrollPane2.setViewportView(applyList);

        jSplitPane1.setRightComponent(jScrollPane2);

        jLabel2.setText("Register applications on the upper list ");

        moveupbtn.setBackground(new java.awt.Color(204, 204, 204));
        moveupbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        moveupbtn.setText("↑ (Reject List)");
        moveupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveupbtnActionPerformed(evt);
            }
        });

        movedownbtn.setBackground(new java.awt.Color(204, 204, 204));
        movedownbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movedownbtn.setText("↓ (Apply List)");
        movedownbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedownbtnActionPerformed(evt);
            }
        });

        applicatebtn.setBackground(new java.awt.Color(102, 0, 153));
        applicatebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        applicatebtn.setForeground(new java.awt.Color(255, 255, 255));
        applicatebtn.setText("Apply Reg.");
        applicatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicatebtnActionPerformed(evt);
            }
        });

        refreshforreg.setBackground(new java.awt.Color(0, 102, 102));
        refreshforreg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshforreg.setForeground(new java.awt.Color(255, 255, 255));
        refreshforreg.setText("Refresh");
        refreshforreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshforregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(refreshforreg))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(movedownbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(moveupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(applicatebtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(refreshforreg)
                        .addGap(66, 66, 66)
                        .addComponent(moveupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(movedownbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(applicatebtn)))
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registers", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String url = "jdbc:mysql://localhost:3306/fzt ";
    String username = "root"; // Kullanıcı adını buraya girin
    String password = "fsmvu";
    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:

        if (taxcombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please select one of them.");
        } else if (taxcombo.getSelectedIndex() == 1) {
            notificationListModel.clear();
            fetchNotificationsFromTable();

            taxeslist.setModel(notificationListModel);
        } else if (taxcombo.getSelectedIndex() == 2) {
            deleteSelectedNotification();

        }
    }//GEN-LAST:event_okbtnActionPerformed

    private void moveupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveupbtnActionPerformed
        // TODO add your handling code here:
        moveup();
    }//GEN-LAST:event_moveupbtnActionPerformed

    private void movedownbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedownbtnActionPerformed
        // TODO add your handling code here:
        movedown();
        applyList.setModel(applyListModel);
    }//GEN-LAST:event_movedownbtnActionPerformed

    private void refreshforregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshforregActionPerformed
        // TODO add your handling code here:
        yenileVerileri();
        registerList.setModel(registermodel);

    }//GEN-LAST:event_refreshforregActionPerformed

    private void applicatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicatebtnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < applyListModel.size(); i++) {
            String data = (String) applyListModel.get(i);
            String[] parts = data.split(", "); // Verileri ayır

            int ID = Integer.parseInt(parts[0]); // ID
            String name = parts[1]; // Name                                                     
            String surname = parts[2]; // Surname
            //  int income = Integer.parseInt(parts[3]); // Income (VARCHAR olarak)
            int income = parseIncome(parts[3]);
            addCompany(ID, name, surname, income);
        }
    }//GEN-LAST:event_applicatebtnActionPerformed

    private int parseIncome(String incomeString) {
        // Gereksiz karakterleri temizle (örneğin, boşlukları ve metinleri kaldır)
        incomeString = incomeString.replaceAll("[^0-9]", "");

        try {
            return Integer.parseInt(incomeString);
        } catch (NumberFormatException e) {
            // Hatalı bir giriş durumunda hata ele alınabilir
            e.printStackTrace();
            return 0; // Varsayılan değeri döndür
        }
    }
/**
     * Yeni bir şirket ekler.
     * @param ID Şirket ID'si
     * @param name Şirket adı
     * @param username Şirket kullanıcı adı
     * @param income Şirket geliri
     */
    private void addCompany(int ID, String name, String Username, int income) {
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            String query = "INSERT INTO company (id, name, username, income) VALUES "
                    + "('" + ID + "', '" + name + "', '" + Username + "', " + income + ")";

           // statement.executeUpdate(query);
            int rowsAffected = statement.executeUpdate(query);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Save Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            deleteRegister(ID);
            String selectedValue = applyList.getSelectedValue();

      
  // Eğer hiçbir öğe seçilmediyse veya öge zaten "registerListModel" içinde varsa işlemi yapma
       

                // "applyList" içinden seçilen ögeyi kaldır
        applyListModel.removeElement(selectedValue);
        } else {
            JOptionPane.showMessageDialog(this, "No rows were affected. Save operation failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } catch (SQLException ex) {
            if (ex instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(this, "You cannot enter the same id! Please refresh your table with the switch button!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
    
    
    private void deleteRegister(int ID) {
    try (Connection connection = DriverManager.getConnection(url, username, password);
         Statement statement = connection.createStatement()) {

        String deleteQuery = "DELETE FROM register WHERE id = " + ID;
        int rowsAffected = statement.executeUpdate(deleteQuery);

        if (rowsAffected > 0) {
            System.out.println("Deleted register with ID: " + ID);
        } else {
            System.out.println("No rows were affected. Delete operation failed.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting register", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public void movedown() {
        // Seçilen öğeyi al
        String selectedValue = registerList.getSelectedValue();

        // Eğer hiçbir öğe seçilmediyse veya öğe zaten "applyListModel" içinde varsa işlemi yapma
        if (selectedValue == null || applyListModel.contains(selectedValue)) {
            return;
        }

        // Seçilen öğeyi "applyListModel" içine ekle
        applyListModel.addElement(selectedValue);

        // "registerList" içinden seçilen öğeyi kaldır
        DefaultListModel<String> registerListModel = (DefaultListModel<String>) registerList.getModel();
        registerListModel.removeElement(selectedValue);
    }

    public void moveup() {
        // Seçilen öğeyi al
        String selectedValue = applyList.getSelectedValue();

        // Eğer hiçbir öğe seçilmediyse veya öge zaten "registerListModel" içinde varsa işlemi yapma
        if (selectedValue == null || registermodel.contains(selectedValue)) {
            return;
        }

        // Seçilen ögeyi "registerListModel" içine ekle
        registermodel.addElement(selectedValue);

        // "applyList" içinden seçilen ögeyi kaldır
        applyListModel.removeElement(selectedValue);
    }

    public void yenileVerileri() {
        // MySQL veritabanına bağlanma işlemi
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM register");

            registermodel.clear(); // JList'i temizle

            // Verileri JList'e ekle
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int income = resultSet.getInt("income");
                String veri = id + ", " + name + ", " + surname + ", " + income;
                registermodel.addElement(veri);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void fetchNotificationsFromTable() {

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM notificationstable";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String message = resultSet.getString("messages");

                String notificationInfo = "ID: " + id + ", Message: " + message;
                notificationListModel.addElement(notificationInfo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteSelectedNotification() {
        int selectedIndex = taxeslist.getSelectedIndex();

        if (selectedIndex != -1) { // Eğer bir satır seçildiyse
            Object selectedObject = notificationListModel.getElementAt(selectedIndex);

            if (selectedObject instanceof String) {
                String selectedNotification = (String) selectedObject;
                int idToDelete = extractIdFromNotification(selectedNotification); // Örnek: "ID: 1, Message: Notification"
                deleteNotificationFromDatabase(idToDelete); // Veritabanından ilgili veriyi silmek için gerekli SQL sorgusunu çağırın
                notificationListModel.removeElementAt(selectedIndex); // JList'ten öğeyi kaldırın
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a notificationstable to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private int extractIdFromNotification(String notification) {
        String[] parts = notification.split("ID: ");
        if (parts.length > 1) {
            String idPart = parts[1].split(",")[0].trim();
            return Integer.parseInt(idPart);
        } else {
            return -1;
        }
    }

    private void deleteNotificationFromDatabase(int id) {

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            String deleteQuery = "DELETE FROM notificationstable WHERE id = " + id;
            statement.executeUpdate(deleteQuery);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(NotificationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applicatebtn;
    private javax.swing.JList<String> applyList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton movedownbtn;
    private javax.swing.JButton moveupbtn;
    private javax.swing.JButton okbtn;
    private javax.swing.JButton refreshforreg;
    private javax.swing.JList<String> registerList;
    private javax.swing.JComboBox<String> taxcombo;
    private javax.swing.JList<String> taxeslist;
    // End of variables declaration//GEN-END:variables
}