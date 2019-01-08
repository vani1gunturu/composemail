import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ComposeMail
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/libs/chromedriver");
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("vanigunturu1234@gmail.com");
        driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("dummy@123");
		driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.className("vO")).sendKeys("pavanigunturu536@gmail.com");
		driver.findElement(By.className("aoT")).sendKeys("hi vani..how are you");
		driver.findElement(By.id(":a2")).sendKeys("hello dear,this is my message through script");
		driver.findElement(By.id(":8n")).click();
		driver.findElement(By.xpath("//*[@class='gb_bb gbii']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
	public void close()
	{
		driver.close();
	}
}


