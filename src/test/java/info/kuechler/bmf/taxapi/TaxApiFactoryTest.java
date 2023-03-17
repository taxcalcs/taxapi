package info.kuechler.bmf.taxapi;

import static info.kuechler.bmf.taxapi.TaxApiFactory.CODE;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxApiFactoryTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of( //
                arguments("https://www.bmf-steuerrechner.de/interface/2022Version1.xhtml", 0, 2022),
                arguments("https://www.bmf-steuerrechner.de/interface/2023Version1.xhtml", 0, 2023)
        );
    }

    @ParameterizedTest(name="{index} => {1}/{2}")
    @MethodSource("dataProvider")
    public final void testGetUrl(final String url, final int month, final int year) {
        Assertions.assertEquals(url + "?code=" + CODE, TaxApiFactory.getUrl(month, year));
    }
}
