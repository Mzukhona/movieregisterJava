package dev.rhudulu.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/vi/reviews")
public class ReviewController {

    @Autowired
    private  ReviewService reviewService ;

    @PostMapping
    public ResponseEntity<Review> create(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reveiwBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
