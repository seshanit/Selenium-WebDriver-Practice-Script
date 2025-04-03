package testcases;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccesspage;

import java.time.Duration;

public class TestCase001 {

    WebDriver driver;

    @BeforeMethod
    public void OpenPAge() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TestCase001() {
        HomePage homePage = new HomePage(driver);
        homePage.SelectRegisterMenu();

        RegisterPage registerPage = new RegisterPage(driver);

        //contact info
        registerPage.setFirstName_loc("Seshani");
        registerPage.setLastName_loc("Wickramasinghe");
        registerPage.setPhone_no_loc("123456789");
        registerPage.setEmail_loc("wickramasinghe@gmail.com");

        //Mail address
        registerPage.setAddress_loc("52");
        registerPage.setState_loc("test");
        registerPage.setPostal_loc("123698");
        registerPage.setCity_loc("Washington");
        registerPage.selectCountry_loc();

        //User info
        registerPage.setUserName_loc("Seshani");
        registerPage.setPassword_loc("Wickramasinghe");
        registerPage.setConfirmPassword_loc("Wickramasinghe");
        registerPage.setSubmitBtn_loc();

        RegisterSuccesspage registerSuccesspage = new RegisterSuccesspage(driver);
        String actualText = registerSuccesspage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear123"), "register attempt failed");

    }

    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }

}

