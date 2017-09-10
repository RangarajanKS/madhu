import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	        WebDriver  driver= new ChromeDriver();
	        Thread.sleep(2000);
	        driver.navigate().to("http://toolsqa.com/automation-practice-form/"); 
	        Thread.sleep(2000);
	        Select listItem=new Select(driver.findElement(By.xpath("//*[@id='continents']")));
    for(Integer i=0;i<listItem.getOptions().size();i++)
    {
        listItem.selectByIndex(i);
        System.out.println(listItem.getFirstSelectedOption().getText()); //Just to make sure what is selected
    }
 
//	   /https://github.com/RangarajanKS/KSR.git
	}

}

 
