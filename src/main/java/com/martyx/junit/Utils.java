package com.martyx.junit;

import java.math.BigDecimal;

public class Utils {

    public int sum(int a, int b){
        return a + b;
    }

    private final int aktualnaDan = 20;

    public BigDecimal pripocitajDan(BigDecimal suma){
        return suma.add(suma.divide(BigDecimal.valueOf(100)).
                multiply(BigDecimal.valueOf(aktualnaDan)));
    }

    public double  obsahTrojuholnika(double stranaA, double vyskaA){
        return 0.5 * stranaA * vyskaA;
    }

    public int delenie (int a, int b){
        return a/b;
    }

    public String workWithString(){
        String text = giveMeString();
        return text.toLowerCase();
    }

    public String giveMeString(){
        return "null";
    }
}
