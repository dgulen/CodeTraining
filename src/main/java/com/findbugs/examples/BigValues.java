package com.findbugs.examples;

public class BigValues {
    public BigValues(){

    }
	//double d = 1.1;
/*
	BigDecimal bd1 = (BigDecimal.valueOf(d)); // Noncompliant; see comment above
	BigDecimal bd2 =BigDecimal.valueOf(1.1); // Noncompliant; same result
	
	BigDecimal bd3 = BigDecimal.valueOf(d);
	BigDecimal bd4 = BigDecimal.valueOf(1.1);
*/
}
