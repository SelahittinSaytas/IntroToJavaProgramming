import java.awt.*; //Imports colors, border layouts stuff like that
import java.awt.event.*; //These are pretty much 'mouse events'
import javax.swing.*;

public class Gui extends JFrame{
    private JPanel mousePanel; //The area you can click and move your cursor around - big white box
    private JLabel statusBar; //A list
    //The window will have a big, empty space calle 'Mouse Panel' in which we can test out all mouse
    //events like 'click', 'drag', 'release'
    //The status bar will tell us whether clicked or dragged so on.
    public Gui(){
        super("The JPanel Title");
        
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); //This is going to make it appear in the center of the screen and fill up
        //all the empty space
        
        statusBar = new JLabel("Default");
        add(statusBar, BorderLayout.SOUTH); //This is going to appear at the bottom of the screen
        
        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler); //press, clicked, release, entered, and exit the space
        mousePanel.addMouseMotionListener(handler); // while the mouse is moving move or hold down the mouse - dragging the mouse
    }
}