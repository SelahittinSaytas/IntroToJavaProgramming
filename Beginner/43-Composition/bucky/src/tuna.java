
public class tuna {
    // 'Composition' means that a class instead of just variables and methods it can also have
    // references to other objects for other classes
    private String name;
    // A reference to 'potpie' object
    private potpie birthday;
    
    // Constructer
    public tuna(String theName, potpie theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}