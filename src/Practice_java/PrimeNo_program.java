package Practice_java;

import java.util.Scanner;

public class PrimeNo_program {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no here");
		int no=scn.nextInt();
		
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("no is prime");
		}else {
			System.out.println("No is not prime");
		}
	}
}
