package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxArraySubLength {

    public int maxArraySubLen(int [] values, int target){

        int sum = 0;
        int max = 0;

        Map<Integer,Integer> sums = new HashMap<>();

        for(int i=0 ; i<values.length ; i++){
            sum += values[i];

            //We have found our target. Set the max.
            if(sum == target)
                max = i + 1; //Index based counting needs to be length based.

            //Lets check inside of our map if a (sum - k) exists.
            else if(sums.containsKey(sum - target)){
                max = Math.max(max, i - sums.get(sum - target));
            }

            if(!sums.containsKey(sum)){
                sums.put(sum, i);
            }
        }

        return max;
    }
}
