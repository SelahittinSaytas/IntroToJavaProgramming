
// 47 - More on Static

public class apples {
    public static void main(String[] args) {
        tuna member1 = new tuna("Megan", "Fox");
        tuna member2 = new tuna("Natalie", "Portman");
        tuna member3 = new tuna("Taylor", "Swift");
        
        // 'Static' means all of these objects share the same 'static variable'
        
        System.out.println(tuna.getMembers()); // Anytime when you have a 'static method' that uses
        // static variables, , you don't have to have a seperate object. You can just
        // put the class name and then just put the 'static method'
        // 'Static' variables are shared among all objects
        
        /*
        System.out.println();
        System.out.println(member1.getFirst()); // Unique
        System.out.println(member1.getLast()); // Unique
        System.out.println(member1.getMembers()); //Shared among all objects
        
        System.out.println();
        System.out.println(member2.getFirst()); // Unique
        System.out.println(member2.getLast()); // Unique
        System.out.println(member2.getMembers()); //Shared among all objects
        */
    }
}