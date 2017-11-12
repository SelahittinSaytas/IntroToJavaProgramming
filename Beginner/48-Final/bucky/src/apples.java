
// 48 - Final - Instance Variables

public class apples {
    public static void main(String[] args) {
        tuna tunaObject = new tuna(10);
        
        for(int i = 0; i < 5; i++){
            tunaObject.add();
            //System.out.println(tunaObject.toString());
            System.out.printf("%s", tunaObject);
        }
    }
}