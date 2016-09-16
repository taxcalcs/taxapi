package info.kuechler.bmf.taxapi;

public class TaxApiFactory {
    public static String getUrl(final int month, final int year) {
        return "https://www.bmf-steuerrechner.de/interface/" + getYearKey(month, year) + ".jsp";
    }

    protected static String getYearKey(final int month, final int year) {
        if (year < 2006 || month > 12 || month < 0) {
            throw new IllegalArgumentException("Month have to be between 0 and 12, year >= 2006");
        }
        if (year == 2011 || year == 2015) {
            if (month == 12 || month == 0) {
                return Integer.toString(year) + "Dez";
            }
            return Integer.toString(year) + "bisNov";
        }
        if (year >= 2016) {
            return "2016V1";
        }
        return Integer.toString(year);
    }

    private TaxApiFactory() {
        // nothing
    }
}
