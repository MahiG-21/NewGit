package sampleProgramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquenUmber {

	public static void main(String[] args) { 
		int []abc = {1,1,2,3,4,2,2,3};
		
	/*List<Integer> a= Arrays.asList(1,1,2,3,4,2,2,3);
	a.stream().distinct().forEach(s->System.out.println(s));*/
		for(int i=0;i<abc.length;i++) {
			boolean isLoobean = false;

			for(int j=0;j<i;j++) {
				if((abc[i]==abc[j])) { //find the unique number 
					isLoobean= true;
					break;
					}
			} 
			if(!isLoobean) {
				System.out.println(abc[i]);
			}

		}
		
		
		
		
		
		
	}

}
