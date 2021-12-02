package info.kuechler.bmf.taxapi;

public class TaxApiFactory {
    protected static final String CODE = "2022eP";

    public static String getUrl(final int month, final int year) {
        return "https://www.bmf-steuerrechner.de/interface/" + getYearKey(month, year) + ".xhtml?code=" + CODE;
    }

    protected static String getYearKey(final int month, final int year) {
        if (year < 2019 || month > 12 || month < 0) {
            throw new IllegalArgumentException("Month have to be between 0 and 12, year >= 2019");
        }
        return Integer.toString(year) + "Version1";
    }

    private TaxApiFactory() {
        // nothing
    }
}
