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

}