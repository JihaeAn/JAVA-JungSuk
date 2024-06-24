package javaJungsuk.객체지향;

public class Student {
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어 점수
    int eng;        // 영어 점수
    int math;       // 수학 점수

    public Student(){}
    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return kor + eng + math;
    }

    public float getAverage(){
        return Math.round((kor + eng + math) / 3.0f * 10) / 10.0f;
    }

    public String info(){
        return name + "," + ban + "," + no + "," + kor + ","
                + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}