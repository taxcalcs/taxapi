package info.kuechler.bmf.taxapi;

import static info.kuechler.bmf.taxapi.TaxApiFactory.CODE;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxApiFactoryTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of( //
                arguments("https://www.bmf-steuerrechner.de/interface/2006Version1.xhtml", 0, 2006),
                arguments("https://www.bmf-steuerrechner.de/interface/2007Version1.xhtml", 0, 2007),
                arguments("https://www.bmf-steuerrechner.de/interface/2008Version1.xhtml", 0, 2008),
                arguments("https://www.bmf-steuerrechner.de/interface/2009Version1.xhtml", 0, 2009),
                arguments("https://www.bmf-steuerrechner.de/interface/2010Version1.xhtml", 0, 2010),

                arguments("https://www.bmf-steuerrechner.de/interface/2011bisNovVersion1.xhtml", 1, 2011),
                arguments("https://www.bmf-steuerrechner.de/interface/2011DezVersion1.xhtml", 0, 2011),

                arguments("https://www.bmf-steuerrechner.de/interface/2012Version1.xhtml", 0, 2012),
                arguments("https://www.bmf-steuerrechner.de/interface/2013Version1.xhtml", 0, 2013),
                arguments("https://www.bmf-steuerrechner.de/interface/2014Version1.xhtml", 0, 2014),

                arguments("https://www.bmf-steuerrechner.de/interface/2015bisNovVersion1.xhtml", 1, 2015),
                arguments("https://www.bmf-steuerrechner.de/interface/2015DezVersion1.xhtml", 0, 2015),

                arguments("https://www.bmf-steuerrechner.de/interface/2016Version1.xhtml", 0, 2016),

                arguments("https://www.bmf-steuerrechner.de/interface/2017Version1.xhtml", 0, 2017),
                arguments("https://www.bmf-steuerrechner.de/interface/2018Version1.xhtml", 0, 2018),
                arguments("https://www.bmf-steuerrechner.de/interface/2019Version1.xhtml", 0, 2019),
                arguments("https://www.bmf-steuerrechner.de/interface/2020Version1.xhtml", 0, 2020)

        );
    }

    @ParameterizedTest(name="{index} => {1}/{2}")
    @MethodSource("dataProvider")
    public final void testGetUrl(final String url, final int month, final int year) {
        Assertions.assertEquals(url + "?code=" + CODE, TaxApiFactory.getUrl(month, year));
    }
}
