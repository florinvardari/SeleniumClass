package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//   goto syntax HRMS application and login and goto the pim option

        //  go to the website
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement choseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        choseFile.sendKeys("/Users/florinvardari/Desktop/git/GitHubToken");
    }
}
