package dssc.assignment.leapyear;

public class LeapYear {

    public static void main(String... args) {

    }

    /**
     * Print "yes" if the year is leap and false otherwise.
     */
    public String leapYear(int year){
        if( year % 4 == 0 )
            return "true" ;
        else
            return "false" ;
    }

}
