package javaJungsuk.예외처리;

public class UnsupportedFuctionException extends RuntimeException{
    final private int ERR_CODE;

    UnsupportedFuctionException(String str, int num){
        super(str);
        ERR_CODE = num;
    }

//    UnsupportedFuctionException(String str) {
//        this(str, 100);
//    }
    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[ " + getErrorCode() + " ] " + super.getMessage();
    }
}
