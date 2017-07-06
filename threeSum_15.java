public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    List<Integer> correct = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(correct);
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    low++; high--;
                } else if (nums[i] + nums[low] + nums[high] < 0 ) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}