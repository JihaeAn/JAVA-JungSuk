package javaJungsuk.객체지향;

public class Exercise6_23 {
    public static int max(int[] arr){
        if(arr == null || arr.length == 0) return -999999;

        int biggest = arr[0];
        int length = arr.length;    // for문 돌 때마다 길이 구하는 메서드 도는 것보다 미리 구해놓는게 성능상 좋음
        for(int i = 1; i < length; i++){    // 배열의 두 번째 값부터 비교
            if(arr[i] > biggest) biggest = arr[i];
        }
        return biggest;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));
    }
}
