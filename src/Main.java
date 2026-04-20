import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Account acc = new Account();
        ArrayList<Account> list = new ArrayList<>();
Account currentUser = null;

        Scanner sc = new Scanner(System.in);




        while(true)
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Register");
            System.out.println("2.Login");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Balance Check");
            System.out.println("6. Logged Out");
            System.out.println("7.Exit");


            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                {
                    Account acc = new Account();

                    acc.register();
                    list.add(acc);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter card number");

                    String input = sc.nextLine();

                    System.out.println("ENter pin");
                     String pinn = sc.nextLine();


                    Account foundAcc = Account.findAccount(list, input,pinn);

                    if(foundAcc != null)
                    {
                        currentUser = foundAcc;
                        System.out.println("Login Successfully");
                    }else {
                        System.out.println("Account Not Found");
                    }
                    break;

                }
                case 3:
                {

                    if (currentUser != null) {
                        currentUser.deposit();   // ya withdraw/display
                    } else {
                        System.out.println("login First");
                    }


      break;
                }
                case 4:
                {

                    if (currentUser != null) {
                        currentUser.withdraw();   // ya withdraw/display
                    } else {
                        System.out.println("Login first");
                    }
                    break;

                }
                case 5 :
                {
                    if (currentUser != null) {
                        currentUser.display();   // ya withdraw/display
                    } else {
                        System.out.println("Login First");
                    }
                    break;

                }
                case 6:
                {
                    if(currentUser != null)
                    {
                        currentUser = null;
                        System.out.println("Logged out Successfully");
                    }else {
                        System.out.println("No User Logged in");
                    }
                    break;
                }

                case 7:
                {

                    System.out.println("Thank you for using ATM");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Invalid Input");
                }



            }
        }




    }
}