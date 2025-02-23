import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                a.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                a.append(Character.toUpperCase(c));
            }
        }
        System.out.println(a.toString());
    }
}