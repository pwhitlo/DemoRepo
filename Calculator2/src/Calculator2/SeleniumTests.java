package Calculator2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
public class SeleniumTests 
{

	public static void main(String[] args) 
	{	
		//-	Go to usf.edu 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_wins\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl ="http://www.usf.edu/";
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		
		//Select Work at USF link
		Actions action = new Actions(driver);
		String linkText="Work at USF";
		WebElement worklink=driver.findElement(By.linkText(linkText));
		System.out.println(worklink);
		worklink.click();

		//Select Contact us Button
		String contact="Contact Us";
		WebDriver contactlink=new ChromeDriver();
		contactlink.get("http://www.usf.edu/work-at-usf/careers/contact.aspx");
		System.out.println(contact);
		System.out.println(contactlink);
		
		
		//Select St. Pete link
		String PeteCampus="St. Petersburg Campus, HR";
		WebDriver contactPete=new ChromeDriver();
		contactPete.get("http://www.usfsp.edu/hr/");
		System.out.println(PeteCampus);
		System.out.println(contactPete);
		System.out.println(PeteCampus);
		
		
		
		
		
		/*String originalWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().equals("Welcome to the University of South Florida | Tampa, St. Petersburg, Sarasota-Manatee, FL"));
			System.out.println("flag 1");
		//Actions action = new Actions(driver);
		WebElement d=driver.findElement(By.xpath('//a[@href="'+https://www.usf.edu/work-at-usf/careers/contact.aspx+'"]'));  
		System.out.println(d);
		String t = d.getText();
		System.out.println(t);
		d.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			System.out.println("flag 2");
		WebElement x = driver.findElement(By.xpath("/html/body/header/div[3]/div/nav/ul/li[1]/div[2]/div/div[3]/ul/li[4]/a"));
		x.click();
	    	System.out.println("flag 3");
	    String title = driver.getTitle();
	      System.out.println("Page title after link click : " + title);
	      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    WebElement y = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a[2]"));
	    y.click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    	System.out.println("flag 4");
	    //Loop through until we find a new window handle
	    for (String windowHandle : driver.getWindowHandles()) {
	        if(!originalWindow.contentEquals(windowHandle)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    title = driver.getTitle();
	    System.out.println("Page title after link click : " + title);
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
	    WebElement z = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/p[5]/a"));
	    z.click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    System.out.println("flag 5");
	    title = driver.getTitle();
	    System.out.println("Page title after link click : " + title);
	    driver.close();
	    driver.quit();*/
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch website
	      driver.navigate().to("http://www.usf.edu/");*/
	}

}
