public class TestCar {
    public static void main(String[] args) {
        
        Car Mazzeratti = new Car() ; 
        Car Nissan = new Car( "Japan" , "Qashqai" , 2018) ;
        Car Dodge = new Car( "USA", "Charger", 2021 , 25000 , 240) ;

    
        System.out.println( "Nissan Basic information : ") ;
        Nissan.CarInfoPrinter();
        System.out.println( "--------------------------") ;
        
        Nissan.turnON(); 
        System.out.println( "Expected : The Engine is ON!") ;
        Nissan.getEngineStatus(); 
        
        System.out.println( "Nissan initial speed = " + Nissan.getSpeed() ) ;
        Nissan.accelerate( 120 );
        System.out.println( "Nissan speed after acceleration\n Expected speed: 120 | Actual speed = " + Nissan.getSpeed() ) ;
        Nissan.decelerate(50);
        System.out.println( "Nissan speed after deacceleration\n Expected speed: 70 | Actual speed  = " + Nissan.getSpeed() ) ;


        System.out.println( "--------------------------") ;
        System.out.println( "Accelerating Mazzeratti, Expected result: You need to turn on the car first!");     
        Mazzeratti.accelerate( 100 ); 
        Mazzeratti.turnON(); 
        Mazzeratti.accelerate(100);
        System.out.println( "Accelerating Mazzeratti, Expected speed: 100 | Actual speed:" + Mazzeratti.getSpeed()); 
        Mazzeratti.stop();
        System.out.println( "Stopping Mazzeratti \n Expected speed: 0  | Actual speed  : " + Mazzeratti.getSpeed());
        Mazzeratti.turnOff();
        System.out.println( "Expected : The Engine is OFF!") ;
        Mazzeratti.getEngineStatus(); 
        System.out.println( "--------------------------") ;

        System.out.println( "Dodge Basic information : ") ;
        Dodge.CarInfoPrinter();
        System.out.println( "--------------------------") ;

        System.out.println( "Dodge initial Max speed = " + Dodge.getMaxSpeed() ) ;
        Dodge.setMaxSpeed( 320 );
        System.out.println( "Dodge Max speed after upgrading = " + Dodge.getMaxSpeed() ) ;
        System.out.println( "--------------------------") ;
        Dodge.turnON();
        Dodge.accelerate(321);
        System.out.println( "Accelerating Dodge, Expected speed: 320 | Actual speed:" + Dodge.getSpeed());
        System.out.println( "--------------------------") ;
        Dodge.stop() ;
        System.out.println( "Stopping Dodge \n Expected speed: 0  | Actual speed  : " + Dodge.getSpeed());
        
        Dodge.turnOff(); 
        System.out.println( "Expected : The Engine is OFF!") ;
        Mazzeratti.getEngineStatus(); 
        System.out.println( "--------------------------") ;
    
        Car Ford = new Car("USA", "Mustang", 2011 , 55000, 290, 1.2); 
        System.out.println( "Ford Basic information : ") ;
        Ford.CarInfoPrinter();
        System.out.println( "--------------------------") ;
        System.out.println( "Initial fuel in the tank: " + Ford.getGasInTank()) ;
        Ford.addGas(80);
        System.out.println( "amount of fuel after visiting a gas station: " + Ford.getGasInTank()) ;
        System.out.println( "--------------------------") ;
        Ford.drive(55) ; 
        System.out.println( "amount of fuel after driving 55 Kilometers: " + Ford.getGasInTank()) ;


    
    }
}
