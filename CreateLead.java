package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(ById.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(ById.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(ById.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(ById.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(ById.id("createLeadForm_firstName")).sendKeys("Team");
		driver.findElement(ById.id("createLeadForm_lastName")).sendKeys("Spirit");
		driver.findElement(ById.name("generalProfTitle")).sendKeys("AccountsTeam");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();









	}

}
