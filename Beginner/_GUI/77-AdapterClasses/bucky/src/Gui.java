import java.awt.*; //Imports colors, border layouts stuff like that
import java.awt.event.*; //These are pretty much 'mouse events'
import javax.swing.*;

public class Gui extends JFrame{
    private String details;
    private JLabel statusBar;
    
    public Gui(){
        super("The Adapter Class Title");
        
        statusBar = new JLabel("This is default!");
        add(statusBar, BorderLayout.SOUTH);
        
        addMouseListener(new MouseClass());
    }
    private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d", event.getClickCount());
            
            if(event.isMetaDown()){
                details += "With right mouse button!";
            }else if(event.isAltDown()){
                details += "With center mouse button!";
            }else{
                details += "With left mouse button!";
            }
            statusBar.setText(details);
        }
    }
}