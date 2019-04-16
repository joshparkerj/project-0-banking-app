package project0;

import java.util.*;

public interface ITextFile {

	public List<ISerializable> getAccounts();
	public List<ISerializable> getAdmins();
	public List<ISerializable> getCustomers();
	public List<ISerializable> getEmployees();
	public void writeToDisc(IDB i);
	
}
