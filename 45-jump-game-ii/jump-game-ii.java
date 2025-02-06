class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }

        int jumps=0;
        int far=0;
        int end=0;

        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==end){
                jumps++;
                end=far;
                if(end>=nums.length-1){
                    break;
                }
            }
        }
        return jumps;
    }
}