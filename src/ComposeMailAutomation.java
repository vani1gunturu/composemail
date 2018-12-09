import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComposeMailAutomation {
	public static void main(String[] args) throws InterruptedException {
		//setting the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/vani/selenium components/chromedriver_linux64/chromedriver");
		//launch the chrome browser
        ChromeDriver driver=new ChromeDriver();
		//maximize the chrome
        driver.manage().window().maximize();
		//applying implicit wait to load the elements in the web page
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//enter the url
        driver.get("https://www.gmail.com");
		//enter the email into email field
        driver.findElement(By.id("identifierId")).sendKeys("xxxxxxx@gmail.com");
		//click on Next button
        driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		//enter the password into password field
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("xxxxxx");
		//click on Next button
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
	    Thread.sleep(5000);
	    //clicking on compose
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		//enter the To address
		driver.findElement(By.className("vO")).sendKeys("xxxxxxx@gmail.com");
		//enter the subject
		driver.findElement(By.className("aoT")).sendKeys("hi vani..how are you");
		//enter the body of the message
		driver.findElement(By.id(":p3")).sendKeys("hello dear..this is my message through script");
		//click on send
		driver.findElement(By.id(":no")).click();
		//click on signout logo
		driver.findElement(By.xpath("//*[@class='gb_bb gbii']")).click();
		//click on signout
		driver.findElement(By.linkText("Sign out")).click();
	 }
}


