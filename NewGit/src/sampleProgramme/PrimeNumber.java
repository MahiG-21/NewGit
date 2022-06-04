package sampleProgramme;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        /*System.out.println("Enter the numbre ");
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int sum =1;
         for(int i=2;i<=n/2;i++) {
        	 if(n % i == 0) {
        		 sum +=i;
        		       	 }        		
         }
    	 System.out.println(sum ==1 ? "Prime"  : "not prime ");
*/
		// ns soluton 
    	 
		/*System.out.println("Enter the number");
	   Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         boolean isPrime = true;
	   for(int i =2;i<n/2;i++) {
		   if(n % i ==0)
			   isPrime= false;
		   break;
	   }
		
	   System.out.println(isPrime ? "prime" : "not prime");
*/	   
	   int p= 10;
	   boolean is= true;
	   for(int i=2;i<=p/2;i++) {
		   if(p%i==0) {
			   is=false;
			   break;
		   }
	   }System.out.println(is ? "prime" : "not prime");
	   
	   
    	 
	}

}
