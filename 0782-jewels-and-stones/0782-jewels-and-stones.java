class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for(char jewel : jewels.toCharArray()){
            jewelSet.add(jewel);
        }
        int count = 0;
        for(char stone : stones.toCharArray()){
            if (jewels.indexOf(stone) != -1){
                count++;
            }
        }
        return count;
    }
}