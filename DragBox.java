import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragBox {
  static WebDriver driver=TatocBasic.driver;
  
  public static String dragBox()
  {
	  WebElement elementS=driver.findElement(By.id("dragbox"));
	  WebElement elementT=driver.findElement(By.id("dropbox"));
	  (new Actions(driver)).dragAndDrop(elementS,elementT).perform();
	  driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	
	  
	  return driver.getCurrentUrl();
	  
	  
	  
	  
	  
  }
  
}
