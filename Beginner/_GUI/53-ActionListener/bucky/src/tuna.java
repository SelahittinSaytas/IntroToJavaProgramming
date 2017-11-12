import java.awt.FlowLayout; // To give you the layout
import java.awt.event.ActionListener; // To wait or listen for the user to do something like press enter
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField; // To write text
import javax.swing.JPasswordField; // To write password by covering the field with asteriks
import javax.swing.JOptionPane;

public class tuna extends JFrame {
    // 'extends JFrame' lets us to use a window
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;
    
    // This class is pretty much the window
    public tuna(){
        super("The Title Bar"); // Title
        setLayout(new FlowLayout()); // To set the layout
        
        item1 = new JTextField(10); // Length of it is 10
        add(item1); // To add item to the window - screen
        
        item2 = new JTextField("Enter Text Here"); // Gives default text inside - kind of prompt
        add(item2);
        
        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false); // Text field isn't going to be editable
        add(item3);
        
        passwordField = new JPasswordField("mypass");
        add(passwordField);
        
        // This builds an 'Action Listener' object
        thehandler handler = new thehandler();
        
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    
    private class thehandler implements ActionListener{
        // 'implements ActionListener' means that this is going to be the class to handle the evens
        public void actionPerformed(ActionEvent event){
            // The body of the method
            String string = ""; // final string outputs
            // 'event' is like an enter or click
            // 'getSource' pretty much means where it happens
            // 'getActionCommand" means that get the text from that location
            if(event.getSource() == item1){
                string = String.format("Field 1: %s", event.getActionCommand());
            }else if(event.getSource() == item2){
                string = String.format("Field 2: %s", event.getActionCommand());
            }else if(event.getSource() == item3){
                string = String.format("Field 3: %s", event.getActionCommand());
            }else if(event.getSource() == passwordField){
                string = String.format("Password Field: %s", event.getActionCommand());
            }
            
        }
    }
}