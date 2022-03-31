//              https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> arr=new ArrayList();
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    row.add(arr.get(i-2).get(j)+arr.get(i-2).get(j-1));
                }
            }
            arr.add(row);
        }
        return arr;
        
      
    }
}
