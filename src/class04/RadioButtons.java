package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
  public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

    WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));

    boolean isMaleEnabled=maleBtn.isEnabled();
   System.out.println("The radio button male is enabled "+isMaleEnabled);

   boolean isDisplayedBtn=maleBtn.isDisplayed();
    System.out.println(isDisplayedBtn);

    boolean isSelectedMale=maleBtn.isSelected();
    System.out.println("The male button is selcted "+isSelectedMale);

    if (!isSelectedMale) {
      maleBtn.click();
    }

    isSelectedMale=maleBtn.isSelected();
    System.out.println("The male button is selcted "+isSelectedMale);

    WebElement checkedValueButton=driver.findElement(By.cssSelector("button[id='buttoncheck']"));
    checkedValueButton.click();


    WebElement maleButtonSclt=driver.findElement(By.cssSelector("input[name='gender']"));
    maleButtonSclt.click();

    WebElement ageGroup=driver.findElement(By.cssSelector("input[value='5 - 15']"));
    ageGroup.click();

    WebElement getValuesButton=driver.findElement(By.cssSelector("button[onclick='getValues();']"));
    getValuesButton.click();



}
}