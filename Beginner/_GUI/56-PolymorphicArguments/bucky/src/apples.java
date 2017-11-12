

// 56 - Polymorphic Arguments

public class apples {
    public static void main(String[] args) {
        fatty buckyObject = new fatty();
        food foObject = new food();
        food poObject = new potpie();
        food toObject = new tuna();
        
        buckyObject.digest(foObject);
        buckyObject.digest(poObject);
        buckyObject.digest(toObject);
    }
}