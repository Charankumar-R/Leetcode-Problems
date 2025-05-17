import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums.length,res,nums);
        return res;
    }

    private static void backtrack(int start,int end,List<List<Integer>> res,int[] nums){
        if(start == end){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
            return;
        }
        for(int i=start; i<end; i++){
            rev(start,i,nums);
            backtrack(start+1,end,res,nums);    
            rev(start,i,nums);    
        }
    }

    private static void rev(int i,int start,int[] nums){
        int temp=nums[start];
        nums[start]=nums[i];
        nums[i]=temp;
    }
}