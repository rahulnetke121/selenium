package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloon {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver d = new ChromeDriver();
		 d.get("https://www.pantaloons.com/");
		 d.manage().window().maximize();
		WebElement a=  d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		a.sendKeys("wallet");
		 a.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		 d.findElement(By.xpath("//p[text()='Gender']")).click();
		  Thread.sleep(4000);
		 d.findElement(By.xpath("//div[contains(text(),'Men')]")).click();
		 Thread.sleep(4000);
		  d.findElement(By.xpath("(//div[@class='PlpWeb_product-name__1_7kw'])[3]/../..//div[@class='PlpWeb_product-price__2A3Lf']")).click();
		d.findElement(By.xpath("(//span[@class='Quantity_plus__2gUw9'])")).click();
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	
		Thread.sleep(4000);
		  
		d.close();
		
		  /*// a.findElement(By.cssSelector("img[alt='Yellow Solid Casual Full Sleeves Regular Hood Men Regular Fit Sweatshirts']")).click();
		// a.findElement(By.id("size_L")).click();
		 WebElement b=d.findElement(By.cssSelector("select[class='MuiSelect-root MuiSelect-select MuiInputBase-input MuiInput-input']"));
		 b.sendKeys("Price - Low to High");
		// a.click();
		 b.sendKeys(Keys.ENTER);
		 //Thread.sleep(2000);
		  
		  */
		  
	
		 
		 
	}
}
