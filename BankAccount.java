/* This is a BankAccount class. Has attributes: firstName (String), lastName (String), accountID(integer), and balance(double)
Allows deposits, and allows withdrawals if amount less than the balance. */

// Default constructor
public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Parameterized constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double depositAmount) {
        // A method to allow deposits to bank account. Accepts a double amount.

        if (depositAmount > 0) {
            this.balance += depositAmount;             // Add deposit amount to current balance
            System.out.println("An amount of $" + depositAmount + " has been deposited to your bank account successfully.");
        
        } else {                                
            System.out.println("Deposit amount must be greater than 0");

        }
        System.out.println("=======================================================");

    }

    public void withdrawal(double withdrawAmount) {
        // A method to allow withdrawals from ban account

        if (withdrawAmount <= 0 | withdrawAmount > this.balance) {                 
            System.out.println("Withdraw amount can not be less than 0 or greater than current balance.");

        } else {
            this.balance -= withdrawAmount;           // subtract withdraw amount from current balance
            System.out.println("An amount of $" + withdrawAmount + " has been withdrawn from your bank account successfully.");
            System.out.println("Remaining balance: $" + this.balance);
            
        }
        System.out.println("=======================================================");

    }

    // Setter method for firstName
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;

    }

    // Setter method for lasttName
    public void setLastName(String newLastName) {
        this.lastName = newLastName;

    }

    // Setter method for accountID
    public void setAccountID(int newAccountID) {
        this.accountID = newAccountID;

    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Getter method for firstName
    public String getFirstName() {
        return this.firstName;

    } 

    // Getter method for lastName
    public String getLastName() {
        return this.lastName;

    } 

    // Getter method for accountID
    public int getAccountID() {
        return this.accountID;

    } 

    // Getter method for balance
    public double getBalance() {
        return this.balance;
    
    }

    public void accountSummary() {
        // A method to print ot account details

        String fullName = this.firstName + " " + this.lastName;
        String summary = """
                              Account type: Bank account
                              Account holder's fullname: %s
                              Account ID: %d
                              Account balance: $%.2f """.formatted(fullName, this.accountID, this.balance);
        
        System.out.println("=======================================================");
        System.out.println(summary);
        

    }

    



}