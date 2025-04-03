package testcases;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
//import pages.LoginSuccesspage;

import java.time.Duration;


import java.time.Duration;

public class TestCase002_Register_login_user {
    WebDriver driver;

    @BeforeMethod
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void testcase002() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("Seshani");
        loginPage.enterPassword("Wickramasinghe");
        loginPage.loginBtn();

        String successmessage = loginPage.thankyouText();
        Assert.assertEquals(successmessage,"Login Successfully");
    }
}
