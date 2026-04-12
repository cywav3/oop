/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jnazah;//blh tukar lain

/**
 *
 * @author Lenovo
 */
import java.util.*;
import java.io.*;

public class Deceased {
    //make the array list have no limit
    private static ArrayList<Deceased> deceasedList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static final String FILE_NAME = "addDeceased.txt";
    
  /* public static void main(String[] args) {
        loadFromFile();
        addDeceased();
    //coding for addDeceased
   }*/
    public static void addDeceased(){
        System.out.println("--- Application For Plot Burial ---");
        
        System.out.print("Full Name: ");
        String name = input.nextLine().toUpperCase();
        
        System.out.print("IC Number (without '-'): "); 
        String ic = input.nextLine();
        
        System.out.print("Gender (MALE/FEMALE): "); 
        String gen = input.nextLine().toUpperCase();
        
        System.out.print("Date of Birth (ex: 01/01/2000): "); 
        String dob = input.nextLine();
        
        System.out.print("Date of Death (ex: 01/01/2000): "); 
        String dod = input.nextLine();
        
        System.out.print("Heir Name: "); 
        String hName = input.nextLine().toUpperCase();
        
        System.out.print("Heir Phone (without '-'): "); 
        String hPhone = input.nextLine();

        // Instantiate new object and add to the list
        deceasedList.add(new Deceased(name, ic, gen, dob, dod, hName, hPhone));

        System.out.println("To proceed with the application, please make a payment of RM80");
        System.out.println("Have you made the payment? (yes/no)");
        String paid = input.nextLine();
        
        if (paid.equalsIgnoreCase("yes")){
            saveToFile();
        }
        else{
            System.out.println("Please make payment first before applying");
        }
    }
        
    public static void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < deceasedList.size(); i++) {
                Deceased d = deceasedList.get(i);
                pw.println(d.toFileFormat());
            }
            System.out.println("Data successfully updated in file.");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static void loadFromFile() {
        File f = new File(FILE_NAME);
        if (!f.exists()) return;

        deceasedList.clear(); // Clear list before loading from file

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 7) { //check if the information is complete
                    // Rebuild the object and add to list
                    deceasedList.add(new Deceased(p[0], p[1], p[2], p[3], p[4], p[5], p[6]));
                }
                else
                    System.out.println("Your information is incomplete, please try again.");
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }          
}



        
    
    
    
    
    
    
    
    
    
    
    
    
    
    

