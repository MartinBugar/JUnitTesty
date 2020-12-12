package com.martyx.junit;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class UtilsTest {

    private Utils utils;

    @BeforeAll
    static void beforeAllMethod () { // musi byt staticka, pretoze sa spusti este pred vytvorenim instancie triedy
        System.out.println(" spustanie before all metody");
    }

    @AfterAll
    static void afterAllMetod (){
        System.out.println("spustenie metody afterAll"); // nakoniec po vswetkom sa pusti toto jeden kratb
    }

    @BeforeEach // pred kaydzm spustenim kazdej metody sa pusti toto
    void initBeforeEachMethod(){
        utils = new Utils(); //takze toto sa vytvori nove pre kazdu metodu zvlast
        System.out.println("toto sa vypise pred kazdym spustenim kazdej metody");
    }

    @AfterEach
    void afterMethod (){
        System.out.println("po kazdej metode sa toto vypise");
    }

    @Test
    void failedtest(){
          //   fail(); //metoda na zlyhanie testu
    }

    @Test
    @DisplayName("Test, ktory vzdy prejde")
    @Disabled // tento test sa nespusti
    void passedTest (){
        assertTrue(true);
    }

    @Test
    void sumIs2(){
      //  Utils utils = new Utils();
        assumeTrue(true); // veci za tymto sa vykonaju len je je toto true
        int expectedValue = 2;
        int actualValue = utils.sum(1,1);
        assertEquals( expectedValue, actualValue); // porovnava dve hodnity ci sa rovnaju
    }

    @RepeatedTest(5) //5 5 krat sa zopakuje test
    void suma100PlusDanJe120(RepetitionInfo repetitionInfo){
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetition = repetitionInfo.getTotalRepetitions();
        System.out.println(currentRepetition);
        System.out.println(totalRepetition);
      //  Utils utils = new Utils();
        assertEquals(BigDecimal.valueOf(120),
                utils.pripocitajDan(BigDecimal.valueOf(100)));

    }

    @Test
    public void suma141PlusDanJe169Cela2(){
     //   Utils utils = new Utils();
        assertEquals(BigDecimal.valueOf(169.20).setScale(2),
                utils.pripocitajDan(BigDecimal.valueOf(141L)));
    }

    @Test
    public void suma10PlusDanNieJe100(){
     //   Utils utils = new Utils();
        assertNotEquals(BigDecimal.valueOf(100).setScale(2),
        utils.pripocitajDan(BigDecimal.valueOf(10).setScale(2)), "Suma 10 + Dan nie je 100");
    }

    @Test
    public void obsahTrojuholnikaJe3priDlzkeStrany2AVyskaNaStranu3(){
     //   Utils utils = new Utils();
        assertEquals(3, utils.obsahTrojuholnika(2,3), "Metoda ma vypocitat obsah trojuholnika");
    }

    @Test
    public void obsahTrojuholnikaJe10priDlzkeStrany4AVyskaNaStranu5(){
    //    Utils utils = new Utils();
        assertEquals(10, utils.obsahTrojuholnika(4,5), "Metoda ma vypocitat obsah trojuholnika");
    }

    @Test
    public void vysledokDelenia10a2je5(){
    //    Utils utils = new Utils();
        assertEquals(5,utils.delenie(10,2));
    }

    @Test
    void  delenie0HadzeVynimku(){
     //   Utils utils = new Utils();
        assertThrows(ArithmeticException.class,
                () -> utils.delenie(10,0),
                "Pri deleni 0 musi byt vynimka");
    }

    @Test
    void nemozeNastatVynimka(){ 
     //   Utils utils = new Utils();
        assertDoesNotThrow(()->utils.workWithString());
    }

    @Test
    @EnabledOnOs(OS.WINDOWS) // spusti sa tento test len na windowse
    void overCestuNaWinSubor(){
        System.out.println("overujem cestu pre windows");
    }

    @Test
    @EnabledOnOs(OS.LINUX) // spusti sa tento test len na windowse
    @EnabledOnJre(JRE.JAVA_8) // spusti sa na jave 8
    void overCestuNaLinuxSubor(){
        System.out.println("overujem cestu pre Linux");
    }


}