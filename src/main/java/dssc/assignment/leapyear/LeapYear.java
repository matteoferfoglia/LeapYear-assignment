package dssc.assignment.leapyear;

public class LeapYear {

    public static void main(String... args) {

    }

    /**
     * Print "true" if the year is leap and false otherwise.
     */
    public String isLeapYear(int year){
        if( year % 4 == 0 )
            if( year % 100 == 0 )
                if( year % 400 == 0 )
                    return "true";
                else
                    return "false";
            else
                return "true";
        else
            return "false";
    }

}
