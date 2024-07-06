package javaJungsuk.UtilClass;

public class Exercise9_12 {
    public static int getRand(int from, int to) {
        // Math.abs(to - from) +1) 에서 +1은 0을 포함하려고 하는 거 알지?
        return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            System.out.print(getRand(1,-3) + ",");
        }
        System.out.println();
        for(int i = 0; i < 20; i++) {
            System.out.print(getRand(6,-1) + ",");
        }
    }
}
