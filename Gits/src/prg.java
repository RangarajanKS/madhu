import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listners.class)
public class prg
{
	 public static WebDriver driver;
	 @BeforeClass
	 public void setup() throws IOException, InterruptedException ,UnhandledAlertException
     {
       
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	           driver= new ChromeDriver();
	        Thread.sleep(2000);
	     }
	  @Test(    ) 	   
       public  void login() throws InterruptedException, IOException {
	        driver.navigate().to("http://toolsqa.com/automation-practice-form/"); 
	        Thread.sleep(2000);
	        Select listItem=new Select(driver.findElement(By.xpath("//*[@id='continents']")));
    for(Integer i=0;i<listItem.getOptions().size();i++)
    {
        listItem.selectByIndex(i);
        System.out.println(listItem.getFirstSelectedOption().getText()); //Just to make sure what is selected
        
        
    }
    System.out.println( "SUCCVESS"); //Just to make sure what is selected
    

}
	  }
 
