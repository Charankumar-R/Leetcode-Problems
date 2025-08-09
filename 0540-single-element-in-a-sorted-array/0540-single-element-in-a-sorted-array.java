class Solution {
    public int singleNonDuplicate(int[] nums) {
        // XOR Approach
        // int xor = 0;
        // for (int n : nums){
        //     xor ^= n;
        // }
        // return xor;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}