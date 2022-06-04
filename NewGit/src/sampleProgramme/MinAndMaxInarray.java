package sampleProgramme;

public class MinAndMaxInarray {

	public static void main(String[] args) { 
		
		int arr[]= {1,1,7,4,6,8,9};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			max=(arr[i]>max ) ? arr[i] : max;
			min=(arr[i]<min) ? arr[i] :min;
			
		}
		System.out.println("max is " + max + "min is" + min);
			
	}
	
	public static void MinMax(int arr[]) {
		int min =arr[0];
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
            for(int j=1;j<i+1;j++) {
            	if(min<arr[j]) {
            		
            	}
            	
            }
    
		
	}
	System.out.println(min);

}}
