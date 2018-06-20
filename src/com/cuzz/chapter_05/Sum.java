package com.cuzz.chapter_05;

public class Sum {
    public static int sum(int[] arr, int start) {
        if (start == arr.length) {
            return 0;
        }
        return arr[start] + sum(arr, start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int res = sum(arr, 0);
        System.out.println(res);
    }
}
