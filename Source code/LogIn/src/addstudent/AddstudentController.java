/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addstudent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class AddstudentController implements Initializable {

    ObservableList<String> genderlist = FXCollections.observableArrayList("Male", "Female");
    
    @FXML
    private ChoiceBox Gender;
    @FXML
    private DatePicker DOB;
    @FXML
    private TextField RollNumber;
    @FXML
    private TextField StudentName;
    @FXML
    private TextField FatherName;
    @FXML
    private TextField Caste;
    @FXML
    private TextField Religion;
    @FXML
    private TextField GuardianNumber;
    @FXML
    private TextField ClassName;
    @FXML
    private TextField PlaceOfBirth;
    @FXML
    private TextField GCNIC;
    @FXML
    private TextField Nationality;
    @FXML
    private TextArea Address;
    @FXML
    private TextField LastInstitute;
    @FXML
    private Label StudentStatus;
    @FXML
    private TextField student_user;
    @FXML
    private PasswordField student_pass;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Gender.setItems(genderlist);
    }    

    @FXML
    private void back_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addData/adddata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD DATA");
        stage.setScene(scene);
        stage.show();
    }
    
    private void showAge()
    {
        Calendar now = Calendar.getInstance();
        int year  = now .get(Calendar.YEAR);
        int birthyear = (DOB.getValue().getYear());
        int age = year - birthyear;
    }

    @FXML
    private void submitStudent(ActionEvent event) throws SQLException 
    {
        String Error = "";
        int count = 0;
        if (this.DOB.getValue() == null) {
            Error = String.valueOf(Error) + "Date of Birth   \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.RollNumber.getText().equals("")) {
            Error = String.valueOf(Error) + "Roll Number      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.StudentName.getText().equals("")) {
            Error = String.valueOf(Error) + "Student Name     \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.FatherName.getText().equals("")) {
            Error = String.valueOf(Error) + "Father Name      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Caste.getText().equals("")) {
            Error = String.valueOf(Error) + "Caste                 \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Gender.getValue() == null) {
            Error = String.valueOf(Error) + "Gender              \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Religion.getText().equals("")) {
            Error = String.valueOf(Error) + "Religion          \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.ClassName.getText().equals("")) {
            Error = String.valueOf(Error) + "Class                 \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Address.getText().equals("")) {
            Error = String.valueOf(Error) + "Address           \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.GuardianNumber.getText().equals("")) {
            Error = String.valueOf(Error) + "Guardian Number\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.student_user.getText().equals("")) {
            Error = String.valueOf(Error) + "Username           \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.student_pass.getText().equals("")) {
            Error = String.valueOf(Error) + "Password    \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.GCNIC.getText().equals("")) {
            Error = String.valueOf(Error) + "Guardian CNIC    \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.PlaceOfBirth.getText().equals("")) {
            Error = String.valueOf(Error) + "Place of Birth   \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Nationality.getText().equals("")) {
            Error = String.valueOf(Error) + "Nationality      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.LastInstitute.getText().equals("")) {
            Error = String.valueOf(Error) + "Last Insititute  \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.RollNumber.getText().equals("") | this.StudentName.getText().equals("") | this.FatherName.getText().equals("") | this.Caste.getText().equals("") | this.Address.getText().equals("") | this.GuardianNumber.getText().equals("") | this.DOB.getValue() == null | this.GCNIC.getText().equals("") | this.PlaceOfBirth.getText().equals("") | this.Nationality.getText().equals("") | this.LastInstitute.getText().equals("") | this.student_user.getText().equals("") | this.student_pass.getText().equals("")) {
            final String BigError = "Please Fill Following Fields to Continue: \n" + Error;
            this.StudentStatus.setText(BigError);
        }
        else
        {
            Connection con;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
		}
		Statement st= con.createStatement();
		final String sql3 = "Select * from students where RollNumber='" + this.RollNumber.getText() + "'";
                ResultSet rs= st.executeQuery(sql3);
		
                
                if (!rs.next()) 
                {
                    final String sql5 = "Select * from students where Username='" + this.student_user.getText() + "'";
                    ResultSet rs1= st.executeQuery(sql5);
                    
                    if(!rs1.next())
                    {
                        final String sql4 = "INSERT INTO students (RollNumber, Name, FatherName, Caste, Gender, Religion, Class, Address, GuardianContact, DateOfBirth, GuardianCNIC, PlaceOfBirth, Nationality, LastSchool, Username, Password)values(+'" + this.RollNumber.getText() + "'" + "," + "'" + this.StudentName.getText() + "'" + "," + "'" + this.FatherName.getText() + "'" + "," + "'" + this.Caste.getText() + "'" + "," + "'" + this.Gender.getValue().toString() + "'" + "," + "'" + this.Religion.getText() + "'" + "," + "'" + this.ClassName.getText() + "'" + "," + "'" + this.Address.getText() + "'" + "," + "'" + this.GuardianNumber.getText() + "'" + "," + "'" + (this.DOB.getValue()).toString() + "'" + "," + "'" + this.GCNIC.getText() + "'" + "," + "'" + this.PlaceOfBirth.getText() + "'" + "," + "'" + this.Nationality.getText() + "'" + "," + "'" + this.LastInstitute.getText() + "'" + "," + "'" + this.student_user.getText() + "'" + "," + "'" + this.student_pass.getText() + "'" + ")";
                        st.executeUpdate(sql4);
                    
                        this.StudentStatus.setText("Registration was Successfull");
                        this.RollNumber.clear();
                        this.StudentName.clear();
                        this.FatherName.clear();
                        this.Caste.clear();
                        this.Gender.setValue((Object)null);
                        this.Religion.clear();
                        this.ClassName.clear();
                        this.Address.clear();
                        this.GuardianNumber.clear();
                        this.DOB.setValue(null);
                        this.GCNIC.clear();
                        this.PlaceOfBirth.clear();
                        this.Nationality.clear();
                        this.LastInstitute.clear();
                        this.student_user.clear();
                        this.student_pass.clear();
                    }
                    else
                    {
                        this.StudentStatus.setText("Username Already Exist \n Choose New One");
                    }
                }
                else 
                {
                    this.StudentStatus.setText("Roll Number Already Exist \n Choose New One");
                }
                
                con.close();
                
                
            }
            catch(ClassNotFoundException e)
            {
                System.out.println("Class Not Found");
            }
            
                
            
            
        }
    }
    
    private final String checkCount(int count)
    {
        if(count%2 == 1)
        {
            return "\t";
        }
        return "\n";
    }
    
}
