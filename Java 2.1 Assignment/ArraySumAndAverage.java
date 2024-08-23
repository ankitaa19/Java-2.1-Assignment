public class ArraySumAndAverage {
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};

        
        int sum = 0;
        double average;

       
        for (int number : numbers) {
            sum += number;
        }

       
        if (numbers.length > 0) {
            average = (double) sum / numbers.length;
        } else {
            average = 0.0;
        }
// Print the sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
