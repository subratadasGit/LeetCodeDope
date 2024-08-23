class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; // Corrected variable declaration
        k = k % n; // Handle cases where k > n

        // Reverse the first part
        rev(nums, 0, n - 1);    // Reverse the entire array // 7654321
        rev(nums, 0, k - 1);    // Reverse the first k elements // k=3 // 5674321
        rev(nums, k, n - 1);    // Reverse the rest of the array // 5671234
    }

    // Corrected rev method with proper types and logic
    private void rev(int arr[], int start, int end) {
        while (start < end) {  // Use '<' to avoid unnecessary swaps
            int temp = arr[start];  
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
