
// 12 - Switch Statement

// What switch does is find the variable value in the parameters

public class apples {
    public static void main(String[] args) {
        
        int age;
        age = 3;
        
        switch(age){
            case 1:
                System.out.println("You can crawl!");
                break;
            case 2:
                System.out.println("You can talk!");
                break;
            case 3:
                System.out.println("You can get in trouble");
                break;
            default:
                System.out.println("I don't know how old you are!");
        }
    }
}