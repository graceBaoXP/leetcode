package cn.graceBaoXP;

/**
 * Jump Game II
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 */
public class Leet45 {
    public int jump(int[] nums) {

        if (nums.length<=1){
            return 0;
        }
        int index=0,max=0;
        int step=0,i=0;
        while (i<nums.length){
            //如果可以直接一步到最后，步数+1
            if (i+nums[i]>=nums.length-1){
                step++;
                break;
            }
            //每次初始化
            max=0;
            //记录索引
            index=i+1;
            for(int j=i+1;j-i<=nums[i];j++){
                if (max<nums[j]+j-i){
                    max=nums[j]+j-i;
                    index=j;
                }
            }
            i=index;
            step++;
        }
        return step;
    }
}
