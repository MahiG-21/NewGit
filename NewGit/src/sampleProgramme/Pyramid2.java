package sampleProgramme;

import java.awt.Point;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
         
        int n =5;
        for(int i=1;i<=n;i++) {
        	
        	for(int j=1;j<=n-i;j++) 
        		
        		System.out.print(" ");
        		
        		for(int k=1;k<=2*i-1;k++)  //instes of i we can write 2*i-1 also 
        			
        			if (i==n)
              System.out.print("*");
        			else
        				if(k == 1 || k==2*i-1)
        				System.out.print("*");
        				else
        					System.out.print(" ");
        		
        		
        		System.out.println();
        }	
        	
	}
}
           
        	
	

