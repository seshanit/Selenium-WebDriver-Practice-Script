package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //By location strategy

   By firstName_loc = By.xpath("//input[@name='firstName']");
    By lastName_loc = By.xpath("//input[@name='lastName']");
    By phone_no_loc = By.xpath("//input[@name='phone']");
    By email_loc = By.xpath("//input[@id='userName']");
    By address_loc = By.xpath("//input[@name='address1']");
    By city_loc = By.xpath("//input[@name='city']");
    By state_loc = By.xpath("//input[@name='state']");
    By postal_loc = By.xpath("//input[@name='postalCode']");
    By country_loc = By.xpath("//select[@name='country']");
    By userName_loc = By.xpath("//input[@id='email']");
    By password_loc = By.xpath("//input[@name='password']");
    By confirmPassword_loc = By.xpath("//input[@name='confirmPassword']");
    By submitBtn = By.xpath("//input[@name='submit']");


    public void setFirstName_loc(String firstName) {
        driver.findElement(firstName_loc).sendKeys(firstName);
    }

    public void setLastName_loc(String lastName) {
        driver.findElement(lastName_loc).sendKeys(lastName);
    }

    public void setPhone_no_loc(String phoneNo) {
        driver.findElement(phone_no_loc).sendKeys(phoneNo);
    }

    public void setEmail_loc(String email) {
        driver.findElement(email_loc).sendKeys(email);
    }
    public void setAddress_loc(String address) {
        driver.findElement(address_loc).sendKeys(address);
    }

    public void setCity_loc(String city) {
        driver.findElement(city_loc).sendKeys(city);
    }

    public void setState_loc(String state) {
        driver.findElement(state_loc).sendKeys(state);
    }

    public void setPostal_loc(String postal) {
        driver.findElement(postal_loc).sendKeys(postal);
    }

    public void selectCountry_loc() {
        WebElement countrySelect_ele = driver.findElement(country_loc);
        Select dropdownCountry = new Select(countrySelect_ele);
        dropdownCountry.selectByIndex(2);

    }

    public void setUserName_loc(String userName) {
        driver.findElement(userName_loc).sendKeys(userName);
    }

    public void setPassword_loc(String password) {
        driver.findElement(password_loc).sendKeys(password);
    }

    public void setConfirmPassword_loc(String confirmPassword) {
        driver.findElement(confirmPassword_loc).sendKeys(confirmPassword);
    }

    public void setSubmitBtn_loc() {
        driver.findElement(submitBtn).click();
    }
}
