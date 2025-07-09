class Solution {
    public int missingNumber(int[] nums) {
        // XOR Approach
        // int exp = 0, act = 0;
        // for(int i = 0; i < nums.length; i++){
        //     exp ^= (i+1);
        //     act ^= nums[i];
        // }
        // return exp ^ act;

        //Iterative Approach
        int act = 0, n = nums.length;
        for(int i : nums){
            act += i;
        }
        int exp = n * (n + 1) / 2;
        return exp - act;
    }
}