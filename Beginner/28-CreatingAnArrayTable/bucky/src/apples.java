
// 28 - Creating An Array Table

public class apples {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        // This is an array initializer
        int bucky[] = {1, 3, 7, 17, 33, 77};
        
        for(int counter = 0; counter < bucky.length; counter++){
            System.out.println(counter + "\t" + bucky[counter]);
        }
    }
}