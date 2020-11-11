package vn.techmaster;

public class Sum2 {

    public static int sum2(int[] a,int startIndex, int endIndex) {
        // #1 Your implementation
        if (endIndex > startIndex) {
            return endIndex + sum2(a, startIndex, endIndex - 1);
        } else {
            return endIndex;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // #2 call sum2
        System.out.println(sum2(a,a[0],a[a.length-1]));
    }
}