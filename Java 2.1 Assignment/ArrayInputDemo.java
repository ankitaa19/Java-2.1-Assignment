import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        
        int[] numbers = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        scanner.close();

        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }
    }
}
