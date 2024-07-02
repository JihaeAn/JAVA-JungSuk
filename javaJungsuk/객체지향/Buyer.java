package javaJungsuk.객체지향;

import java.util.Arrays;

public class Buyer {
    int money = 1000;
    Product3[] cart = new Product3[3];    // 구입한 제품을 저장하기 위한 배열
    int i = 0;                            // Product 배열 cart에 사용될 index

    void buy(Product3 p) {
        if(p.price > money) {
            System.out.println("잔액이 부족하여 " + p + "를 살 수 없습니다.");    // p.toString() 안 해도 됨! 오버라이딩 해놨잖아 !
            return;
        } else {
            money -= p.price;
            add(p);
        }
    }
    void add(Product3 p) {
        if(i == cart.length){
            Product3[] cart2 = Arrays.copyOf(cart, (cart.length) * 2);
            cart = cart2;
        }
        cart[i] = p;
        i++;
    }
    void summary() {
        System.out.println("장바구니 목록: " + Arrays.toString(cart));
        int totalPrice = 0;
        for(Product3 pp : cart){
            if(pp == null) break;   // 유효성 검사도 해주자!!!!!
            totalPrice += pp.price;
        }
        System.out.println("사용한 금액: " + totalPrice);
        System.out.println("남은 돈: " + money);
    }
}
class Product3 {
    int price;      // 제품의 가격

    Product3(int price) {
        this.price = price;
    }
}

class Tv2 extends Product3 {
    Tv2() { super(100); }

    public String toString() { return "Tv"; }
}

class Computer extends Product3 {
    Computer() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio extends Product3 {
    Audio() { super(50); }

    public String toString() { return "Audio"; }
}