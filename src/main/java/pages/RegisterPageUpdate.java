package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageUpdate {

    WebDriver driver;

    public RegisterPageUpdate(WebDriver driver) {
            this.driver=driver;
          PageFactory.initElements(driver, this);
    }

    //Locating web elements using locators

   @FindBy (xpath = ("//input[@name='firstName']"))
   WebElement firstName_ele;

    @FindBy (xpath = ("//input[@name='lastName']"))
    WebElement lastName_ele;

    @FindBy (xpath =("//input[@name='phone']"))
    WebElement phone_no_ele;
    @FindBy (xpath = ("//input[@id='userName']"))
    WebElement email_ele;

    @FindBy (xpath = ("//input[@name='address1']"))
    WebElement address_ele;

    @FindBy (xpath = ("//input[@name='city']"))
    WebElement city_ele;

    @FindBy (xpath = ("//input[@name='state']"))
    WebElement state_ele;

    @FindBy (xpath = ("//input[@name='postalCode']"))
    WebElement postal_ele;

    @FindBy (xpath = ("//select[@name='country']"))
    WebElement country_ele;

    @FindBy (xpath = ("//input[@id='email']"))
    WebElement userName_ele;

   @FindBy (xpath =("//input[@name='password']"))
   WebElement password_ele;

   @FindBy (xpath = ("//input[@name='confirmPassword']"))
    WebElement confirmPassword_ele;

   @FindBy (xpath =("//input[@name='submit']"))
   WebElement submit_ele;


// Performing Actions on Web Elements:

    public void setFirstName_loc(String firstName) {
        firstName_ele.sendKeys(firstName);
    }

    public void setLastName_loc(String lastName) {

        lastName_ele.sendKeys(lastName);
    }

    public void setPhone_no_loc(String phoneNo) {

        phone_no_ele.sendKeys(phoneNo);
    }

    public void setEmail_loc(String email) {

        email_ele.sendKeys(email);
    }
    public void setAddress_loc(String address) {
        address_ele.sendKeys(address);
    }

    public void setCity_loc(String city) {

        city_ele.sendKeys(city);
    }

    public void setState_loc(String state) {

        state_ele.sendKeys(state);
    }

    public void setPostal_loc(String postal) {

        postal_ele.sendKeys(postal);
    }

    public void selectCountry_loc() {
    //    WebElement country_ele = driver.findElement(country_loc);
        Select dropdownCountry = new Select(country_ele);
        dropdownCountry.selectByIndex(2);

    }

    public void setUserName_loc(String userName) {

        userName_ele.sendKeys(userName);
    }

    public void setPassword_loc(String password) {

        password_ele.sendKeys(password);
    }

    public void setConfirmPassword_loc(String confirmPassword) {
        confirmPassword_ele.sendKeys(confirmPassword);
    }

    public void setSubmitBtn_loc() {

        submit_ele.click();
    }
}
