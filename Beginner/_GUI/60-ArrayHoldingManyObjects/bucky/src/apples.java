

// 60 - Array Holding Many Objects

// 'Concrete class' is a class that's specific enough where you can make an object from it
public class apples {
    public static void main(String[] args) {
        AnimalList ALO = new AnimalList();
        Dog D = new Dog();
        Fish F = new Fish();
        Animals A = new Animals();
        
        ALO.add(D);
        ALO.add(F);
        ALO.add(A);
    }
}