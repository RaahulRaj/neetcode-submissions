class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length; 
      Map<Integer, Integer> prevMap = new HashMap<>();
      for(int i = 0;i<n;i++){
        int diff  = target - nums[i];
        if(prevMap.containsKey(diff)){
            return new int[]{prevMap.get(diff)+1,i+1};
        }
            prevMap.put(nums[i], i);
        
      }
      return new int[]{};  
    }
}
