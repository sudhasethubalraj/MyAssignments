package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
     ChromeDriver driver = new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/");
     driver.manage().window().maximize();
     driver.findElement(ById.id("username")).sendKeys("DemoSalesManager");
     driver.findElement(ById.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(ById.id("label")).click();
 	driver.findElement(By.linkText("Accounts")).click();
 	driver.findElement(By.linkText("Create Account")).click();
 	driver.findElement(ById.id("accountName")).sendKeys("sudhaacc");
 	driver.findElement(ById.name("description")).sendKeys("Selenium Automation Tester");
 	driver.findElement(ById.id("numberEmployees")).sendKeys("100");
 	driver.findElement(ById.id("officeSiteName")).sendKeys("LeafTaps");
 	driver.findElement(By.className("smallSubmit")).click();
 	driver.close();
 	
 	
 	
 	
     //driver.findElement(ById.className("Account Name")).sendKeys("myaccount");
     
	}

}


//DemoSalesManager
//crmsfa