package calculator;
package com.wordpress.technologyconversations.tddtest;
 
import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;
 
public class StringCalculatorTest {
  @Test
public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
    Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
}
    }

