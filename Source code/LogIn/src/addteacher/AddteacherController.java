/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addteacher;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class AddteacherController implements Initializable {

    ObservableList<String> genderlist = FXCollections.observableArrayList("Male", "Female");
    
    
     @FXML
    private ChoiceBox Gender;
    @FXML
    private DatePicker DOB;
    @FXML
    private TextField TeacherName;
    @FXML
    private TextField FatherName;
    @FXML
    private TextField Caste;
    @FXML
    private TextField Religion;
    @FXML
    private TextField PersonalNumber;
    @FXML
    private TextField Salary;
    @FXML
    private TextField PlaceOfBirth;
    @FXML
    private TextField PCNIC;
    @FXML
    private TextField Nationality;
    @FXML
    private TextArea Address;
    @FXML
    private TextField Grade;
    @FXML
    private TextField Subject;
    @FXML
    private Label StudentStatus;
    @FXML
    private TextField teacher_user;
    @FXML
    private PasswordField teacher_pass;
    @FXML
    private TextField idfield;
    @FXML
    private TextField keyfield;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Gender.setItems(genderlist);
    }    
    
    private void showAge()
    {
        Calendar now = Calendar.getInstance();
        int year  = now .get(Calendar.YEAR);
        int birthyear = (DOB.getValue().getYear());
        int age = year - birthyear;
    }

    @FXML
    private void cancel_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addData/adddata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void submit_clicked(ActionEvent event) 
    {
        String Error = "";
        int count = 0;
        if (this.DOB.getValue() == null) {
            Error = String.valueOf(Error) + "Date of Birth   \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Subject.getText().equals("")) {
            Error = String.valueOf(Error) + "Subject      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.keyfield.getText().equals("")) {
            Error = String.valueOf(Error) + "Subject Key      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.idfield.getText().equals("")) {
            Error = String.valueOf(Error) + "ID              \t\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.teacher_user.getText().equals("")) {
            Error = String.valueOf(Error) + "Username      \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.teacher_pass.getText().equals("")) {
            Error = String.valueOf(Error) + "Password              \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.TeacherName.getText().equals("")) {
            Error = String.valueOf(Error) + "Teacher Name     \t";
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
        if (this.Salary.getText().equals("")) {
            Error = String.valueOf(Error) + "Salary                 \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Address.getText().equals("")) {
            Error = String.valueOf(Error) + "Address           \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.PersonalNumber.getText().equals("")) {
            Error = String.valueOf(Error) + "Phone #              \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.PCNIC.getText().equals("")) {
            Error = String.valueOf(Error) + "Personal CNIC    \t";
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
        if (this.Grade.getText().equals("")) {
            Error = String.valueOf(Error) + "Grade             \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Subject.getText().equals("") | this.TeacherName.getText().equals("") | this.FatherName.getText().equals("") | this.Caste.getText().equals("") | this.Address.getText().equals("") | this.PersonalNumber.getText().equals("") | this.DOB.getValue() == null | this.PCNIC.getText().equals("") | this.PlaceOfBirth.getText().equals("") | this.Nationality.getText().equals("") | this.Grade.getText().equals("") | this.Salary.getText().equals("") | this.teacher_user.getText().equals("") | this.teacher_pass.getText().equals("") | this.idfield.getText().equals("") | this.keyfield.getText().equals("")) {
            final String BigError = "Please Fill Following Fields to Continue: \n" + Error;
            this.StudentStatus.setText(BigError);
        }
        else
        {
            
            Connection con;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
		}
		Statement st= con.createStatement();
		final String sql3 = "Select * from teacher where id='" + this.idfield.getText() + "'";
                ResultSet rs= st.executeQuery(sql3);
                
                if(!rs.next())
                {
                    final String sql4 = "Select * from teacher where Username='" + this.teacher_user.getText() + "'";
                    ResultSet rs1= st.executeQuery(sql4);
                    
                    if(!rs1.next())
                    {
                        final String sql6 = "Select * from teacher where SubjectKey='" + this.keyfield.getText() + "'";
                        ResultSet rs2= st.executeQuery(sql6);
                        
                        if(!rs2.next())
                        {
                            final String sql5 = "INSERT INTO teacher (Name, FatherName, Caste, Religion, Subject, Gender, DOB, phone, Salary, Grade, PlaceofBirth, PCNIC, Nationality, Username, password, Address, id, SubjectKey)values(+'" + this.TeacherName.getText() + "'" + "," + "'" + this.FatherName.getText() + "'" + "," + "'" + this.Caste.getText() + "'" + "," + "'" + this.Religion.getText() + "'" + "," + "'" + this.Subject.getText() + "'" + "," + "'" + this.Gender.getValue().toString() + "'" + "," + "'" + (this.DOB.getValue()).toString() + "'" + "," + "'" + this.PersonalNumber.getText() + "'" + "," + "'" + this.Salary.getText() + "'" + "," + "'" + this.Grade.getText() + "'" + "," + "'" + this.PlaceOfBirth.getText() + "'" + "," + "'" + this.PCNIC.getText() + "'" + "," + "'" + this.Nationality.getText() + "'" + "," + "'" + this.teacher_user.getText() + "'" + "," + "'" + this.teacher_pass.getText() + "'" + "," + "'" + this.Address.getText() + "'" + "," + "'" + this.idfield.getText() + "'" + "," + "'" + this.keyfield.getText() + "'" + ")";
                            st.executeUpdate(sql5);
                        
                            this.StudentStatus.setText("Registration was Successfull");
                            this.Subject.clear();
                            this.TeacherName.clear();
                            this.FatherName.clear();
                            this.Caste.clear();
                            this.Gender.setValue((Object)null);
                            this.Religion.clear();
                            this.Salary.clear();
                            this.Address.clear();
                            this.PersonalNumber.clear();
                            this.DOB.setValue(null);
                            this.PCNIC.clear();
                            this.PlaceOfBirth.clear();
                            this.Nationality.clear();
                            this.Grade.clear();
                            this.teacher_pass.clear();
                            this.teacher_user.clear();
                            this.idfield.clear();
                            this.keyfield.clear();
                        }
                        else
                        {
                            this.StudentStatus.setText("Subject Key Already Exist \n Choose New One");
                        }
                        
                    }
                    else
                    {
                        this.StudentStatus.setText("Username Already Exist \n Choose New One");
                    }
                  
                }
                else
                {
                    this.StudentStatus.setText("ID Already Exist \n Choose New One");
                }
                
                

            }
            catch(Exception e)
            {
                System.out.println(e);
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
