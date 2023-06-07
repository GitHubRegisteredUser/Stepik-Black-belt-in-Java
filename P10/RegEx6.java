package P10;

import java.util.regex.Pattern;

public class RegEx6 {

    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        RegEx6 r6 = new RegEx6();
        r6.checkIP(ip1);
        r6.checkIP(ip2);
    }

}
