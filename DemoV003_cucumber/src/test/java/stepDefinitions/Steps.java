package stepDefinitions;
import com.google.j2objc.annotations.Property;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.*;
import net.bytebuddy.implementation.FieldAccessor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.searchCustomerPage;

import java.util.logging.Logger;

public class Steps extends BaseClass {

    @Given("the user launch chrome browser")
    public void the_user_launch_chrome_browser() {
//        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp=new LoginPage(driver);
        //addCust=new AddcustomerPage(driver);
//        logger= Logger.getLogger("nopCommerce"); //Added logger
//        PropertyConfigurator.configure("log4j.properties");//Added logger
//        FieldAccessor.PropertyConfigurable.co
    }

    @When("the user opens URL {string}")
    public void the_user_opens_URL(String url) {
        driver.get(url);
        driver.manage().window().maximize();// To maximize the page
    }

    @When("the user Enters Email as {string} and Password as {string}")
    public void the_user_Enters_Email_as_and_Password_as(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_Login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String title) throws InterruptedException {
        if(driver.getPageSource().contains("Login was unsuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }else{
            Assert.assertEquals(title, driver.getTitle());
        }
        Thread.sleep(3000);
    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link()  throws InterruptedException
    {
        lp.clickLogout();
        Thread.sleep(3000);
    }

//    @Then("Page title should be {string}")
//    public void page_title_should_be(String string) {
//        if(driver.getPageSource().contains("Login was unsuccessful.")){
//            driver.close();
//            Assert.assertTrue(false);
//        }else{
//            Assert.assertEquals(title, driver.getTitle());
//        }
//    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }

    //Customer feature step definitions
    @Then("User can view Dashboard")
    public void user_can_view_Dashboard() {
        addCust= new AddcustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
    }

    @When("User click on customers Menu")
    public void user_click_on_customers_Menu() throws InterruptedException{
        Thread.sleep(3000);
        addCust.clickOnCustomersMenu();
    }

    @When("click on customers Menu Item")
    public void click_on_customers_Menu_Item()throws InterruptedException {
        Thread.sleep(3000);
        addCust.clickOnCustomersMenuItem();
    }

    @When("click on Add new Button")
    public void click_on_Add_new_Button() throws InterruptedException{
        addCust.clickOnAddNew();
        Thread.sleep(3000);
    }

    @Then("user can view Add new customer page")
    public void user_can_view_Add_new_customer_page() {
        addCust = new AddcustomerPage(driver);
        Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
    }

    @When("User enter customer info")
    public void user_enter_customer_info() throws InterruptedException {
        String email=randomstring()+"@gmail.com";
        addCust.setEmail(email);
        addCust.setPassword("test123");
        //Registered - default
        //The customer cannot be both "Guests" and "Registered" customer roles
        //Add the customer to "Guests" or "Registered" customer role
        addCust.setCustomerRole("Guest");
        Thread.sleep(3000);

        addCust.setManagerOfVendor("Vendor 2");
        addCust.setGender("Male");
        addCust.setFirstName("Thalukanyo");
        addCust.setLastName("Siboyeboyi");
        addCust.setDob("03/27/2000");
        addCust.setCompanyName("Sibo co.");
        addCust.setAdminContent("We test here.");
    }

    @When("click on Save button")
    public void click_on_Save_button() throws InterruptedException{
        addCust.clickOnSave();
        Thread.sleep(2000);
    }

    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String feedback) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
    }

    //Search a Customer using EmailId steps............................
    @When("the page with title {string} is displayed")
    public void the_page_with_title_is_displayed(String title) {
        Assert.assertEquals(title, searchCustomer.getPageTitle());
    }

    @When("Enter customer Email")
    public void enter_customer_Email() {
        searchCustomer=new searchCustomerPage(driver);
        searchCustomer.setTxtEmail("victoria_victoria@nopCommerce.com");
    }
    @Then("Click on search button")
    public void click_on_Search_button() throws InterruptedException {
        searchCustomer.setBtnSearch();
        Thread.sleep(1000);
    }

    @Then("the user should find email in the search table")
    public void the_user_should_find_email_in_the_search_table() {
        boolean status=searchCustomer.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(true, status);

    }

    //Search customer by FName and LName.............................
    @When("Enter customer FirstName")
    public void enter_customer_FirstName() {
        searchCustomer=new searchCustomerPage(driver);
        searchCustomer.setTxtFName("Victoria");
    }

    @When("Enter customer LastName")
    public void enter_customer_LastName() {
        searchCustomer=new searchCustomerPage(driver);
        searchCustomer.setTxtLName("Terces");
    }
    @Then("the user should find Name in the search table")
    public void the_user_should_find_name_in_the_search_table() {
        boolean status=searchCustomer.searchCustomerByName("Victoria Terces");
        Assert.assertEquals(true, status);

    }



}
