public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDis = Integer.MAX_VALUE;
        int minSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++) {
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target)
                    return target;
                if (sum < target) 
                    low ++;
                else 
                    high --;
                minSum = Math.abs(sum - target) < minDis ? sum: minSum;
                minDis = Math.min(Math.abs(sum - target), minDis);
            }
        }
        return minSum;
    }
}