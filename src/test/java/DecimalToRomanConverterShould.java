import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.ingram.DecimalToRomanConverter.toRoman;
import static org.assertj.core.api.Assertions.assertThat;

class DecimalToRomanConverterShould {

    @ParameterizedTest(name = "{0} should be represented as {1}")
    @CsvSource({
            "1,I",
            "2,II",
            "3,III",
            "5,V",
            "6,VI",
            "8,VIII",
            "10,X",
            "11,XI",
            "17,XVII",
            "19,XIX",
            "22,XXII",
            "298,CCXCVIII",
            "299,CCXCIX",
            "300,CCC",
            "1983,MCMLXXXIII"
    })
    void convertDecimalToRoman(int input, String expected) {
        assertThat(toRoman(input)).isEqualTo(expected);
    }
}
