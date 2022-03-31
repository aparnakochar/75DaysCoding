//          https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] <= 0) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    int lo = i + 1;
                    int hi = nums.length - 1;
                    int sum = -nums[i];

                    while (lo < hi) {
                        if (nums[lo] + nums[hi] == sum) {
                            res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                            
                            //Avoiding duplicates.
                            while (lo < hi && nums[lo] == nums[lo + 1]) {
                                lo++;
                            }
                            //Avoiding duplicates.
                            while (lo < hi && nums[hi] == nums[hi - 1]) {
                                hi--;
                            }

                            lo++;
                            hi--;
                        }
                        else if (nums[lo] + nums[hi] < sum) {
                            lo++;
                        }
                        else {
                            hi--;
                        }
                    }
                }
            }
        }
        
        return res;
    }
}
