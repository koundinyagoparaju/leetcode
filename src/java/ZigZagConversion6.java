import java.util.Arrays;

public class ZigZagConversion6 {

  public static void main(String[] args) {
    System.out.println(convert("ab", 1));
  }
  public static String convert(String s, int numRows) {
    if(numRows == 1) return s;
    int numColumns = 0, num = s.length();
    while (num > 0) {
      if(numColumns % numRows == 0) num -= numRows;
      else num -= 1;
      numColumns++;
    }
    char[] result = new char[numRows * numColumns];
    boolean isStraight = true;
    int r = 0, c = 0;
    for (char chr : s.toCharArray()) {
        result[c + r * numColumns] = chr;
        if(r % numRows == 0) isStraight = true;
        if(r % numRows == numRows - 1) isStraight = false;
        if(isStraight) {
          r++;
        } else {
          r--;
          c++;
        }
    }
    StringBuilder stringBuilder = new StringBuilder("");
    for (char value : result) {
      if (value != '\0')
        stringBuilder.append(value);
    }
    return stringBuilder.toString();
  }
}
