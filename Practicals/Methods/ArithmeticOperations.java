import java.util.Scanner;
public class ArithmeticOperations{

    public static float add(float numOne, float numTwo){
        return numOne + numTwo;
    }
    public static float subtract(float numOne, float numTwo){
        return numOne - numTwo;
    }
    public static float multiply(float numOne, float numTwo){
        return numOne * numTwo;
    }
    public static float divide(float numOne, float numTwo){
        return numOne / numTwo;
    }
    public static float modulo(float numOne, float numTwo){
        return numOne % numTwo;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float numOne, numTwo;
        float sum, residue, product, quotient, remainder;
        System.out.print("Enter the first number: ");
        numOne = sc.nextFloat();
        System.out.print("Enter the second number: ");
        numTwo = sc.nextFloat();

        sum = add(numOne, numTwo);
        System.out.println("The Sum of the two numbers: "+sum);        
        residue = subtract(numOne, numTwo);
        System.out.println("The Subtraction of the two numbers: "+residue);
        product = multiply(numOne, numTwo);
        System.out.println("The Product of the two numbers: "+product);
        quotient = divide(numOne, numTwo);
        System.out.println("The Division of the two numbers: "+quotient);
        remainder = modulo(numOne, numTwo);
        System.out.println("The Modulo Division of the two numbers: "+remainder);

    }
}