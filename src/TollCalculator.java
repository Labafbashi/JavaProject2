import java.util.*;

public class TollCalculator {
    public int getTollFee(Vehicle vehicle, Date... dates){
        Date intervalStart = dates[0];
        int totalFee = 0;
        for (Date date : dates){
            System.out.println(date);
        }
        return totalFee;
    }

    public int getTollFee(final Date date, Vehicle vehicle){
        return 0;
    }

    private boolean isTollFreeDate(Date date){
        return false;
    }
}
