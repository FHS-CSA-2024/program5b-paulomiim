public class Car {
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car (){
        carName = "";
        milesDriven = 0.0;
        gallonsUsed = 0.0;
        
    }
    public Car (String name, double miles, double gallons) {
        this.carName = name;
        this.milesDriven = miles;
        this.gallonsUsed = gallons;
    }
    
    public void setName(String newName){
        this.carName = newName;
    }
    
    public String getName(){
        return carName;
    }
    
    public void setMiles(double newMiles){
        this.milesDriven = newMiles;
    }
    
    public double getMiles(){
        return milesDriven;
    }
    
    public void setGallons(double newGallons){
        this.gallonsUsed = newGallons;
    }
    
    public double getGallons(){
        return gallonsUsed;
    }
    
    public double calculateAverage(){
        double avg = milesDriven / gallonsUsed + 0.05;
        double avg1 = avg * 10;
        double avg2 = (int)avg1;
        double avg3 = avg2 / 10.0;
        return avg3;
    }
    
    public String toString() {
        return carName + " averaged " + calculateAverage() + " m/g.";
    }
    
    
    
    
    
    
    
}

