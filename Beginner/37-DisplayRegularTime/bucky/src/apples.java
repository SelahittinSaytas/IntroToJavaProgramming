
// 37 - Display Regular Time

public class apples {
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13, 17, 13);
        System.out.println(tunaObject.toMilitary());
        
        System.out.println(tunaObject.toString());
        
        tunaObject.setTime(13, 27, 6);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
    }
}