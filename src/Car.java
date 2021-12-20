// Create Car class and implement vheicle wich is resposible for car and motobike.
// here creates the Car details such as model, year made, brand name and number plate. 
// then creates the databas of car object and saves in variable names. 

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
