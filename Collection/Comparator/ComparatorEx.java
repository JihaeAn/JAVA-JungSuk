package Collection.Comparator;
import java.util.Arrays;


public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"tiger", "cat" ,"dog", "lion" };

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));    // 배열은 Arrays라는 static 클래스의 메서드들을 활용할 것

        Person p1 = new Person(25, "안지해");
        Person p2 = new Person(27, "조건희");
        System.out.println(p1.compareTo(p2));
    }
}

class Person implements Comparable{
    private int age;
    private String name;

    public Person(){

    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object obj){
        Person p = new Person();
        if(obj instanceof Person) {
            p = (Person)obj;
        }
        return (this.age > p.age) ? 1 : (this.age == p.age) ? 0 : -1;
    }
}