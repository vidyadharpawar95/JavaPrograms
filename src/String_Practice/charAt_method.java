package String_Practice;

public class charAt_method {

	public static void main(String[] args) {
		String firstName="Tonny";
		String lastName="Stark";
		String fullName= firstName +" "+lastName;

		System.out.println(fullName);
		for(int i=0;i<fullName.length();i++) {
			System.out.println(fullName.charAt(i));
		} 
	}

}
