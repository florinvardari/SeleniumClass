package class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxWeb {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("http://practice.syntaxtechs.net/");
    }
}
