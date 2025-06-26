package tests.day13_excelAutomation_getScreenshot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C05_MethodIleScreenshotCekme extends utilities.TestBase_Each {

    @Test
    public void test01() throws InterruptedException {

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCek(driver, "anasayfaTesti");

        //phone icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCek(driver, "aramaTesti");

        //ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@class='prod-img'])[1]")).click();

        //screenshot alin
        utilities.ReusableMethods.tumSayfaResimCek(driver, "ilkUrunTesti");
    }
}
