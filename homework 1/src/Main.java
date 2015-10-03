import java.util.*;

public class Main {

    public static void main(String[] args) {

        int A[] ={ -1,0,-3,-44,-210};
        HW1 hw = new HW1();
        int res= lucky3(2,13,3);
//        System.out.println("the result of lucky3 is "+ res);
        System.out.println();
        long res2= maxProduct(A);

        System.out.println("For Array A == " + Arrays.toString(A));
        System.out.println("Its max-product of two elements is "+ res2);
        System.out.println("Its max-product of two elements is "+ hw.maxProduct(A));


    }




    public static int lucky3(int a, int b, int c) {
        // write your code here
        int sum = 0;
        int A[] = {a, b, c};
        for (int i = 0; i < A.length; i++)
            if (A[i] == 13)
                return sum;
            else
                sum += A[i];
        return sum;
    }

    public static long maxProduct(int[] A) {
        // write your code here
        long result = A[0];
        int negMin = A[0], posMax = A[0];
        for (int i = 1; i < A.length; i++) {
            result = Math.max(result, Math.max(negMin * A[i], posMax * A[i]));
            negMin = Math.min(negMin, A[i]);
            posMax = Math.max(posMax, A[i]);
        }
        return result;
    }
}
