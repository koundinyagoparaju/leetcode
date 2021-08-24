public class ReverseInteger7 {

  public static void main(String[] args) {
    System.out.println(reverse(-1534236469));
  }
  public static int reverse(int x) {
    if (x == 0) return 0;
    int result = 0;
    while (x != 0) {
      if((result * 10) / 10 != result) return 0; // to check for overflow. Overflow eg: 964632435 * 10 becomes 1056389758, which when divided by 10 doesn't equal 964632435
      result = (x % 10) + (result * 10);
      x = x / 10;
    }
    return result;
  }
}
