package Practice_java;

public  class Sum_of_arrya {

	 static public void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,};
		int sum=0;
		int lengthOfArray= arr.length;
		System.out.println("Length of Array="+lengthOfArray);
	
		for(int i=0;i<lengthOfArray;i++) {
			sum=sum+arr[i];
		}
           System.out.println("Addition of array="+sum);
	}

}
