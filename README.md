# JavaProject2
__Toll Calculator__

Collaborators: MohammadHossein Labafbashi, Hadi Taghilouei

This is a college project in Java programming.

The purpose of this task is to teach us to independently create programs in the Object-Oriented style.


__This project contains This acknowledges.__

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

Installation is very easy, you can clone the entire code and run it with your IDE of choice, or you can download the src files and run it with terminal. 
   
  Ex: 
    
    $ javac TollCalculatorMain.java 
    $ java TollCalculatorMain 


__How to:__

In TollCalculatorMain class you should use some input about vehicle like car model, plate number, date and time that vehicle will pass the road camera (see below code).

You can either run the program with default input shown as blow or you can use your own vehicle details to see if it's toll-free time or in rush time. Here comes some explanation of how you can use this program. 

                                                    
        Date date=new Date(); // Make date object
        Car car1 = new Car("C-Klass",2012,"Mercedes-Benz","SVG 312"); // Create car object with some car details
        
        TollCalculator tc = new TollCalculator();
        
        String sDate1="2021/12/11 09:10:23";
        Date date1= null;
        date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(sDate1);
        System.out.println("Car => "+tc.getTollFee(car1,date1));
        










