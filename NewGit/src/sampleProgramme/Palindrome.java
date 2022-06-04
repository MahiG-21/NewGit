package sampleProgramme;

public class Palindrome {

	public static void main(String[] args) {
     //Palindrome String 
		String str= "abc";
		boolean isPalindrome = true;
		for(int i=0 ,j=str.length()-1 ;i<j;i++ ,j--) {
			//initiling 2 i and j togetheror 
			//int j = str.length()-1 
			//		j--
			
			if(str.charAt(i)==str.charAt(j))
				continue;
				
				isPalindrome = false ;
			   break;
		}System.out.println(isPalindrome ?  "PAlindrome " : "not palindrome");

}}
