package ListMaven.List;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ListWebtableSort {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
	//SoftAssert a = new SoftAssert();
  driver.findElement(By.xpath("//tr/th[1]")).click();
  List<WebElement>elementList=driver.findElements(By.xpath("//tr/td[1]"));
  List<String>orignalList= elementList.stream().map(s->s.getText()).collect(Collectors.toList());
  
  List<String> sortedList=orignalList.stream().sorted().collect(Collectors.toList());
  //Assert.assertTrue(orignalList.equals(sortedList));
  List<Object>  price;
  do { 
	  List<WebElement>elementLists=driver.findElements(By.xpath("//tr/td[1]"));

	  
	price= elementLists.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());

  
     price.forEach(a->System.out.println(a));
     if(price.size()<1) {
    	 driver.findElement(By.cssSelector("[aria-label='Next']")).click();

     }}
  while(price.size()<1);
    	 
 
     
	 
     
	}

	private static Object getVeggiePrice(WebElement s) {
	String priceValue=	s.findElement(By.xpath("following-sibling::td[1]")).getText(); 
		return priceValue;
	}

}
