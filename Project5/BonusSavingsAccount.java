
/**
 * This section of the code handles any extra or "bonus" accounts that the user might want to make within the system. It also handles any penalties given from the banks and takes into consideration any withdrawals happening within the account.
 *
 * @author (Kerrin Bulpett)
 * @version (Project 5)
 */
public class BonusSavingsAccount extends SavingsAccount
{
    private final int penalty = 35;
    private final double bonusRate = 0.06;
    
    public BonusSavingsAccount (int account_number, double initial_balance, double interest_rate){
        super (account_number, initial_balance, interest_rate);
    }
    
    public boolean withdrawals (double amount){
        System.out.println("The penalty on account is " + penalty);
        return super.withdrawals (amount + penalty);
    }
    
    public void add_interest(){
        balance += balance * (rate + bonusRate);
        System.out.println("Interest on the account was " + account);
        System.out.println("As of now the new balance is equal to " + balance);
        System.out.println();
    }
}
