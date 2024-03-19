import java.util.Scanner;

public class NumToHangle {
        public static void main(String[] args) {
            String hangle = "영일이삼사오육칠팔구";

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String changeNum = String.valueOf(num);

            char[] hangleList = hangle.toCharArray();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < changeNum.length(); i++) {
                int digit = Character.getNumericValue(changeNum.charAt(i));
                result.append(hangleList[digit]);
            }

            System.out.println(result);
        }
}
