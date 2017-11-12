

// 61 - Simple Polymorphic Program

public class apples {
    public static void main(String[] args) {
        Animals[] theList = new Animals[2];
        Dog d = new Dog();
        Fish f = new Fish();
        
        theList[0] = d;
        theList[1] = f;
        
        for(Animals x: theList){
            x.noise();
        }
    }
}