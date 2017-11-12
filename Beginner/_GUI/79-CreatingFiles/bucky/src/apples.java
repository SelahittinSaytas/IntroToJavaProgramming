import java.util.*;

// 79 - Creating Files

public class apples {
    public static void main(String[] args) {
        //A 'Formatter' variable pretty much outputs Strings to a file, pretty much 'printf'
        //instead of printing to the screen, you print it a file
        final Formatter x; //outputs a string
        
        //Exception Handling
        //We use this to prevent getting a bunch of error messages on our command prompt
        //'try' this code, if you get an error do/ 'catch' this!
        try{
            x = new Formatter("fred.txt");
            System.out.println("You created a file!");
        }
        catch(Exception e){
            System.out.println("You got an error");
        }
    }
}