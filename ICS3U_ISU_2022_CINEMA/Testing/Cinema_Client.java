package Testing;
import javax.swing.*;
import java.awt.*;
public class Cinema_Client 
{
    public static void main(String args[])
    {
        Object x = dropdownMenu();
        System.out.println(x);
    }
    public static Object dropdownMenu()
    {
        String[] selections = new String[3];
        selections[0] = "Option1";
        selections[1] = "Option2";
        selections[2] = "Option3";
        return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
    }
}
