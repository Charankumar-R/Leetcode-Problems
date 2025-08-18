class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxArea = 0;
        while(l < r){
            int h = Math.min(height[l], height[r]);
            maxArea = Math.max(h * (r - l), maxArea);
            while (l < r && height[l] <= h) l++;
            while (l < r && height[r] <= h) r--;
        }
        return maxArea;
    }
}