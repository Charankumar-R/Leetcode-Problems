class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while(left < right){
            int area = Math.min(height[left],height[right]);
            max = Math.max(max, (right - left) * area);
            while (left < right && height[left] <= area) left++;
            while (left < right && height[right] <= area) right--;
        }
        return max;
    }
}