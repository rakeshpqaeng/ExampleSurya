package NewProject4Surya.ExampleSurya;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends GoogleMain{

	public GoogleTest()
	{
		super();
	}
	
	@Test(priority=0)
	public void executeMyGoogleTest()
	{
	initialization();	
		
	//driver.findElement(By.id("lst-ib")).sendKeys("Java");
	driver.findElement(By.name("q")).sendKeys("surya namskar");
	//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='suggestions-inner-container']"));
	System.out.println("total number of suggestions in search box:::===>" + list.size());
	
	for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("surya namaskar")){
			list.get(i).click();
			break;
		}
		
	}
	}
	
}
