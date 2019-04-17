package project0;

import java.util.*;

public class TextFileDummy implements ITextFile {
	
	public List<ISerializable> getCustomers(){
		return new LinkedList<ISerializable>();
	}
	
	public List<ISerializable> getAccounts(){
		return new LinkedList<ISerializable>();
	}
	
	public List<ISerializable> getEmployees(){
		return new LinkedList<ISerializable>();
	}
	
	public List<ISerializable> getAdmins(){
		return new LinkedList<ISerializable>();
	}
	public void writeToDisc(IDB i) {
		return;
	}
}
