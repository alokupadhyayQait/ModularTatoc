import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CookieHandle {
 static WebDriver driver=TatocBasic.driver;
 
 public static String cookieHandle()
 {
	 driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
     String tokenVal=driver.findElement(By.xpath("//*[@id=\"token\"]")).getText();
	 tokenVal=tokenVal.substring(7);
	 Cookie ck = new Cookie("Token", tokenVal);
	    driver.manage().addCookie(ck);
	    driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();
	    return driver.getCurrentUrl();
	 
 }
}
