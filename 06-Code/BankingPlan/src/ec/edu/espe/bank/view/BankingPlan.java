package ec.edu.espe.bank.view;

import ec.edu.espe.bank.model.Cdt;
import ec.edu.espe.bank.model.Checking;
import ec.edu.espe.bank.model.Money;
import ec.edu.espe.bank.model.Profit;
import ec.edu.espe.bank.model.Saving;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author RocketTeam
 */
public class BankingPlan {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Checking> checking = new ArrayList<>();
        
        ArrayList<Money> money = new ArrayList<>();
        ArrayList<Profit> profits = new ArrayList<>();
<<<<<<< HEAD
        
        Cdt cdt;
        cdt = new Cdt(0, 0, 0, money) {};
        System.out.println("Cdt Account" + cdt);
        
                
=======

        Saving saving;
        int number, option;
        String accountNumber = "";
>>>>>>> 3025a5bc2d5aab342e4143271e1ad0fb92cfd1ed
        String name = "";
        float amount = 0.F;
        ArrayList<Saving> savings = new ArrayList<>();

        System.out.println("--> Menu for Saving Account <--");
        System.out.println("Do you want to continue? --> Yes(1) / No (0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("1.Deposit \n2.Withdraw \n3.Transfer \n4.Exit\n");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("Enter full name of the account holder to deposit -> (No spaces)");
                name = teclado.next();
                System.out.println("Enter the card number (10 digits): ");
                accountNumber = teclado.next();
                System.out.println("Enter the amount to deposit");
                amount = teclado.nextFloat();
                System.out.println("Check the data entered please!");
                saving = new Saving(name, amount, accountNumber, money, profits);
                System.out.println(saving);
                System.out.println("\nAre you sure of this action? -> Yes(1)/No(0)");
                number = teclado.nextInt();
                if (number == 1) {
                    //action to remove money from the account
                    System.out.println("Deposit made successfully!");
                    System.out.println("Thanks for using our banking plan\n");
                }
                if (number == 0) {
                    System.out.println("Thanks for using our banking plan\n");
                }
            }
            if (option == 2) {
                System.out.println("Choose the amount to withdraw:");
                System.out.println("1) 10 \n2) 20 \n3) 50 \n4) 80 \n5) Other");
                number = teclado.nextInt();
                if (number == 1) {
                    //action to remove money from the account
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 2) {
                    //action to remove money from the account
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 3) {
                    //action to remove money from the account
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 4) {
                    //action to remove money from the account
                    System.out.println("Withdraw made successfully!");
                    System.out.println("Thanks for using our banking plan");
                }
                if (number == 5) {
                    //action to remove money from the account
                    System.out.println("Enter the amount:");
                    amount = teclado.nextFloat();
                    System.out.println("Are you sure of this value? -> Yes(1)/No(0)");
                    number = teclado.nextInt();
                    if (number == 1) {
                        //action to remove money from the account
                        System.out.println("Withdraw made successfully!");
                        System.out.println("Thanks for using our banking plan\n");
                    }
                    if (number == 0) {
                        System.out.println("Thanks for using our banking plan\n");
                    }
                }

            }
            if (option == 3) {
                System.out.println("Enter full name of the account holder to transfer -> (No spaces)");
                name = teclado.next();
                System.out.println("Enter the amount to transfer:");
                amount = teclado.nextFloat();
                System.out.println("Enter the account number (20 digits): ");
                accountNumber = teclado.next();
                System.out.println("Check the data entered please!");
                saving = new Saving(name, amount, accountNumber, money, profits);
                System.out.println(saving);
                System.out.println("Are you sure of this action? -> Yes(1)/No(0)");
                number = teclado.nextInt();
                if (number == 1) {
                    //action to remove money from the account
                    System.out.println("Transfer made successfully!");
                    System.out.println("Thanks for using our banking plan\n");
                }
                if (number == 0) {
                    System.out.println("Thanks for using our banking plan\n");
                }

            }
            if (option == 4) {
                System.out.println("Thanks for using our banking plan");
                System.out.println("See you soon!");
                break;
            }

<<<<<<< HEAD
        System.out.println("The name --> " + name + " ;the Id --> " + id + " ;age --> " + age + " ;password --> " + password);

        System.out.println("List of CdtAccounts");
        String cdtAccounts;
        String fileName = "data/cdtAccounts.csv";
        cdtAccounts = FileManager.read(fileName);
        System.out.println(" --> CdtAccounts <--\n" + cdtAccounts);
        System.out.println("author Sebastian Tayo");

=======
        }
>>>>>>> 3025a5bc2d5aab342e4143271e1ad0fb92cfd1ed
    }

}
