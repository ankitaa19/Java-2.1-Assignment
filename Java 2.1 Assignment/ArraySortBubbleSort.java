public class ArraySortBubbleSort {
    public static void main(String[] args) {
        
        int[] numbers = {45, 23, 78, 56, 89, 12, 67};

        
        System.out.println("Original array:");
        printArray(numbers);

        
        bubbleSort(numbers);

        
        System.out.println("Sorted array:");
        printArray(numbers);
    }

   
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
          
            if (!swapped) {
                break;
            }
        }
    }

  
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
