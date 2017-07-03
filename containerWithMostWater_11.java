public class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int area = 0;
        while (low < high) {
            area 1= Math.max(area, Math.min(height[low], height[high]) * (high - low));
            if (height[low] > height[high])
                high--;
            else 
                low++;
        }
        return area;
    }
}