class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int count=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                arr1[j]=nums[i];
                j++;
            }
        }
        int len=n-count;
        for(int i=len;i<n;i++){
            arr1[i]=0;
        }
        for(int i=0;i<n;i++)
      nums[i]=arr1[i];
    }
}
