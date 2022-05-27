import java.util.*;
public class Cinema 
{
    private ArrayList<Movie> movies;

    public Cinema() 
    {
        this.movies = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public void setMovies(ArrayList<Movie> movies) {
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
}