package project0;

public class CloseAccountMenu implements IMenu {

	private String accountNumber;
	private String confirmation;
	private IMenuTree mt;

	public CloseAccountMenu(IMenuTree mt) {
		this.mt = mt;
	}

	public void Run() {
		System.out.print("Please enter the account number:\n");
		this.accountNumber = System.console().readLine();
		System.out.print("You have entered the account number " + this.accountNumber
				+ "\nAre you sure you wish to close this account? Y/n");
		this.confirmation = System.console().readLine();
	}

	private void Execute() {
		switch (confirmation.toLowerCase()) {
		case "yes":
		case "y":
			this.closeAccount();
			mt.account();
			break;
		case "no":
		case "n":
			System.out.println("Account closure cancelled.");
			mt.account();
			break;
		default:
			System.out.println("Your input was not understood");
			mt.closeAccount();
		}

	}

	private void closeAccount() {
		try {
			IDB db = BankDB.getDB();
			Account a = db.getAccountByNumber(this.accountNumber);
			if (a != null) {
				db.deleteAccountByNumber(this.accountNumber);
				System.out.println("Account closed.");
			} else {
				System.out.println("Account not found.");
			}
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
