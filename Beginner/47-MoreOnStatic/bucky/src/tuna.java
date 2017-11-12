
public class tuna {
    // what 'Static Variables' are and how they're used
    private String first;
    private String last;
    // 'static' keyword means that every object shares the same variable
    // so when you change static variable, that changes the all objects
    private static int members = 0;
    // Constructor
    public tuna(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the in the club: %d\n", first, last, members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
    
}