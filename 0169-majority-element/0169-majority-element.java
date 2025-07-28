class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> count = new HashMap<>();
        // int n = nums.length;
        // for(int num: nums){
        //     count.put(num,count.getOrDefault(num,0) + 1);
        //     if(count.get(num) > n / 2){
        //         return num;
        //     }
        // }
        // return -1;

        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        int value = nums[0];
        int count = 0;
        for(int num : nums){
            if(count == 0) value = num;
            count += (num == value) ? 1: -1;
        }
        return value;
    }
}