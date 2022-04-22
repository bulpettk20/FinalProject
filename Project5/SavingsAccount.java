
/**
 * This section of the code lets the user set up a savings account and handles any interest within the account.
 *
 * @author (Kerrin Bulpett)
 * @version (Project 5)
 */
public class SavingsAccount extends BankAccount
{
    protected double rate;
    
    public SavingsAccount (int account_number, double initial_balance, double interest_rate){
        super (account_number, initial_balance);
        rate = interest_rate;
    }
    public void add_interest(){
        balance += balance * rate;
        System.out.println("Interest on the account was " + account);
        System.out.println("As of now the new balance equals to " + balance);
        System.out.println();
    }
}

