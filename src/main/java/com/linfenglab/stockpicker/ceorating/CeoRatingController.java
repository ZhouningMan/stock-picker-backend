package com.linfenglab.stockpicker.ceorating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ceoratings")
public class CeoRatingController {

    private final CeoRatingRepository repository;

    public CeoRatingController(CeoRatingRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<CeoRating> getAllRatings(){
        return repository.findAll();
    }
}
