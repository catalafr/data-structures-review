package arrays;

public class TrappingRainWater {

    public int trap(int[] height) {
        return findBuckets(height);
    }

    private int findBuckets(int [] height){

        int leftPtr = 0;
        int rightPtr = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int count = 0;

        while(leftPtr <= rightPtr){
            leftMax = Math.max(leftMax, height[leftPtr]);
            rightMax = Math.max(rightMax, height[rightPtr]);
            if(leftMax < rightMax){
                count += leftMax - height[leftPtr];
                leftPtr++;
            }
            else {
                count += rightMax - height[rightPtr];
                rightPtr--;
            }
        }


        return count;
    }
}
