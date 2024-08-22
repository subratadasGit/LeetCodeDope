
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        int k = 0; // This will track the index of the next unique element.
        
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) { // If the element is not already in the set.
                set.add(nums[i]); // Add it to the set.
                nums[k] = nums[i]; // Place it at index k in the array.
                k++; // Increment the unique element counter.
            }
        }
        
        return k; // Return the count of unique elements.
    }
}
