package polymorphism2;

public class Child extends Parent  {
	public void printMsg() {
		System.out.println("i am child class");
	}
 public static void main(String[] args) {
	// Child c = (Child)new (Parent); //Parent class cant access child class so it will give you the compilelation error 
	 //c.printMsg();/and we cannot cast parent to child class child to parent is possible 
 }
}
