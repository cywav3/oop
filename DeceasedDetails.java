package cemeterySystem;
public class DeceasedDetails {
    protected String name;
    protected String ic;
    protected String gender;
    protected String dob;
    protected String dod;
    protected String heirName;
    protected String heirPhone; //protected just in case want to use it elsewhere

    public DeceasedDetails(String name, String ic, String gender, String dob, 
                    String dod, String heirName, String heirPhone) {
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.dob = dob;
        this.dod = dod; 
        this.heirName = heirName;
        this.heirPhone = heirPhone;
    }

    public String toFileFormat() { //format to display in file
        return name + "," + ic + "," + gender + "," + dob + "," + dod + "," + heirName + "," + heirPhone;
    }
}
