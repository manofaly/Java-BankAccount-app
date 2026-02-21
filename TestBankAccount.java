/*This class tests the BankAccount and CheckingAccount classes. */

public class TestBankAccount {
    public static void main (String[] args) {
        BankAccount account1 = new BankAccount();             // Creating a BankAccount instance
        account1.setFirstName("Omer");           // Setting first name
        account1.setLastName("Manofaly");         // Setting last name
        account1.setAccountID(1234);             // Setting account ID
        account1.deposit(600.0);                // Performing a deposit of $600
        account1.withdrawal(200.0);            // Performing a withdrawal of $200
        
        System.out.println("\n* Initial account details: ");
        account1.accountSummary();
        System.out.println("=======================================================");

        

        // Creating a CheckingAccount instance
        CheckingAccount account2 = new CheckingAccount();

        account2.deposit(500);                           // performing a deposit
        account2.processWithdrawal(200);           // performing a withdrawal
        account2.setFirstName("Omer");                      // setting firstname
        account2.setLastName("Manofaly");                    // setting lastname
        account2.setAccountID(5678);                        //setting account ID
        account2.setInterestRate(3.0);                   // Seeting interest rate

        // account2.deposit(500.0);
        // account2.processWithdrawal(650.0);
        
        System.out.println("\n* Account details after withdrawal of $950: ");
        account2.displayAccount();


    }

}