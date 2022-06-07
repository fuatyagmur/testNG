package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BrcPage brcPage;

    @Test
    public void yanlisSifre() {

       brcPage =new BrcPage();

        //Bir test methodu olustur  positiveLoginTest()
        //      https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data user password: 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        //login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya basarili bir sekilde girilemedigini test et.

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());


        //bu class'da 2 test methodu daha olusturun
        //biri yanlis kullanici
        //digeri de yanlis sifre ve kullanici adi

        // ders notlarinda hotel le ilgili olani da coz.








    }
}
