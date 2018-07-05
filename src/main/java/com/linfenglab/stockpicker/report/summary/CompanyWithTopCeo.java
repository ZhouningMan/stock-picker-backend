package com.linfenglab.stockpicker.report.summary;

public class CompanyWithTopCeo {
    private final String ceo;
    private final String company;
    private final String ticker;
    private final String industry;
    private final int rank;

    CompanyWithTopCeo(String ceo, String company, String ticker, String industry, int rank) {
        this.ceo = ceo;
        this.company = company;
        this.ticker = ticker;
        this.industry = industry;
        this.rank = rank;
    }

    public String getCeo() {
        return ceo;
    }

    public String getCompany() {
        return company;
    }

    public String getTicker() {
        return ticker;
    }

    public String getIndustry() {
        return industry;
    }

    public int getRank() {
        return rank;
    }
}
