import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileProcessing {
	
	
	 public static void main(String[] args) {
	        // TODO code application logic here
	        Random randomObj = new Random();
	        try {
	            File myFile = new File("jayraj.txt");
	            if (myFile.createNewFile()) {
	                System.out.println("File created: " + myFile.getName());
	            } else {
	                System.out.println("File already exists.\n");
	            }
	        FileWriter myWriter = new FileWriter("jayraj.txt");
	      
	       for (int i = 0; i < 10; i++) {
	            double randomDbl = randomObj.nextDouble();
	            myWriter.write(String.valueOf(randomDbl)+"\n");
	        }
	       System.out.println("Successfully wrote to the file.\n");
	       myWriter.close();
	       
	       Scanner myReader = new Scanner(myFile);
	       System.out.println("Reading from file: "+ myFile.getName());
	       while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	      
	      if (myFile.delete()) { 
	      System.out.println("Deleted the file: " + myFile.getName());
	    } else {
	      System.out.println("Failed to delete the file.\n");
	    } 
	      
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }  
	    }
	    
	}
