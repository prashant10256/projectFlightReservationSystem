import java.util.Scanner;

public class Contact {
    Scanner input = new Scanner(System.in);
    String name = input.next();
    String phone = input.next();
    String email = input.next();

    public String ContactDetails(){

        return ("Name: "+name+"Phone: "+phone+"Email: "+email);
    }
    public void getContactDetails(){

    }

    public String updateContactDetails(){

        return ("Name: "+name+"Phone: "+phone+"Email: "+email);
    }
    public void setAddressDetails(){

    }
}
