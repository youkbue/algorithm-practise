package may.dichotomous;

/**
 * <p> 二分搜索模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 14:21
 */
public class DichotomousSearchTemplate {

    public int search(int[] nums, int target) {
      int left = 0, right = nums.length - 1;
      while (left <= right) {
          int mid = left + (right - left) / 2;
          if (nums[mid] == target) {
              return mid;
          }else if (nums[mid] < target) {
              left = mid + 1;
          } else if (nums[mid] > target) {
              right = mid - 1;
          }
      }
      return -1;
    }
}
