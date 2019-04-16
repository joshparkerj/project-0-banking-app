package project0;

import java.util.*;
import java.io.*;

public class TextFile implements ITextFile {
	
	public TextFile(String filename) {
		this.admins = new LinkedList<ISerializable>();
		this.accounts = new LinkedList<ISerializable>();
		this.customers = new LinkedList<ISerializable>();
		this.employees = new LinkedList<ISerializable>();
		this.filename = "./" + filename;
		this.file = new File(this.filename);
		try {
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
		} catch(FileNotFoundException e) {
			System.out.println("dead on open file");
			System.out.print(e);
		} catch(IOException e) {
			System.out.println("dead on read line");
		} catch(Exception e) {
			System.out.println("dead but where");
			System.out.print(e);
		}
		System.out.println("end of text file contructor");

	}

	private String filename;
	private BufferedReader br;
	private File file;
	private List<ISerializable> accounts;
	private List<ISerializable> admins;
	private List<ISerializable> customers;
	private List<ISerializable> employees;
	
	public List<ISerializable> getAccounts(){
		return this.accounts;
	}
	
	public List<ISerializable> getAdmins(){
		return this.admins;
	}
	
	public List<ISerializable> getCustomers(){
		return this.customers;
	}
	
	public List<ISerializable> getEmployees(){
		return this.employees;
	}
	
	public void writeToDisc(IDB i) {
		i.serialize();
	}
}
