class Solution
{
    public int maxProduct(int[] nums)
    {
       int n = nums.length; 
       int prefix = 1,suffix=1,pre_max = nums[0], suff_max = nums[n-1];
       int i; 
       for(i=0;i<=n-1;i++)
       {
        prefix = prefix * nums[i]; 
        if(pre_max < prefix)
        {
            pre_max = prefix;
        }
        if(prefix == 0 )
        {
            prefix = 1;
        }
       }
       for(i=n-1;i>=0;i--)
       {
        suffix = suffix * nums[i]; 
        if(suff_max < suffix)
        {
            suff_max = suffix;
        }
        if(suffix == 0 )
        {
           suffix = 1;
        }
       }
       return (pre_max>suff_max)?pre_max:suff_max;
    }
} 
