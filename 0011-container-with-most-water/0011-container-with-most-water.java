class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int area = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, (right - left) * area);
            while (left < right && height[left] <= area) left++;
            while (left < right && height[right] <= area) right--;
        }
        return maxArea;
    }
}