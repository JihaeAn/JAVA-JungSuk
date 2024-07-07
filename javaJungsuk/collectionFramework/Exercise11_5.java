package javaJungsuk.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getToal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getToal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name +","+ ban +","+ no +","+ kor    +","+ eng +","+ math
                +","+ getToal() +","+getAverage();
    }
    public int compareTo(Object obj) {
        if(obj instanceof Student) {
            Student tmp = (Student) obj;
                return name.compareTo(tmp.name);
        }
        return -1;
    }
}
public class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이연주",1,4,70,90,70));
        list.add(new Student("안지해",1,5,100,90,100));

        Collections.sort(list);
        // System.out.println(list);
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }

}
