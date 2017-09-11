import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class java_sample
{
 public static WebDriver driver;
		// TODO Auto-generated method stub
		@BeforeTest
		public void step1() throws AWTException
		{
			
 System.setProperty("webdriver.chrome.driver", "D:\\Keyword Driven Framework\\chromedriver.exe");
    driver = new ChromeDriver();
        
        Robot r= new Robot();
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_CONTROL);
        
        driver.get("http://cos.stfc.me/Scufcrm/csms.ui/login.aspx");
        driver.close();
		 
	     Set<String> handles = driver.getWindowHandles();
	     
	        System.out.println(handles);

	        // Pass a window handle to the other window

	        for (String handle1 : driver.getWindowHandles()) {

	        	System.out.println(handle1);

	        	driver.switchTo().window(handle1);
	        }
	        	}
	        @Test
			public void step2() throws InterruptedException
			{
       String title =  driver.getTitle(); 
       
       //String PageSource =  driver.getPageSource();
       String CurrentUrl =  driver.getCurrentUrl();
       
     //  driver.manage().window().maximize();
       String wh=driver.getWindowHandle();
        
       Set<String> wh1=driver.getWindowHandles();
       
       System.out.println("the title,pagesource,currenturl,wh,wh1"
       +title    +""+CurrentUrl +""+wh +""+wh1  );
       // navigation-windows
       driver.navigate().back();
       driver.navigate().forward();
       driver.navigate().to(CurrentUrl);
     driver.navigate().refresh();
     
     Thread.sleep(2000);
			}
		 
@Test
public void step3() throws InterruptedException
{
 	driver.findElement(By.id("txtusername")).sendKeys("rah");

 	driver.findElement(By.id("txtpassword")).sendKeys("welcome");

 		driver.findElement(By.id("btnSubmit")).click();
 	     
 	     Thread.sleep(2000);
 		driver.navigate().to("url");
 		
 		//actions

 		// driver.findElement(By.xpath("//*[@name='ctl00$MainContent$txtMobileNo']")).sendKeys("9791021463");
 		//*[@id="txtmobile"]
 	       driver.findElement(By.xpath("//*[@id='txtmobile']")).sendKeys("2222");
 	      // driver.findElement(By.xpath("//*[@id='txtmobile2']")).sendKeys("");
 	       
 		WebElement click = driver.findElement(By.id("btnLevel"));
 		Actions a = new Actions(driver);
 		
 		a.click(click).build().perform();
 		
        System.out.println("the element is clicked "+click +""+click.isSelected()  +" "+click.getText() );
        
//        
//        for( int i=1;i<4;i++)
//        {
//      List<WebElement> list1 =  driver.findElements(By.xpath("//*[@id='first']/td["+i+"] [text()='Live']"));
//      WebElement str = list1.get(i);
//      System.out.println("str is "+ str.getText());
//	  }
// 		for(int j =1;j<4;j++)
// 		{
// 			////*[@id="first"]/td[1]
// 			
// 		      List<WebElement> list2 =  driver.findElements(By.xpath(" //*[@id='first']/td["+j+"] "));
// 		     WebElement str2 = list2.get(j);
// 		    System.out.println("str2 is "+ str2.getText());
// 		}
	 
}
//      //*[text()='TeleCaller']
//        class Selenium extends Selenium_ip
//        {
//   
// 
//		@Override
//		public void TeleCaller() {
//			// TODO Auto-generated method stub
//			   
//	    	WebElement ch = driver.findElement(By.xpath("//*[text()='TeleCaller']"));
//	    	ch.click();
//	    	//txtrtpwd
//	    	
//
//	    	WebElement ch2 = driver.findElement(By.id("txtrtpwd"));
//		
//    	
//    	a.clickAndHold(ch). build().perform();
//    	
//        System.out.println("the element is clicked & holded "+ch +""+ch.isSelected()  +" "+ch.getText() );
//        
//		 
//        //
//        a.contextClick(ch).build().perform();
// 	
//       	
//        System.out.println("the element is rightclicked "+ch +""+ch.isSelected()  +" "+ch.getText() );
//        
//        a.sendKeys(Keys.ARROW_DOWN);
//        
//        a.sendKeys(Keys.ENTER);
//        
//        a.click(ch).build().perform();
//        
//        a.click(ch).moveToElement(ch2).click().build().perform();
//        
//      //*[contains(@title,'Enter MobileNo')]
//      //*[contains(@id,'txtmobile2')]
 
   
	 

 
}
 

 
