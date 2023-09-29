/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_S_RollNumber;

/**
 *
 * @author Muhammad Tahir
 */
public class ModelTable {
    
    
    private String RollNumber;
    private String Name;
    private String FNmae;
    private String Caste;
    private String Gender;
    private String religion;
    private String class1;
    private String Address;
    private String DOB;
    private String POB;
    private String Nationality;
    private String Lastinstitute;
    
    public ModelTable(String RN, String N,String FN,String C,String G,String R,String CL,String A,String DOB,String POB,String NA,String LI)
    {
        this.RollNumber = RN;
        this.Name = N;
        this.FNmae = FN;
        this.Caste = C;
        this.Gender = G;
        this.religion = R;
        this.class1 = CL;
        this.DOB = DOB;
        this.Address = A;
        this.POB = POB;
        this.Nationality = NA;
        this.Lastinstitute = LI;
    }

    public String getRollNumber() {
        return RollNumber;
    }

    public String getName() {
        return Name;
    }

    public String getFNmae() {
        return FNmae;
    }

    public String getCaste() {
        return Caste;
    }

    public String getGender() {
        return Gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getClass1() {
        return class1;
    }

    public String getAddress() {
        return Address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getPOB() {
        return POB;
    }

    public String getNationality() {
        return Nationality;
    }

    public String getLastinstitute() {
        return Lastinstitute;
    }

    public void setRollNumber(String RollNumber) {
        this.RollNumber = RollNumber;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setFNmae(String FNmae) {
        this.FNmae = FNmae;
    }

    public void setCaste(String Caste) {
        this.Caste = Caste;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setPOB(String POB) {
        this.POB = POB;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public void setLastinstitute(String Lastinstitute) {
        this.Lastinstitute = Lastinstitute;
    }
    
    
    
    
}
