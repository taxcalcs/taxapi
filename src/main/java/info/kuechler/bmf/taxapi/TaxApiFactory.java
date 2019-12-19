package info.kuechler.bmf.taxapi;

public class TaxApiFactory {
    protected static final String CODE = "Lohn2020";

    public static String getUrl(final int month, final int year) {
        return "https://www.bmf-steuerrechner.de/interface/" + getYearKey(month, year) + ".xhtml?code=" + CODE;
    }

    protected static String getYearKey(final int month, final int year) {
        if (year < 2006 || month > 12 || month < 0) {
            throw new IllegalArgumentException("Month have to be between 0 and 12, year >= 2006");
        }
        final String middle;
        switch (year) {
        case 2011:
        case 2015: {
            if (month == 12 || month == 0) {
                middle = "Dez";
            } else {
                middle = "bisNov";
            }
            break;
        }
        default:
            middle = "";
            break;
        }

        return Integer.toString(year) + middle + "Version1";
    }

    private TaxApiFactory() {
        // nothing
    }
}
