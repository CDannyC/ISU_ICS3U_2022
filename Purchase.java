import java.text.DecimalFormat;
import java.util.*;
public class Purchase 
{
    private ArrayList<Ticket> items;
    public Purchase()
    {
        this.items = new ArrayList<Ticket>();
    }
    public ArrayList getCart()
    {
        return this.items;
    }
    public void addItem(Ticket obj)
    {
        this.items.add(obj);
    }
    public Ticket getItem(int ind)
    {
        return this.items.get(ind);
    }
    public void removeItem(int ind)
    {
        this.items.remove(ind);
    }
    public void clearCart()
    {
        for (int i = this.items.size() - 1; i >= 0; i--)
        {
            this.items.remove(i);
        }
    }
    public String toString() 
    {
        String str = new String();
        for (int i = 0; i < items.size(); i++)
        {
            str += items.get(i) + "\n";
        }
        return str;
    }
    
}