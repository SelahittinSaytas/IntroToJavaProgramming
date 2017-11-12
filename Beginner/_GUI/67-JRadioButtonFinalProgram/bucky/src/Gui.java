import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton italicButton;
    private JRadioButton boldItalicButton;
    private ButtonGroup group;
    
    public Gui(){
        super("JRadio Button");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Bucky is awesome!", 25);
        add(textField);
        
        plainFont = new Font("Serif", Font.PLAIN, 14);        
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);
        
        plainButton = new JRadioButton("Plain", true); // true = checked
        add(plainButton);
        boldButton = new JRadioButton("Bold", false); // false = unchecked
        add(boldButton);
        italicButton = new JRadioButton("Italic", false);
        add(italicButton);
        boldItalicButton = new JRadioButton("Bold & Italic", false);
        add(boldItalicButton);
        
        group = new ButtonGroup();
        group.add(plainButton);
        group.add(boldButton);
        group.add(italicButton);
        group.add(boldItalicButton);
        
        // Wait for event to happen, pass in font object to constructor
        plainButton.addItemListener(new HandlerClass(plainFont));
        boldButton.addItemListener(new HandlerClass(boldFont));
        italicButton.addItemListener(new HandlerClass(italicFont));
        boldItalicButton.addItemListener(new HandlerClass(boldItalicFont));
    }
    
    private class HandlerClass implements ItemListener{
        private Font font;
        
        // The font object gets variable font
        public HandlerClass(Font f){
            font = f;
        }
        
        // Sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }
}