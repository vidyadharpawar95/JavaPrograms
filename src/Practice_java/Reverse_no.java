 package Practice_java;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int no=sc.nextInt();
		 int no=5432; 
		 int rev=0;
		 int rem;
		 while(no!=0) {
			 rem=no%10;   //5432%10=2
			 rev=(rev*10)+rem; // (0*10)+2= 2
			 no=no/10; // 5432/10= 543
		 }
           System.out.println(rev);
	}

}
