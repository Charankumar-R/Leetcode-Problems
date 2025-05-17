import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(1,new ArrayList<>(),res,n,k);
        return res;
    }

    private static void backtrack(int st,List<Integer> path,List<List<Integer>> res,int n,int k){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=st; i<n+1 ;i++){
            path.add(i);
            backtrack(i+1,path,res,n,k);
            path.remove(path.size()-1);
        }
    }
}