import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("dvdf"));
  }

  static int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> positions = new HashMap<>();
    StringBuilder substring = new StringBuilder();
    int longestSubstringLength = 0;
    int substringLength = 0;
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if(positions.containsKey(c)) {
        if(longestSubstringLength < substringLength) {
          longestSubstringLength = substringLength;
        }
        substring.delete(0, substring.indexOf(c + "") + 1);
      }
      substring.append(c);
      substringLength = substring.length();
      positions.put(c, i);
    }
    if(longestSubstringLength < substringLength) {
      longestSubstringLength = substringLength;
    }
    return longestSubstringLength;
  }

}
