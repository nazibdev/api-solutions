package com.github.nazib.apis;


import com.github.nazib.apis.arithmetic.Operation;
import org.junit.Test;

import java.math.BigDecimal;

public class Tester {

    @Test
    public void test01(){
        System.out.println(Operation.add(new BigDecimal(5), new BigDecimal(5)));
    }

}
