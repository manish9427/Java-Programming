// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target

import java.util.*;
public class _13_TwoSum {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] result = TargetSumResult(nums, target);
        if(result != null){
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Target Not Found");
        }
    }

    public static int[] TargetSumResult(int[] nums , int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
