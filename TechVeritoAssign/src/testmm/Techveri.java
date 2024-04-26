package testmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Techveri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//driver =new ChromeDriver();
		
		driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://bookcart.azurewebsites.net/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("Ybehere");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Yogita@123");
		
		driver.findElement(By.cssSelector("button[class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content/app-addtocart/button")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[2]/app-book-card/mat-card/mat-card-content/app-addtocart/button")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div[3]/app-book-card/mat-card/mat-card-content/app-addtocart/button")).click();
		
		driver.findElement(By.cssSelector("button[class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")).click();
		
		driver.findElement(By.xpath("//button[@ng-reflect-router-link=\'/shopping-cart\']")).click();
		
		WebElement CartValue =driver.findElement(By.xpath("//*[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-action mat-column-action'][5]"));
		
		WebElement Qut =driver.findElement(By.xpath("/html/body/app-root/div/app-shoppingcart/mat-card/mat-card-content[1]/table/tbody/tr[1]/td[3]"));
		
		WebElement Single =driver.findElement(By.xpath("//td[contains(text(),'₹235.00')]"));
		
		WebElement TotalCartValue =driver.findElement(By.xpath("//*[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-action mat-column-action'][5]"));
		
		if(Qut!=Single) {
			System.out.println("Verify that Total Quantity (multiple Quantity) of Added Products and price of product is Different");
		}
		else {
			System.out.println("Test case if Fail");
		}
		
		
		if(CartValue!=TotalCartValue) {
			System.out.println("Verify that if any quantity updated then total price(value) of cart also updated");
									}
		else {
			System.out.println("Test case if Fail");
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

}
