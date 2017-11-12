
public class potpie {
    // build-in method 'toString' method
    private int month;
    private int day;
    private int year;
    
    // '%s' means String - '\n' means new line
    public potpie(int m, int d, int y){
        month = m;
        day = d;
        year = y;
        
        // 'this' keyword is a reference to whatever object we just built whenever we call this class
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}