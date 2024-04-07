package edu.ib.networktechnologies.Controllers;

import edu.ib.networktechnologies.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.ib.networktechnologies.Entities.Review;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @PostMapping("/add")
    public @ResponseBody Review addReview (@RequestBody Review review){
        return reviewRepository.save(review);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<Review> getAll(){
        return reviewRepository.findAll();
    }
}
