package dev.erenkirnak.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private IMovieRepository mr;
    public List<Movie> allMovies(){
        return mr.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return mr.findMovieByImdbId(imdbId);
    }
}
