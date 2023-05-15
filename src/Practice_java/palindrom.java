package Practice_java;

public class palindrom {

	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int rev=0;
		int rem;
		
		
		while(no!=0) {
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(temp==rev) {
			System.out.println("No is Palindrome");
		}else {
			System.out.println("No is not Palindrom");
		}
	}  
	

}

