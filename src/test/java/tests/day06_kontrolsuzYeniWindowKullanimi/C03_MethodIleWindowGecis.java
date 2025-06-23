package tests.day06_kontrolsuzYeniWindowKullanimi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_MethodIleWindowGecis extends utilities.TestBase_Each {
    @Test
    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement openingANewWindowYaziElementi = driver.findElement(By.xpath("//h3[.='Opening a new window']"));
        Assertions.assertTrue(openingANewWindowYaziElementi.isDisplayed());

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);

        //● Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();

        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu test edin
        // driver' i acilan 2. window' a gecirmeliyiz
        String hedefUrl="https://the-internet.herokuapp.com/windows/new";
        utilities.ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement sayfadakiYaziElementi=driver.findElement(By.tagName("h3"));

        String expectedYazi="New Window";
        String actualYazi= sayfadakiYaziElementi.getText();

        Assertions.assertEquals(expectedYazi,actualYazi);

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu test edin
        hedefUrl="https://the-internet.herokuapp.com/windows";
        utilities.ReusableMethods.urlIleWindowGecisi(driver,hedefUrl);

        // sayfa basliginin "The Internet" oldugunu test edin
        expectedTitle="The Internet";
        actualTitle=driver.getTitle();

        Assertions.assertEquals(expectedTitle,actualTitle);

    }

}
