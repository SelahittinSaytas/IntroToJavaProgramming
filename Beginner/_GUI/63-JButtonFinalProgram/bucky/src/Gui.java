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
        
        Icon speakerImage = new ImageIcon(getClass().getResource("speaker.png"));
        Icon wheelImage = new ImageIcon(getClass().getResource("wheel.png"));
        customButton = new JButton("Custom Button", speakerImage);
        customButton.setRolloverIcon(wheelImage);
        add(customButton);
        
        HandlerClass handler = new HandlerClass();
        
        regularButton.addActionListener(handler);
        customButton.addActionListener(handler);
    }
    
    private class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
            // 'event.getActionCommand()' gives the name of the button
            
            /*
            String string = "";
            if(event.getSource() == regularButton){
                string = String.format("%s", event.getActionCommand());
            }else if(event.getSource() == customButton){
                string = String.format("%s", event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(rootPane, string);
            */
        }
    }
}