package may.prefix_sum;

import java.util.Arrays;

/**
 * <p> 前缀和模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/19 14:47
 */
public class PrefixSumTemplate {

    private int[] prefixSum;

    public void buildPrefixSum(int[] nums)  {
        //因为 前缀数组 是从索引为1 开始算 ，索引为0的值为0
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for(int i = 0; i < nums.length; i++){
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    // 查询从索引left到索引right之间的元素和[left,right]
    public int rangeSum(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        PrefixSumTemplate ps = new PrefixSumTemplate();
        ps.buildPrefixSum(nums);
        System.out.println("前缀数组和 ==========>" + Arrays.toString(ps.prefixSum));
        int left = 2;
        int right = 3;
        int sum = ps.rangeSum(left, right);
        System.out.println("从索引 " + left + " 到索引 " + right + " 的区间和是：" + sum);
    }

}
