package project0;

import java.util.*;

public class TextFileDummy implements ITextFile {
	
	public List<Customer> getCustomers(){
		return new LinkedList<Customer>();
	}
	
	public List<Account> getAccounts(){
		return new LinkedList<Account>();
	}
	
	public List<Employee> getEmployees(){
		return new LinkedList<Employee>();
	}
	
	public List<Admin> getAdmins(){
		return new LinkedList<Admin>();
	}
	public void writeToDisc(IDB i) {
		return;
	}
}
