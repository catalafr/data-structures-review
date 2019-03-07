package arrays;

import java.util.Arrays;

public class TrappingRainWater {


    public int trap(int[] height) {
        return findBuckets(height);
    }

    private int findBuckets(int [] height){

        int left = 0;
        int right = 0;
        int count = 0;

        for(int i = 0 ; i < height.length ; i++){
            if(height[i] >= 1){
                left = i;
            }
            if(left != 0 && left != i && height[i] >= height[left]){
                right = i;
                count = countBetween(Arrays.copyOfRange(height, left, right),
                        Math.min(height[left], height[right]));
                left = i;
            }
        }


        return count;
    }

    private int countBetween(int [] subarray, int min){
        int count = 0;
        for(int i : subarray)
            if(i < min){
                count += min - i;
            }

        return count;
    }

}
