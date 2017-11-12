
// 35 - Variable Length Arguments

public class apples {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(average(43, 56, 76, 8, 65, 76, 2, 31));
    }
    
    // Use ellipse if you don't know with how many numbers you're working with
    public static int average(int...numbers){
        int total = 0;
        
        for(int x: numbers){
            total += x;
        }
        
        return total/numbers.length;
    }
}