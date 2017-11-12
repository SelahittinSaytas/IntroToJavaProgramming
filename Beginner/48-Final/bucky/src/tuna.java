
public class tuna {
    private int sum;
    private final int NUMBER; // 'NUMBER' is capital because it's going to be constant
    // Whenever you write final in front of a variable or constant it meanst that you
    // cannot modify this no matter what
    
    public tuna(int x){
        NUMBER = x;
    }
    public void add(){
        sum += NUMBER;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}