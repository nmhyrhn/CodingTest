class Solution {
    public int solution(int n, String control) {
        int result = n;
        
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            
            if (c == 'w') {
                result += 1;
            } else if (c == 's') {
                result -= 1;
            } else if (c == 'd') {
                result += 10;
            } else if (c == 'a') {
                result -= 10;
            }
        }
        
        return result;
    }
}