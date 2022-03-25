class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        int left=0;
        int res=-1;
        for(int i=0;i<n;i++){
           total=total+nums[i]; 
        }
  //      System.out.print(total);
        for(int i=0;i<n;i++){
         total=total-nums[i];
            if(left==total){
               return  i;
                //break;
            }
            
                left=left+nums[i];
            
        }
        return res;
    }
}
