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
            printArray(arr);
        }
        return arr;
    }

    public static void main(String a[]){

        int[] arr1 = { 9,5,8,4,7,3};
        int[] arr2 = selectionSort(arr1);
    }

    private static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i] + "\t");        
        System.out.println();
    }
}
