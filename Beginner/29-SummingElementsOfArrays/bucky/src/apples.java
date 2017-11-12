
// 29 - Summing Elements Of Arrays

public class apples {
    public static void main(String[] args) {
        // Array initializer
        int bucky[] = {1, 3, 7, 13, 17, 33, 77};
        int sum = 0;
        
        for(int loopCounter = 0; loopCounter < bucky.length; loopCounter++){
            sum += bucky[loopCounter];
        }
        
        System.out.println("The sum of these numbers is " + sum);
    }
}