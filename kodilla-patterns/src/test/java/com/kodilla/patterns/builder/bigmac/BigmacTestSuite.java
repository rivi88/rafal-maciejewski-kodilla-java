package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        Bigmac bigmac = new BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Sałata")
                .ingredient("Cebula")
                .ingredient("Bekon")
                .build();

        System.out.println(bigmac);

        Assertions.assertEquals("Sezam", bigmac.getBun());
        Assertions.assertEquals(2, bigmac.getBurgers());
        Assertions.assertEquals("Barbecue", bigmac.getSauce());
        Assertions.assertTrue(bigmac.getIngredients().contains("Sałata"));
        Assertions.assertTrue(bigmac.getIngredients().contains("Cebula"));
        Assertions.assertTrue(bigmac.getIngredients().contains("Bekon"));
    }
}
