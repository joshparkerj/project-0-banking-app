package project0;

import java.util.*;

public interface IDB {

	String serialize();
	List<Account> getAccounts();
	List<Employee> getEmployees();
	List<Admin> getAdmins();
	List<Customer> getCustomers();
	Account getAccountByNumber(String accountNumber);
	void deleteAccountByNumber(String accountNumber);
	
}
