class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int ind=0;
        for(Integer n:nums1){
            set1.add(n);
        }
        for(Integer v:nums2){
            set2.add(v);
        }
        set1.retainAll(set2);
        
        int ans[]=new int[set1.size()];
        for(int s:set1){
            ans[ind]=s;
            ind++;
        }
        return ans;
    }
}