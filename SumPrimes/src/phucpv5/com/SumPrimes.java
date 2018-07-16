package phucpv5.com;

public class SumPrimes {
  public int[] findSum(int number) {
    if (!(number % 2 == 0) || number < 2) {
      return null;
    }
    for (int i = 0; i <= number/2; i++) {
      if (checkPrimes(i) && checkPrimes(number - i)) {
        return new int[] { i, number - i };
      }
    }
    return null;
  }

  public boolean checkPrimes(int number) {
    if(number < 2) {
      return false;
    }
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
