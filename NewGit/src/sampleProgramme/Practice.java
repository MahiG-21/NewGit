package sampleProgramme;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Prime Number
		int num = 20, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		  //2)Palindrom
		  
		  StringBuffer sb= new StringBuffer("hello");
		System.out.println(  sb.reverse());
		
	String a = "mahima";
	String b="";
	for (int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	System.out.println(b);

	}

}
