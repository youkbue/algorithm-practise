package may;

public class Code704_DichotomousSearch {

    public int search(int[] nums, int target) {
      int l = 0 , r = nums.length - 1;
      while (l <= r) {
          int mid = l + (r - l ) / 2;
          if(nums[mid] == target) return mid;
          else if (nums[mid] < target) l = mid + 1;
          else if (nums[mid] > target) r = mid - 1;
      }
      return -1;
    }

    public static void main(String[] args) {
        Code704_DichotomousSearch searcher = new Code704_DichotomousSearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = searcher.search(arr, target);
        if (result != -1) {
            System.out.println("目标值 " + target + " 在数组中的索引是：" + result);
        } else {
            System.out.println("数组中不包含目标值 " + target);
        }
    }
}
