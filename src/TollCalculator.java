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

    public int getTollFee(){
        return 0;
    }

    private boolean isTollFreeDate(Date date){
        String[] dayTollFree = {"Saturday","Sunday"};
        int[] timeTollFree = {0,1,2,3,4,5,6,20,21,22,23};
        int[] rushHours = {8,9,16,17};

        String dfd = Convertor.dayOfDate(date);
        int gh = Convertor.getHour(date);

        if ((dfd == "Saturday") || (dfd == "Sunday")){
            return true;
        }

        return false;
    }


}
