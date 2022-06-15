import java.util.*;
public class Cinema 
{
    private int cartCount;
    private ArrayList<Purchase> items;
    private ArrayList<Movie> movies;
    private ArrayList<Food> food;

    public Cinema() 
    {
        cartCount = 0;
        this.items = new ArrayList <Purchase>();
        this.movies = new ArrayList<Movie>();
        this.food = new ArrayList<Food>();
        this.items.add(new Purchase());
        movies.add(new Movie(1,1,9.99,"hello"));
        movies.add(new Movie(45,6,10.99,"batman"));
        movies.add(new Movie(56, 1, 19.99, "Avengers"));
        food.add(new Food("Chips", 5.99));
    }



    public ArrayList<Food> getFood() 
    {
        return food;
    }

    public ArrayList<Movie> getMovies()
    {
        return movies;
    }
    public Purchase getItem()
    {
        return items.get(this.cartCount);
    }
    public ArrayList getItems()
    {
        return items;
    }
    public void setMovies(ArrayList<Movie> movies)
    {
        this.movies = movies;
    }   
    public void removeMovie(Movie mov)
    {
        this.movies.remove(mov);
    }
    public void addMovie(Movie mov)
    {
        this.movies.add(mov);
    }
    public void newCart()
    {
        cartCount ++;
        this.items.add(new Purchase());
    }
}