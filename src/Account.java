import java.util.ArrayList;
import java.util.Scanner;

public class Account {

     private String card_no;
     private String name;
     private long balance;
     private String pin;
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

    public void setPin(String pin)
    {
        this.pin = pin;
    }
    public String getPin(){
         return pin;
    }

    public void register()
    {
        // Card Number

        while(true)
        {
            System.out.println("Enter Customer Card Number");
            card_no = sc.nextLine();

            if(card_no.matches("\\d{16}"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid Card Number (must be 16 digits) and must be digit only");
            }
        }

        // Name
        while(true)
        {
            System.out.println("Enter Customer Name");
            name = sc.nextLine();

            if(!name.trim().isEmpty() && name.matches("[a-zA-Z ]+"))
            {

                break;
            }
            else
            {
                System.out.println("Name cannot be empty and digit and special charatcer not allowed");
            }
        }
        while(true) {
            System.out.println("Enter Pin");
            pin = sc.nextLine();
            if (pin.matches("\\d{4}")) {

                break;

            }else {
                System.out.println("Pin must be 4 digit only");
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
         sc.nextLine();
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
         sc.nextLine();
         if(balance >= amt && amt > 0)
         {
             balance = balance - amt;
             System.out.println("✅ Withdraw Successful");
             System.out.println("Remaining Balance: " + balance);

         } else if (amt < 0) {
             System.out.println("Invalid amt");

         }else
         {
             System.out.println("❌ Insufficient Balance");
         }

     }

    public static Account findAccount(ArrayList<Account> list, String cardNo,String pin) {
        for (Account a : list) {
            if (a.getCard_no().equals(cardNo) && pin.equals(a.getPin())) {
                return a;
            }
        }
        return null;

    }

    public void changePin()
    {
        sc.nextLine();
        System.out.println("ENter old pin");
        String old_pin = sc.nextLine();
        if(old_pin.equals(pin))
        {
            System.out.println("Enter new pin");
            String new_pin = sc.nextLine();
            if(new_pin.matches("\\d{4}")) {
                pin = new_pin;
                System.out.println("new pin successfully set");
            }else {
                System.out.println("Pin must be 4 digit only");
            }


        }
        else {
            System.out.println("Wrong Pin");
        }


    }




}
