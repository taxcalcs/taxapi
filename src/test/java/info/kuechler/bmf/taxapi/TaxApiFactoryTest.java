package info.kuechler.bmf.taxapi;

import static info.kuechler.bmf.taxapi.TaxApiFactory.CODE;

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
                        { "https://www.bmf-steuerrechner.de/interface/2006Version1.xhtml", "0", "2006" },
                        { "https://www.bmf-steuerrechner.de/interface/2007Version1.xhtml", "0", "2007" },
                        { "https://www.bmf-steuerrechner.de/interface/2008Version1.xhtml", "0", "2008" },
                        { "https://www.bmf-steuerrechner.de/interface/2009Version1.xhtml", "0", "2009" },
                        { "https://www.bmf-steuerrechner.de/interface/2010Version1.xhtml", "0", "2010" },

                        { "https://www.bmf-steuerrechner.de/interface/2011bisNovVersion1.xhtml", "1", "2011" },
                        { "https://www.bmf-steuerrechner.de/interface/2011DezVersion1.xhtml", "0", "2011" },

                        { "https://www.bmf-steuerrechner.de/interface/2012Version1.xhtml", "0", "2012" },
                        { "https://www.bmf-steuerrechner.de/interface/2013Version1.xhtml", "0", "2013" },
                        { "https://www.bmf-steuerrechner.de/interface/2014Version1.xhtml", "0", "2014" },

                        { "https://www.bmf-steuerrechner.de/interface/2015bisNovVersion1.xhtml", "1", "2015" },
                        { "https://www.bmf-steuerrechner.de/interface/2015DezVersion1.xhtml", "0", "2015" },

                        { "https://www.bmf-steuerrechner.de/interface/2016Version1.xhtml", "0", "2016" },
                        
                        { "https://www.bmf-steuerrechner.de/interface/2017Version1.xhtml", "0", "2017" },
                        { "https://www.bmf-steuerrechner.de/interface/2018Version1.xhtml", "0", "2018" }

        });
    }

    @Test
    public final void testGetUrl() {
        Assert.assertEquals(url + "?code=" + CODE, TaxApiFactory.getUrl(Integer.parseInt(month), Integer.parseInt(year)));
    }
}
