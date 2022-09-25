import java.util.*;

public class Stringpal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your string : ");
        String str = s.next();
        String org_str = str;

        String rev = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {
            System.out.println(org_str + " is palindrome string");
        } else {
            System.out.println(org_str + " is Not palindrome string");

        }
    }
}
