public class UserSession {
	
	private static UserSession uniqueSession = null;
	private static String staticType;
	private static String staticID;
	
	private String userType;
	private String userID;
	
	public static void setInfo(String t, String i) {
		staticType = t;
		staticID = i;
	}
	
	public static UserSession getSession() {
		if (uniqueSession != null) return uniqueSession;
		uniqueSession = new UserSession(staticType, staticID);
		return uniqueSession;
	}
	
	public static void endSession() {
		uniqueSession = null;
	}
	
	private UserSession(String t, String i) {
		this.userType = t;
		this.userID = i;
	}
	
	public String getID() {
		return this.userID;
	}

}
