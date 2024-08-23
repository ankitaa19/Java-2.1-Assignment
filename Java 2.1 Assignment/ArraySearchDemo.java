public class ArraySearchDemo {
    public static void main(String[] args) {
      
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        
        int target = 50;

        
        boolean found = false;

       
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; 
            }
        }

       
        if (found) {
            System.out.println("Element " + target + " is found in the array.");
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
}
