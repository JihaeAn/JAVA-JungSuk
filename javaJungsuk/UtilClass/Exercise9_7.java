package javaJungsuk.UtilClass;

public class Exercise9_7 {

    static boolean contains(String src, String target) {
        // 1️⃣ contains()로 푸는법
        return src.contains(target);

        // 2️⃣ indexOf로 푸는 방법
//        int result = src.indexOf(target);
//        if(result == -1){
//            return false;
//        }
//        return true;

        // 2️⃣-1️⃣indexOf 더 짧은 코드로 푸는 방법
//         return src.indexOf(target) != -1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
