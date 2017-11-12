
// Enumerations are pretty much kind of like classes, but they are used to declare constants in this
// tutorial
// Anytime we want to do this instead of 'public class' we put 'public enum'
// We can use this in a specific way
public enum tuna {
    // The first thing is to declare a bunch of constants of the enum type
    // These constants are pretty much like variables and never change
    // Essence objects
    bucky("nice", "22"),
    kelsey("cutie", "10"),
    julie("mistake", "12");
    
    // Each constant is an object and it's going to have its own set of variables in this
    // entire 'enumaration'
    
    // 'final' keyword is used since we don't want to change
    private final String descrip;
    private final String year;
    
    // Create an 'enumeration constructor'
    tuna(String description, String birthday){
        descrip = description;
        year = birthday;
    }
    
    public String getDescription(){
        return descrip;
    }
    
    public String getYear(){
        return year;
    }
    
    // 'Enumerations' are 'constants' that are also 'objects' pretty much
    
}