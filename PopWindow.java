import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PopWindow {
  static WebDriver driver=TatocBasic.driver;
  
  public static String popWindow()
  {
	  String mainWindow = driver.getWindowHandle();
	  driver.findElement(By.xpath("/html/body/div/div[2]/a[1]")).click();
	  Set<String> handles=driver.getWindowHandles();
	  String secWindow=null;
	  Iterator<String> iterator=handles.iterator();
	  while(iterator.hasNext())
	  {
		  secWindow=iterator.next();
	  }
	  driver.switchTo().window(secWindow);
	  driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("alok");
	  driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	  driver.switchTo().window(mainWindow);
	  driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();
	  return driver.getCurrentUrl();        
	  
	  
	  
	  
  }
}
