package javaJungsuk.객체지향;

class Product{
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    // Product의 기본 생성자가 없으면 오류가 남 !
    // Tv (자식 클래스) 생성자 호출할 때 컴파일러가 자동으로 super()를 추가해준다. 그러나 super()는 기본생성자이기 때문 !!
    Product(){}
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}
class Tv extends Product{
    Tv(){}
    public String toString(){
        return "Tv";
    }
}
public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
