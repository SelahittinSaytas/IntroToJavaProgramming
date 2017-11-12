import java.util.Scanner;

// 8 - Math Operators

public class apples {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        
        int girls, boys, peopleAddition, peopleSubtraction, peopleMultiplication, peopleDivision, peopleModule;
        girls = 17;
        boys = 7;
        peopleAddition = girls + boys;
        peopleSubtraction = girls - boys;
        peopleMultiplication = girls * boys;
        peopleDivision = girls / boys;
        peopleModule = girls % boys;
        
        System.out.println(peopleAddition);
        System.out.println(peopleSubtraction);
        System.out.println(peopleMultiplication);
        System.out.println(peopleDivision);
        System.out.println(peopleModule);
    }
}