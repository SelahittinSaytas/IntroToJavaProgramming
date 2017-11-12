import java.util.Scanner;

public class apples {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner answer = new Scanner(System.in);
        
        System.out.print(answer.nextLine() + ", ");
        System.out.println("What is your name ?");
        System.out.print(answer.nextLine() + ", ");
        System.out.println("it is a nice name!");
        System.out.println(answer.nextLine());
    }
}
