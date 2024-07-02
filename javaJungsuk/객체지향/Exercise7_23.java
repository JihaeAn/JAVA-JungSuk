package javaJungsuk.객체지향;

public class Exercise7_23 {
    static double sumArea(Shape[] arr) {
        double total = 0;
        for(Shape s : arr){
            total += s.calcArea();
        }
        return total;
    }
    public static void main(String[] args) {
        Shape[] arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합: " + sumArea(arr));
    }

}
