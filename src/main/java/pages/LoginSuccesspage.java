package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSuccesspage {

    WebDriver driver;

    public LoginSuccesspage(WebDriver driver) {
        this.driver = driver;
    }

        By SignoffBtn = By.linkText("SIGN-OFF");


        public boolean isSignoffbtnVisible () {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement TargetBtn = driver.findElement(SignoffBtn);
            return TargetBtn.isDisplayed();
        }
    }