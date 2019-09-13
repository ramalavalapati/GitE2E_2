package LoginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	 WebDriver driver;
	 
	 @FindBy(id = "username")
	 WebElement userName;
	 @FindBy(id = "password")
	 WebElement password;
	 @FindBy(xpath = "//*[contains(@type, 'submit')]")
	 WebElement signin;
	 
	 //Code upload to GIT from GitE2E
	 //Good work
	 //Will wiat for further update
	 
	// public Stst2LoginCaseManager(Webdriver driver) {
	   public LoginPageObject(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }
	   
	   KeywordMethods kw = KeywordMethods(driver);
	   
	   public LoginPageObject clickSignIn() {
		   kw.
	   }
	 
	 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("PWRBA01CW");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("@Sep2018");

		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("PWRBA01CW");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("@Sep2018");

		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
}
