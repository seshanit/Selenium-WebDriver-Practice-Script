package Functions;

import org.openqa.selenium.WebDriver;
import pages.HomePageupdated;
import pages.RegisterPageUpdate;
import pages.RegisterSuccesspageUpdate;

public class Commonfunctions {
    WebDriver driver;

    public Commonfunctions(WebDriver driver) {
        this.driver = driver;
    }

    public String  registerUserflow (String fName, String lName, String email, String phoneNo,String address, String state, String postalCode, String city,String uName,String password, String confirmPassword)
    {
        HomePageupdated homePage = new HomePageupdated(driver);
        homePage.Register();

        RegisterPageUpdate registerPage = new RegisterPageUpdate(driver);
        registerPage.setFirstName_loc(fName);
        registerPage.setLastName_loc(lName);
        registerPage.setPhone_no_loc(phoneNo);
        registerPage.setEmail_loc(email);

        //Mail address
        registerPage.setAddress_loc(address);
        registerPage.setState_loc(state);
        registerPage.setPostal_loc(postalCode);
        registerPage.setCity_loc(city);
        registerPage.selectCountry_loc();

        //User info
        registerPage.setUserName_loc(uName);
        registerPage.setPassword_loc(password);
        registerPage.setConfirmPassword_loc(confirmPassword);
        registerPage.setSubmitBtn_loc();

        RegisterSuccesspageUpdate registerSuccessPageUpdate = new RegisterSuccesspageUpdate(driver);
        String sucessText = registerSuccessPageUpdate.registerSuccessText();
        return sucessText;
    }
}
