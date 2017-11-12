
// 81 - Reading From Files

public class apples {
    public static void main(String[] args) {
        createFile fileObject = new createFile();
        
        fileObject.openFile();
        fileObject.addRecords();
        fileObject.closeFile();
    }
}