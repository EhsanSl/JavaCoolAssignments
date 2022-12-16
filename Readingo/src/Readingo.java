import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class Readingo {

    public static void main(String[] args) throws FileNotFoundException, NoSuchElementException 
        ,InputMismatchException, ArrayIndexOutOfBoundsException {
        
            //getting the names of the files from the use
        Scanner sc2 = new Scanner (System.in);
        String in ; 
        String out ; 
        System.out.println("Enter the name of the input file!");
        if(sc2.hasNext()){
            in = sc2.nextLine() ; 
            in = in + ".txt" ; 
            
        }else{ 
            System.out.println("invalid input!");
            sc2.close() ; 
            return ; 
        }
        System.out.println("Enter the name of the output file!");
        if(sc2.hasNext()){
            out = sc2.nextLine() ; 
            out = out + ".txt" ; 
            sc2.close() ;
        }else{ 
            System.out.println("invalid input!");
            sc2.close() ; 
            return ; 
        }

        //opening file to read 
        File f = new File(in) ; 
        Scanner sc = new Scanner( f ) ; 
        String dataT ; 

        if(sc.hasNextLine()){
            dataT = sc.nextLine() ;  
        }
        else { 
            System.out.println("File is empty!");
            sc.close() ; 
            return ; 
        }

        //different ways of dealing with different data types
        //String
        if( dataT.equals("String")){ 
            ArrayList<String> arr = new ArrayList<String>() ; 
            try{
                while( sc.hasNextLine()){
                    arr.add(sc.nextLine());    
                }
                sc.close(); 
            }
            catch(InputMismatchException exception){
                System.out.println(exception.getMessage());
            }
            //sorting
            try{
                String SO = args[0].toLowerCase() ; //formatting the argument passed to the programme
                Collections.sort(arr) ;
                if(SO.equals("descending")){
                    Collections.reverse(arr); 
                }
            }
             catch (ArrayIndexOutOfBoundsException exception) { //exception handling 
            }

            //Counting the number of lines in the list and printing on console
            int counter = 0 ; 
            for( String obj : arr ){
                System.out.println(obj+  " ");
                counter++ ; 
            }
            //printing on the newfile
            try(PrintWriter p = new PrintWriter(out)){ //just in case 
                
                p.println(dataT+","+counter); 
                for( String obj : arr ){
                    p.println(obj);
                }
            }
            catch(NoSuchElementException exception){
                System.out.println(exception.getMessage());
            }

        }
        //Integer
        if( dataT.equals("Integer")){ 
            ArrayList<Integer> arr = new ArrayList<Integer>() ; 
            try{
                while( sc.hasNextInt()){
                arr.add(sc.nextInt());    
                }
                sc.close(); 
            }
            catch(InputMismatchException exception){
                System.out.println(exception.getMessage());
            }
            //sorting
            try{
                String SO = args[0].toLowerCase() ; //formatting the argument passed to the programme
                Collections.sort(arr) ;
                if(SO.equals("descending")){
                    Collections.reverse(arr); 
                }
            }
            catch (ArrayIndexOutOfBoundsException exception) { //exception handling
                Collections.sort(arr) ; 
            }
            
            
            //printing the arraylist to make sure its ok:>
            //Counting the number of lines in the list and printing on console
            int counter = 0 ; 
            for( Integer obj : arr ){
                System.out.println(obj+  " ");
                counter++ ; 
            }
            //printing on the newfile
            try(PrintWriter p = new PrintWriter(out)){ //just in case
                
                p.println(dataT+","+counter); 
                for( Integer obj : arr ){
                    p.println(obj);
                }
            }
            catch(NoSuchElementException exception){
                System.out.println(exception.getMessage());
            }
        }


        //Double    
        if( dataT.equals("Double")){ 
            ArrayList<Double> arr = new ArrayList<Double>() ; 
            try{
                while( sc.hasNextDouble()){
                arr.add(sc.nextDouble());    
                }
                sc.close(); 
            }
            catch(InputMismatchException exception){
                System.out.println(exception.getMessage());
            }
            //sorting
            try{
                String SO = args[0].toLowerCase() ; //formatting the argument passed to the programme
                Collections.sort(arr) ;
                if(SO.equals("descending")){
                    Collections.reverse(arr); 
                }
            }
            catch (ArrayIndexOutOfBoundsException exception) { //exception handling
                Collections.sort(arr) ; 
            }
            //Counting the number of lines in the list and printing on console
            int counter = 0 ; 
            for( Double obj : arr ){
                System.out.println(obj+  " ");
                counter++ ; 
            }
            //printing on the newfile
            try(PrintWriter p = new PrintWriter(out)){ 
                
                p.println(dataT+","+counter); 
                for( Double obj : arr ){
                    p.println(obj);
                }
            }
            catch(NoSuchElementException exception){
                System.out.println(exception.getMessage());
            }
        }




        
    }
    

}
