class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        boolean dupF = false ;

        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i]==nums[i+1]){
                dupF=true ;
                break;
            }
        dupF=false ;
        }

        return dupF;
    }
}