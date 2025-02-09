class Solution {
    public int findClosestNumber(int[] nums) {
        int near=nums[0];
        for(int i:nums){
            if(Math.abs(i)<Math.abs(near)||(Math.abs(i) == Math.abs(near) && i > near)){
                near=i;
            }
        }
        return near;
    }
}