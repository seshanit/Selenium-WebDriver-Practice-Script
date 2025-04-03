package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccesspage {

    WebDriver driver;

    public RegisterSuccesspage(WebDriver driver) {
        this.driver = driver;
    }

        By successText_loc = By.xpath("//b[contains(text(),'Dear')]");


    public String registerSuccessText()
    {
        String successText = driver.findElement(successText_loc).getText();
        return successText;
    }
}
