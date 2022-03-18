package project0;

import java.util.*;

public interface ITextFile {

	public List<Account> getAccounts();
	public List<Admin> getAdmins();
	public List<Customer> getCustomers();
	public List<Employee> getEmployees();
	public void writeToDisc(IDB i);
	
}
