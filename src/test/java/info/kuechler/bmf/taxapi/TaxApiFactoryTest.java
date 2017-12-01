package info.kuechler.bmf.taxapi;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TaxApiFactoryTest {

    @Parameter(value = 0)
    public String url;

    @Parameter(value = 1)
    public String month;

    @Parameter(value = 2)
    public String year;

    @Parameters(name="[{index}] {1}.{2}")
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][] { //
                        { "https://www.bmf-steuerrechner.de/interface/2006.jsp", "0", "2006" },
                        { "https://www.bmf-steuerrechner.de/interface/2007.jsp", "0", "2007" },
                        { "https://www.bmf-steuerrechner.de/interface/2008.jsp", "0", "2008" },
                        { "https://www.bmf-steuerrechner.de/interface/2009.jsp", "0", "2009" },
                        { "https://www.bmf-steuerrechner.de/interface/2010.jsp", "0", "2010" },

                        { "https://www.bmf-steuerrechner.de/interface/2011bisNov.jsp", "1", "2011" },
                        { "https://www.bmf-steuerrechner.de/interface/2011Dez.jsp", "0", "2011" },

                        { "https://www.bmf-steuerrechner.de/interface/2012.jsp", "0", "2012" },
                        { "https://www.bmf-steuerrechner.de/interface/2013.jsp", "0", "2013" },
                        { "https://www.bmf-steuerrechner.de/interface/2014.jsp", "0", "2014" },

                        { "https://www.bmf-steuerrechner.de/interface/2015bisNov.jsp", "1", "2015" },
                        { "https://www.bmf-steuerrechner.de/interface/2015Dez.jsp", "0", "2015" },

                        { "https://www.bmf-steuerrechner.de/interface/2016V1.jsp", "0", "2016" },
                        
                        { "https://www.bmf-steuerrechner.de/interface/LSt2017.jsp", "0", "2017" },
                        { "https://www.bmf-steuerrechner.de/interface/LSt2018.jsp", "0", "2018" }

        });
    }

    @Test
    public final void testGetUrl() {
        Assert.assertEquals(url, TaxApiFactory.getUrl(Integer.parseInt(month), Integer.parseInt(year)));
    }
}
