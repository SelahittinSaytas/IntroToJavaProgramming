import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame{
    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    
    private static String[] foods = {"Bacon", "Wings", "Ham", "Beef", "More Bacon"};
    
    public Gui(){
        super("Multiple Selection List");
        setLayout(new FlowLayout());
        
        leftList = new JList(foods); //JList always take an argument of an array
        leftList.setVisibleRowCount(3);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList)); //Puts a scroll bar on your list
        
        moveButton = new JButton("Move -->");
        
        moveButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        rightList.setListData(leftList.getSelectedValues());
                    }
                }
        );
        
        add(moveButton);
    }
}