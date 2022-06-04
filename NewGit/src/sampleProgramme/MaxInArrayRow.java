package sampleProgramme;

public class MaxInArrayRow {

	public static void main(String[] args) {
		int [][]integers = {{1,2,3,6},
	             {7,4,5,6},
	              {5,7,8,9}
                          };
		
		for (int i=0;i<3;i++) {
			int max= integers[i][0];
			for(int j =1;j<4;j++) {
				max=(integers[i][j]>max) ? integers[i][j] : max;
			}       System.out.println(max);

			
		}		

	}

}
