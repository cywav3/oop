/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cemeterysystem;

public class DeceasedDetails {
    protected String name;
    protected String ic;
    protected String gender;
    protected String dob;
    protected String dod;
    protected String heirName;
    protected String heirPhone;
    private String owner;//protected just in case want to use it elsewhere

    public DeceasedDetails(String name, String ic, String gender, String dob, 
                    String dod, String heirName, String heirPhone, String owner) {
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.dob = dob;
        this.dod = dod; 
        this.heirName = heirName;
        this.heirPhone = heirPhone;
        this.owner = owner;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getDod() {
        return dod;
    }

    public String getHeirName() {
        return heirName;
    }

    public String getHeirPhone() {
        return heirPhone;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public String toFileFormat() { //format to display in file
        return name + "," + ic + "," + gender + "," + dob + "," + dod + "," + heirName + "," + heirPhone + "," + owner;
    }
}

