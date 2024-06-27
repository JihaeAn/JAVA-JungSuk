package javaJungsuk.객체지향;

public class SutdaCard {
    int num = 1;
    boolean isKwang = true;

    public SutdaCard(){
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

//    public String info(){
//        String answer;
//        if(isKwang == true){
//            answer = num + "K";
//        }else{
//            answer = String.valueOf(num);
//        }
//        return answer;
//    }

    public String info(){
        return (isKwang == true) ? num+"K" : String.valueOf(num);
    }

    public String toString(){
        return num + ( isKwang ? "K" : "");
    }
}