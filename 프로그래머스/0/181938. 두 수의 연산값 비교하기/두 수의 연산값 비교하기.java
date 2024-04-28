class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strab = ""+a+b;
        int ab= Integer.parseInt(strab);
        
        answer = 2*a*b > ab ? 2* a*b : ab;
        
        return answer;
    }
}