import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame{
    //'JList' is pretty much a list
    private JList list;
    private static String[] colorNames = {"black", "blue", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
    
    public Gui(){
        super("The JList Title");
        setLayout(new FlowLayout());
        
        list = new JList(colorNames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));
        
        list.addListSelectionListener(
                // We are making an anonymous class - easier way for handling events
                new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent event){
                        //There is 3 different layers on our window
                        //Background - ContentPane - GlassPane
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                        
                    }
                }
        );
    }
}