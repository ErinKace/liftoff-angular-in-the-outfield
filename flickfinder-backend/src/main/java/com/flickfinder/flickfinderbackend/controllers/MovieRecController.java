package com.flickfinder.flickfinderbackend.controllers;

import com.flickfinder.flickfinderbackend.models.Movie;
import com.flickfinder.flickfinderbackend.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/rec")
public class MovieRecController {

    private MovieService movieService;
    public MovieRecController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity<Flux<Movie>> getMovieRec() {
        Flux<Movie> movieList = movieService.getTrendingMovies();
        return ResponseEntity.status(HttpStatus.OK).body(movieList);

    }
}
