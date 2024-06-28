package javaJungsuk.객체지향;

import java.util.HashMap;

public class Ex_12_2 {
    public static void main(String[] args) {
        HashMap<String, Student2> map = new HashMap<>(); // JDK1.7부터 생성자에 타입 지정 생략 가능
        map.put("자바왕", new Student2("자바왕",1, 1, 100, 100, 100));

        // public V get(Object key) => public Student2 get(Object key) 로 바뀜
        Student2 s = map.get("자바왕"); // 원래는 앞에 (Student2) 붙여서 형변환 해줘야 하는데 지네릭스 덕분에 안 해도 됨!
        System.out.println(s);
        System.out.println(map.get("자바왕").name);
    }
}
class Student2 {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}