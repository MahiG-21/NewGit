package sampleProgramme;

import java.util.Scanner;

public class SrtingSpace {

	public static void main(String[] args) {
   System.out.println("enter the String");
   Scanner s = new Scanner(System.in);
      String sub = s.nextLine();
      
      for(int i = 0;i<sub.length();i++) {
    	System.out.print( sub.charAt(i)+ " ");
      }
   
   
   
	}

}
