package sampleProgramme;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("How many Elements ? (Max 20)");
          int n = input.nextInt();
      while(n> 20 || n<=0) {
    	  System.out.println("Invalid number try again ");
    	  n= input.nextInt();
    	  System.out.println("hello");
      }
      int []numbers = new int[n];
      printArrayOfInteger(numbers);
      fillArrayOfInteger(numbers);
      
          
	}
	public static void fillArrayOfInteger(int[]numbers) {
		Scanner input = new Scanner(System.in);
		for(int i =0;i<numbers.length;i++)
			numbers[i]= input.nextInt();
	}
	public static void printArrayOfInteger(int []numbers) {
		System.out.print("The Elements are");
		System.out.println(Arrays.toString(numbers));
	}

}
