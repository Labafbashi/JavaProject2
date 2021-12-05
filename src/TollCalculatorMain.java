import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TollCalculatorMain {
    public static void main(String[] args) {
        Date date=new Date();
        Car car1 = new Car("C-Klass",2012,"Mercedes-Benz","SVG 312");
        TollCalculator tc = new TollCalculator();
        System.out.println(tc.getTollFee(car1,date));
        System.out.println("Car 1 toll fee ==> "+car1.getFee());
        System.out.println("Car 1 information ==> "+car1.getInfo()[3]);
        System.out.println(("   Test 1 2 3    ".trim()).replaceAll("\\s+","-"));
/*        try {
            File myObj = new File("Databases/Vehicles/Cars/");
            if(! myObj.exists()){
                myObj.mkdirs();
            }
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/
    }


}
