
// 14 - Using Multiple Classes

// What while loop does is it allows you to execute a certain block of code multiple times
// but only write it one time, so it pretty much saves you a bunch of time writing a code

public class apples {
    public static void main(String[] args) {
        
        // Anytime you run a Java program, it looks for the first thing that says 'main' and
        // runs it from there
        // So, in order to use 'tuna' class, we need to go ahead and use it in 'main' class
        
        // Here is our 'main' function or method and main class called 'apple' class
        
        // Whenever you use a method in another class say we want to use 'simpleMessage()' method
        // and it's in the 'tuna' class
        
        // What we need to do is go ahead and
        // First, create an object of 'tuna' class
        // So, the first thing we do is to put the class name which is 'tuna'
        // Next, we need an object name 'tunaObject'
        // What this object is going to allow us to do is use all the stuff that's in 'tuna' class
        // Then set it equal to new and the class name with empty parameters which is 'tuna()'
        
        tuna tunaObject = new tuna();
        
        // To use this object, put the object name which is 'tunaObject' and then after
        // the object name what you do is add a dot separator, and after the dot separator
        // we use the method name with empty parameters which is 'simpleMessage()'
        
        tunaObject.simpleMessage();
    }
}