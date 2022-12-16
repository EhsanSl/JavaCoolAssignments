import java.awt.Point ; 

/**
 * Robot
 */
public class Robot {

    private Point p ; 
    private int direction  ; 

    public Robot(Point p , int direction) { 
           this.p = p ; 
           this.direction = direction ; 
    }

    public void turnLeft(){
        if( this.direction >= 1){
            this.direction-- ; 
        }
        else { 
            this.direction = 3 ; 
        }
    }

    public void turnRight(){
        if( this.direction <= 2 ){
            this.direction++ ; 
        }
        else { 
            this.direction = 0 ; 
        }
    }


    public void move(){
        if(this.direction == 0 ){
            this.p.y-- ; 
        } 
        else if(this.direction == 1 ){
            this.p.x++ ; 
        } 
        else if(this.direction == 2 ){
            this.p.y++ ; 
        } 
        else if(this.direction == 3 ){
            this.p.x-- ; 
        } 
    }


    public Point getLocation(){
        return this.p ; 
    }


    public String getDirection(){
        if(this.direction == 0 ){
            return "N";
        }
        else if(this.direction == 1){
            return "E"; 
        }
        else if(this.direction == 2){
            return "S"; 
        }
        else if(this.direction == 3){
            return "W"; 
        }
        else{
            return null;
        }
    }


}
