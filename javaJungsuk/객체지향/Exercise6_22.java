package javaJungsuk.객체지향;

public class Exercise6_22 {
    public static boolean isNumber(String str){
        if(str == null || str == "") return false;

        for(int i = 0; i < str.length(); i++){
            Character cha = str.charAt(i);
            if(cha < '0' || cha > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "은 숫자입니까? " + isNumber(str));

        str = "";
        System.out.println(str + "은 숫자입니까? " + isNumber(str));
    }
}
