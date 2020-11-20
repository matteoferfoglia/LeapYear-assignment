package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {

    @ParameterizedTest
    @CsvSource({"2001, false", "2002, false", "2003, false","1996, true", "2004, true", "2008, true","1700, false", "1800, false", "1900, false","1600, true", "2000, true", "2400, true"})
    void true_false(int year, String expected) {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));
        LeapYear leapYear = new LeapYear();

        leapYear.print(year);

        assertEquals(expected, fakeStandardOutput.toString());
    }


}
