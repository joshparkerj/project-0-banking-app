package project0;

import java.util.*;

public class BankDB implements IDB {

	private ITextFile t;
	private List<ISerializable> accounts;
	private List<ISerializable> customers;
	private List<ISerializable> employees;
	private List<ISerializable> admins;
	private String s;
	private static BankDB uniqueInstance;
	private static boolean instantiated = false;
	private static String filename;
	
	public static void setFilename(String f) {
		filename = f;
	}
	
	public static BankDB getDB() throws Exception {
		if (instantiated) return uniqueInstance;
		uniqueInstance = new BankDB();
		instantiated = true;
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

}
