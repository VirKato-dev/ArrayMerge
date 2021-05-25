import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a1 = {0,2,2};
        int[] a2 = {1,3};
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));

        System.out.println(Arrays.toString(mergeArrays(a1, a2)));

    }


    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int lenA1 = a1.length;
        int lenA2 = a2.length;
        int lenA3 = lenA1 + lenA2;
        int[] a3 = new int[lenA3];
        int p1 = --lenA1;
        int p2 = --lenA2;
        int p3 = --lenA3;
        while (p3 >= 0) {
            if (p1>=0 & p2>=0) {
                if (a1[p1] >= a2[p2]) {
                    a3[p3] = a1[p1];
                    p1--;
                } else {
                    a3[p3] = a2[p2];
                    p2--;
                }
            } else if (p1>=0) {
                a3[p3] = a1[p1];
                p1--;
            } else {
                a3[p3] = a2[p2];
                p2--;
            }
            p3--;
        }
        return a3;
    }

}
