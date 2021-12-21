import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TollCalculatorMain {
    public static void main(String[] args) {
        // Create car with some car details
        // Can be change for any car details, exactly as shown below
        Car car1 = new Car("C-Klass",2012,"Mercedes-Benz","SVG 312");
        Car car2 = new Car("E-Klass",2019,"Mercedes-Benz","MLK 222");
        Car car3 = new Car("2008",2019,"Peugeot","STW 129");

        // Create motorbike with some input
        // can be change for any motorbike details, exactly as show below
        MotorBike mb1 = new MotorBike("Seventy-Two", 2020,"HarleyDavidson","DFL 982");

        // Calling Toll Calculator class
        TollCalculator tc = new TollCalculator();

        // Making date as a string
        // converting to simple date format
        String sDate1="2021/12/10 19:10:23";
        String sDate2="2021/12/21 09:11:10";
        String sDate3="2021/12/21 08:14:54";
        String sDate4="2021/12/18 09:11:10";
        Date date1= null;
        Date date2= null;
        Date date3= null;
        Date date4= null;
        try {
            date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate1);
            date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate2);
            date3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate3);
            date4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(car1.getInfo()[0]+", " + Convertor.dayOfDate(date1) + " Toll payment fee=> " +tc.getTollFee(car1,date1));
        System.out.println(car2.getInfo()[0]+", " + Convertor.dayOfDate(date3) + " Toll payment fee=> " +tc.getTollFee(car2,date3));
        System.out.println(car3.getInfo()[0]+", " + Convertor.dayOfDate(date4) + " Toll payment fee=> " +tc.getTollFee(car3,date4));
        System.out.println("Motor Bike => "+tc.getTollFee(mb1,date2));
    }
}
