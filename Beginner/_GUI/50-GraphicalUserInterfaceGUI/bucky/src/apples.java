import javax.swing.JOptionPane;
// 50 - Graphical User Interface GUI

// Java has built in class that stores all the components you need
// You just need to tell it where to put it and what to do with it
// We first need to import the entire class 'JOptionPane' (menu, dialog box, scrollbar)
public class apples {
    public static void main(String[] args) {
        // All GUIs are built from GUI components
        String fn = JOptionPane.showInputDialog("Enter first number!");
        String sn = JOptionPane.showInputDialog("Enter second number!");
        
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        
        // 'showMessageDialog' method takes 4 parameters
        // The first one is 'where to position it' - null = right in the middle of the screen
        // The second one is 'what you want to say for your prompt-message'
        // The third one is 'what you want to appear in your title bar'
        // The fourth one is 'the message that's going to pop-up' - We have an option for putting icons on GUI
        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Math", JOptionPane.PLAIN_MESSAGE);
        
    }
}