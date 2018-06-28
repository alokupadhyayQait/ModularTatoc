import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GreenBox {
 static WebDriver driver=TatocBasic.driver;
   public static String greenBox()
   {
	   driver.findElement(By.className("greenbox")).click();
	   return driver.getCurrentUrl();
   }
}
