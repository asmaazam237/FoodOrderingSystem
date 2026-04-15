package FoodApplication;
import FoodApplication.AdminLogin;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import FoodClasses.*;
public class AdminDashboard extends javax.swing.JFrame {
    public AdminDashboard() {
        initComponents();
        Color col =new Color(242,242,242);
        getContentPane().setBackground(col);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("FoodIcon.jpg")).getImage());
        Connect();
        LoadData();
        Person p = new Admin();
        p.adjustColumnWidths(jTable2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newitemtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newdesctxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        newpricetxt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOOD ORDERING APPLICATION");
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Dashboard");

        backbtn.setBackground(new java.awt.Color(204, 204, 204));
        backbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        backbtn.setText("Log out");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addbtn.setBackground(new java.awt.Color(0, 102, 102));
        addbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 102, 102));
        updatebtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(0, 102, 102));
        deletebtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Enter new item:");

        newitemtxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("Enter description:");

        newdesctxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        newdesctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newdesctxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel3.setText("MENU:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setShowGrid(false);
        jScrollPane3.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("Enter new price:");

        newpricetxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newdesctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(newitemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newpricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(addbtn)
                        .addGap(54, 54, 54)
                        .addComponent(updatebtn)
                        .addGap(55, 55, 55)
                        .addComponent(deletebtn)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newitemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(newpricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newdesctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private static final String username = "root";
    private static final String password = "12345";
    private static final String dataConnection = "jdbc:mysql://localhost:3306/item";
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        AdminLogin ad = new AdminLogin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void newdesctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newdesctxtActionPerformed
      
    }//GEN-LAST:event_newdesctxtActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
    String itemName = newitemtxt.getText();
    String priceText = newpricetxt.getText();
    String description = newdesctxt.getText();

    if (itemName.isEmpty() || priceText.isEmpty() || description.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    try {
        double price = Double.parseDouble(priceText);

        // Get the next ID by counting rows (or MAX(id) + 1 for safety)
        String idQuery = "SELECT MAX(id) FROM fooditems";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(idQuery);
        int nextId = 1;
        if (rs.next()) {
            nextId = rs.getInt(1) + 1;
        }

        // Insert the new item with manual ID assignment
        String sql = "INSERT INTO fooditems (id, itemname, prize, description) VALUES (?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setInt(1, nextId);
        pst.setString(2, itemName);
        pst.setDouble(3, price);
        pst.setString(4, description);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Item Added Successfully");
        LoadData();
        newitemtxt.setText("");
        newpricetxt.setText("");
        newdesctxt.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error adding item: " + ex.getMessage());
    }
    }//GEN-LAST:event_addbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
         int selectedRow = jTable2.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an item to update.");
        return;
    }

    // Get current values from table
    int id = (int) jTable2.getValueAt(selectedRow, 0);
    String currentName = (String) jTable2.getValueAt(selectedRow, 1);
    double currentPrice = (double) jTable2.getValueAt(selectedRow, 2);
    String currentDesc = (String) jTable2.getValueAt(selectedRow, 3);

    // Get input from user (new values)
    String newName = newitemtxt.getText().trim();
    String newPriceText = newpricetxt.getText().trim();
    String newDesc = newdesctxt.getText().trim();

    // Use current value if input is empty
    if (newName.isEmpty()) {
        newName = currentName;
    }
    double newPrice;
    if (newPriceText.isEmpty()) {
        newPrice = currentPrice;
    } else {
        try {
            newPrice = Double.parseDouble(newPriceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format.");
            return;
        }
    }
    if (newDesc.isEmpty()) {
        newDesc = currentDesc;
    }

    try {
        String sql = "UPDATE fooditems SET itemname = ?, prize = ?, description = ? WHERE id = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, newName);
        pst.setDouble(2, newPrice);
        pst.setString(3, newDesc);
        pst.setInt(4, id);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Item Updated Successfully");

        LoadData();
        newitemtxt.setText("");
        newpricetxt.setText("");
        newdesctxt.setText("");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error updating item: " + ex.getMessage());
    }

    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       int selectedRow = jTable2.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an item to delete.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this item?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    try {
        int id = (int) jTable2.getValueAt(selectedRow, 0);

        // Delete selected item
        String sql = "DELETE FROM fooditems WHERE id = ?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();

        // Re-adjust all IDs to be sequential
        String reorderSQL = "SET @count = 0;";
        Statement stmt = con.createStatement();
        stmt.execute(reorderSQL);

        reorderSQL = "UPDATE fooditems SET id = (@count:=@count+1) ORDER BY id";
        stmt.executeUpdate(reorderSQL);

        JOptionPane.showMessageDialog(this, "Item Deleted and IDs Re-adjusted Successfully");
        LoadData();
        newitemtxt.setText("");
        newpricetxt.setText("");
        newdesctxt.setText("");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting item: " + ex.getMessage());
    }
    }//GEN-LAST:event_deletebtnActionPerformed
    public void Connect() { 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(dataConnection, username, password); 
        } catch (ClassNotFoundException | SQLException ex) { 
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + ex); 
        } 
    } 
     public void LoadData() { 
        try { 
            pst = con.prepareStatement("SELECT * FROM fooditems"); 
            rs = pst.executeQuery(); 
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Item Name", "Price", "Description"}, 0); 
            while (rs.next()) { 
                int id = rs.getInt("id"); 
                String itemname = rs.getString("itemname"); 
                double prize = rs.getDouble("prize"); 
                String description = rs.getString("description"); 
                model.addRow(new Object[]{id, itemname, prize, description}); 
            } 
            jTable2.setModel(model); 
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(this, "Data Load Failed: " + ex); 
        } 
     }
      @Override
    public void setVisible(boolean visible) {
    super.setVisible(visible);
    jTable2.setDefaultEditor(Object.class, null); // disables editing
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField newdesctxt;
    private javax.swing.JTextField newitemtxt;
    private javax.swing.JTextField newpricetxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
