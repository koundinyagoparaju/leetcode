public class LongestPalindrome5 {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("acca"));
  }
  public static String longestPalindrome(String s) {
    char[] sArr = s.toCharArray();
    int sLength = sArr.length;
    if(sLength == 1) return s;
    int palinStartIndex = -1, palinEndIndex = -1;
    int maxLength = -1;
    for (int i = 0; i < sLength; i++) {
      if(sLength - i - 1 <= maxLength) break;
      for (int j = sLength - 1; j > i; j--) {
        if(j - i <= maxLength) break;
        if(isPalindrome(sArr, i, j)) {
          if(j - i > maxLength) {
            palinStartIndex = i;
            palinEndIndex = j;
            maxLength = j - i;
          }
          break;
        }
      }
    }
    //Optimizations are the reason for not using substring
    if(palinStartIndex == -1) return String.valueOf(sArr[0]);
    StringBuilder stringBuilder = new StringBuilder("");
    for (int i = palinStartIndex; i < palinEndIndex + 1; i++) {
      stringBuilder.append(sArr[i]);
    }
    return stringBuilder.toString();
  }

  private static boolean isPalindrome(char[] sArr, int startIndex, int endIndex) {
    while (startIndex < endIndex) {
      if(sArr[startIndex] != sArr[endIndex]) return false;
      startIndex ++;
      endIndex --;
    }
    return true;
  }
}
