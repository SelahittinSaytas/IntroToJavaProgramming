
public class tuna {
    // Only methods inside this class can access and use these 'private' variables
   private int hour;
   private int minute;
   private int second;
   
   // These are all 'constructor' - one with zero argument, one with one, two, and three
   public tuna(){
       this(0, 0, 0);
   }
   public tuna(int h){
       this(h, 0, 0);
   }
   public tuna(int h, int m){
       this(h, m, 0);
   }
   public tuna(int h, int m, int s){
       setTime(h, m, s);
   }
   public void setTime(int h, int m, int s){
       setHour(h);
       setMinute(m);
       setSecond(s);
   }
   
}