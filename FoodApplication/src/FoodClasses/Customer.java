package FoodClasses;

public class Customer extends Person {
    private String address;
    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public String displayInfo() {
        return "Name: "+getName()+"\nContact: "+getContact()+"\nAddress: "+address;
    }
}