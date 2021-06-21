package edu.cnm.deepdive;

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest
values in the array.
 */

public class CodingBatTheBigDiff {

  public static void main(String[] args) {
    int[] one = {10, 3, 5, 6};
    int[] two = {7, 2, 10, 9};
    int[] three = {2, 10, 7, 2};

    System.out.println("With the array {10, 3, 5, 6}, the outcome will be " + bigDiff(one) + ".");
    System.out.println("With the array {7, 2, 10, 9}, the outcome will be " + bigDiff(two) + ".");
    System.out.println("With the array {2, 10, 7, 2}, the outcome will be " + bigDiff(three) + ".");


  }

  public static int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];

    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);
    }
    return max - min;
  }



}
