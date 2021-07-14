import java.util.Arrays;

public class TwoSum1 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(findSumPair(new int[]{2, 7, 11, 15}, 9)));
  }

  static int[] findSumPair(int[] nums, Integer target) {
    for (int i = 0; i < nums.length; i++) {
      int pairIndex = findIndex(target - nums[i], i, nums);
      if(pairIndex > -1 && pairIndex != i) {
        return new int[]{i, pairIndex};
      }
    }
    return new int[] {-1, -1};
  }

  private static int findIndex(int num, int fromIndex, int[] arr) {
    for (int i = fromIndex + 1; i < arr.length; i++) {
      if(arr[i] == num) return i;
    }
    return -1;
  }
}
