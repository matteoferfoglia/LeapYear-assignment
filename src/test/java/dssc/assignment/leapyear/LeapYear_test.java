package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYear_test {

    @ParameterizedTest
    @CsvSource({"2001, false", "2002, false", "2003, false"})
    void yearsDivisibleBy4(int year, String expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected, leapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({"1996, true", "2004, true", "2008, true"})
    void yearsDivisibleBy4ButNotBy100(int year, String expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected,leapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({"1700, false", "1800, false", "1900, false"})
    void yearsDivisibleBy4AndBy100ButNotBy400(int year, String expected){
        LeapYear leapYear = new LeapYear();
        assertEquals(expected,leapYear.isLeapYear(year));
    }



}
