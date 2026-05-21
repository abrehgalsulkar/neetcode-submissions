class Solution {
    public int climbStairs(int n) {
        switch(n) {
            case 1: return 1;
            case 2: return 2; 
        }
        int onestepbefore = 2;
        int twostepsbefore = 1;
        int curr = 0;
        for (int i = 3; i <= n; i++) {
            curr = 0;
            curr += onestepbefore;
            curr += twostepsbefore;
            twostepsbefore = onestepbefore;
            onestepbefore = curr;
        }
        return curr;
    }
}