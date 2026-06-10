class Solution {
    public int solution(int n) {
        
        int result = 0;
        
        if(n % 2 == 1) {
            for(int i=1; i<=n; i++) {
                if(i % 2 == 1 ) result += i;
            }
        } else {
            for(int i=1; i<=n; i++) {
                if(i % 2 != 1) result += i*i;
            }
        }
        return result;
    }
}