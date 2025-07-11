package structure;

import java.util.Arrays;

public class ArraysEqualsCompareToString {

    void main() {
        System.out.println("Permute int value");
        int[] ia = {1, 2, 3, 4, 5}, ib = {1, 2, 3, 4, 5};
        System.out.println(
                "ia = " + Arrays.toString(ia) +
                        "ib = " + Arrays.toString(ib));
        System.out.println("By Arrays.equals(): " + Arrays.equals(ia, ib));
        System.out.println("compare(ia,ib) returns " + Arrays.compare(ia, ib));
        ia[4] = 6;
        System.out.println(
                "ia = " + Arrays.toString(ia) + ", " +
                        "ib = " + Arrays.toString(ib));
        System.out.println("By Arrays.equals(): " + Arrays.equals(ia, ib));
        System.out.println("compare(ia,ib) returns " + Arrays.compare(ia, ib));
    }
}
