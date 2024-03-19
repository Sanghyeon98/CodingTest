public class Solution {
    public static void main(String[] args) {
        Solution.solution("abced");
    }
    public static String solution(String s) {
        String answer = "";

        int length = s.length();
        int midIndex = length / 2;
        System.out.println(length);
        System.out.println(midIndex);


        if (length % 2 == 0) {
            answer = s.substring(midIndex - 1, midIndex + 1);
            return answer;
        } else {
            answer = String.valueOf(s.charAt(midIndex));
            return answer;
        }

    }
}
