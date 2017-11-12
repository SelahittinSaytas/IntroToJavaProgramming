import java.util.Scanner;

// 9 - Increment Operators

public class apples {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        
        int tuna = 5;
        int bass = 17;
        int guitar = 33;
        
        ++tuna;
        --bass;
        //guitar = guitar + 17;
        guitar += 17;
        // guitar -= 17;
        // guitar *= 17;
        // guitar /= 17;
        
        System.out.println(tuna);
        System.out.println(bass);
        System.out.println(guitar);
        // System.out.println(++tuna);
        // System.out.println(--tuna);
        
        // This is going to change the variable to 6, but not going to do it until -
        // after it already outputs it is 5
        // System.out.println(tuna++);
        // System.out.println(tuna);
        // System.out.println(bass--);
        // System.out.println(bass);
    }
}