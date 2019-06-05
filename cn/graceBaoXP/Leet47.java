package cn.graceBaoXP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permutations II
 *
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * Input: [1,1,2]
 * Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class Leet47 {

    public static void main(String[] args){
        int[] nums={1,1,2};
        List<List<Integer>> lists=permuteUnique(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        back(res,new ArrayList<>(),nums,used);
        return res;
    }

    public static void back(List<List<Integer>> res,List<Integer> tempRes,int[] nums,boolean[] used){
        if (tempRes.size()==nums.length){
            //已经遍历完
            res.add(new ArrayList<>(tempRes));
        }else {
            for(int i=0;i<nums.length;i++){
                if (used[i]){
                    continue;
                }
               if (i>0&&nums[i-1]==nums[i]&&!used[i-1]){
                   continue;
               }
               used[i]=true;
               tempRes.add(nums[i]);
               back(res,tempRes,nums,used);
               used[i]=false;
               tempRes.remove(tempRes.size()-1);
            }
        }
    }

}
