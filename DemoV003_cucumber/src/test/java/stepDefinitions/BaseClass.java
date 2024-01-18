package stepDefinitions;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.searchCustomerPage;
import java.util.Random;
import java.util.logging.Logger;

public class BaseClass {
    public WebDriver driver;
    public LoginPage lp; //To get web element from LoginPage
    public AddcustomerPage addCust;
    public searchCustomerPage searchCustomer;
    public static Logger logger;

    //To generate random string for unique email ID
    public static String randomstring(){
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }
}
