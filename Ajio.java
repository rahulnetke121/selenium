package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.ajio.com/");
		d.manage().window().maximize();
		WebElement a=	d.findElement(By.name("searchVal"));
		a.sendKeys("Shoes");
		a.sendKeys(Keys.ENTER);
		
		//a.findElement(By.className("ic-search")).click();
		//d.findElement(By.id("Men")).click();
		
		//d.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		//d.findElement(By.xpath("//label[contains(text(),'Sneakers & Sports Shoes')]")).click();
		//d.findElement(By.xpath("//label[contains(text(),'Rs.1001-1500')]")).click();
		
		d.findElement(By.xpath("//img[contains(@src,'https://assets.ajio.com/medias/sys_master/root/202…_black_men_revolution_7_lace-up_running_shoes.jpg')]")).click();
	}

}
