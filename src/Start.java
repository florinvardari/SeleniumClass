import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
                System.out.println(driver.getCurrentUrl());

    }



}