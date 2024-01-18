package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {
    //ldriver and remote driver
    public WebDriver ldriver;
    public AddcustomerPage(WebDriver rdriver){
        ldriver= rdriver;
        PageFactory.initElements(ldriver, this);
    }

    By lnkCustomers_menu= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
    By lnkCustomers_menuitem= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a");
    By btnAddnew= By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
    By txtEmail= By.xpath("//*[@id=\"Email\"]");
    By txtPassword= By.xpath("//*[@id=\"Password\"]");
    By txtCustomersRoles= By.xpath("//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div");
    By lstitemAdministrators= By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[1]");
    By lstitemRegistered= By.xpath("//*[@id=\"b8df9b2a-7dd8-406e-862b-82f865246dce\"]");
    By lstitemGuests= By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[3]");
    By lstitemVendors= By.xpath("//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[5]");
    By drpmgrOfVendor=By.xpath("//*[@id=\"VendorId\"]");
    By rdMaleGender= By.id("Gender_Male");
    By rdFemaleGender= By.id("Gender_Female");

    By txtFirstName= By.xpath("//*[@id=\"FirstName\"]");
    By txtLastName= By.xpath("//*[@id=\"LastName\"]");
    By txtDob=By.xpath("//*[@id=\"DateOfBirth\"]");
    By txtCompanyName=By.xpath("//*[@id=\"Company\"]");
    By txtAdminContent=By.xpath("//*[@id=\"AdminComment\"]");
    By btnSave=By.xpath("/html/body/div[3]/div[1]/form/div[1]/div/button[1]");

    //Actions Method for every element above
    public String getPageTitle(){
        return  ldriver.getTitle();
    }
    public void clickOnCustomersMenu(){
        ldriver.findElement(lnkCustomers_menu).click();
    }
    public void clickOnCustomersMenuItem(){
        ldriver.findElement(lnkCustomers_menuitem).click();

    }
    public void clickOnAddNew(){
        ldriver.findElement(btnAddnew).click();

    }
    public void setEmail(String email){
        ldriver.findElement(txtEmail).sendKeys(email);
    }
    public void setPassword(String password){
        ldriver.findElement(txtPassword).sendKeys(password);
    }
    public void setCustomerRole(String role) throws InterruptedException{
        if(!role.equals("Vendors")) //If role is vendors should not delete registered role
        {
            ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[1]"));

        }
        ldriver.findElement(txtCustomersRoles).click();
        WebElement listitem;
        Thread.sleep(3000);

        if(role.equals("Administrators"))
        {
            listitem=ldriver.findElement(lstitemAdministrators);

        } else if (role.equals("Guests")) {
            listitem=ldriver.findElement(lstitemVendors);
        } else if (role.equals("Registered")) {
            listitem=ldriver.findElement(lstitemRegistered);
        }
        else
        {
            listitem=ldriver.findElement(lstitemVendors);
        }
        listitem.click();
        //Thread.sleep(3000);

        //When click method is not working use below(java script notation)
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].click();", listitem);
    }
    public void setManagerOfVendor(String value){
        Select drp= new Select(ldriver.findElement(drpmgrOfVendor));
        drp.selectByVisibleText(value);
    }

    public void setGender(String gender){
        if(gender.equals("Male"))
        {
            ldriver.findElement(rdMaleGender).click();
        } else if (gender.equals("Female")) {
            ldriver.findElement(rdFemaleGender).click();
        }
        else{
            ldriver.findElement(rdMaleGender).click(); //Default value
        }
    }

    public void setFirstName(String fname){
        ldriver.findElement(txtFirstName).sendKeys(fname);
    }

    public void setLastName(String lname){
        ldriver.findElement(txtFirstName).sendKeys(lname);
    }

    public void setDob(String dob){
        ldriver.findElement(txtDob).sendKeys(dob);
    }
    public void setCompanyName(String comname){
        ldriver.findElement(txtCompanyName).sendKeys(comname);
    }
    public void setAdminContent(String content){
        ldriver.findElement(txtAdminContent).sendKeys(content);
    }
    public void clickOnSave(){
        ldriver.findElement(btnSave).click();
    }


}

