package FoodClasses;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.table.TableColumnModel;

public abstract class Person {
    private String name;
    private String contact;
    
    public void setName(String name){
        this.name = name;
    }
    public boolean setContact(String contact){
        if (contact !=null&& contact.length()== 10 & contact.matches("\\d{10}")){
            this.contact = contact;
            return true;
        }
        else{
            return false;
        }
    }
    public String getName() {
        return name;
    }
       public String getContact() {
        return contact;
    }
    public abstract String displayInfo();
    public void adjustColumnWidths(JTable jTable2) {
        TableColumnModel columnModel = jTable2.getColumnModel(); // Assuming your JTable variable is jTable1

        if (columnModel.getColumnCount() > 0) {
            TableColumn column0 = columnModel.getColumn(0);
            column0.setPreferredWidth(60);

            TableColumn column1 = columnModel.getColumn(1);
            column1.setPreferredWidth(150);

            TableColumn column2 = columnModel.getColumn(2);
            column2.setPreferredWidth(80);
            
            TableColumn column3 = columnModel.getColumn(3);
            column3.setPreferredWidth(250);
        }
    }
}