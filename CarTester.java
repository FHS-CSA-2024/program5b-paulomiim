import java.util.Scanner;
public class CarTester{
    
    public static Car addCar(){
        Scanner myScanner = new Scanner(System.in); //make scanner
        
        System.out.println("Please enter car name: ");
        String carName = myScanner.nextLine();
        
        System.out.println("Please enter cars miles: ");
        Double milesDriven = myScanner.nextDouble();
        
        System.out.println("Please enter cars gallons: ");
        Double gallonsUsed = myScanner.nextDouble();
        
        Car myCar1 = new Car(carName, milesDriven, gallonsUsed);
        return myCar1;
        
        
    }
    
    
    
    public static void main(String[] args){
        Car car1 = addCar();
        System.out.println(car1.toString());
        
        Car car2 = addCar();
        System.out.println(car2.toString());
        
        
        
        
        
        
    }
}

