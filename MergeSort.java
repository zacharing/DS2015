public class MergeSort{
    public static void main(String[] args){
        int[] A = { 9,5,8,4,7,3};
        mergeSort(A);
    }

    public static void mergeSort(int[] A){
        mergeSort(A,  0,  A.length - 1);
    }


    private static void mergeSort(int[] A, int left, int right){
        if( left < right ){
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A,  mid + 1, right);
            merge(A, left, mid , right);
        }
    }


    private static void merge(int[] A, int left, int mid, int right ){
        // create B
        int B[] = new int[mid-left+2];
        for(int i=0;i+left<=mid;i++)
            B[i]=A[left+i];
        B[B.length-1] = Integer.MAX_VALUE;
        // create C
        int C[] = new int[right-mid+1];
        for(int i =0;i<C.length-1;i++)
            C[i] = A[mid+1+i];
        C[C.length-1] = Integer.MAX_VALUE;

        // merge them together
        int iB=0,iC=0;
        for(int i =left;i<=right;i++)
            if(B[iB]<C[iC])
                A[i]=B[iB++];
            else
                A[i] = C[iC++];
            printNumbers(A);
    }

    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i] + "\t");
        
        System.out.println();
    }
 }
