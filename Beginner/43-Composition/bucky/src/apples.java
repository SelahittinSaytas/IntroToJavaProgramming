
// 43 - Composition

public class apples {
    public static void main(String[] args) {
        
        potpie potObject = new potpie(4, 5, 6);
        tuna tunaObject = new tuna("Bucky", potObject);
        
        System.out.println(tunaObject);
    }
}