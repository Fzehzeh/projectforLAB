/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cp2labproject;

import static com.mycompany.cp2labproject.AdminPage.companymodel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class CompanyAddForManager extends javax.swing.JFrame {

    /**
     * Creates new form PersonnelAddForManager
     */
    public CompanyAddForManager() {
        initComponents();
    }
    String url = "jdbc:mysql://127.0.0.1:3306/fzt ";
    String username = "root"; // Kullanıcı adını buraya girin
    String password = "fsmvu";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblCompanyAffairPage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblincome = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        cmbComp = new javax.swing.JComboBox<>();
        btnApply = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Company Affair Page\n");
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));

        btnClose.setBackground(new java.awt.Color(153, 153, 153));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblCompanyAffairPage.setText("Company Affair Page ");

        lblName.setText("Name");

        lblUsername.setText("Username");

        lblID.setText("ID");

        lblincome.setText("Income");

        lblTax.setText("Tax");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        cmbComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Add", "Remove", "Update by ID" }));

        btnApply.setBackground(new java.awt.Color(0, 102, 102));
        btnApply.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApply.setForeground(new java.awt.Color(255, 255, 255));
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(txtName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblincome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbComp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(lblCompanyAffairPage, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(cmbComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnApply))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClose)
                            .addComponent(lblCompanyAffairPage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblincome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTax))))
                .addGap(54, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed

        // Eğer ComboBox'ta hiçbir öğe seçilmediyse, uyarı mesajı göster
        if (cmbComp.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select an item.", "Warning", JOptionPane.WARNING_MESSAGE);
        } // ComboBox'ta "Add" seçildiyse
        else if (cmbComp.getSelectedIndex() == 1) {
            String name = txtName.getText();
            String username = txtusername.getText();
            String str = txtID.getText();
            int ID = Integer.parseInt(str);
            String income = txtIncome.getText();
            String tax = txtTax.getText();

            // Şirket ekleme işlemini gerçekleştir
            addCompany(name, username, income, tax, ID);

            // Kullanıcıya şirket eklendiği bilgisini göster
            JOptionPane.showMessageDialog(rootPane, "Company added!");

        } else if (cmbComp.getSelectedIndex() == 2) {
            String str = txtID.getText();
            int ID = Integer.parseInt(str);

            // Şirket silme işlemini gerçekleştir
            DeleteCompany(ID);

            // Kullanıcıya şirketin silindiği bilgisini göster
            JOptionPane.showMessageDialog(rootPane, "Company removed!");

            // ComboBox'ta "Update by ID" seçildiyse
        } else if (cmbComp.getSelectedIndex() == 3) {

            String name = txtName.getText();
            String username = txtusername.getText();
            String str = txtID.getText();
            int ID = Integer.parseInt(str);
            String income = txtIncome.getText();
            String tax = txtTax.getText();

            // Şirket güncelleme işlemini gerçekleştir
            UpdateCompany(name, username, income, tax, ID);

            // Kullanıcıya şirketin güncellendiği bilgisini göster
            JOptionPane.showMessageDialog(rootPane, "Company updated!");
        }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public void addCompany(String name, String username, String income, String tax, int ID) {
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            // SQL sorgusu ile veritabanına yeni bir şirket ekleniyor.
            String query = "INSERT INTO company (id, name, username, income, tax) VALUES "
                    + "('" + ID + "', '" + name + "', '" + username + "', " + income + ", " + tax + ", '')";

            statement.executeUpdate(query);
        } catch (SQLException ex) {

            // Hata durumlarıyla başa çıkma
            if (ex instanceof SQLIntegrityConstraintViolationException) {

                // Eğer aynı ID ile başka bir şirket zaten varsa kullanıcıya hata mesajı gösteriliyor.
                JOptionPane.showMessageDialog(this, "You cannot enter same id! '", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                // Diğer SQL hatası durumlarında hata mesajları konsola yazdırılıyor.
                ex.printStackTrace();
            }
        }
    }

    public void DeleteCompany(int ID) {
        String tableName = "company";

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            // SQL sorgusu ile veritabanında belirtilen ID'ye sahip şirket siliniyor.
            String query = "DELETE FROM " + tableName + " WHERE id = " + ID;
            statement.executeUpdate(query);
        } catch (SQLException ex) {

            // Veritabanı hatası durumunda konsola hata mesajları yazdırılıyor.
            ex.printStackTrace();
        }
    }

    public void UpdateCompany(String newName, String username, String income, String tax, int ID) {

        // Güncellenen şirket bilgilerini veritabanında ve tabloda güncellemek için kullanılan metod.
        String tableName = "Company"; // Güncellenecek tablonun adı

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {

            String query = "UPDATE " + tableName + " SET name = '" + newName + "', usurname = '" + username + "', income = " + income + ", tax = " + tax + " WHERE id = " + ID;
            statement.executeUpdate(query);
            // Model içindeki tablodan güncellenen şirket bilgilerini bul ve güncelle
            int rowCount = companymodel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                int rowID = (int) companymodel.getValueAt(i, 0);
                if (rowID == ID) {

                    // Belirtilen ID'ye sahip satır bulunduğunda, tablodaki değerleri güncelle
                    companymodel.setValueAt(newName, i, 1);
                    companymodel.setValueAt(username, i, 2);
                    companymodel.setValueAt(income, i, 3);
                    companymodel.setValueAt(tax, i, 4);
                    break;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyAddForManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cmbComp;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCompanyAffairPage;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblincome;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
