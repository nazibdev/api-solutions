package com.github.nazib.apis.arithmetic;

import java.math.BigDecimal;

public class Operation {
    public static BigDecimal add(BigDecimal a, BigDecimal b){ return a.add(b);}
    public static BigDecimal subtract(BigDecimal a, BigDecimal b){ return a.subtract(b);}
    public static BigDecimal multiply(BigDecimal a, BigDecimal b){ return a.multiply(b);}
    public static BigDecimal divide(BigDecimal a, BigDecimal b){ return a.divide(b);}
}
