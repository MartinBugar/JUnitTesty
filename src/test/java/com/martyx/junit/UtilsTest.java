package com.martyx.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void failedtest(){
            fail(); //metoda na zlyhanie testu
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

}