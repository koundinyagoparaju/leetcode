import java.util.Arrays;

public class ThreeSumClosest16 {

  public static void main(String[] args) {
    System.out.println(threeSumClosest(new int[] {0, 2, 1, -3}, 1));
  }
  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int numsLength = nums.length;
    long delta = Long.MAX_VALUE;
    int closestSum = -1;
    for (int i = 0; i < numsLength; i++) {
      int num = nums[i];
      int left = i + 1;
      int right = numsLength - 1;
      while (left < right) {
        int leftNum = nums[left];
        int rightNum = nums[right];
        int sum = leftNum + rightNum + num;
        if(Math.abs(target - sum) < delta) {
          delta = Math.abs(sum - target);
          closestSum = sum;
        }
        if(target - sum > 0) left++;
        else right--;
      }
      while (i < numsLength - 1 && nums[i] == nums[i + 1]) {
        i ++;
      }
    }
    return closestSum;
  }
}
