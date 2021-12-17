import java.util.Date;

public class Car implements Vehicle {
    private final String model;
    private final int yearMade;
    private final String brand;
    private final String numberPlate;
    public static String dbPath = "Databases/Vehicles/Cars";

    public Car(String model,int yearMade, String brand, String numberPlate){
        this.model=model;
        this.yearMade=yearMade;
        this.brand=brand;
        this.numberPlate=(numberPlate.trim()).replaceAll("\\s+","-");
    }

    @Override
    public int getFee(){
        return 11;
    }

    @Override
    public String[] getInfo() {
        String[] carInfo = new String[4];
        carInfo[0] = this.model;
        carInfo[1] = String.valueOf(this.yearMade);
        carInfo[2] = this.brand;
        carInfo[3] = this.numberPlate;
        return carInfo;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

}
