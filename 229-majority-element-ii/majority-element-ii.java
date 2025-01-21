class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        int n = nums.length;

        for(int i=0;i<n;i++) {
            if(count1 == 0 && element2 != nums[i]) {
                count1 = 1;
                element1 = nums[i];
            }
            else if(count2 == 0 && element1 != nums[i]) {
                count2 = 1;
                element2 = nums[i];
            }
            else if(element1 == nums[i]) count1++;
            else if(element2 == nums[i]) count2++;
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0;i<n;i++) {
            if(element1 == nums[i]) count1++;
            if(element2 == nums[i]) count2++;
        }

        int mini = (int)(n/3) + 1;
        List<Integer> res = new ArrayList<>();

        if(count1 >= mini) res.add(element1);
        if(count2 >= mini) res.add(element2);

        Collections.sort(res);
        return res;
    }
}