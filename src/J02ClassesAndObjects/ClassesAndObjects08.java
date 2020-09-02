package J02ClassesAndObjects;
/*
Write a Java function to determine a string is a member of enum DayOfWeek or not
Example:
For value = "SUNDAY", the function return true
For value = "MAY", the function return false
Input: a string value
Output: check whether value is a member of enum DayOfWeek or not.
Execution time limit: 1 second
 */
public class ClassesAndObjects08 {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    static boolean isDayOfWeek(String value) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if(day.name().equals(value)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDayOfWeek("WEDNESDAY"));
    }
}
