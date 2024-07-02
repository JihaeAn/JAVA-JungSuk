package javaJungsuk.예외처리;

public class Exercise8_7 {
    static void method(boolean b){
        try {
            System.out.println(1);
            if(b) System.exit(0);   // System.exit() 코드가 읽히는 즉시 강제 종료. 이후 구문은 출력x
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
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);   // 1
        method(false);  // 1 2 5 6
        // 둘이 같이 실행하면 1만 출력됨
    }
}
