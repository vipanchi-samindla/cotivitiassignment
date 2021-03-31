package seleniumex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtestcase1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Current URL:" + url);
		String pagetitle=driver.getTitle();
		if("Facebook – log in or sign up".equals(pagetitle)) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sandyaindra143@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("indra1");
		driver.findElement(By.xpath("//*[@id='u_0_d_wg']")).click();
		
	}

}
