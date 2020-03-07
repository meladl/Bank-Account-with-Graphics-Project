


// By Mohamed Eladl
// Assignment 1 
// Sub-Class

public class BankAccount {
    public BankAccount(int anAccountNumber){
       accountNumber = anAccountNumber;
        balance = 0;       
    }
    public BankAccount(int anAccountNumber, double intialbalance){
       accountNumber = anAccountNumber;
        balance = intialbalance;
    } 
    public int getAccountNumber(){
      return accountNumber;
    }
    
    public void deposit(double amount){
        if (amount < 0)
            System.out.println("Please Enter Correct Amount !");
        else{
        double newbalance = balance + amount;
                balance = newbalance;
        System.out.println("A " + "$" + amount + " is successfully deposited to your account.");
        }
    }
    public void withdraw(double amount){
        if (amount < 0)
            System.out.println("Please Enter Correct Amount !");
        else{
        double newbalance = balance - amount;
        if (newbalance < 0)
            System.out.println("Insuffient Balance for the Withdrawal of " + "$" + amount);
        else{
            balance=newbalance; 
        System.out.println("A " + "$"+ amount + " is successfully withdrawn from your account.");
        }
    }
    }
    public double getBalance(){
        return balance;           
    }
    
    private double balance;
    private int accountNumber;
}
   


