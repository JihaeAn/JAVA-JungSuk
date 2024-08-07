package javaJungsuk.예외처리;

public class Exercise8_5 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if(b) throw new ArithmeticException();
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
    }
    public static void main(String[] args) {
        method(true);
        method(false);
        // 1 3 5
        // 1 2 5
    } // main
}
