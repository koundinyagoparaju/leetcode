public class StringToInteger8 {

  public static void main(String[] args) {
    System.out.println(myAtoi("  +-12"));
  }
  public static int myAtoi(String s) {
    char[] chars = s.toCharArray();
    long num = 0;
    boolean positive = true, signParsed = false;
    boolean numbersParsed = false;
    for (char c: chars) {
      if(!numbersParsed) {
        if(!signParsed) {
          if(c == ' ') continue;
          if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '.') return 0;
          if(c == '-') {
            positive = false;
            signParsed = true;
          }
          if(c == '+') {
            signParsed = true;
          }
        } else {
          if(c < '0' || c > '9') return 0;
        }

      } else {
        if(c < '0' || c > '9') break;
      }
      if(c >= '0' && c <= '9') {
        numbersParsed = true;
        num = positive ? num * 10 + (c - 48) : num * 10 - (c - 48);
        if(num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
      }
    }
    return (int) num;
  }
}
