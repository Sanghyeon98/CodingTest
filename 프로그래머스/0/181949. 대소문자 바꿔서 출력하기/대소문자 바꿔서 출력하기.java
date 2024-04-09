import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] str = a.split("");
        
        int index = 0;
        for(int i = 0; i < str.length; i++) {
            if(Character.isUpperCase(str[i].charAt(0))) {
                str[i] = str[i].toLowerCase();
            } else if(Character.isLowerCase(str[i].charAt(0))) {
                str[i] = str[i].toUpperCase();
            }
            System.out.print(str[i]);
        }
    }
}