// https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] intervals) {
             Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> resultList = new ArrayList<>();
        resultList.add(intervals[0]);
        
        for(int i = 1; i < intervals.length; i++) {
            int[] prev = resultList.get(resultList.size() - 1);
            int[] curr = intervals[i];
            
            if(prev[1] < curr[0])
                resultList.add(curr);
            else {
                prev[1] = Math.max(prev[1], curr[1]);
            }
        }
                                  
        return resultList.toArray(new int[resultList.size()][2]);
    }
}
