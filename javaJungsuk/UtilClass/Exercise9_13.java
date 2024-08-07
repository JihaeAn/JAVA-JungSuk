package javaJungsuk.UtilClass;

public class Exercise9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") +"개 찾았습니다.");

        String src2 = "안녕하세요.저는지해입니다.안지해지해";
        System.out.println(src2);
        System.out.println("지해를 " + stringCount(src2, "지해") +"번 찾았습니다.");
    }

    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }

    static  int stringCount(String src, String key, int from) {
        int count = 0;
        int index = 0;

        if(key == null || key.isEmpty())
            return 0;

        while((index = src.indexOf(key, from)) != -1) {
            count ++;
            from = index + key.length();
        }

        return count;
    }
}
