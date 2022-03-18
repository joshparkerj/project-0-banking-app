import java.util.*;

public interface IDB {

	String serialize();
	List<Account> getAccounts();
	List<Employee> getEmployees();
	List<Admin> getAdmins();
	List<Customer> getCustomers();
	Account getAccountByNumber(String accountNumber);
	void deleteAccountByNumber(String accountNumber);
	boolean customerOwnsAccount(String customerSSN, String accountNumber);
	void write();
	
}
