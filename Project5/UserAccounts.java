
/**
 * The main program. This section of the program creates the multiple accounts within the one bank account and performs various actions within.
 *
 * @author (Kerrin Bulpett)
 * @version (Project 5)
 */
public class UserAccounts
{
    public static void main (String[] args) {
        SavingsAccount savings = new SavingsAccount ( 2043, 1270.00, 0.03);
        BonusSavingsAccount bonusSavings = new BonusSavingsAccount (27889, 1230.00, 0.03);
        CheckingAccount checking = new CheckingAccount (620, 452.58, savings);
        
        savings.deposit (35.00);
        bonusSavings.deposit (35.00);
        
        savings.withdrawals (45.00);
        bonusSavings.withdrawals (5.00);
        checking.withdrawals (45.00);
    }
}
