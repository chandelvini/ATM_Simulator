import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Account acc = new Account();
        ArrayList<Account> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while(true)
        {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

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
                    boolean isfound = false;
                    System.out.println("Enter card number");
                    String input = sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {
                        Account a = list.get(i);
                        if(a.getCard_no().equals(input))
                        {
                            a.deposit();
                            isfound = true;
                            break;
                        }
                        System.out.println(a.getCard_no());
                    }
                    System.out.println(input);

                    if(!isfound)
                    {
                        System.out.println("Account not found");
                    }
      break;
                }
                case 3:
                {
                    boolean isfound = false;
                    System.out.println("Enter card number");
                    String input = sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {
                        Account a = list.get(i);
                        if(a.getCard_no().equals(input))
                        {
                            a.withdraw();
                            isfound = true;
                            break;
                        }
                    }
                    if(!isfound)
                    {
                        System.out.println("account not found");
                    }
                    break;

                }
                case 4 :
                {
                    boolean isfound = false;
                    System.out.println("Enter card number");
                    String input = sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {
                        Account a = list.get(i);
                        if(a.getCard_no().equals(input))
                        {
                            a.display();
                            isfound = true;
                            break;
                        }
                    }
                    if(!isfound)
                    {
                        System.out.println("account not found");
                    }
                    break;



                }

                case 5:
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