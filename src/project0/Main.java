package project0;

import java.util.*;

public class Main {
	
	private static String filename;

	public static void main(String args[]) {
		if (args.length > 0) {
			filename = args[0];
		} else {
			filename = "DefaultData.txt";
		}
		BankDB.setFilename(filename);
		IDB db = BankDB.getDB();
		String[] s = db.serialize().split("\t");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.print(db.serialize());
	}
}
