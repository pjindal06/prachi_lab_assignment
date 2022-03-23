package e;

public class q5 {
	public static void main(String[] args) {

		userRegistration registration=new userRegistration();
		
		try {
			registration.registerUser("prachi", "india");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
