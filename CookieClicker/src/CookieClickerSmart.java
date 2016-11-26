import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CookieClickerSmart {
	
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", 
	               "C:/Users/jyoung/Documents/QA Work/New folder/CookieClicker/src/chromedriver.exe");
		//driver = new FirefoxDriver();
		driver=new ChromeDriver();
		wait = new WebDriverWait(driver, 360);
		
	}
	
	@After
	public void tearDown()
	{
	//	driver.quit();
	}
	
	@Test
	public void CookieClick() throws InterruptedException{
		
		driver.get("http://orteil.dashnet.org/cookieclicker/");
		By cookieClicker				=	By.xpath(".//*[@id='bigCookie']");
		By product0						=	By.xpath(".//*[@id='product0']");		
		By product1						=	By.xpath(".//*[@id='product1']");
		By product2						=	By.xpath(".//*[@id='product2']");
		By product3						=	By.xpath(".//*[@id='product3']");
		By product4						=	By.xpath(".//*[@id='product4']");
		By product5						=	By.xpath(".//*[@id='product5']");
		By product6						=	By.xpath(".//*[@id='product6']");
		By product7						=	By.xpath(".//*[@id='product7']");
		By product8						=	By.xpath(".//*[@id='product8']");
		By product9						=	By.xpath(".//*[@id='product9']");
		By product10					=	By.xpath(".//*[@id='product10']");
		By product11					=	By.xpath(".//*[@id='product11']");
		By product12					=	By.xpath(".//*[@id='product12']");
		By product13					=	By.xpath(".//*[@id='product13']");
		By upgrade0						=	By.xpath(".//*[@id='upgrade0']");
		By upgrade1						=	By.xpath(".//*[@id='upgrade1']");
		By upgrade2						=	By.xpath(".//*[@id='upgrade2']");
		By upgrade3						=	By.xpath(".//*[@id='upgrade3']");
		By upgrade4						=	By.xpath(".//*[@id='upgrade4']");
		By upgrade5						=	By.xpath(".//*[@id='upgrade5']");
		By upgrade6						=	By.xpath(".//*[@id='upgrade6']");
		By upgrade7						=	By.xpath(".//*[@id='upgrade7']");
		By upgrade8						=	By.xpath(".//*[@id='upgrade8']");
		By upgrade9						=	By.xpath(".//*[@id='upgrade9']");
		By upgrade10					=	By.xpath(".//*[@id='upgrade10']");
		
		WebElement cookieClick 			=	driver.findElement(cookieClicker);
		WebElement productClick0 		=	driver.findElement(product0);
		WebElement productClick1 		=	driver.findElement(product1);
		WebElement productClick2 		=	driver.findElement(product2);
		WebElement productClick3 		=	driver.findElement(product3);
		WebElement productClick4 		=	driver.findElement(product4);
		WebElement productClick5 		=	driver.findElement(product5);
		WebElement productClick6 		=	driver.findElement(product6);
		WebElement productClick7 		=	driver.findElement(product7);
		WebElement productClick8 		=	driver.findElement(product8);
		WebElement productClick9 		=	driver.findElement(product9);
		WebElement productClick10 		=	driver.findElement(product10);
		WebElement productClick11 		=	driver.findElement(product11);
		WebElement productClick12 		=	driver.findElement(product12);
		WebElement productClick13 		=	driver.findElement(product13);
		
	    for(int i=0; i<10; i++){
	        new Thread("" + i){
	          public void run(){
	            for(int z = 0; z < 10; z++){
	            	cookieClick.click();
	            }
	          }
	        }.start();
	      }
		
/*		try{
			WebElement goldenCookieClick = driver.findElement(By.xpath(".//*[@id='shimmers']/div"));
			goldenCookieClick.click();
		}
		catch(Exception e){
		}

		try{
			WebElement upgradeClick0 = 	driver.findElement(upgrade0);
			upgradeClick0.click();
		}
		catch(Exception e){
		}

		try{
			WebElement upgradeClick1 = 	driver.findElement(upgrade1);
			upgradeClick1.click();
		}
		catch(Exception e){
		}

		try{
			WebElement upgradeClick2 = 	driver.findElement(upgrade2);
			upgradeClick2.click();
		}
		catch(Exception e){
		}

		try{
			WebElement upgradeClick3 = 	driver.findElement(upgrade3);
			upgradeClick3.click();
		}
		catch(Exception e){
		}

		try{
			WebElement upgradeClick4 = 	driver.findElement(upgrade4);
			upgradeClick4.click();
		}
		catch(Exception e){
		}
		
		try{
			WebElement upgradeClick5 = 	driver.findElement(upgrade5);
			upgradeClick5.click();
		}
		catch(Exception e){
		}
		
		try{
			WebElement upgradeClick6 = 	driver.findElement(upgrade6);
			upgradeClick6.click();
		}
		catch(Exception e){
		}
		
		try{
			WebElement upgradeClick7 = 	driver.findElement(upgrade7);
			upgradeClick7.click();
		}
		catch(Exception e){
		}
		
		try{
			WebElement upgradeClick8 = 	driver.findElement(upgrade8);
			upgradeClick8.click();
		}
		catch(Exception e){
		}
		try{
			WebElement upgradeClick9 = 	driver.findElement(upgrade9);
			upgradeClick9.click();
		}
		catch(Exception e){
		}*/
	}
}
					
	
				
	
	
	

