package dssc.assignment.leapyear;

public class LeapYear {

    public static void main(String... args) {

    }

    /**
     * Print "true" if the year is leap and "false" otherwise.
     */
    public String isLeapYear(int year){
        if( year % 4 == 0
                && ( year % 100 != 0 || year % 400 == 0 ) )
            return "true";
        else
            return "false";
    }

}
