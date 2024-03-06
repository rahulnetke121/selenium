package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	public static void main(String [] args)
	{
		//to launch empty chrome browser
		//ChromeDriver d= new ChromeDriver();
		
		//call get(String url) to launch  application
		//d.get("https://www.myntra.com/");
		FirefoxDriver f= new FirefoxDriver();
		//GeckoDriver g=new GeckoDriver();
		//f.get("https://www.google.com/");
		//f.manage().window().minimize();
		
	}

}
