package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hmButonu;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[1]")
    public WebElement hrButonu;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBilgileri;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement ddMenu;

    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement ddState;

    @FindBy(xpath = "(//span[@class='checked'])[1]")
    public WebElement approvedYes;














}
