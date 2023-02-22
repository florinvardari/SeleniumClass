package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        // conect to web driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        // create an instance of web driver
        WebDriver driver=new ChromeDriver();
        //goto google.com
        driver.get("https://www.google.com/");
        //maximize the window
        driver.manage().window().maximize();
        //full screen

        driver.manage().window().fullscreen();

    }
}
