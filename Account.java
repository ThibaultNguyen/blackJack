import java.util.Scanner;

public class Account{
    //Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class constructor
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    //Function for Deposing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Function for Withdrawing money
    void withdraw(int amount) {
        if (amount !=0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    //Function calculating interest of current funds after a number of years
    void calculateInterest(int years) {
        double interestRate = 0.2;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be : " + newBalance);
    }

    //Function showing the main menu
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerID + " ! ");
        System.out.println("Your ID is : " + customerID);
        System.out.println();
        System.out.println("What would you like to do ?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View the previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do{
            System.out.println();
            System.out.println("Enter an option : ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
                //Case 'A' allows the user to check their account balance
                case 'A' :
                System.out.println("==========================");
                System.out.println("Balance = €" + balance);
                System.out.println("==========================");
                System.out.println();
                break;
                //Case 'B' allows the user to make a deposit in their with a specific amount using the 'deposit' function
                case 'B' :
                System.out.println("Enter the amount to deposit");
                int amountDeposited = scanner.nextInt();
                deposit(amountDeposited);
                System.out.println();
                break;
                //Case 'C' allows the user to make a wihtdrawal with a specific amount using the 'withdraw' function
                case 'C' :
                System.out.println("Enter the amount to withdraw");
                int amountWithdraw = scanner.nextInt();
                withdraw(amountWithdraw);
                System.out.println();
                break;
                //Case 'D' allows the user to check the previous transaction using the 'getPreviousTransaction' function
                case 'D' :
                System.out.println("==========================");
                getPreviousTransaction();
                System.out.println("==========================");
                System.out.println();
                break;
                //Case 'E' allows the user to calculate the interest after a specified number of year
                case 'E' :
                System.out.println("Enter 'how many years' you want to estimate your interest in : ");
                int years = scanner.nextInt();
                calculateInterest(years);
                break;
                //Case 'F' the user exits from their account
                case 'F' :
                System.out.println("==========================");
                break;
                //The default case let the user know that they entered an invalid character and how to enter a valid one
                default :
                System.out.println("Error : invalid option. Please enter A, B, C, D, E or access services. ");
                break;
            }
        } while(option != 'F');
        System.out.println("Thank you for your trust !");
    }

    
}  