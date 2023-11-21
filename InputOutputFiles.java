import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
      boolean fileCorrect = false;
      
      while(fileCorrect == false) 
      {
    	  try {
    		  
    		  Scanner FileF = new Scanner(System.in);
        	  System.out.println("enter the path to open");
        	  String inputFi = FileF.next();
        	  
       
        	  File inputFile = new File(inputFi);
        	
              PrintWriter outputfile = new PrintWriter("outline.txt");
        	  
           
              Scanner in = new Scanner(inputFile);
             
              while (in.hasNext()) 
              {
            
              String what = in.nextLine();
              outputfile.println(what);
              }
       
              in.close();
              outputfile.close();
              FileF.close();
              

              fileCorrect = true;
              System.out.println("Input file found");
          }

          catch(FileNotFoundException e)
          {
        	  System.out.println("File not found, please try again");
          }
      }
 
      
   }
}