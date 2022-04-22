
/**
 * The BankAccount sets up all of the sub accounts with the routing numbers. Also allows the ability for withdrawals and deposits.
 *
 * @author (Kerrin Bulpett)
 * @version (Project 5)
 */
public class BankAccount
{
    protected int account;
    protected double balance;
    
    public BankAccount(int account_number, double initial_balance){
        account = account_number;
        balance = initial_balance;
    }
    
    public void deposit (double amount){
        balance += amount;
        System.out.println("The deposit in the account is " + account);
        System.out.println("The amount is " + amount);
        System.out.println("As of now the new balance equals to " + balance);
        System.out.println();
    }
    
    public boolean withdrawals (double amount){
        boolean results = false;
        System.out.println("The withdrawal from the account was " + account);
        System.out.println("The amount on the account is " + amount);
        
        if (amount > balance){
            System.out.println("Unsuccessful withdrawal.");
        } else {
            balance -= amount;
            System.out.println("As of now the new balance equals to " + balance);
            results = true;
        }
        System.out.println();
        return results;
    }
}
