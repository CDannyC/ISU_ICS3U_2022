public class Food 
{
    private String food;
    private double price;
    public Food( String food, double price)
    {
        this.food = food;
        this.price = price;
    }
    public String getFood() 
    {
        return food;
    }
    public void setFood(String food) 
    {
        this.food = food;
    }
    public double getPrice()
    {
        return Math.round(price * 100.0) / 100.0;

    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public String toString() 
    {
        return "Food [food=" + food + ", price=" + price + "]";
    }
    
    
}
