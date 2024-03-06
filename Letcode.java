package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
			ChromeDriver d= new ChromeDriver();
			d.get("https://letcode.in/test");
			d.manage().window().maximize();
			/*//d.findElement(By.linkText("Edit")).click();
			//.findElement(By.name("fullName")).sendKeys("Rahul Netke");
			d.findElement(By.linkText("Sign up")).click();	
			d.findElement(By.id("name")).sendKeys("rahul netke");
			d.findElement(By.id("email")).sendKeys("rahulnetke121@gmail.com");
			d.findElement(By.id("pass")).sendKeys("rahul123");
			d.findElement(By.id("agree")).click();
			d.findElement(By.xpath("//button[text()='SIGN UP']")).click();
			Thread.sleep(4000);
			d.findElement(By.linkText("Sign out")).click();
			Thread.sleep(4000);
			d.close();*/
			
			
			d.findElement(By.linkText("Log in")).click();
			d.findElement(By.name("email")).sendKeys("rahulnetke121@gmail.com");
			d.findElement(By.name("password")).sendKeys("rahul123");
			d.findElement(By.xpath("//button[text()='LOGIN']")).click();
			//d.findElement(By.xpath("//a[text()=New Course!']")).click();
			//Thread.sleep(4000);
			d.findElement(By.linkText("Sign out")).click();
			//Thread.sleep(4000);
			d.close();
		}

}
