package may.write;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> 题号1：两数之和 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/25 16:42
 */
public class Code1_TwoMemberSum {

    //解法1 暴力
//    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0 ; i < nums.length - 1; i++) {
//            for(int j = i+1 ; j < nums.length; j++){
//                if(nums[i] + nums[j] == target) return new int[]{i,j};
//            }
//        }
//        return new int[0];
//    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(8);
        for(int i = 0 ; i < length ; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
