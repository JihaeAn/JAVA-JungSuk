package javaJungsuk.객체지향;

abstract class Shape {
    Point p;

    Shape(){}
    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[ " + x + "," + y + " ]";
    }
}

class Circle extends Shape {
    double r;   // 반지름

    Circle(double r) {
        this(new Point(0, 0), r);   // Circle(Point p, double r)를 호출
    }
    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }
    double calcArea(){
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape{
    double width;   // 폭
    double height;  // 높이

    Rectangle(double width, double height) {
        // 해당 클래스의 다른 생성자를 통해 조상 클래스의 인스턴스 멤버
        // new Point(0, 0) 초기화
        this(new Point(0, 0), width, height);
    }
    Rectangle(Point p, double width, double height) {
        super(p);   // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.width = width;
        this.height = height;
    }
    double calcArea(){
        return width * height;
    }

    boolean isSquare() {
        return width * height != 0 && width == height ? true : false;
    }
}