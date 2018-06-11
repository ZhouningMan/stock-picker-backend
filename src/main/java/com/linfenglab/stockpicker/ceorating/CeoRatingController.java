package com.linfenglab.stockpicker.ceorating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="ceoratings")
public class CeoRatingController {

    private CeoRatingRepository repository;

    public CeoRatingController(CeoRatingRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="/")
    public @ResponseBody Iterable<CeoRating> getAllRatings(){
        return repository.findAll();
    }
}
