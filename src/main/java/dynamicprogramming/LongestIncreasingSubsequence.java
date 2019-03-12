class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {

        int[] lengths = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            lengths[i] = 1;
        }

        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i] && lengths[j] + 1 > lengths[i]) {
                    lengths[i] = lengths[j] + 1;
                }
            }
        }

        int maxSeq = 0;
        for(int i = 0; i < lengths.length; i++) {
            maxSeq = Math.max(lengths[i], maxSeq);
        }

        return maxSeq;
    }
}
