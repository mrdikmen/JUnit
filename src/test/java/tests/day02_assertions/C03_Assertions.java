package tests.day02_assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Assertions {

    //https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin


    static WebDriver driver;
    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bestbuy.com/");

    }
    @AfterAll
    public static void teardown(){
        driver.quit();
    }
    @Test
    public void urlTest(){
        // ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String expectedSonucUrl ="https://www.bestbuy.com/";
        String actualSonucUrl = driver.getCurrentUrl();

        Assertions.assertEquals(expectedSonucUrl,actualSonucUrl);
    }

   @Test
    public void titleTest(){
       // ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

       String actualTitle = driver.getTitle();
       String unexpectedTitleIcerik = "Rest";

       Assertions.assertFalse(actualTitle.contains(unexpectedTitleIcerik),"Title istenmeyen Rest kelimesini iceriyor");
   }

    @Test
    public void logoTest(){
        // ○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));

        Assertions.assertTrue(logoElementi.isDisplayed(),"Logo gorunuyor");
    }

    @Test
    public void francaisTest(){
        // ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement franceisLinkElementi= driver.findElement(By.xpath("//*[.='Français']"));

        Assertions.assertTrue(franceisLinkElementi.isDisplayed(),"Francais Linki gorunur degil");

    }

}
