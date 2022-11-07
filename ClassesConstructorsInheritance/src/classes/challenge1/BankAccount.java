package classes.challenge1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(){  // if we want to create an object with default fields
        this("56789", 2.50, "Default name", "Default address",
         "Default phone");
    }

    
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmailAddress,
            String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }



    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }else{
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+ " processed. Remaining balance = "+this.balance);
        }


    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return balance;
    }
    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    
}