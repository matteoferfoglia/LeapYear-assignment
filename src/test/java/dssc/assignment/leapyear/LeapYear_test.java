package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
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

    @Test
    void yearsDivisibleBy4NotBy100(){
        LeapYear leapYear = new LeapYear();
        assertEquals("false",leapYear.isLeapYear(1600));
    }

}
