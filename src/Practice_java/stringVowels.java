package Practice_java;

public class stringVowels {

	public static void main(String[] args) {
		String str="passionate";
		char ar[]= {'a','e','i','o','u'};
         int vowel=0;

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
               str.charAt(i);
               vowel++;
			}
		}
	System.out.println(vowel);
	}

}
