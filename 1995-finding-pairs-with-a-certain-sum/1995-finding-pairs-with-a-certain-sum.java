class FindSumPairs {
    int[] n1,n2;
    Map<Integer, Integer> m = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for(int i : n2){
            m.put(i, m.getOrDefault(i, 0) +1);
        }
    }
    
    public void add(int ind, int val) {
        m.put(n2[ind], m.get(n2[ind])- 1);
        n2[ind] += val;
        m.put(n2[ind], m.getOrDefault(n2[ind], 0) + 1);
    }
    
    public int count(int tot) {
        int c = 0;
        for (int x :n1){
            c += m.getOrDefault(tot-x,0);
        }
        return c;
    }
}
// m.getOrDeafult(a,b);
// if the get value a is present in the Hashmap then it returns a or else it returns the default value 

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */