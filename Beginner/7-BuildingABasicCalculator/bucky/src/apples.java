import java.util.Scanner;

// Building a basic calculator

public class apples {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        double firstNumber, secondNumber, addition, subtraction, multiplication, division, modulo;
        
        System.out.println("Enter first number: ");
        firstNumber = bucky.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = bucky.nextDouble();
        
        addition = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber *  secondNumber;
        division = firstNumber / secondNumber;
        modulo = firstNumber % secondNumber;
        
        System.out.println("The addition of "+ firstNumber + " and " + secondNumber + "equals to " + addition);
        System.out.println("The subtraction of "+ firstNumber + " and " + secondNumber + "equals to " + subtraction);
        System.out.println("The multiplication of "+ firstNumber + " and " + secondNumber + "equals to " + multiplication);
        System.out.println("The division of "+ firstNumber + " and " + secondNumber + "equals to " + division);
        System.out.println("The modulo of "+ firstNumber + " and " + secondNumber + "equals to " + modulo);
    }
}