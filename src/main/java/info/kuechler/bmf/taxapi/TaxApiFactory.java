package info.kuechler.bmf.taxapi;

public class TaxApiFactory {
    public static String getUrl(final int month, final int year) {
        return "https://www.bmf-steuerrechner.de/interface/" + getYearKey(month, year) + ".jsp";
    }

    protected static String getYearKey(final int month, final int year) {
        if (year < 2006 || month > 12 || month < 0) {
            throw new IllegalArgumentException("Month have to be between 0 and 12, year >= 2006");
        }
        switch (year) {
        case 2011:
        case 2015: {
            if (month == 12 || month == 0) {
                return Integer.toString(year) + "Dez";
            }
            return Integer.toString(year) + "bisNov";
        }
        case 2016:
            return Integer.toString(year) + "V1";
        case 2017:
            return "LSt" + Integer.toString(year);
        default:
            return Integer.toString(year);
        }
    }

    private TaxApiFactory() {
        // nothing
    }
}
