package project0;

import java.util.*;

public class BankDB implements IDB {

	private ITextFile t;
	private List<Account> accounts;
	private List<Customer> customers;
	private List<Employee> employees;
	private List<Admin> admins;
	private String s;
	private static BankDB uniqueInstance = null;
	private static String filename;
	
	public static void setFilename(String f) {
		filename = f;
	}
	
	public static BankDB getDB() throws Exception {
		if (uniqueInstance != null) return uniqueInstance;
		uniqueInstance = new BankDB();
		return uniqueInstance;
	}

	private BankDB() throws Exception {
		System.out.println("constructing db");
		this.t = new TextFile(filename);
		System.out.println("constructed textfile");
		this.accounts = t.getAccounts();
		this.customers = t.getCustomers();
		this.employees = t.getEmployees();
		this.admins = t.getAdmins();
	}

	public String serialize() {
		this.s = "";
		this.accounts.forEach(account -> {
			this.s += account.serialize();
		});
		this.customers.forEach(customer -> {
			this.s += customer.serialize();
		});
		this.employees.forEach(employee -> {
			this.s += employee.serialize();
		});
		this.admins.forEach(admin -> {
			this.s += admin.serialize();
		});
		return this.s;
	}
	
	public List<Account> getAccounts(){
		return this.accounts;
	}
	
	public List<Customer> getCustomers(){
		return this.customers;
	}
	
	public List<Admin> getAdmins(){
		return this.admins;
	}
	
	public List<Employee> getEmployees(){
		return this.employees;
	}
	
	public Account getAccountByNumber(String accountNumber) {
		for (Account a:this.accounts) {
			if (a.getAccountNumber() == accountNumber) {
				return a;
			}
		}
		return null;
	}
	
	public void deleteAccountByNumber(String accountNumber) {
		this.accounts.removeIf(a -> (a.getAccountNumber() == accountNumber));
	}
	
	public boolean customerOwnsAccount(String customerSSN, String accountNumber) {
		for (Account a:this.accounts) {
			if (a.getAccountNumber() == accountNumber && a.getOwnerSSN() == customerSSN) {
				return true;
			}
		}
		return false;
	}
	
	public void write() {
		t.writeToDisc(this);
	}
	
	public void addCustomer(Customer c) {
		this.customers.add(c);
	}
	
	public void addAdmin(Admin a) {
		this.admins.add(a);
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}

}
