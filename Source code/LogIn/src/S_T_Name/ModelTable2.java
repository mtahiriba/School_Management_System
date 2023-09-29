/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_T_Name;

/**
 *
 * @author Muhammad Tahir
 */
public class ModelTable2 {
    
    
    private String Subject;
    private String Name;
    private String FNmae;
    private String Caste;
    private String Gender;
    private String religion;
    private String Phone;
    private String Address;
    private String DOB;
    private String POB;
    private String Nationality;
    private String Lastinstitute;
    private String Grade;
    private String Salary;
    private String RollNumber;
    
    public ModelTable2(String RN, String N,String FN,String C,String G,String R,String CL,String A,String DOB,String POB,String NA,String LI, String grade, String salary, String rn)
    {
        
        this.Name = RN;
        this.FNmae = N;
        this.Caste = FN;
        this.religion = C;
        this.Subject = G;
        this.Gender = R;
        this.DOB = CL;
        this.Phone = A;
        this.Salary = DOB;
        this.Grade = POB;
        this.POB = NA; 
        this.Lastinstitute = LI;
        this.Nationality = grade;
        this.Address = salary;
        this.RollNumber = rn;
       
        
        
        
        
    }

    public String getSubject() {
        return Subject;
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

    public String getPhone() {
        return Phone;
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

    public String getGrade() {
        return Grade;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
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

    public void setPhone(String Phone) {
        this.Phone = Phone;
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

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public void setRollNumber(String Grade) {
        this.RollNumber = Grade;
    }

    public String getRollNumber() {
        return this.RollNumber;
    }
    
    
    
    
}
