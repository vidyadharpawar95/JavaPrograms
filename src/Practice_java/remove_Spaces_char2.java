package Practice_java;

public class remove_Spaces_char2 {

	public static void main(String[] args) {
		String str= "pa ss i on ate";
		String plainText= str.replaceAll("\\s", "");
		System.out.println(plainText);

	}

}
