package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class DilipOakAcademy {
		
		// TODO Auto-generated method stub
		public void login() throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(" https://dev-cbt.dilipoakacademy.com/#/login\r\n");
			WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
			WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
			WebElement login=driver.findElement(By.xpath("//button[@class=\"mat-raised-button primary mat-primary\"]"));
			username.sendKeys("4444444444");
			password.sendKeys("password");
			login.click();
			
	
			WebElement qbank = driver.findElement(By.xpath("//div[@id=\"iroSideBar\"]/child::ul/child::li[3]"));
			qbank.click();
			WebElement addquestion = driver.findElement(By.xpath("//button[@class=\"mat-raised-button primary fill mat-primary\"]/span[@class=\"mat-button-wrapper\"]"));
			addquestion.click();
			WebElement reference_id=driver.findElement(By.xpath("//input[1]"));
			reference_id.sendKeys("12345");
			//select Level
			WebElement leveldropdown =driver.findElement(By.className("mat-select-value"));
			leveldropdown.click();
			WebElement levels = driver.findElement(By.xpath("//div[@class=\"mat-select-content ng-trigger ng-trigger-fadeInContent\"]/child::mat-option[2]"));
			levels.click();
			//Select Question for
			WebElement Question =driver.findElement(By.xpath("//span[@class=\"mat-select-placeholder ng-tns-c27-10 ng-star-inserted\"]"));
			Question.click();
			WebElement questions = driver.findElement(By.xpath("//mat-option[@id=\"mat-option-10\"]"));
			questions.click();
			//select section
			WebElement Section=driver.findElement(By.xpath("//mat-select[@id=\"mat-select-3\"]"));
			Section.click();
			WebElement section= driver.findElement(By.xpath("//mat-option[@id=\"mat-option-14\"]"));
			section.click();
			//Select category
			WebElement Category=driver.findElement(By.xpath("//mat-select[@id=\"mat-select-4\"]"));
			Category.click();
			WebElement category= driver.findElement(By.xpath("//mat-option[@id=\"mat-option-17\"]"));
			category.click();
			//Select tag
			WebElement Tag=driver.findElement(By.id("mat-select-7"));
			Tag.click();
			WebElement tag= driver.findElement(By.xpath("//mat-option[@id=\"mat-option-20\"]"));
			tag.click();
			WebElement tags= driver.findElement(By.xpath("//mat-option[@id=\"mat-option-21\"]"));
			tags.click();
			Thread.sleep(0);
			WebElement Next= driver.findElement(By.xpath("//app-iro-button[@title=\"Next\"]"));
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			ex.executeScript("arguments[0].click();",Next );
			
			
			//Radio button choose upload image option
			WebElement upimage = driver.findElement(By.xpath("//input[@id=\"mat-radio-3-input\"]"));
			ex.executeScript("arguments[0].click();",upimage );
			
			//Upload image for Question.
			Actions act=new Actions(driver);
			WebElement upload = driver.findElement(By.xpath("//app-iro-button[@title=\"Upload Image\"]"));
			act.moveToElement(upload).perform();
			ex.executeScript("arguments[0].click();",upload );
			Thread.sleep(1000);
			 //put path to your image in a clipboard
		     StringSelection ss = new StringSelection("C:\\Users\\Rasika\\Downloads\\Quantitative");
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		     //imitate mouse events like ENTER, CTRL+C, CTRL+V
		     Robot robot = new Robot();
		     robot.delay(250);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     Thread.sleep(2000);
			WebElement ok = driver.findElement(By.xpath("//app-iro-button[@title=\"OK\"]"));
			ex.executeScript("arguments[0].click();",ok);
			
			//select option A
			WebElement optionA = driver.findElement(By.xpath("//mat-select[@class=\"mat-select ng-tns-c27-22 ng-untouched ng-pristine ng-valid ng-star-inserted\"]"));
			ex.executeScript("arguments[0].click();",optionA);
			WebElement A_type = driver.findElement(By.xpath("//mat-option[@id=\"mat-option-72\"]"));
			ex.executeScript("arguments[0].click();",A_type);
			Thread.sleep(2000);
			WebElement A_img = driver.findElement(By.xpath("//div[@class=\"pointer question-options-upload-image\"]/child::p"));
			A_img.click();
			Thread.sleep(2000);
			 	  StringSelection AA = new StringSelection("C:\\Users\\Rasika\\Desktop\\cycle");
			     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(AA, null);
			     robot.delay(250);
			     robot.keyPress(KeyEvent.VK_ENTER);
			     robot.keyRelease(KeyEvent.VK_ENTER);
			     robot.keyPress(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_V);
			     robot.keyRelease(KeyEvent.VK_V);
			     robot.keyRelease(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_ENTER);
			     robot.delay(90);
			     robot.keyRelease(KeyEvent.VK_ENTER);
			     Thread.sleep(2000);
			     WebElement Ok = driver.findElement(By.xpath("//app-iro-button[@title=\"OK\"]"));
				 Ok.click();
				 
				 //option B
				 WebElement optionB = driver.findElement(By.id("mat-input-4"));
				 optionB.sendKeys("XYZ");
				 WebElement optionC = driver.findElement(By.id("mat-input-5"));
				 
				 //option C
				 optionC.sendKeys("PQR");
				 WebElement Correct = driver.findElement(By.xpath("//mat-checkbox[@id=\"mat-checkbox-2\"]"));
				 Correct.click();
				 
				 //Enter justification
				 Thread.sleep(2000);
				 WebElement justification = driver.findElement(By.xpath("//iframe[@id=\"mce_1_ifr\"]"));
				 justification.sendKeys("!!!Think proper!!!");
				
				 WebElement Next1 = driver.findElement(By.xpath("//app-iro-button[@title=\"Next\"]"));
				 Next1.click();
				 WebElement Save = driver.findElement(By.xpath("//app-iro-button[@title=\"Save Draft\"]"));
				 Save.click();
				 
		}
}