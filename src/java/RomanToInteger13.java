import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RomanToInteger13 {

  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }

  private static int romanToInt(String s) {
    int num = 0;
    int stringLength = s.length();
    for (int i = 0; i < stringLength; i++) {
      char c = s.charAt(i);
      Roman roman = Roman.toRoman(c);
      if(i < stringLength - 1) {
        char c1 = s.charAt(i + 1);
        if(roman.associatedDigits.contains(c1)) {
          num += Roman.toRoman(c1).value - roman.value;
          i ++;
          continue;
        }
      }
      num += roman.value;
    }
    return num;
  }

  enum Roman {
    I ( 1, new HashSet<>(Arrays.asList('V', 'X'))),
    V ( 5, Collections.emptySet()),
    X ( 10, new HashSet<>(Arrays.asList('L', 'C'))),
    L ( 50, Collections.emptySet()),
    C ( 100, new HashSet<>(Arrays.asList('D', 'M'))),
    D ( 500, Collections.emptySet()),
    M ( 1000, Collections.emptySet());
    private final int value;
    private final Set<Character> associatedDigits;
    Roman(int value, Set<Character> associatedDigits) {
      this.value = value;
      this.associatedDigits = associatedDigits;
    }
    //I didn't want to use valueOf(String) since we have to convert the char to string to do that. Hence this approach
    static Roman toRoman(char c) {
      return switch (c) {
        case 'I' -> I;
        case 'V' -> V;
        case 'X' -> X;
        case 'L' -> L;
        case 'C' -> C;
        case 'D' -> D;
        case 'M' -> M;
        default -> throw new IllegalArgumentException("");
      };
    }
  }
}
