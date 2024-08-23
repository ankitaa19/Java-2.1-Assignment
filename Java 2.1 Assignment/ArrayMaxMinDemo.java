public class ArrayMaxMinDemo {
    public static void main(String[] args) {
        
        int[] numbers = {45, 23, 78, 56, 89, 12, 67};

        
        int max = numbers[0];
        int min = numbers[0];

        
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
