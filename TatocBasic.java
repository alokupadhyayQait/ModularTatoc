import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TatocBasic {
  static WebElement element;
  static WebDriver driver;
  String mainWindow;
  String expectedURL;
  
  public static void systemProp() 
  {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Alok\\Downloads\\chromedriver_win32\\chromedriver.exe");
     driver= new ChromeDriver();
     driver.get("http://10.0.1.86//tatoc");
  }
  
 
}
