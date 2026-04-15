package FoodClasses;
import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;
public class Admin extends Person {
   private String email;
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String displayInfo() {
        return "Email: "+email+"\nContact: "+getContact();
    }   
    private static final String username = "root";
    private static final String password = "12345";
    private static final String dataConnection = "jdbc:mysql://localhost:3306/item";

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConnection, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean LoginCheck(String username, String password) {
        try {
            String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if(rs.next()) { 
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database error occurred.", "Login Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally {
            try {
                if(rs != null) rs.close();
                if(pst != null) pst.close();
               if(con != null) con.close();
            } 
            catch(SQLException ex) {
            ex.printStackTrace();
            }
        }
        return true;
    }
}