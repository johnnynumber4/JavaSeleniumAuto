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


public class AutoCookieClick {
	
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
		//driver.quit();
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
		By goldenCookie					=	By.xpath(".//*[@id='shimmers']/div");
				
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
/*		WebElement upgradeClick0 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick1 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick2 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick3 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick4 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick5 		= 	driver.findElement(upgrade0);
		WebElement upgradeClick6 		= 	driver.findElement(upgrade0);
		WebElement totalCookies;
		*/
	
		/*try {
			Thread.sleep(5000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		*/
		int x = 2147483646;
		while(x>0){

		
/*		try{
			try{
			WebElement goldenCookieClick	=	driver.findElement(goldenCookie);				
			if(driver.findElement(goldenCookie).isDisplayed()){
				goldenCookieClick.click();
				int a = 1;
				while(a<10){
				cookieClick.click();
				a++;
				}
			}
		}catch(NoSuchElementException e){
				
			}
			*/
		
/*
		if(driver.findElement(product13).isDisplayed()){
			productClick13.click();
			int a = 1;
			while(a<10){
			cookieClick.click();
			a++;
			}
		}


		if(driver.findElement(product12).isDisplayed()){
			productClick12.click();
			int b = 1;
			while(b<10){
			cookieClick.click();
			b++;
			}
		}


		if(driver.findElement(product11).isDisplayed()){
			productClick11.click();
			int c = 1;
			while(c<10){
			cookieClick.click();
			c++;
			}
		}
		

		if(driver.findElement(product10).isDisplayed()){
			productClick10.click();
			int d = 1;
			while(d<10){
			cookieClick.click();
			d++;
			}
		}
		

		if(driver.findElement(product9).isDisplayed()){
			productClick9.click();
			int e = 1;
			while(e<10){
			cookieClick.click();
			e++;
			}
		}
		

		if(driver.findElement(product8).isDisplayed()){
			productClick8.click();
			int f = 1;
			while(f<10){
			cookieClick.click();
			f++;
			}
		}
		

		if(driver.findElement(product7).isDisplayed()){
			productClick7.click();
			int g = 1;
			while(g<10){
			cookieClick.click();
			g++;
			}

		}
		

		if(driver.findElement(product6).isDisplayed()){
			productClick6.click();
			int h = 1;
			while(h<10){
			cookieClick.click();
			h++;
			}
		}
		

		if(driver.findElement(product5).isDisplayed()){
			productClick5.click();
			int i = 1;
			while(i<10){
			cookieClick.click();
			i++;
			}
		}
		*/

		if(driver.findElement(product4).isDisplayed()){
			productClick4.click();
			int j = 1;
			while(j<10){
			cookieClick.click();
			j++;
			}
		}
		
		

		if(driver.findElement(product3).isDisplayed()){
			productClick3.click();
			int k = 1;
			while(k<10){
			cookieClick.click();
			k++;
			}
		}
		

		if(driver.findElement(product2).isDisplayed()){
			productClick2.click();
			int l = 1;
			while(l<10){
			cookieClick.click();
			l++;
			}
		}
		

		if(driver.findElement(product1).isDisplayed()){
			productClick1.click();
			int m = 1;
			while(m<10){
			cookieClick.click();
			m++;
			}
		}
		if(driver.findElement(product0).isDisplayed()){
			productClick0.click();
			int n = 1;
			while(n<10){
			cookieClick.click();
			n++;
			}
		}
	}
	//finally{

		int o = 1;
		while(o < 1000){
		cookieClick.click();
		o++;
		}

	//		}


			x--;	
		}
	}
//}


