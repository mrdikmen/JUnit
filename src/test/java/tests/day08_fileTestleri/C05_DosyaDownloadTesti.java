package tests.day08_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DosyaDownloadTesti extends utilities.TestBase_Each {
    @Test
    public void test01(){


        //1. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //2. learn.jpg dosyasını indirelim
        driver.findElement(By.linkText("learn.jpg")).click();
        utilities.ReusableMethods.bekle(2);

        //3. Dosyanın başarıyla indirilip indirilmediğini test edelim
        //NORMAL SARTLAR ALTINDA bir dosya indirmek istedigimizde
        //bilgisayar Downloads klasörüne indirir

        //dinamik olarak Downloads klasörü altinda learn.jpg dosyasinin yolunu olusturalim

        String dinamikDosyaYolu=System.getProperty("user.home") + "/Downloads/learn.jpg";
        Assertions.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));


    }
}
