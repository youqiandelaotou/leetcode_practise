package com.xuyi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xuyi7 on 2016/6/24.
 */

// 去重，就不能用hash的做法了

    /*
    先升序排序，然后用第一重for循环确定第一个数字。

然后在第二重循环里，第二、第三个数字分别从两端往中间扫。

如果三个数的sum等于0，得到一组解。

如果三个数的sum小于0，说明需要增大，所以第二个数往右移。

如果三个数的sum大于0，说明需要减小，所以第三个数往左移。
     */
public class No15_3Sum {

    public static   List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3){
            return ans;
        }
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            int index = i;
            int goal = (-1) * nums[i];
            List<List<Integer>> twoSumAns = twoSum(nums, index, goal);
            if (twoSumAns == null)
                continue;
            for (int j=0; j<twoSumAns.size(); j++){
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(nums[index]);
                tmp.add(nums[twoSumAns.get(j).get(0)]);
                tmp.add(nums[twoSumAns.get(j).get(1)]);
                ans.add(tmp);
            }

        }
        return ans;

    }

    public static     List<List<Integer>> twoSum(int[] nums, int index, int goal){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=index+1; i<nums.length; i++){
            if (i >= 1 && nums[i] == nums[i-1] )
                continue;
            if (hashMap.containsKey(goal - nums[i])){
                int xx = hashMap.get(goal - nums[i]);
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(xx);
                tmp.add(i);
                ans.add(tmp);
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return ans;
    }
}
