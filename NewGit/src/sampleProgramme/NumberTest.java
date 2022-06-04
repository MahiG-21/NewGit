package sampleProgramme;

public class NumberTest {

	public static void main(String[] args) {
		//print the number divisable by 3 or 5 from 1 to 20 
		
		for(int i =1;i<=20;i++) {
			if (i % 5==0) {
				System.out.println(i);
			}else if(i%3==0) {
				System.out.println(i);
			}
		}
		
	}

}
