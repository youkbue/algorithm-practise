package may;

import may.sort.QuickSortTemplate;

/**
 * <p> 题号：数组中的第k个最大元素 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 14:12
 */
public class Code215_FindKthLargestElementByArr {

    public int findKthLargest(int[] nums, int k) {
        QuickSortTemplate quickSortTemplate = new QuickSortTemplate();
        quickSortTemplate.quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

//    private void quickSort(int[] q ,int l , int r) {
//        if(l >= r) return;
//        int x = q[l];
//        int i = l - 1 , j = r + 1;
//        while(i < j) {
//            do i++;while (q[i] < x);
//            do j--;while (q[j] > x);
//            if(i < j) {
//                int temp = q[i];
//                q[i] = q[j];
//                q[j] = temp;
//            }
//        }
//        quickSort(q,l,j);
//        quickSort(q,j+1,r);
//    }

    public static void main(String[] args) {
        Code215_FindKthLargestElementByArr finder = new Code215_FindKthLargestElementByArr();
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = finder.findKthLargest(arr, k);
        System.out.println("数组中的第" + k + "个最大元素是：" + result);
    }
}
