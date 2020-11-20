package dssc.assignment.leapyear;

public class LeapYear {

    public static void main(String... args) {

    }

    /**
     * For a given year, prints on the standard output "true" if
     * it is a leap year, "false" otherwise
     */
    public void print(int year) {
        System.out.print(isLeapYear(year) ? "true" : "false");
    }

    /**
     * Return true if the year is leap and false otherwise.
     */
    public boolean isLeapYear(int year){
        return year % 4 == 0
                && ( year % 100 != 0 || year % 400 == 0 );
    }

}
