import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    private JTextField textField;
    private JCheckBox boldBox;
    private JCheckBox italicBox;
    
    public Gui(){
        super("The Check Box");
        setLayout(new FlowLayout());
        
        textField = new JTextField("This is a sentence", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        boldBox = new JCheckBox("bold");
        add(boldBox);
        italicBox = new JCheckBox("italic");
        add(italicBox);
        
        HandlerClass handler = new HandlerClass();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }
    
    private class HandlerClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            
            if(boldBox.isSelected() && italicBox.isSelected()){
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }else if(boldBox.isSelected()){
                font = new Font("Serif", Font.BOLD, 14);
            }else if(italicBox.isSelected()){
                font = new Font("Serif", Font.ITALIC, 14);
            }else{
                font = new Font("Serif", Font.PLAIN, 14);
            }
            
            textField.setFont(font);
        }
    }
}