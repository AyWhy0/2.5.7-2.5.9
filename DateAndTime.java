// Alessandra Yu
// 2.5.9 Step 21 - 11/13/2023
import java.util.Calendar;
public class DateAndTime {
    public static String getDateTime() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }
}
