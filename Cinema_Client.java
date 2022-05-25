import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Cinema_Client 
{
    public static void main(String args[])
    {
        Cinema cineplex = new Cinema();
        Purchase items = new Purchase();
        Movie hel = new Movie(1,1,1,1,"fart");
        cineplex.addMovie(hel);
        cineplex.addMovie(new Movie(45,6,5.99,10.99,"batman"));
        Object a = dropDownMenu(cineplex.getMovies());
        System.out.println(a);
        mainMenu();
        
    }
    public static Object dropDownMenu(ArrayList lst)
    {
        Object[] arr = lst.toArray();
        return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
    }
    public static Object mainMenu()
    {
        String[] menuOption = {"View Movies", "Add Money", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);
    }
}
