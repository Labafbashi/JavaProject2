import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TollCalculatorMain {
    public static void main(String[] args) {
        // Create car with some car details
        // Can be change for any car details, exactly as shown below
        Car car1 = new Car("C-Klass",2012,"Mercedes-Benz","SVG 312");

        // Create motorbike with some input
        // can be change for any motorbike details, exactly as show below
        MotorBike mb1 = new MotorBike("Seventy-Two", 2020,"HarleyDavidson","DFL 982");

        // Calling Toll Calculator class
        TollCalculator tc = new TollCalculator();

        // Making date as a string
        // converting to simple date format
        String sDate1="2021/12/11 09:10:23";
        String sDate2="2021/12/11 09:11:10";
        Date date1= null;
        Date date2= null;
        try {
            date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate1);
            date2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Car => "+tc.getTollFee(car1,date1));
        System.out.println("Motor Bike => "+tc.getTollFee(mb1,date2));
    }
}
