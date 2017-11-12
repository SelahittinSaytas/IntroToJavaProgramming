import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    private JComboBox box;
    private JLabel picture; //The pictures are named 'JLabel' in Java
    
    private static String[] fileName = {"speaker.png", "wheel.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};
    
    public Gui(){
        super("The JComboBox Title");
        setLayout(new FlowLayout());
        
        box = new JComboBox(fileName);
        add(box);
        
        picture = new JLabel();
    }
}