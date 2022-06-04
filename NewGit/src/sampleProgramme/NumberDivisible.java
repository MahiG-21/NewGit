package sampleProgramme;

import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		System.out.println("Enter the numbre ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        for(int i=1;i<=n/2;i++) {
       	 if(n%i ==0) {
       		System.out.println(sum +=i);
       	 }

        }
		// System.out.println(sum);

       

	}}
