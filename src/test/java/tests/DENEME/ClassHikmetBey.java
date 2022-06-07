package tests.DENEME;


/*



import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class MyHotelE2ETest  {
    @Test
    public void createHotel() throws InterruptedException {
        MyHotelPage myHotel = new MyHotelPage();

        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username : manager
        //b. Password : Manager1!

        //5. Login butonuna tıklayın.
        Driver.getDriver().get(ConfigReader.getProperty("myHotelUrl"));

        myHotel.loginButton.click();

        myHotel.email.sendKeys(ConfigReader.getProperty("myHotelValidUserName"));

        myHotel.password.sendKeys(ConfigReader.getProperty("myHotelValidPassword"));

        myHotel.ikinciloginButton.click();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        Thread.sleep(2000);
        myHotel.hotelManagement.click();
        myHotel.hotelListButton.click();
        //  Driver.getDriver().findElement(By.xpath("//a [@href='/admin/HotelAdmin']")).click();
        myHotel.addHotel.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker = new Faker();
        myHotel.codeAdd.sendKeys(faker.code().asin());
        myHotel.name.sendKeys(faker.name().name());
        myHotel.address.sendKeys(faker.address().fullAddress());
        myHotel.phone.sendKeys(faker.phoneNumber().cellPhone());
        myHotel.emaill.sendKeys(faker.internet().emailAddress());
        Select select=new Select(myHotel.selectButton);
        select.selectByIndex(1);
        //8. Save butonuna tıklayın.
        myHotel.saveButton.submit();
        Thread.sleep(2000);
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        String expectedYazi="Hotel was inserted successfully";

        String actualYazi=myHotel.alertYazi.getText();
        Assert.assertEquals(actualYazi,expectedYazi);

        //10. OK butonuna tıklayın

        Driver.getDriver().findElement(By.xpath("//button[text()='OK']")).click();
        // 11. Hotel rooms linkine tıklayın.
        // 12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın
        Thread.sleep(2000);



        myHotel.hotelRoom.click();
        String expectedYazi1="LIST OF HOTELROOMS";
        String actualYazi1=Driver.getDriver().findElement(By.xpath("//span[.='List Of Hotelrooms']")).getText();
        Assert.assertEquals(actualYazi1,expectedYazi1);

    }
}

 */