package javaJungsuk.객체지향;

public class Exercise6_24 {
    public static int abs(int value){
        // if(value < 0) value = value * -1;
        return value >= 0 ? value : -value; // 삼항연산자가 성능상 더 빠르다.
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));

        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}
