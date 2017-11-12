
public class AnimalList {
    private Animals[] theList = new Animals[7];
    private int counter = 0;
    
    public void add(Animals a){
        if(counter<theList.length){
            theList[counter] = a;
            System.out.println("Animals added at index " + counter);
            counter++;
        }
    }
}
