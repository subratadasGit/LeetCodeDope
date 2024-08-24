class Solution {
    public void moveZeroes(int[] nums) {
        // Temporary list to store non-zero elements
        ArrayList<Integer> temp = new ArrayList<>();
        
        // Add non-zero elements to temp
        for (int num : nums) {
            if (num != 0) {
                temp.add(num);
            }
        }

        // Number of non-zero elements
        int nz = temp.size();

        // Update the original array with non-zero elements
        for (int i = 0; i < nz; i++) {
            nums[i] = temp.get(i);
        }

        // Fill the remaining positions with zeros
        for (int i = nz; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
