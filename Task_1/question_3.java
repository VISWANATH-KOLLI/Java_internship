//3]

//There is a division by zero error in this line:
//int result = divide(10, 0);
//This line attempts to divide 10 by 0, which is not allowed in Java and will result in an ArithmeticException being thrown at runtime. To fix this issue, you should add a try-catch block to handle this exception.
// Here's the modified code:
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}