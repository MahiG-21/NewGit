package sampleProgramme;

public class ColumnAddRowAdd {

	public static void main(String[] args) {
		int [][]integers = {{1,2,3},
	             {4,5,6},
	              {7,8,9}
                          };

        for(int i=0;i<integers.length;i++) {
        	int sum =0;
        	for(int j=0;j<integers.length;j++) {
        		sum +=integers[j][i];
        	}
        	System.out.println(sum);
        }
        
        }
	}


