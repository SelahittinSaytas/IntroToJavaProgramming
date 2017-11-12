
public class tuna {
    // When you're working with classes right now we have 2 types of variables 'public' and 'private'
    // public variables any class can use that variable, but when you use a private variable only
    // the methods inside this class can use it, so the methods we're about to build can manipulate
    // and change and also access to this variable. PRIVATE -ONLY THE METHODS CAN USE INSIDE THIS CLASS
    private String girlName;
    
    // The first thing create a constructor by naming a method the exact same thing a class
    public tuna(String name){
        girlName = name;
    }
    
    public void setName(String name){
        girlName = name;
    }
    
    // Return Type - whatever your method does, it may or may not return something. This method is going
    // to return a string, so that's why we need to put string. AND IF YOUR METHOD RETURNS NOTHING
    // GO AHEAD AND PUT 'void'
    public String getName(){
        return girlName;
    }
    
    // Whenever we use '%s' it needs to know what string I want to put in place of this
    // 'printf' is a common print function in language C and Java
    public void saying(){
        System.out.printf("Your first girlfriend was %s", getName());
    }
}

// Whenever you have a variable that's outside a method, again it's outside all everything but inside
// entire class it's called instance variables