# JavaProject2
__Toll Calculator__

Collaborators: MohammadHossein Labafbashi, Hadi Taghilouei

This is a college project in Java programming.

The purpose of this task is to teach us to independently create programs in the Object Orientead style.


__This project contains these knowledge.__

    1. Describe the most common libaries in the Java platform.
    2. Describe how to analays and break down problems into logical smaller parts.
    3. Explain TDD. 
    4. Explain version control with Git and Github.
    5. Create teminal applications with IDE and Java. 



__Task:__

The city has decided to have customs duties on the roads in an attempt to create smaller bottlenecks in traffic.
People should be given financial incentives to drive other times than during rush hour (8:00 - 9:00) and (16: 00-17: 00).
The city client has given us consultants the task of designing a system to calculate the fee for an individual car that passes a road camera at a certain time of the day.


__Installation__:

Installation is very easy, you can clone the entire code and run it with your IDE of choice or you can download the src files and run it with terminal. 
   
  Ex: 
    
    $ javac TollCalculatorMain.java 
    $ java TollCalculatorMain 


__How to:__

In TollCalculatorMain class you shoud use some input like car model, plate number and date and time (see blow code) ..., you can either run the program with some default imput that already is inside Main method or you can use your own vehicle to see if it's toll free time. here comes some basic explanation of how you can use this program. 

                                                    
        Date date=new Date(); // Make date object
        Car car1 = new Car("C-Klass",2012,"Mercedes-Benz","SVG 312"); // Create car object with some car details
        MotorBike mb1 = new MotorBike("Seventy-Two", 2020,"HarleyDavidson","DFL 982"); // Create Moto bike object with some input

        TollCalculator tc = new TollCalculator();
        
        // Here you can put date and time that Car or Motor bike will pass road camera. 
        // For testing you can use diffrent date and time to see if your vehicle is in toll free date and time
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
        // Printing the result 
        System.out.println("Car => "+tc.getTollFee(car1,date1));
        System.out.println("Motor Bike => "+tc.getTollFee(mb1,date2));










