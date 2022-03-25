class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums[i];
        //    System.out.print(a);
            int b=a*a;
            arr[i]=b;
         //   System.out.print(b);
        }
        Arrays.sort(arr);
        return arr;
    }
}
