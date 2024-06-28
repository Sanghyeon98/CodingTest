class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numString = number.trim().split("");
        for(int i =0; i<numString.length; i++){
            answer += Integer.parseInt(numString[i]);
        }
        int realAnswer = answer % 9;
      
        return realAnswer;
    }
}