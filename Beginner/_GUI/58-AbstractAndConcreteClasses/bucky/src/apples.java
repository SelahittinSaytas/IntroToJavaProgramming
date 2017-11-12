

// 58 - Abstract and Concrete Classes

// 'Concrete class' is a class that's specific enough where you can make an object from it
public class apples {
    public static void main(String[] args) {
        fatty buckyObject = new fatty();
        // food foObject = new food();
        food poObject = new potpie();
        food toObject = new tuna();
        
        // buckyObject.digest(foObject);
        buckyObject.digest(poObject);
        buckyObject.digest(toObject);
    }
}