package ec.espe.edu.bank.view;

import ec.espe.edu.bank.model.Account;
import ec.espe.edu.bank.model.Profile;
import java.util.Scanner;

/**
 *
 * @author RocketTeam
 */
public class BankingPlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "Sebastian";
        int id = 123123;
        int age = 15;
        int password = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("data profile");
        
        System.out.println("name");
        name = scanner.next();
        
        System.out.println("id-->");
        id = scanner.nextInt();
        
        System.out.println("age -->");
        age = scanner.nextInt();
        
        System.out.println("password -->");
        password = scanner.nextInt();
       
        System.out.println("The name --> "+ name +" ;the Id --> "+ id +" ;age --> "+ age +" ;password --> "+ password);
        
    }

}
