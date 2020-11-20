package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYear_test {

    @ParameterizedTest
    @CsvSource({"2001, true", "2002, true", "2003, true"})
    void numbersNotDivisibleBy4(int year, String expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected, leapYear.leapYear(year));
    }

}
