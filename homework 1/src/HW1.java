/*  Name:      Ashlee Troop
 *  
 *  Problem discription:
 *  Problem 1:  
 *    Given 3 input values, return their sum.
 *    However, if any of them is 13, then it does not count towards the sum, and the value to its right also does not count.
 *    here is the example:
 *    lucky3(1, 2, 3) → 6
 *    lucky3(1, 2, 13) → 3
 *    lucky3(1, 13, 3) → 1
 *
 *
 * Problem 2:
 *      MaxProduct
 *      Given an int array, return the max-product value of its two different values
 *      maxProduct( [ 2,1,3])  --> 6
 *      maxProduct([0,-1,1])-->0
 *      maxProduct([-1,-10,4,2]) --> 10
 *
 *
 *  Note:  do not change the frame work of this file
 *     i.e.  do no change class name, the method name.  otherwise, the Auto-test script cannot test your solution
 *
 */

public class HW1{
    public int lucky3(int a, int b, int c) {
        // write your code here
        int set[] = {a,b,c};
        int sum = 0;

        for(int i = 0; i < set.length;i++)
            if(set[i] == 13)
                return sum;
            else sum += set[i];
        return sum;

    }
    public long maxProduct(int[] A){
        // write your code here
        int maxone = 0;
        int maxtwo = 0;

        for(int n:A){
            if(maxone < n){
                maxtwo = maxone;
                maxtwo = n;}
            else if (maxtwo < n){
                maxtwo = n;}
        }
        return maxone * maxtwo;


    }
}