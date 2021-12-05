import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Convertor {
    public static String dateToString(Date date){
        return String.valueOf(date);
    }

    public static String[] dateToArray(Date date){
        String ds = dateToString(date);
        return ds.split(" ");
    }

    public static String[] dateToArray(String date){
        return date.split(" ");
    }

    public static String dateHumanReadable(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ms");
        return sdf.format(date);
    }

    public static String dayOfDate(Date date){
        DateFormat formatter = new SimpleDateFormat("EEEE");
        return formatter.format(date);
    }

    public static int getHour(Date date){
        return Integer.parseInt(dateToArray(dateHumanReadable(date))[1].split(":")[0]);
    }
}
