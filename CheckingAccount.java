/* This is a checking account class that inherits from BankAccount. Has an interestRate attribute
in addition to the superclass attributes. Allow overdraft withdrawals and charge a $30 fee. */

public class CheckingAccount extends BankAccount {                    // Fields declaration
    private double interestRate;
    private static final double OVERDRAFT_FEES = 30.0;


    // Default constructor
    public CheckingAccount() {
        super();
        this.interestRate = 0.0;
    }
    
    // Setter method for interestRate
    public void setInterestRate(double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    // Getter method for interestRate
    public double getInterestRate() {
        return this.interestRate;
    }

    @Override     //Override the superclass method
    public void deposit(double depositAmount) {
        // A method to allow deposits to the checking account
        double balance = getBalance();          // current balance 
        if (depositAmount > 0) {  
            balance += depositAmount;                    // add deposit amount to current balance
            setBalance(balance);                         // update the balance after deposit
            System.out.println("An amount of $" + depositAmount + " has been deposited to your checking account successfully.");
        
        } else {            
            System.out.println("Deposit amount must be greater than 0");

        }
    }

    public void processWithdrawal(double processWithdrawAmount) {
        // A method to handle withdrawals from the checking account 
        double currentBalance = getBalance();                   // Access the balance attribute through its getter 
        if (processWithdrawAmount <= currentBalance) {
            withdrawal(processWithdrawAmount);                  // Perform normal withdrawal 
        
        } else {                                                // Overdraft withdrawal
            double newBalance = currentBalance - processWithdrawAmount - OVERDRAFT_FEES;
            System.out.println("Current balance: $" + currentBalance + ". Withdrawing $" + processWithdrawAmount + " from checking account.");
            System.out.println("Withdrawal amount greater than current balance. A $" + OVERDRAFT_FEES + " overdraft fee will be applied.");
            setBalance(newBalance);
            System.out.println("Your new balance is $" + newBalance);
            System.out.println("=======================================================");
        }

    }

    public void displayAccount() {
        // A method to display checking account details
        String checkingAccountFullname = getFirstName() + " " + getLastName();
        int accountID = getAccountID();
        double balance = getBalance();
        String summary = """
                              Account type: Checking account
                              Account holder's fullname: %s
                              Account ID: %d
                              Account balance: $%.2f 
                              Interest rate: %.2f %% """.formatted(checkingAccountFullname, accountID, balance, interestRate); 
        System.out.println(summary);
        System.out.println("=======================================================");
    }
}