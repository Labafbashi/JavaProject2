import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Car implements Vehicle {
    private final String model;
    private final int yearMade;
    private final String brand;
    private final String numberPlate;

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

    public void createDB(Date date){
        String dbPath = "Databases/Vehicles/Cars";
        String dbName = this.getInfo()[3]+".db";
        File dir = new File(dbPath);
        if(! dir.exists()){
            dir.mkdirs();
        }
        File file = new File(dbPath+"/"+dbName);
        try{
            Path path = Paths.get(dbPath+"/"+dbName);
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            long lines;
            lines = Files.lines(path).count();
            String addNewData = (lines+1) +";" + Convertor.dayOfDate(date) + ";" + Convertor.dateHumanReadable(date) + ";" ;
            bw.write(addNewData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
