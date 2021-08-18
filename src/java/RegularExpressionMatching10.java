public class RegularExpressionMatching10 {

  public static void main(String[] args) {
    System.out.println(isMatch("ab", ".*"));
  }

  private static boolean isMatch(String s, String p) {
    return isMatch(s.toCharArray(), p.toCharArray(), s.length() - 1, p.length() - 1);
  }

  private static boolean isMatch(char[] s, char[] p, int sIndex, int pIndex) {
    if (sIndex == -1 && pIndex == -1) {
      return true;
    }
    if (sIndex != -1 && pIndex == -1) {
      return false;
    }
    if (sIndex == -1 && pIndex > -1) {
      if (p[pIndex] == '*') {
        return isMatch(s, p, sIndex, pIndex - 2);
      }
      return false;
    }
    if (s[sIndex] == p[pIndex] || p[pIndex] == '.') {
      return isMatch(s, p, sIndex - 1, pIndex - 1);
    } else if (p[pIndex] == '*') {
      if (isMatch(s, p, sIndex, pIndex - 2)) {
        return true;
      }
      if (s[sIndex] == p[pIndex - 1] || p[pIndex - 1] == '.') {
        return isMatch(s, p, sIndex - 1, pIndex);
      }
    }
    return false;
  }
}
