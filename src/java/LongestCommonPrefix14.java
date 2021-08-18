public class LongestCommonPrefix14 {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "dfg"}));
  }
  private static String longestCommonPrefix(String[] strs) {
    StringBuilder commonPrefix = new StringBuilder("");
    int shortestStringLength = Integer.MAX_VALUE;
    for (String str : strs) {
      int stringLength = str.length();
      if(stringLength <= shortestStringLength) {
        shortestStringLength = stringLength;
      }
    }
    for (int i = 0; i < shortestStringLength; i++) {
      char c = strs[0].charAt(i);
      for (String str : strs) {
        if(str.charAt(i) != c) {
          return commonPrefix.toString();
        }
      }
      commonPrefix.append(c);
    }
    return commonPrefix.toString();
  }
}
