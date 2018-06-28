import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class basicCourse {
	 static WebDriver driver=TatocBasic.driver;
	public static String basic_Course()
	  {
	     //   driver.findElement(By.linkText("basic course")).isDisplayed();	  
	        driver.findElement(By.linkText("Basic Course")).click();
	       return driver.getTitle();
	  }
	
}
