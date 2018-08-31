package capgemini.Day2.java;

public class LoginValidation {
	
	public static boolean checkUserIdAndPassword(String user, String password) {
		String[] users= {"kavya","mahanvi","lahari"};
		String[] passwords= {"111","222","333"};
		int i;
		for ( i=0;i<users.length;i++)
		{
		if (users[i].equals(user) && passwords[i].equals(password)) 
			{
				return true;
			}
		}
	return false;
	}
	
}
