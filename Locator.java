package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.pantaloons.com/");
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("wallet");
		d.findElement(By.className("search-bar-content-textSearch-icon")).click();
	}

}
