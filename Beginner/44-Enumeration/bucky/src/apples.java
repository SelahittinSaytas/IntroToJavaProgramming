
// 44 - Enumeration

public class apples {
    public static void main(String[] args) {
        // First use a enhanced for loop with
        // type = class name
        // identifier = the variable you wanna use in for loop whatever named it
        // Next thing is you need an array that you need to loop through
        // Java automatically makes a built-in array by taking 'contants'
        // Array name is called whatever your enumeration is called
        // an when you write 'values' which is a built-in array of the 'constants'
        // 'values()' keyword cannot be changed and is called 'static method'
        for(tuna people: tuna.values()){
            System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());
        }
    }
}