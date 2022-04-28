import java.util.Scanner;
public class Address {
    Scanner input = new Scanner(System.in);
    String street = input.next();
    String city = input.next();
    String state = input.next();

    public String AddressDetails() {
        return ("Street = "+street+"City = "+city+"State = "+state);
    }
    public void getAddressDetails(){

    }
    public String updateAddressDetails(){
        return ("Street = "+street+"City = "+city+"State = "+state);
    }
    public void setAddressDetails(){

    }
}
