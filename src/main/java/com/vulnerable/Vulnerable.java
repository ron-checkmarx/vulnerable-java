package com.vulnerable;

import org.json.Kim;
import org.jsr166.LongAdder8;

public class Vulnerable {

    public static void main(String[] args) throws Exception {
        Kim[] kims = new Kim[10];
        System.out.println(kims);

        LongAdder8 x = new LongAdder8();
    }

}
