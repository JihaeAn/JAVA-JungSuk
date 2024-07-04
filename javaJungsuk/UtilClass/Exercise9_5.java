package javaJungsuk.UtilClass;

public class Exercise9_5 {
    public static int count(String src, String target) {
        int count = 0;  // 찾은 횟수
        int pos = 0;    // 찾기 시작할 위치

        for(int i = 0; i < src.length(); i++) {
            pos = src.indexOf(target, pos);

            if(pos == -1) {
                return count;
            }
            count++;
            pos += target.length(); // 증감식으로 써줘야 찾기 시작할 위치가 계속 올라가는 거야 =만 쓰면 안 돼 !!!
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
