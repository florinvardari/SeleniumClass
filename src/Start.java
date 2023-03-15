import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Start {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hababam sinifi");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//yt-formatted-string[text()='Hababam Sınıfı | FULL HD']")).click();




            }
        }

     



