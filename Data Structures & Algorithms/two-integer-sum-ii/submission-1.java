class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      int left = 0, right  = n-1;
      while(left<right){
        int currSum = nums[left] + nums[right];
        if(currSum==target) return new int[]{left+1, right+1};
        else if(currSum<target) left++;
        else right--;
      }
       
      return new int[]{};  
    }
}
