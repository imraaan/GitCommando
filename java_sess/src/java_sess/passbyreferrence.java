package java_sess;

public class passbyreferrence {
	public static void main(String[] args) {
		User user = new User();
		
		
		System.out.println("Value of name before student modification:" + user.getName());
		System.out.println("Value of age before student modification:" + user.getAge());
		
		modifyUser(user);
		System.out.println("Value of name after User modification: " + user.getName());
		System.out.println("Value of age before student modification:" + user.getAge());
		
	}
	private static void modifyUser(User user) {
		user.setName("Imran");
		user.setAge("23");
	}
}
