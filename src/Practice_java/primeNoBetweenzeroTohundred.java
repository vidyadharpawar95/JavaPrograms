package Practice_java;

public class primeNoBetweenzeroTohundred {

	public static void main(String[] args) {
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		
		for(int i=1;i<=100;i++)
		{
			int temp=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		
		}
	}

}
