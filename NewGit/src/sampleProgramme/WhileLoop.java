package sampleProgramme;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	
		int sum =0;
		while(sum<=100) {//while(true) {
			System.out.print("Enter the number ");
			sum +=s.nextInt();
			
			}
		System.out.println("done");
	

}
}