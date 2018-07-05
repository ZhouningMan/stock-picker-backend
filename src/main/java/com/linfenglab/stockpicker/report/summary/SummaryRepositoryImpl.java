package com.linfenglab.stockpicker.report.summary;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

@Component
public class SummaryRepositoryImpl implements SummaryRepository {
    private final static String COMPANY_WITH_TOP_CEOS_SQL =
            "select cc.ceo, cr.rank, cc.company, cc.ticker, cc.industry\n" +
            "from ceo_rating cr, ceo_compensation cc\n" +
            "where cr.year = ? and upper(cr.name) = upper(cc.ceo)\n" +
            "order by cr.rank asc";

    private final JdbcTemplate jdbcTemplate;

    public SummaryRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CompanyWithTopCeo> findCompanyWithTopCeo(int year) {
        return jdbcTemplate.query(COMPANY_WITH_TOP_CEOS_SQL,
                new Object[]{year},
                (ResultSet rs, int rowNum) ->{
                    String ceo = rs.getString("ceo");
                    String company = rs.getString("company");
                    String ticker = rs.getString("ticker");
                    String industry = rs.getString("industry");
                    int rank  = rs.getInt("rank");
                    return new CompanyWithTopCeo(ceo, company, ticker, industry, rank);
                });
    }
}
