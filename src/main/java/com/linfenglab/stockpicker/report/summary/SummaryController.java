package com.linfenglab.stockpicker.report.summary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/summary")
public class SummaryController {
    private final SummaryRepository summaryRepository;

    public SummaryController(SummaryRepository summaryRepository) {
        this.summaryRepository = summaryRepository;
    }

    @GetMapping(path="/{year}")
    public Iterable<CompanyWithTopCeo> getCompaniesWithTopCeo(@PathVariable int year){
        return summaryRepository.findCompanyWithTopCeo(year);
    }
}
