package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        //open up the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximamize the screen
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click login button
        driver.findElement(By.className("button")).click();

        String title=driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is incorrect");
        }

       driver.findElement(By.linkText("Logout")).click();

       driver.quit();
    }
}
