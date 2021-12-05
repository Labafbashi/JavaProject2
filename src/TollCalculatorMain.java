import java.util.Date;

public class TollCalculatorMain {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(Convertor.dateToString(date));

        for (String s : Convertor.dateToArray(date)){
            System.out.println(s);
        }

        System.out.println(Convertor.dateHumanReadable(date));
        System.out.println(Convertor.dayOfDate(date));
        System.out.println(Convertor.getHour(date));
    }


}
