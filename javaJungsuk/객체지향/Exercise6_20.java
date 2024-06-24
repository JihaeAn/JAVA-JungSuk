package javaJungsuk.객체지향;

public class Exercise6_20 {
    static int[] shuffle(int[] arr){

        int length = arr.length;
        for(int i = 0; i < length; i++){
            int a = (int)(Math.random() * 9);
            int origin = arr[i];
            arr[i] = arr[a];
            arr[a] = origin;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
