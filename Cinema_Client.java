import javax.swing.*;

public class Cinema_Client 
{
    //public static int userSelect;
    public static int ticketCounter;
    public static Cinema cineplex = new Cinema();
    public static double balance;
    public static void main(String args[])
    {
        int userSelection;
        Movie hel = new Movie(1,1,9.99,"fart");
        cineplex.addMovie(hel);
        cineplex.addMovie(new Movie(45,6,10.99,"batman"));
        //Object a = dropDownMenu(cineplex.getMovies());
        //System.out.println(a);

        String test1= JOptionPane.showInputDialog("");

        while(true)
        {

        
            userSelection = mainMenu(); 
            if (userSelection == 0)
            {
                movieSelect();
            }
            else if (userSelection == 1)
            {
                
            }
            else
            {
                System.exit(0);
            }
            System.out.println(cineplex.getItems());
        }   

        
    }
    public static double movieSelect()
    {
        String[] menuOption = {"Adult Ticket", "Child Ticket"};


        String[] arr = new String[cineplex.getMovies().size()];
        Movie a;
        Movie mov;

        
        for (int i = 0; i < cineplex.getMovies().size();i++)
        {
            a = cineplex.getMovies().get(i);
            arr[i] = a.getTitle();
        }
        
        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);

        int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        for (int i = 0; i < cineplex.getMovies().size(); i++)
        {
            if (selection.equals(arr[i]))
            {
                mov = cineplex.getMovies().get(i);
                if (b == 0)
                {
                    cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getCost(), cineplex.getMovies().get(i)));
                }
                else if (b == 1)
                {
                    cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getChildCost(), cineplex.getMovies().get(i)));
                }
                else
                {
                    System.exit(0);
                }
            }
        }
        

        
        //int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        if (b == 0)
        {
            
        }

        return 0;
    }

    public static void addMoney()
    {
        int[] vals = {5, 10 , 25, 50, 100};
        int selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, vals, vals[0]);
        balance += vals[selection]; 
    }

    public static int mainMenu()
    {
        String[] menuOption = {"Purchase Movie Tickets", "Add Money", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
    }
}
