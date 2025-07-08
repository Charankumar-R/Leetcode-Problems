class Solution {
    public int minPatches(int[] nums, int n) {
        long reach = 0;
        int ans = 0, idx = 0;
        while(reach < n){
            if(idx < nums.length && nums[idx] <= reach + 1){
                reach += nums[idx];
                idx ++;
            }
            else{
                ans ++;
                reach += reach +1;
            }
        }
        return ans;
    }
}