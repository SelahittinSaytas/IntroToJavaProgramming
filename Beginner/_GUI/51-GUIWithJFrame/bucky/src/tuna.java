import java.awt.FlowLayout; //AWT (Abstract Window Toolkit)
import javax.swing.JFrame;
import javax.swing.JLabel;

// 'FlowLayout' going to import pretty much how things are placed by giving default layout managing
// 'JFrame' pretty much gives you all the basic windows features (title bar, minimize, maximize, x)
// pretty much it gives you the basic window
// 'JLabel' is pretty much a line of text, also lets you do simple images

public class tuna extends JFrame {
    private JLabel item1;
    public tuna(){
        super("The Title Bar"); // 'super()' is used to add a title to window
        setLayout(new FlowLayout()); // gives us default layout
        item1 = new JLabel("This is a sentence!");
        item1.setToolTipText("This is going to show up on hover!");
        add(item1); // To add the item to the window
    }
    
}