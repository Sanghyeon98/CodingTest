public class StrMethod {
    public static void main(String[] args) {
        String str ="apple";

        //길이 반환 int타입
        str.length();

        //빈 문자열 체크 boolean
        str.isEmpty();

        //문자 찾기
        str.charAt(0);  //'a' -> 문자 반환
        str.indexOf("a"); // 0 -> 인덱스 반환
        str.lastIndexOf("p"); // 2-> 마지막으로 문자가 속ㄷ한 인덱스 반환

        //문자 자르기
        str.substring(1, 3); //"pp" -> 인덱스 1 이상 3 미만 위치의 문자열 반환
        str.substring(3); //"app" -> 인덱스 3 미만 위치의 문자열 반환

        //문자 치환(바꾸기)
        //replace([기존문자], [바꿀문자])
        str.replace('p','e'); //"

    }
}
