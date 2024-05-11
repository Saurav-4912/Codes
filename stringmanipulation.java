package Codes;

public class stringmanipulation {
    public static void main(String[] args) {
        String firstName="Saurav";
        String lastName="pawar";

        String fullName=firstName.concat (" " ).concat(lastName);
        System.out.println(fullName.toUpperCase());
        
    }
}

/*output =
 * SAURAV PAWAR
 */