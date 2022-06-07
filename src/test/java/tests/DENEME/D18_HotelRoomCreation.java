package tests.DENEME;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class D18_HotelRoomCreation {

    // 1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //2. Bir metod olusturun: RoomCreateTest()
    //3. https://www.hotelmycamp.com adresine gidin.
    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
    //        a.Username : manager
    //        b. Password : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna basin.
    //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.
    //11. Hotel rooms linkine tıklayın.
    //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
    
    
    HotelMyCampPage hotelMyCampPage;
    
    @Test
    public void RoomCreateTest() {
        hotelMyCampPage=new HotelMyCampPage();



        //1. https://www.hotelmycamp.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));

        //2. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        hotelMyCampPage.ilkLoginButonu.click();
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hotelUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelPassword"));

        //3. Login butonuna tıklayın.
        hotelMyCampPage.ikinciLoginButonu.click();

        //4. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hotelMyCampPage.hmButonu.click();
        hotelMyCampPage.hrButonu.click();

        //5. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hotelMyCampPage.addRoomButonu.click();

        //6. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());





        hotelMyCampPage.userNameBilgileri.sendKeys("fuatyagmur");
                 actions.sendKeys(Keys.TAB).sendKeys("12345aBc.")
                        .sendKeys(Keys.TAB).sendKeys("deneme@gmail.com")
                         .sendKeys(Keys.TAB).sendKeys("fuat")
                         .sendKeys(Keys.TAB).sendKeys("1234567890")
                         .sendKeys(Keys.TAB).sendKeys("12345677755212")
                         .sendKeys(Keys.TAB).sendKeys("yes").perform();

        Select select=new Select(hotelMyCampPage.ddMenu);
                 select.selectByVisibleText("United States");
                 actions.sendKeys(Keys.TAB).perform();
        Select select2=new Select(hotelMyCampPage.ddState);
                 select.selectByIndex(3);
                 actions.sendKeys(Keys.TAB).sendKeys("alabama street no:1")
                         .sendKeys(Keys.TAB).sendKeys("04/06/2022")
                         .sendKeys(Keys.TAB)
                         .sendKeys(Keys.TAB).sendKeys("ICT")
                         .sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
                         .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();















/*// dropdown'dan bir option secmek icin 3 adim vardir
        // 1- dropdown'i locate edelim
        WebElement dropDownMenu= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        // 2- bir Select objesi olusturup
        //    parametre olarak bir onceki adimda locate ettigimiz ddm'yu girelim
        Select select=new Select(dropDownMenu);
        // 3- Dropdown'da var olan option'lardan istedigimiz bir taneyi secelim
        select.selectByVisibleText("Books");

 */

















    }
}
