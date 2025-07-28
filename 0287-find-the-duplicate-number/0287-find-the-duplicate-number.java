class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) break;
        }

        int slow2 = nums[0];
        while (slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> seen = new HashSet<>();

//         for(int num : nums) {
//             if(seen.contains(num)) {
//                 return num;
//             }
//             seen.add(num);
//         }

//         return -1; 
//     }
// }