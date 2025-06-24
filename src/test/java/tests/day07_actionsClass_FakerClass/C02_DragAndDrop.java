package tests.day07_actionsClass_FakerClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_DragAndDrop extends utilities.TestBase_Each {
    @Test
    public void test01(){

        //1- https://testotomasyonu.com/droppable adresine gidelim
        driver.get("https://testotomasyonu.com/droppable");

        //2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        WebElement acceptableElementi= driver.findElement(By.xpath("//*[@id='draggable2']"));
        WebElement dropHereElementi = driver.findElement(By.xpath("//*[@id='droppable2']"));

        Actions actions=new Actions(driver);
        utilities.ReusableMethods.bekle(3);

        actions.dragAndDrop(acceptableElementi,dropHereElementi).perform();


        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        String expectedDropYazi="Dropped!";
        String actualDropYazi=dropHereElementi.getText();

        Assertions.assertEquals(expectedDropYazi,actualDropYazi);
        utilities.ReusableMethods.bekle(2);

        //4- Sayfayi yenileyin
        driver.navigate().refresh();

        //5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        WebElement notAcceptableElementi=driver.findElement(By.xpath("//*[@id='draggable-nonvalid2']"));
        dropHereElementi=driver.findElement(By.xpath("//*[@id='droppable2']"));

        actions.dragAndDrop(notAcceptableElementi,dropHereElementi).perform();
        //6- “Drop Here” yazisinin degismedigini test edin

        expectedDropYazi="Drop Here";
        actualDropYazi=dropHereElementi.getText();

        Assertions.assertEquals(expectedDropYazi,actualDropYazi);
        utilities.ReusableMethods.bekle(2);
    }
}
