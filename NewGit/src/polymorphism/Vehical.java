package polymorphism;

public class Vehical {
	
	int maxSpeed = 200;
   public static void drive() {
	   System.out.println("parent driver class");
	}
   public  void race() {
	   System.out.println("parent race class" + maxSpeed);
   }

}
