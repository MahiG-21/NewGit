package polymorphism;

public class Static2 {
    static int i =50;
	public static void changeValue(int i) {
		i=10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i =100; //preference to local variable 
   changeValue(i);
    System.out.println(i);
	}

}
