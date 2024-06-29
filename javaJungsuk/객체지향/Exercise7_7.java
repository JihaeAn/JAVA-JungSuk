package javaJungsuk.객체지향;
class Parent{
    int x = 100;

    Parent() {
        this(200);
    }
    Parent(int x){
        this.x = x;
    }
    int getX(){
        return x;
    }
}
class Child extends Parent {
    int x = 3000;
    Child() {
        this(1000);
    }
    Child(int x) {
        this.x = x;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x= " + c.getX());
        // x= 200
        // Child의 생성자를 호출할 때마다 super()가 호출된다는 것 잊지 말기 !
    }
}
