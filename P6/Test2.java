package P6;

public class Test2 {

    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String s) -> {
//            int a = 5;
            return s.length() + i;
        });
//        System.out.println(a);
    }

}

interface I {
    int abc(String s);
}
