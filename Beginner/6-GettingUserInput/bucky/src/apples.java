import java.util.Scanner;

// Getting user input by using java.util.Scanner
public class apples {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        //Scanner askName = new Scanner(System.in);
        
        System.out.print(bucky.nextLine() + ", ");
        System.out.println("What is your name? ");
        String name = bucky.nextLine();
        System.out.println("Hello " + name + ", How are you doing?");
        String answer = bucky.nextLine();
        
        if(bucky.nextLine() == "I am doing well") {
            System.out.println("Glad to hear it!");
        } else {
            System.out.println("Great!");
        }
    }
}