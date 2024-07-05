package javaJungsuk.UtilClass;

public class Exercise9_8 {
    public static double round(double d, int n) {
        // Maht.pow() 메서드가 두 번 돌지 않도록 짜본 코드
//        double a = Math.pow(10, n);
//        return Math.round(d * a) / a;

        return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
