package Practice_java;

public class char_Occurance_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="I am passionate";
           char ch='s';
           int n=0;
           for(int i=0;i<str.length();i++) {
        	   if(str.charAt(i)==ch) {
        		   n++;
        	   }
           }
           System.out.println("The charecter "+ch+" appears "+n+" times");
	}

}
