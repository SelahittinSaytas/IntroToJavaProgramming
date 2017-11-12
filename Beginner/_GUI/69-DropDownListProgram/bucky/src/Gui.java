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
        
        box.addItemListener(
                //This is an anonymous inner class
                //This is our declaration for an anonymous class that implements 'ItemListener'
                new ItemListener(){
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange() == ItemEvent.SELECTED){
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                    }
                }
        );
        
        add(box);
        
        picture = new JLabel(pics[0]); //This pretty much gives us the default value
        add(picture);
    }
}