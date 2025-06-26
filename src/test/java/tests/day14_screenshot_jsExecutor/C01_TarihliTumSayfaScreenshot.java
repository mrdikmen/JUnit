package tests.day14_screenshot_jsExecutor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_TarihliTumSayfaScreenshot extends utilities.TestBase_Each {

    @Test
    public void test01() throws InterruptedException {

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCekTarihli(driver);

        //phone icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCekTarihli(driver);

        //ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@class='prod-img'])[1]")).click();

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCekTarihli(driver);
    }
}
