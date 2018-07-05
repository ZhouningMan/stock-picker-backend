package com.linfenglab.stockpicker.report.summary;

import java.util.List;

public interface SummaryRepository {
    List<CompanyWithTopCeo> findCompanyWithTopCeo(int year);
}
