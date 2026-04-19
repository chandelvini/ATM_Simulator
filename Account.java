import java.util.Scanner;

public class Account {

     private String card_no;
     private String name;
     private long balance;
    // private int amt;

    Scanner sc = new Scanner(System.in);
     public  Account()
     {
         card_no = "00";
         name = "xxxx";
         balance = 0;
     }
     public  Account( String cardno,String Name)
     {
         this.card_no = cardno;
         this.name = Name;
     }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCard_no()
    {
        return card_no;
    }

    public void register()
    {
        // Card Number

        while(true)
        {
            System.out.println("Enter Customer Card Number");
            card_no = sc.nextLine();

            if(card_no.length() == 16)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Card Number (must be 16 digits)");
            }
        }

        // Name
        while(true)
        {
            System.out.println("Enter Customer Name");
            name = sc.nextLine();

            if(!name.isEmpty())
            {
                break;
            }
            else
            {
                System.out.println("Name cannot be empty");
            }
        }

        System.out.println("Registration done");
    }

     public void display()
     {
         System.out.println("\n===== ACCOUNT DETAILS =====");
         System.out.println("Card Number  : " + card_no);
         System.out.println("Customer Name: " + name);
         System.out.println("Balance      : " + balance);
         System.out.println("===========================");


     }

     public void deposit()
     {
        int amt;
         System.out.println("Enter Amount");
         amt = sc.nextInt();
         if(amt > 0) {
             balance = balance + amt;
             System.out.println("✅ Amount Deposited Successfully");
             System.out.println("Current Balance: " + balance);
         }else
         {
             System.out.println("Invalid amount");
         }


     }
     public void withdraw()
     {

         System.out.println("Enter amount which you have to withdraw");
         int amt = sc.nextInt();
         if(balance >= amt && amt > 0)
         {
             balance = balance - amt;
             System.out.println("✅ Withdraw Successful");
             System.out.println("Remaining Balance: " + balance);

         }else
         {
             System.out.println("❌ Insufficient Balance");
         }

     }


}
