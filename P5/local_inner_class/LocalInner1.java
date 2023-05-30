package P5.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }

}

class Math {

    private int a = 10;

    public void getResult(final int dividend, final int divisor) {
        class Division {

//            private int dividend;
//            private int divisor;

//            public int getDividend() {
//                return dividend;
//            }
//
//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

//            public int getDivisor() {
//                return divisor;
//            }
//
//            public void setDivisor(int divisor) {
//                this.divisor = divisor;
//            }

            public int getQuotient() {
                return dividend / divisor;
            }

            public int getRemainder() {
//                System.out.println(a);
                return dividend % divisor;
            }

        }
        Division division = new Division();
//        division.setDividend(21);
//        division.setDivisor(4);
        System.out.println("Dividend = " + dividend);
        System.out.println("Divisor = " + divisor);
        System.out.println("Quotient = " + division.getQuotient());
        System.out.println("Remainder = " + division.getRemainder());
    }

}
