/*Write a class that represents a person's mailing address. It should have separate fields for the name, street address, city, state, and pin code. Define a toString() method that produces nicely formatted output.*/
import java.util.Scanner;
class mailAddress{
    private String name;
    private String address;
    private String city;
    private String state;
    private int pinCode;
    
    public mailAddress(String name,String address, String city, String state, int pinCode){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode= pinCode;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    
    
    public String getCity(){
        return city;
    }
    
   
    
    public String getState(){
        return state;
    }
    
    
    
    public int getPinCode(){
        return pinCode;
    }
    
    
    
    public String toString(){
        return "mailAddress[Name: %s, Address: %s, City: %s, State: %s, Pincode: %d]". formatted(this.getName(),this.getAddress(), this.getCity(), this.getState(), this.getPinCode());
    }
}


class HelloWorld {
    public static void main(String[] args) {
        /*mailAddress ma = new mailAddress("Ved","Rochester Hills","Detroit","Michigan",438066);
        System.out.println(ma.toString());*/

        System.out.println("Enter the data: ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            String address = sc.nextLine();
            String city = sc.nextLine();
            String state = sc.nextLine();
            int pinCode = sc.nextInt();
   
            mailAddress ma = new mailAddress(name, address, city, state, pinCode);
            System.out.println(ma.toString());
        }
    }
}