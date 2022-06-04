package sampleProgramme;

public class FindUniqeNumber {

	public static void main(String[] args) {
		int [] arr = {1,1,1,5,3,7,7,8,8,9};
		int n=1;
	int i=	getUniqueNumber(arr,n);
	System.out.println(i);
	}
	public static int getUniqueNumber(int[]numbers,int num) {
		int count = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==num) {
				count++;
			}
		}
		return count;
			
	}

}
