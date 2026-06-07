/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cemeterySystem;

import java.util.*;
import java.io.*;

public class Deceased {
    //make the array list have no limit
    private static ArrayList<Deceased> deceasedList = new ArrayList<>();
    private static final String FILE_NAME = "addDeceased.txt";
        
    public static void addDeceased(Deceased d) { //store data
        deceasedList.add(d);
    }

    public static ArrayList<Deceased> getList() { //get all data
        return deceasedList;
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
        if (!f.exists()) 
            return;

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



        
    
    
    
    
    
    
    
    
    
    
    
    
    
    

