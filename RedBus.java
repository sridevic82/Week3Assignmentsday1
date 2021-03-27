package week3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("c");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='icon solr-icon icon-ic-city'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("dest")).sendKeys("b");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='icon solr-icon icon-ic-city'])[1]")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("(//table[@class=\"rb-monthTable first last\"]//tr//td[@class=\"wd day\"])[1]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
        WebElement findElement = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']/span"));
		String text = findElement.getText();
		System.out.println("Total No of buses" + " " + text );
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		driver.findElement(By.xpath("(//input[@id='bt_SLEEPER']/following-sibling::label)[1]")).click();
		Thread.sleep(5000);
		WebElement sleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		String text2 = sleeper.getText();
		System.out.println("No of sleeper bus are"+ " "+ text2);
		
		driver.findElement(By.xpath("(//input[@id='bt_AC']/following-sibling::label)[1]")).click();
		Thread.sleep(5000);
		WebElement sleeperandac = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		String text3 = sleeperandac.getText();
		System.out.println("No of sleeper and ac bus are"+ " "+ text3);
		driver.findElement(By.xpath("//a[text()='Fare']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Fare']")).click();
		WebElement sleeperandaccost = driver.findElement(By.xpath("(//div[@class=\"travels lh-24 f-bold d-color\"])[1]"));
		String text4 = sleeperandaccost.getText();
		System.out.println("Expensive bus is"+ " "+ text4);
		

		

	}

}
