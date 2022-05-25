import java.util.*;
public class Cinema 
{
    private ArrayList<Movie> movies;

    public ArrayList getMovies() {
        return movies;
    }
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    
    public Cinema() 
    {
        ArrayList<Movie> movies = new ArrayList<Movie>();
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