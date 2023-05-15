package Practice_java;

public class swapping_Of_two_no {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 
		 // without using 3rd variable
		 
		/* a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a="+a);
		 System.out.println("b="+b); */
		 
		 //with using 3rd variable
		 int temp=a;
		 a=b;
		 b=temp;
		 System.out.println("a="+a);
		 System.out.println("b="+b);

	}

}
