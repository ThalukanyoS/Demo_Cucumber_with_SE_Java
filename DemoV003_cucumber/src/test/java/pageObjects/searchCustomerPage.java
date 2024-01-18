package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

import java.util.List;

public class searchCustomerPage {
    public WebDriver ldriver;
    WaitHelper waitHelper;
    public searchCustomerPage(WebDriver rdriver){
        ldriver= rdriver;
        PageFactory.initElements(ldriver, this);
        waitHelper = new WaitHelper(ldriver);

    }

     //By txtEmail=By.id("searchEmail");
    //By txtFName= By.id("searchFirstName");
    //By txtLName= By.id("searchLastName");
    //By btnSearch = By.id("search-customers");
    @FindBy(how = How.ID, using ="SearchEmail")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(how = How.ID, using ="SearchFirstName")
    @CacheLookup
    WebElement txtFName;

    @FindBy(how = How.ID, using ="SearchLastName")
    @CacheLookup
    WebElement txtLName;


    @FindBy(how = How.ID, using ="search-customers")
    @CacheLookup
    WebElement btnSearch;
    @FindBy(how = How.XPATH, using ="//table[@role='grid']")
    @CacheLookup
    WebElement tblSearchResults;
    @FindBy(how = How.XPATH, using ="//table[@id='customers-grid']")
    WebElement table;

    @FindBy(how = How.XPATH, using ="//table[@id='customers-grid']//tbody/tr")
    List<WebElement> tableRows;

    @FindBy(how = How.XPATH, using ="//table[@id='customers-grid']//tbody/tr/td")
    List<WebElement> tableColumns;

    //Actions methods
    public String getPageTitle(){
        return  ldriver.getTitle();
    }
    public void setTxtEmail(String email){
        waitHelper.WaitForElement((WebElement) txtEmail, 30);
        ((WebElement) txtEmail).clear();
        ((WebElement) txtEmail).sendKeys(email);
//        ldriver.findElement(txtEmail).sendKeys(email);
    }
    public void setTxtFName(String fname){
        waitHelper.WaitForElement((WebElement) txtFName, 30);
        ((WebElement) txtFName).clear();
        ((WebElement) txtFName).sendKeys(fname);


    }
    public void setTxtLName(String lname){
        waitHelper.WaitForElement((WebElement) txtLName, 30);
        ((WebElement) txtLName).clear();
        ((WebElement) txtLName).sendKeys(lname);
    }

    public void setBtnSearch() {

        ((WebElement) btnSearch).click();
        waitHelper.WaitForElement((WebElement) btnSearch, 30);
        //ldriver.findElement(btnSearch).click();
    }
    public int getNoOfRows(){
        return (tableRows.size());
    }
    public int getNoOfColumns(){
        return (tableColumns.size());
    }

    public boolean searchCustomerByEmail(String email)
    {
        boolean flag = false;
        for(int i=1; i<=getNoOfRows();i++)
        {
            String emailId=table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[2]")).getText();
            System.out.println(emailId);
            if(emailId.equals("victoria_victoria@nopCommerce.com"))
            {
                flag=true;
            }
        }
        return flag;

    }

    public boolean searchCustomerByName(String Name)
    {
        boolean flag = false;
        for(int i=1; i<=getNoOfRows();i++)
        {
            String name=table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[3]")).getText();
            String names[]=name.split(" ");//Separating fname and lname

            if(names[0].equals("Victoria") && names[1].equals("Terces"))
            {
                flag=true;
            }
        }
        return flag;

    }
}
