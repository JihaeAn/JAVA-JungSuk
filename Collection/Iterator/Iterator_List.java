package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("지해짱");
        list.add("건희짱");

        Iterator it = list.iterator();
        System.out.println(it);

        while(it.hasNext()){
            System.out.println(it.next());
        }
        // System.out.println(it.next()); // 1회성이라서 위에서 한번 while문 돌리고 없어졌음 !
    }
}
