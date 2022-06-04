package sampleProgramme;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
System.out.println("Enter the nimber ");
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int max =n;
int min =n;

while(true) {
 n=s.nextInt();

 
 
 if(n<0)
	 break;
 if(n>max)
	 max=n;
 if(n<min)
	 min=n;
	 
}
System.out.println("max=" + max + "min = " +min) ;

	}

}
