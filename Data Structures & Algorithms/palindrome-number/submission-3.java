class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        } else if(x < 0 || (x%10 == 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        int length = String.valueOf(Math.abs(x)).length(); 

        while (x > reversedHalf) {
            reversedHalf = reversedHalf*10 + (x%10);
            x = x/10;
        }
        if(length %2 != 0) {
            reversedHalf = reversedHalf/10;
        }

        if(reversedHalf == x) {
            return true;
        }
        return false;
    }
}