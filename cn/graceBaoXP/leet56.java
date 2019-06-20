package cn.graceBaoXP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Merge Intervals
 *
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 *
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 *
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class leet56 {

    public List<Interval> merge(List<Interval> intervals) {
            int num=intervals.size();
            int[] starts=new int[num];
            int[] ends=new int[num];
            for (int i=0;i<num;i++){
                starts[i]=intervals.get(i).start;
                ends[i]=intervals.get(i).end;
            }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int i=0;
        List<Interval> res=new ArrayList<>();
        while (i<num){
            int start=starts[i];
            while (i<num-1&&starts[i+1]<=ends[i]){
                i++;
            }
            int end=ends[i];
            res.add(new Interval(start,end));
            i++;
        }
        return res;
    }
}

class Interval{
    int start;
    int end;

    public Interval() {
        start=0;
        end=0;
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
