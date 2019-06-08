package cn.graceBaoXP;

/**
 * Maximum Subarray
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class leet53 {

    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            if (current<0){
                current=nums[i];
            }else{
                current +=nums[i];
            }
            res=Math.max(current,res);
        }
        return res;
    }
}
