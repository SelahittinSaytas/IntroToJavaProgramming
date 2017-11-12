import java.io.*;
import java.lang.*; //
import java.util.*;

public class createFile {
    //We're going to add data to our files
    private Formatter x;
    
    public void openFile(){
        try{
            x = new Formatter("freddieMercury.txt");
        }
        catch(Exception e){
            System.out.println("You have an error! ");
        }
    }
    
    public void addRecords(){
        x.format("%s%s%s", "ID ", "First Name ", "Last Name ");
        x.format("%s%s%s", "17 ", "Selahittin ", "Saytaş ");
    }
    
    public void closeFile(){
        x.close();
    }
}
