class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int ab = Integer.parseInt(strA+strB);
        int ba = Integer.parseInt(strB+strA);;
        
        if(ba > ab){
            answer = ba;
        }else{
            answer =ab;
        }
                
        
        return answer;
    }
}