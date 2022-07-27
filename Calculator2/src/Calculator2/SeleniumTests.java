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
	}

}
