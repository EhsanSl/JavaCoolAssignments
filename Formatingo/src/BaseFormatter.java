import java.util.ArrayList; 
public class BaseFormatter implements NumberFormatter {

    private int base ; 

    public BaseFormatter( int base ){
        this.base = base ; 
    }


    @Override
    public String format(int n) {
       
        StringBuilder strB = new StringBuilder() ; 

        String str = ""; //the output to be 
        int q  = n ; //Quotient 
        int rem = 0 ; //remainder 
        Boolean flag = false ; 
        
        //in case we have a negative number 
        if ( n < 0){
            flag = true ; 
            q = -n ;  
        }

        while( q != 0  ){
            rem = q % base ; //remainder 
            q = q / base ;
             
            
            if(rem == 10) 
                str += "A"; 
                 
            if(rem == 11) 
                str += "B" ; 
                 
            if( rem == 12 )
                str += "C" ; 
                 
            if( rem == 13 ) 
                str += "D" ; 
                //strB.append("D");
            if(rem == 14) 
                str += "E" ; 
                //strB.append("E"); 
            if( rem == 15 ) 
                str += "F";
                //strB.append("F");
 
            else {
                str += String.valueOf(rem) ;     
                 
            }

        }
        
        strB.append(str); //appending the str to string builder 

        if ( flag == true ){//adding the '-' sign before reversing 
            strB.append("-"); 
        }

        strB.reverse(); //reversing the Created String made of all the remainders : 
        
        return strB.substring(0) ;  

        
    }


    
    
}
