package cn.graceBaoXP;


import java.util.ArrayList;
import java.util.List;

/**
 *  Permutations
 *
 *  Given a collection of distinct integers, return all possible permutations.
 */
public class Leet46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }

    public static void backtrack(List<List<Integer>> res,List<Integer> tempRes,int[] nums){
        if (tempRes.size()==nums.length){
            //已经遍历完
            res.add(new ArrayList<>(tempRes));
        }else {
            for(int i=0;i<nums.length;i++){
                if (tempRes.contains(nums[i])){
                    continue;
                }
                tempRes.add(nums[i]);
                backtrack(res,tempRes,nums);
                tempRes.remove(tempRes.size()-1);
            }
        }
    }
}

