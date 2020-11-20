package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYear_test {

    @Test
    void numbersDivisibleBy4(){
        LeapYear leapYear = new LeapYear();
        assertEquals("true", leapYear.leapYear(40));    //40 is for sure divisible by 4
    }

}
