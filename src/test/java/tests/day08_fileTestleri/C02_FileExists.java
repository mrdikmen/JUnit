package tests.day08_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExists {

    @Test
    public void test01(){

        //day 13 package' i altinda
        //notlar.txt dosyasi bulndugunu test edin

        String dosyayolu="src/test/java/tests/day13_fileTestleri/notlar.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dosyayolu)));

        //bilgisayar masaustunde selenium.txt
        //dosyasinin var oldugunu test edin

        dosyayolu="C:\\Users\\casper\\Desktop\\Selenium.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dosyayolu)));



    }
}
