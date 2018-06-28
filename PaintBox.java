import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PaintBox {
  static WebDriver driver=TatocBasic.driver;
  
  public static String paintBox()
  {
	  
	 driver.switchTo().frame("main");
	 String box1=driver.findElement(By.id("answer")).getAttribute("class");
	 
	 while(true) {
		 driver.findElement(By.xpath("/html/body/center/a[1]")).click();
		 driver.switchTo().frame("child");
		 String box2=driver.findElement(By.id("answer")).getAttribute("class");
		 driver.switchTo().parentFrame();
		 //driver.switchTo().frame("main");
		 if(box1.equals(box2))
		 {
			 driver.findElement(By.xpath("/html/body/center/a[2]")).click();
			// 
			 break;
			 }
		 
	 }
	 
	 return driver.getCurrentUrl();
  }
}
