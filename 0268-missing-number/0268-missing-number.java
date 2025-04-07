class Solution {
    public int missingNumber(int[] nums) {
        // Get the length of the array
        int n = nums.length;
        
        // Loop through all numbers from 0 to n (inclusive)
        for (int i = 0; i <= n; i++) {
            boolean found = false; // Assume the number i is missing
            
            // Check if the number i exists in the array
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true; // Found i in the array
                    break; // No need to check further
                }
            }
            
            // If i was not found in the array, return it — that's the missing number
            if (!found) {
                return i;
            }
        }
        
        // This return should never be reached, just a fallback
        return -1;
    }
}
