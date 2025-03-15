class Solution {
    public boolean isPalindrome(int x) {
        int temp = x ;
        int x1 = x ;
        int sum = 0 ;
       int digit = 0;
        while(x > 0){
            x = x / 10 ;
            digit++;
        }
        while(x1>0){
            int r = x1 % 10 ;
            sum = sum * 10 + r ;
            x1 = x1 / 10 ;
        }

        if(temp == sum){
            return true ;
        }
        else{
            return false;
        }

    }
}