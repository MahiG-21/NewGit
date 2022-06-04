package sampleProgramme;

public class ConstructorTest {
   int count;
	ConstructorTest(){
		count++;
	}
	void init() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		ConstructorTest c1= new ConstructorTest();
		ConstructorTest c2= new ConstructorTest();
		ConstructorTest c3= new ConstructorTest();
		c1.init();
		c2.init();
		c3.init();
		
	}

}
