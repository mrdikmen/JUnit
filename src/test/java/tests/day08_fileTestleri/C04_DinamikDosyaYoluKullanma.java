package tests.day08_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_DinamikDosyaYoluKullanma {
    @Test
    public void test01() {


        //day13 package' da notlar.txt dosyasinin oldugunu test edin.

        String dosyayolu = "src/test/java/tests/day13_fileTestleri/notlar.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dosyayolu)));

        //dosya yolunu dinamik yapalım

        //C:\Users\casper\IdeaProjects\Team161_JUnit\src\test\java\tests\day13_fileTestleri\notlar.txt

        //Eger proje altindaki bir dosyaya ulasmak istersek
        //Java bilgisayardaki projenin dosya yolunu bize dinamik olarak verir.

        System.out.println(System.getProperty("user.dir"));
        //C:\Users\casper\IdeaProjects\Team161_JUnit

        String dinamikDosyaYolu = System.getProperty("user.dir")
                + "/src/test/java/tests/day13_fileTestleri/notlar.txt";

        Assertions.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
}
