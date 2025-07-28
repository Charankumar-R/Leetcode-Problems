class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            count.put(num,count.getOrDefault(num,0) + 1);
            if(count.get(num) > n / 2){
                return num;
            }
        }
        return -1;
    }
}