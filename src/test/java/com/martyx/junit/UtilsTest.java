package com.martyx.junit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void failedtest(){
          //   fail(); //metoda na zlyhanie testu
    }

    @Test
    void passedTest (){
        assertTrue(true);
    }

    @Test
    void sumIs2(){
        Utils utils = new Utils();
        int expectedValue = 2;
        int actualValue = utils.sum(1,1);
        assertEquals( expectedValue, actualValue); // porovnava dve hodnity ci sa rovnaju
    }

    @Test
    void suma100PlusDanJe120(){
        Utils utils = new Utils();

    }

    @Test
    public void suma141PlusDanJe169Cela2(){
        Utils utils = new Utils();
        assertEquals(BigDecimal.valueOf(169.20).setScale(2),
                utils.pripocitajDan(BigDecimal.valueOf(141L)));
    }

    @Test
    public void suma10PlusDanNieJe100(){
        Utils utils = new Utils();
        assertNotEquals(BigDecimal.valueOf(100).setScale(2),
        utils.pripocitajDan(BigDecimal.valueOf(10).setScale(2)), "Suma 10 + Dan nie je 100");
    }

    @Test
    public void obsahTrojuholnikaJe3priDlzkeStrany2AVyskaNaStranu3(){
        Utils utils = new Utils();
        assertEquals(3, utils.obsahTrojuholnika(2,3), "Metoda ma vypocitat obsah trojuholnika");
    }

    @Test
    public void obsahTrojuholnikaJe10priDlzkeStrany4AVyskaNaStranu5(){
        Utils utils = new Utils();
        assertEquals(10, utils.obsahTrojuholnika(4,5), "Metoda ma vypocitat obsah trojuholnika");
    }

    @Test
    public void vysledokDelenia10a2je5(){
        Utils utils = new Utils();
        assertEquals(5,utils.delenie(10,2));
    }

    @Test
    void  delenie0HadzeVynimku(){
        Utils utils = new Utils();
        assertThrows(ArithmeticException.class,
                () -> utils.delenie(10,0),
                "Pri deleni 0 musi byt vynimka");
    }

    @Test
    void nemozeNastatVynimka(){
        Utils utils = new Utils();
        assertDoesNotThrow(()->utils.workWithString());
    }

}