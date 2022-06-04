package sampleProgramme;

import java.util.Arrays;

public class ArrayToMethod {

	public static void main(String[] args) {
        int number[][]=getArray();
        printArray(number);
		
	}
	public static int[][] getArray() {
		return new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		
		
	}
	public static void printArray(int[][]numbers) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {//will print row wise 
				System.out.print(numbers[i][j]);
			//for(int j=0;j<numbers.length;j++) {// this will print column wise 
			//	System.out.print(numbers[j][i] + " "); //this will print column wise 

			}
			System.out.println();


		}
		System.out.println(Arrays.deepToString(numbers));

		
	}
	

}
