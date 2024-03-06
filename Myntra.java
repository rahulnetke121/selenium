package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://myntra.com/");
		d.manage().window().maximize();
	WebElement a =	d.findElement(By.className("desktop-searchBar"));
		a.sendKeys("Watches");
		a.sendKeys(Keys.ENTER);
		//a.findElement(By.cssSelector("img[title='CASIO VINTAGE Men Watch D011 A-158WA-1Q']")).click();
		d.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		Thread.sleep(12000);
		d.close();

	}

}
