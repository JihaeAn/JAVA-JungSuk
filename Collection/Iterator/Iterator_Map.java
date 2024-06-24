package Collection.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterator_Map {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("안지해", 25);
        map.put("id","anjihae");
        System.out.println(map);

        Set jihaeSet = map.entrySet();

        System.out.println(jihaeSet);
        Iterator it = jihaeSet.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        // 궁금점 1.
        // map.entrySet()받은 set이 무슨 set이지?

    }
}
