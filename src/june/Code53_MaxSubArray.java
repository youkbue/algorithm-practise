package june;

/**
 * <p> 题号53：最大子数组和 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/06/01 09:10
 */
public class Code53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int currentMax = nums[0] , globalMax = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            if(currentMax > globalMax) globalMax = currentMax;
        }
        return globalMax;
    }
}
