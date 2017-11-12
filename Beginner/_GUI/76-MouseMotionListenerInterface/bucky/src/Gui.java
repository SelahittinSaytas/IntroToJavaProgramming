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
        mousePanel.addMouseMotionListener(handler); // while the mouse is moving move or hold down the mouse - dragged
    }
    private class HandlerClass implements MouseListener, MouseMotionListener{
        //These are 'MouseListener' events
        public void mouseExited(MouseEvent event){ //'MouseListener' Event
            statusBar.setText("The mouse has left the window");
            mousePanel.setBackground(Color.WHITE);
        }
        public void mouseEntered(MouseEvent event){ //'MouseListener' Event
            statusBar.setText("You entered the area!");
            mousePanel.setBackground(Color.RED);
        }
        public void mouseReleased(MouseEvent event){ //'MouseListener' Event
            statusBar.setText("You released the button!");
        }
        public void mousePressed(MouseEvent event){ //'MouseListener' Event
            statusBar.setText("You pressed down the mouse!");
        }
        public void mouseClicked(MouseEvent event){ //'MouseListener' Event
            statusBar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
        }
        //These are 'MouseMotionListener' events
        public void mouseMoved(MouseEvent event){ //'MouseMotionListener' Event
            statusBar.setText("You moved the mouse");
        }
        public void mouseDragged(MouseEvent event){ //'MouseMotionListener' Event
            statusBar.setText("You're dragging the mouse");
        }
    }
}