package com.kodilla.power;

public class Power {
    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else if (exponent == 1) {
            return base;
        } else {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result = result * base;
            }
            return result;
        }
    }


}
