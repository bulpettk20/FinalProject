
/**
 * This section of the code sets up the checking account and handles the writing of the withdrawals. 
 *
 * @author (Kerrin Bulpett)
 * @version (Project 5)
 */
public class CheckingAccount extends BankAccount
{
    private SavingsAccount bankruptcy;
    
    public CheckingAccount (int account_number, double initial_balance, SavingsAccount protection){
        super (account_number, initial_balance);
        bankruptcy = protection;
    }
    
    public boolean withdrawls (double amount){
        boolean results = false;
        
        if (! super.withdrawals(amount)){
            System.out.println("Using bankruptcy.");
            if (! bankruptcy.withdrawals (amount-balance)){
                System.out.println("Unsuccessful bankruptcy");
            }
        } else {
            balance = 0;
            System.out.println("As of now the new balance equals " + account + "." + balance);
            results = true;
        }
        System.out.println();
        return results;
    }
}
