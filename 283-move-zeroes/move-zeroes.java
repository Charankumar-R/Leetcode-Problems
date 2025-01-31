// class Solution {
//     public void moveZeroes(int[] nums) {
//         int i=0;
//         int l=nums.length;
//         for(int j=0;j<l;j++){
//             if(nums[j]!=0){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//             }
//         }
//     }
// }
class Solution {
    
    //  static {
    //     for (int i = 0; i < 500; i++) {
    //         moveZeroes(new int[] {});
    //     }
    // }
    
    public static void moveZeroes(int[] nums) {
        
        int j = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
        } 
        
    }
}