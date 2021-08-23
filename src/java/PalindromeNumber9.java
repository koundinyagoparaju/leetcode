public class PalindromeNumber9 {

  public static void main(String[] args) {
    System.out.println(isPalindrome(-11));
  }
  public static boolean isPalindrome(int x) {
    if(x < 0) return false;
    char[] s = String.valueOf(x).toCharArray();
    int numDigits = s.length;
    for (int i = 0; i < numDigits/2; i++) {
      if(s[i] != s[numDigits - i - 1]) return false;
    }
    return true;
  }
}
