import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame{
    private JButton regularButton;
    private JButton customButton;
    
    public Gui(){
        super("The Title Bar");
        setLayout(new FlowLayout());
        
        regularButton = new JButton("Regular Button");
        add(regularButton);
        
        Icon speakerImage = new ImageIcon(getClass().getResource("speaker.pnf"));
        Icon wheelImage = new ImageIcon(getClass().getResource("wheel.png"));
        customButton = new JButton("Custom Button", speakerImage);
        customButton.setRolloverIcon(wheelImage);
        add(customButton);
        
        
    }
}