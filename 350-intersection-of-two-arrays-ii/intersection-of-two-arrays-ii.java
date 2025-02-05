class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1=new ArrayList<>();
        ArrayList<Integer> set2=new ArrayList<>();
        int ind=0;
        for(int n:nums1){
            set1.add(n);
        }
        for(int v:nums2){
            if(set1.contains(v))
            {
                set2.add(v);
                set1.remove((Integer) v);
            }
        }
        int ans[]=new int[set2.size()];
        for(int s:set2){
            ans[ind]=s;
            ind++;
        }
        return ans;
    }
}