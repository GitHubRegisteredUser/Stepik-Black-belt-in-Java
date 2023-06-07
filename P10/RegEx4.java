package P10;

public class RegEx4 {

    public static void main(String[] args) {
        String s1 = "Hi, my  friend!   How    is     your      Java       learning        going?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" {2,}", " ");
//        s1 = s1.replaceAll("\\bH\\w+", "4444");
        s1 = s1.replaceFirst("\\bH\\w+", "4444");
        System.out.println(s1);
    }

}
