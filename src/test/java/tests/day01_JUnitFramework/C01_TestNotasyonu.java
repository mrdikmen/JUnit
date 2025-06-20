package tests.day01_JUnitFramework;

import org.junit.jupiter.api.Test;

public class C01_TestNotasyonu {


    /*

    Bir class' in run edilebilir olmasi icin
    bugune kadar MUTLAKA main method olmali demistik

    Gercekten de main method olmadan
    method' larin yaninda run tusu cikmiyor

    JUnit Framework' u ile gelen en buyuk promosyon
    @TEST notasyonudur

    */

    @Test
    public void test01(){
        System.out.println("Test1 Calisti");
    }
    @Test
    public void test02(){
        System.out.println("Test2 Calisti");
    }
    @Test
    public void test03(){
        System.out.println("Test3 Calisti");
    }
}
