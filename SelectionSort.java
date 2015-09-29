public class SelectionSort {
 
    public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[smallestIndex])
                    smallestIndex = j;
      
            int tmp = arr[smallestIndex]; 
            arr[smallestIndex] = arr[i];
            arr[i] = tmp;            
            // printNumbers(arr);
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = selectionSort(arr1);
    }

    // private static void printNumbers(int[] input) {         
    //     for (int i = 0; i < input.length; i++) {
    //         System.out.print(input[i] + "\t");
    //     }
    //     System.out.println();
    // }
}