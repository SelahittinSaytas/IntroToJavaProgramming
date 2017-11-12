import java.util.Scanner;

// 15 - Use Methods With Parameters

public class apples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        tunaObject.simpleMessage(name);
    }
}