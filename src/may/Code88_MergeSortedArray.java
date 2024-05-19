package may;

/**
 * <p> 题号88：合并两个有序数组 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 16:17
 */
public class Code88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1 , j = n - 1, k = n + m -1;
        while (i >= 0 && j >= 0) {
            if(nums1[i] <= nums2[j]) nums1[k--] = nums2[j--];
            else nums1[k--] = nums1[i--];
        }
        while(j >= 0) nums1[k--] = nums2[j--];
    }

    public static void main(String[] args) {
        Code88_MergeSortedArray arrayMerger = new Code88_MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        arrayMerger.merge(nums1, m, nums2, n);

        System.out.println("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}
