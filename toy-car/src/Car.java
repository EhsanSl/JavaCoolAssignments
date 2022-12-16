/**
 * This is a java class for Cars 
 */
public class Car {

    private String make ; 
    private String model ; 
    private double price ; 
    private int speed ; 
    private int maxSpeed ; 
    private int year ; 
    private boolean isOn; 
    private boolean isMoving ; 

    private double fuelEfficiency ; 
    private double fuelLVL ; 

    public Car() { 
        this.make = "TBA"; 
        this.isOn = false ; 
        this.isMoving = false ; 
        this.speed = 0 ; 
        this.maxSpeed = 120 ; 
    }

    public Car( String make , String model , int year  ){
        this() ; 
        this.make = make ; 
        this. model = model ; 
        this.year = year  ; 
    }

    public Car( String make , String model , int year , int price , int maxSpeed){
        this(make,model,year) ; 
        this.year = year ; 
        this.price = price ; 
        this.maxSpeed = maxSpeed ; 
    }

    public Car( String make , String model , int year , int price , int maxSpeed , double fuelEfficiency){
        this(make ,model ,year ,price ,maxSpeed) ; 
        this.fuelEfficiency = fuelEfficiency ; 
        this.fuelLVL = 0 ; 
    }

    //this setter method reduces the amount of fuel in the tank corresponding to the distance traveled 
    public void drive ( double distance ) { 

        this.fuelLVL = this.fuelLVL - ( distance * fuelEfficiency) ; 
    }

    // returns the amount of fuel in the tank 
    public double getGasInTank() { 
        return this.fuelLVL ; 
    }

    //adds fuerl to the tank 
    public void addGas( double fuel) { 
        this.fuelLVL = this.fuelLVL + fuel ; 
    }

    /**
     * this is a getter method for Price of car
     * @return price of the car object
     */
    public double getPrice(){
        return price ; 
    } 


    /**
     * a simple method to printing out the baic info of car object
     */
    public void CarInfoPrinter( )  {
        System.out.println( "Made in : "+ this.make) ;
        System.out.println( "Model : " + this.model  ) ;
        System.out.println( "Max Speed : " + this.maxSpeed ) ;
        System.out.println( "Year : " + this.year) ;
    }


    /**
     * This is a setter method for car speed
     * @param speedAcc is the additional speed value caused by acceleration
     * this method checks to see if the car's engine is on and then sets the new speed value. 
     */
    public void accelerate(int speedAcc) { 
        if( this.isOn == true ) { 
            if ( speed+speedAcc <= maxSpeed){
                this.speed = this.speed + speedAcc ;  
                
            }
            else { 
            this.speed = maxSpeed ; 
            System.out.println("This Car cannot go faster than "+ maxSpeed+" Km/h!");
            }

        }
        else { 
            System.out.println("You need to turn on the car first!") ; 
        }

    }

    /**
     * This is a setter method for car speed
     * @param speedDec is the amount of decressing in speed caused by using breaks of car. 
     * 
     * this method checks to see if the car is moving and then decreases the speed. 
     */
    public void decelerate ( int speedDec ) { 
        if (this.speed > 0 ){
            this.isMoving = true ; 
        }else {
            System.out.println("The car is already stopped!") ;  
        }    
        if( this.isMoving == true  && this.speed - speedDec > 0 ) { 
            this.speed = this.speed - speedDec ; 
        }
        else { 
            this.speed = 0 ; 
            System.out.println("The car is stopped!") ;
        } 
    }

    /**
     * this setter method sets the speed to zero 
     */
    public void stop (){ 
        speed = 0 ; 
    }

    /**
     * this getter method returns the speed of the car object
     * @return speed of the car 
     */
    public int getSpeed(){
        return this.speed;  
    }

    /**
     * this setter method defines new max speed for the car object 
     * @param maxSpeed is the newly defined max speed for the car object 
     */
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed ; 
    }


    /**
     * This getter method returns the Max speed of car object
     * @return Max speed 
     */
    public int getMaxSpeed(){
        return this.maxSpeed ; 
    }
    
    /**
     * This setter method set the status of engine to off by setting thi.isOn to false ; 
     */
    public void turnOff() { 
        if(this.isOn == true ){
            this.isOn = false ;
        }
        else{
            System.out.println("The car's already OFF!") ; 
        }
         
    }

    /**
     * This setter method set the status of engine to ON by setting thi.isOn to true ; 
     */
    public void turnON(){
        if(this.isOn == false ){
            this.isOn = true  ;
        }
        else{
            System.out.println("The car's already ON!") ; 
        }
    }

    /**
     * This method simply prints out the engine status! 
     * depending on the isOn variable of the object ! 
     * */
    public void getEngineStatus(){ 
        if(isOn == true ){
            System.out.println("The Engine is On!"); 
        }
        else { 
            System.out.println("The Engine is Off!");
        }
    }


    




    


}
