package project0;

import java.util.*;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFile implements ITextFile {
	
	private String filename;
	private Path filepath;
	private BufferedReader br;
	private File file;
	private List<Account> accounts;
	private List<Admin> admins;
	private List<Customer> customers;
	private List<Employee> employees;
	
	public TextFile(String filename) throws Exception {
		this.admins = new LinkedList<Admin>();
		this.accounts = new LinkedList<Account>();
		this.customers = new LinkedList<Customer>();
		this.employees = new LinkedList<Employee>();
		this.filename = "./" + filename;
		this.filepath = Paths.get(this.filename);
		this.file = new File(this.filename);
		this.br = new BufferedReader(new FileReader(this.file));
		String st;
		while ((st = br.readLine()) != null) {
			if (st.startsWith("admin")) {
				this.admins.add(new Admin(st));
			} else if (st.startsWith("employee")) {
				this.employees.add(new Employee(st));
			} else if (st.startsWith("customer")) {
				this.customers.add(new Customer(st));				
			} else if (st.startsWith("account")) {
				this.accounts.add(new Account(st));
			}
		}
	}
	
	public List<Account> getAccounts(){
		return this.accounts;
	}
	
	public List<Admin> getAdmins(){
		return this.admins;
	}
	
	public List<Customer> getCustomers(){
		return this.customers;
	}
	
	public List<Employee> getEmployees(){
		return this.employees;
	}
	
	public void writeToDisc(IDB i) {
		try (BufferedWriter w = Files.newBufferedWriter(this.filepath, Charset.forName("US-ASCII"))){
			String s = i.serialize();
			w.write(s,0,s.length());
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}

}
