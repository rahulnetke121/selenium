package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraBeauty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.tirabeauty.com/");
			d.manage().window().maximize();
			WebElement a =d.findElement(By.id("search"));
			a.sendKeys("Sun Cream");
			a.sendKeys(Keys.ENTER);
			Thread.sleep(6000);
			d.findElement(By.xpath("(//div[@class='product-name'])[4] ")).click();
			Thread.sleep(6000);
			d.findElement(By.xpath("//button[@class='custom-btn secondary lg no-tap-highlight']")).click();
			//d.findElement(By.linkText(""))
			d.close();
	}

}
