import java.util.Random;
// 30 - Array Elements As Counters

public class apples {
    public static void main(String[] args) {
        
        Random randomNumber = new Random();
        int frequency[] = new int[7];
        
        for(int roll = 1; roll < 1000; roll++){
            ++frequency[1+randomNumber.nextInt(6)];
        }
        
        System.out.println("Face\tFrequency");
        
        for(int face = 1; face < frequency.length; face++){
            System.out.println(face + "\t" + frequency[face]);
        }
    }
}