import java.io.File; //'IO' is for reading and writing data
//'.File' gives info about files like whether they exist (length, path, parent stuff like that)

// 78 - File Class

public class apples {
    public static void main(String[] args) {
        File x = new File("/Users/selahittinsaytas/Desktop/index.php");
        
        if(x.exists()){
            System.out.println(x.getName() + " exist!");
        }else{
            System.out.println(x.getName() + " thing does not exist!");
        }
    }
}