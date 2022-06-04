package sampleProgramme;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
//Fibonacci nUmber means if number to find 4 so 
		// 1 ,1,2,3 ,5,8,13 //here 6th number is 8
		//if 6th numner 
		//1+1= 2
		//1+2=3
		//2+3=5
		//3+5=8
		//5+8=13 so we perform total n-2 step 
		
		System.out.print("Enter the number");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int result =0;
		int v1 =1;
		int v2=1;
		for(int i =0;i<n-2;i++) {
			result = v1+v2;
			v1=v2;
			v2=result;
		}
		System.out.println("result= " + (result == 0 ? 1 :result )); 
		
		
		
		
		
		
		
	}

}
