package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jio.com");
		Thread.sleep(4000);
		
		d.findElement(By.linkText("Mobile")).click();
		Thread.sleep(2000);	
		d.findElement(By.linkText("True 5G")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("JioFiber")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("AirFiber")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Business")).click();

		Thread.sleep(2000);
		d.findElement(By.linkText("Devices")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Apps")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Support")).click();
		
		Thread.sleep(4000);
		d.close();
		

	}

}
