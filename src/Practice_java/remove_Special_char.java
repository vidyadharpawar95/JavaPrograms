package Practice_java;

public class remove_Special_char {

	public static void main(String[] args) {
		String str= "p#a$s5s_io&nate+=";
		String plainText= str.replaceAll("[^a-z A-Z]", "");
		System.out.println(plainText);

	}

}
