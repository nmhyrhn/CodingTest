class Solution {
    public int solution(int a, int b) {
        
        String ab = String.valueOf(a)+String.valueOf(b);
        int ans = Integer.parseInt(ab);
        int ans2 = 2 * a * b;
        
        int result = 0;
        
        if(ans > ans2) {
            result = ans;
        } else if (ans < ans2) {
            result = ans2;
        } else {
            result = ans;
        }
        
        
        return result;
    }
}