public class Main {
    public static void main(String[] args) {
        Ints intsCalc = IntsCalculator.getInstance();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.mult(12, 3));
        System.out.println(intsCalc.sub(20, 8));
        System.out.println(intsCalc.div(16, 4));
    }
}
