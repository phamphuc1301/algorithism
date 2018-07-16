package phucpv5.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import phucpv5.com.SumPrimes;

public class TestSumPrimes {
  private int number1;
  private int number2;
  private int[] expect1;
  private int[] expect2;
  private int numberMax;
  private SumPrimes sumprimes;
  @Before
  public void setUp() throws Exception {
    number1 = 1000000;
    number2 = 100;
    numberMax = Integer.MAX_VALUE;
    expect1 = new int[] {17, 999983};
    expect2 = new int[] {3, 97};
    sumprimes = new SumPrimes();
  }

  @Test
  public void testNumber1() {
    assertArrayEquals(expect2, sumprimes.findSum(number2));
    assertArrayEquals(expect1, sumprimes.findSum(number1));
  }
  @Test(timeout=1000)
  public void testMaxNumber() {
    sumprimes.findSum(numberMax-1);
  }
  
  @Test
  public void testNull() {
    assertNull(sumprimes.findSum(9));
  }

}
