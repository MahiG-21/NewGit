package polymorphism;

public class Car extends Vehical {
 int maxSpeed = 100;
 public static void drive() {
	 System.out.println("child class");// static member s cant override bcz they wont blongs to any calss 
 }
 public void race() {
	 System.out.println("child clas"+ maxSpeed);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v = new Car();
		drive();
		v.race();                         /*   Static
                                  Private 
                                Final
                                          and Variables we can not override in Java         */
		System.out.println(v.maxSpeed);
	} 

}
