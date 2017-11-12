import java.util.Scanner;

// 16 - Many Methods And Instances

public class apples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();
        
        System.out.println("Enter name of first girlfriend here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
}