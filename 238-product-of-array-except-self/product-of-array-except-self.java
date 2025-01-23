class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Compute prefix products
        int[] prefix = new int[n];
        prefix[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        
        // Step 2: Compute suffix products and calculate the result simultaneously
        int suffix = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = prefix[i] * suffix;
            suffix *= nums[i]; // Update the suffix product
        }
        
        return answer;
    }
}