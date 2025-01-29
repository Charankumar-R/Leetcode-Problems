class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        if(n<=2){
            return 0;
        }
        //int arr[]=height[n];
        int l[]=new int[n];
        int r[]=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++){
            if(i==0){
                l[i]=arr[i];
            }
            else if(arr[i]<l[i-1]){

                l[i]=l[i-1];
            }
            else{
                l[i]=arr[i];
            }
        }
        for(i=n-1;i>=0;i--){
            if(i==n-1){
                r[i]=arr[i];
            }
            else if(arr[i]<r[i+1]){
                r[i]=r[i+1];
            }
            else{
                r[i]=arr[i];
            }
        }

        for(i=0;i<n;i++){
            sum=sum+((int)(Math.min(l[i],r[i]))-arr[i]);
        }
        return sum;
    }
}