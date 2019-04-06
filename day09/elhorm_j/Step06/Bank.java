public class Bank {
    private static List <Account> accounts = new ArrayList<Account>();

    public static boolean addAccount(Account account) {
	if (accounts.contains(account))
	    return false;
	accounts.add(account);
	return true;
    }

    public static void fillBalanceForAccount(String accountId, int amount) {
	
    }

    
}
