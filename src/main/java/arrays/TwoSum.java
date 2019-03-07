package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> holder = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            holder.put(nums[i], i);
        }

        int [] result = new int[2];

        int unknown;
        for(int i = 0 ; i<nums.length ; i++){
            unknown = target - nums[i];
            if(holder.containsKey(unknown)
                    && holder.get(unknown) != i){
                result[0] = i;
                result[1] = holder.get(unknown);
                break;
            }
        }

        return result;
    }
}
