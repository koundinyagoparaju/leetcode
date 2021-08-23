import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum15 {

  public static void main(String[] args) {
    System.out.println(threeSum(new int[] {0,0,0}));
  }
    private static List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      int numsLength = nums.length;
      List<List<Integer>> result = new LinkedList<>();
      for (int i = 0; i < numsLength; i++) {
        int num = nums[i];
        int left = i + 1;
        int right = numsLength - 1;
        while (left < right) {
          int leftNum = nums[left];
          int rightNum = nums[right];
          int sum = leftNum + rightNum + num;
          if(sum  == 0) {
            result.add(List.of( num, leftNum, rightNum));
            do {
              left++;
            } while (left < numsLength && leftNum == nums[left]);
            do {
              right--;
            }while (right > i && rightNum == nums[right]);

          }
          else if(sum > 0) right--;
          else left++;
        }
        while (i < numsLength - 1 && nums[i] == nums[i + 1]) {
          i ++;
        }
      }
      return result;
  }
}
