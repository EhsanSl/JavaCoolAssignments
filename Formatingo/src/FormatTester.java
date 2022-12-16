import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FormatTester {
    
    public static void main(String[] args) throws FileNotFoundException {
        try{

            File f = new File("Numbers.txt"); //opening the file
            Scanner sc = new Scanner(f) ; // creating an scanner object to read from the file 
            ArrayList<Integer> arr = new ArrayList<Integer>() ; //creating arraylist to store data
            //adding data to array list 
            while(sc.hasNext()){
                arr.add(sc.nextInt());
            }
            
            sc.close();//closing the input file;  
            
            for(Integer i : arr ){
                System.out.println(i.intValue());
            }

            PrintWriter p = new PrintWriter("FormattedNumbers.txt");
            
            //default formatter
            DefaultFormatter df = new DefaultFormatter() ; 
            p.print("Default Format: ");
            for ( int i = 0 ; i < arr.size() ; i++ ){
                p.print(df.format(arr.get(i).intValue()) + " ");
            }
            p.print("\n");
    
            //decimalFormatter
            DecimalSeperatorFormatter dsf = new DecimalSeperatorFormatter() ; 
            p.print("Decimal Format: ");
            for ( int i = 0 ; i < arr.size() ; i++ ){
                p.print(dsf.format(arr.get(i).intValue()) + " ");
            }
            p.print("\n");
            

            //Accounting formatter 
            AccountingFormatter af = new AccountingFormatter() ; 
            p.print("Accounting Format: ");
            for ( int i = 0 ; i < arr.size() ; i++ ){
                p.print(af.format(arr.get(i).intValue()) + " ");
            }
            p.print("\n");

            //Base 8 Format: 
            BaseFormatter bf8 = new BaseFormatter(8) ; 
            p.print("Base 8 Format: ");
            for ( int i = 0 ; i < arr.size() ; i++ ){
                p.print(bf8.format(arr.get(i).intValue()) + " ");
            }
            p.print("\n");

            //base 2 formatter:
            BaseFormatter bf2 = new BaseFormatter(2) ; 
            p.print("Base 2 Format: ");
            for ( int i = 0 ; i < arr.size() ; i++ ){
                p.print(bf2.format(arr.get(i).intValue()) + " ");
            }
            p.print("\n");
            p.close() ; 
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(NoSuchElementException exception){
            System.out.println(exception.getMessage());
        }

        

    }
}
