package com.linfenglab.stockpicker.report.summary;

import java.util.List;

public class Summary {
    private final String title;
    private final List<CompanyWithTopCeo> companyWithTopCeoList;

    public Summary(String title, List<CompanyWithTopCeo> companyWithTopCeoList) {
        this.title = title;
        this.companyWithTopCeoList = companyWithTopCeoList;
    }
}
