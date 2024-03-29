public class Main {

	private static String filename;

	public static void main(String args[]) {
		if (args.length > 0) {
			filename = args[0];
		} else {
			filename = "DefaultData.txt";
		}
		BankDB.setFilename(filename);
		try {
			IDB db = BankDB.getDB();
			MenuTree mt = new MenuTree();
			mt.menu("Splash");
			db.write();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
