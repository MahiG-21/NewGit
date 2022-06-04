package sampleProgramme;

public class PrimeNumberUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //print the prime number between 1 to 50 using method 
		
			printPrimeBetween(10,20);
		
	}
	public static boolean isPrime(int n) {
		boolean isBoolean = true;
		for(int i =2;i<=n/2;i++)
			if(n% i ==0)
			return false;
		
		return true;
					
	}
	public static void printPrimeBetween(int start,int end) {
		for(int i=start ;i<=end;i++)
			if(isPrime(i))
				System.out.println(i + " ");
	}

}
