package Practice_java;

public class reverse_string_withPalindrom2 {

	public static void main(String[] args) {
		String str= "passionate";
		String rev= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
	}

}
