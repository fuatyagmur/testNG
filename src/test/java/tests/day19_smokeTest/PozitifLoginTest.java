package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {
    BrcPage brcPage=new BrcPage();

    @Test
    public void pozitiveLoginTest() {

        //Bir test methodu olustur  positiveLoginTest()
        //      https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data user password: 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya basarili bir sekilde girildigini test et.

       // System.out.println(brcPage.kullaniciProfilIsmi.getText());    cikan sonucu gormek icin yazdirabiliriz.

        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUsername");

        Assert.assertEquals(actualUserName,expectedUserName);


        Driver.closeDriver();



    }
}
