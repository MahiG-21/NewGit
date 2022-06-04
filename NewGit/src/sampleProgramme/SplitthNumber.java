package sampleProgramme;

import java.util.Scanner;

public class SplitthNumber {

	public static void main(String[] args) {
           System.out.println("Enter the number");
           Scanner s = new Scanner(System.in);
           
           int n = s.nextInt();
           int sum =0;
           while(n>0) {
        	   
        	   sum +=n%10;
        	   n/=10; //0
        	          	   
           }
           System.out.println("sum ==" +sum);
           
           
	}

}
