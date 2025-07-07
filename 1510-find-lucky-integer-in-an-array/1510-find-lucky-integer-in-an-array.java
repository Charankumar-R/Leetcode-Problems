class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int luck= -1;
        for(int i:map.keySet()){
            if(map.get(i) == i){
                luck = i;
            }
        }
        return luck;
    }
}