package Leetcode;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i< nums.length; i++)
        {
            hashSet.add(nums[i]);
        }
        if (hashSet.size()!= nums.length)
        {
            return  true;
        }
        return false;

    }
}

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] num = {1,2,3,6,1};
        System.out.println(solution.containsDuplicate(num));

    }
}
