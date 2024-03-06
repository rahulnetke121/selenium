package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[1]/div/div/div/div/img")).click();
		/*WebElement a=d.findElement(By.name("q"));
		a.sendKeys("Mobiles");
		a.sendKeys(Keys.ENTER);
		//a.click();
		//a.findElement(By.xpath("//div[contains(text(),"))
		
		//d.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		//d.findElement(By.xpath("//img[@alt='Mobiles' and @class='_2puWtW _3a3qyb']")).click();
		d.findElement(By.xpath("(//div[@class='_4rR01T'])[2]/../..//div[@class='_3tbKJL']")).click();
		//d.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		//d.findElement(By.cssSelector("button[ww']")).click();*/
	}

}
