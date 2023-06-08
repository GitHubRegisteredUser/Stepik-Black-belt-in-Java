package P11;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("My friend!\nHow are you?\n----------");
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }
        System.out.println(scanner.nextLine().charAt(9));
        scanner.close();
    }

}
