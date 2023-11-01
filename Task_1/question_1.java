//1]

//The issue is in the for loop condition. You are using i <= numbers.length, which will cause an ArrayIndexOutOfBoundsException because array indices in Java are zero-based, so you should use i < numbers.length instead.

//Here's the corrected code:

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}