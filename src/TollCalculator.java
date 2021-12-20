// Create the Toll Calculator class wich will take in vehicle and date as a parameter. 
// create methos for rushing hours during trafic time, rush hours is between 8,9,16 and 17.
// as will as toll fee free , in that time vehicle could pass the road camera without been charge.
// Toll free date is 0, 1, 2, 3, ,4 ,5 ,6, 20, 21, 22 and 23, during this times toll is free for any vehicle. 
// Sturday and Sundays are also toll free, 

import java.util.*;

public class TollCalculator {
    public int getTollFee(Vehicle vehicle, Date... date){
        int totalFee = 0;
        for (Date date1 : date) {
            if(isTollFreeDate(date1)){
                totalFee = 0;
            }else if (isRushHours(date1)){
                totalFee += vehicle.getFee() + 7;
            }else {
                totalFee += vehicle.getFee();
            }
        }
        return totalFee;

    }


    private boolean isRushHours(Date date){
        int[] rushHours = {8,9,16,17};
        int gh = Convertor.getHour(date);
        for (int element : rushHours){
            if (gh == element){
                return true;
            }
        }
        return false;
    }

    private boolean isTollFreeDate(Date date){
        int[] timeTollFree = {0,1,2,3,4,5,6,20,21,22,23};

        String dfd = Convertor.dayOfDate(date);
        int gh = Convertor.getHour(date);

        if ((dfd.equals("Saturday")) || (dfd.equals("Sunday"))){
            return true;
        }
        for (int element : timeTollFree){
            if (gh == element){
                return true;
            }
        }
        return false;
    }

}
