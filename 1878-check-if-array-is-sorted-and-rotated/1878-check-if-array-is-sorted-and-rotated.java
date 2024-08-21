class Solution {
    public boolean check(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;

        // Count the number of breaks in the array
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                countBreaks++;
            }
        }
        
        // Check the wrap-around break (last element and first element)
        if (nums[n - 1] > nums[0]) {
            countBreaks++;
        }
        
        // The array is sorted and rotated if there is at most one break
        return countBreaks <= 1;
    }
}
