class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int [target+1];
        Arrays.fill(dp,-1);
        return count(nums,target,dp);
    }
    public int count(int[] nums,int target,int[] dp){
       if(target == 0){
        return 1;
       }
       if(target < 0){
        return 0;
       }
       if(dp[target] > -1){
        return dp[target];
       }
       int res=0;
       for(int n:nums){
         res+=count(nums,target-n,dp);
       }
       dp[target]=res;
       return res;
    }
}