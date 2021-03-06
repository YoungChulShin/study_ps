package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
  // 시간 복잡도: O(n^2)
  // 공간 복잡도
//  public int[] twoSum(int[] nums, int target) {
//    for (int i = 0; i < nums.length; i++) {
//      for (int j = i + 1; j < nums.length; j++) {
//        if (nums[i] + nums[j] == target) {
//          return new int[]{i, j};
//        }
//      }
//    }
//    return null;
//  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> keyNums = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (keyNums.containsKey(nums[i])) {
        if (nums[i] * 2 == target) {
          return new int[]{ keyNums.get(nums[i]), i};
        }
      } else {
        if (keyNums.containsKey(target - nums[i])) {
          return new int[]{ keyNums.get(target - nums[i]), i};
        }

        keyNums.put(nums[i], i);
      }
    }
    return null;
  }
}
