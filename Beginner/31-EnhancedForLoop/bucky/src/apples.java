
// 31 - Enhanced For Loop

public class apples {
    public static void main(String[] args) {
        // Array initializer
        int bucky[] = {3, 4, 5, 6, 7};
        
        int total = 0;
        
        // Enhanced for statement - instead of taking 3 options, it only takes 2 different things
        // that it needs in the parameters or parantheses
        // The first thing it needs the type of data and an identifier
        // 'int' is type, 'x' is identifier - Type Identifier
        // 'x' is going to store the values in the array as it's looping through the array
        // Second the array we're working on
        
        for(int x: bucky){
            total += x;
        }
        
        System.out.println(total);
    }
}