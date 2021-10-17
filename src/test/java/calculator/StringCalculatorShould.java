package calculator;
package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;
 
public class StringCalculatorTest {
   @Test
public final void whenEmptyStringIsUsedThenReturnValueIs0() {
    Assert.assertEquals(0, StringCalculator.add(""));
}
    }

