/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addEmployee;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class AddemployeeController implements Initializable {

    ObservableList<String> genderlist = FXCollections.observableArrayList("Male", "Female");
    ObservableList<String> worklist = FXCollections.observableArrayList("Poen", "Security Guard");
    
    @FXML
    private ChoiceBox work;
    @FXML
    private ChoiceBox Gender;
    @FXML
    private DatePicker DOB;
    @FXML
    private TextField EmployeeName;
    @FXML
    private TextField FatherName;
    @FXML
    private TextField Caste;
    @FXML
    private TextField Religion;
    @FXML
    private TextField EmployeeNumber;
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
    private Label StudentStatus;
    @FXML
    private TextField id;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Gender.setItems(genderlist);
        work.setItems(worklist);
    }    
    
    private void showAge()
    {
        Calendar now = Calendar.getInstance();
        int year  = now .get(Calendar.YEAR);
        int birthyear = (DOB.getValue().getYear());
        int age = year - birthyear;
    }

    @FXML
    private void Cancel_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addData/adddata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void subt_clicked(ActionEvent event) 
    {
        String Error = "";
        int count = 0;
        if (this.DOB.getValue() == null) {
            Error = String.valueOf(Error) + "Date of Birth   \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.work.getValue() == null) {
            Error = String.valueOf(Error) + "Work             \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.EmployeeName.getText().equals("")) {
            Error = String.valueOf(Error) + "Employee Name  \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.id.getText().equals("")) {
            Error = String.valueOf(Error) + "ID   \t\t\t";
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
        if (this.EmployeeNumber.getText().equals("")) {
            Error = String.valueOf(Error) + "Phone #             \t";
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
        if (this.work.getValue() == null | this.EmployeeName.getText().equals("") | this.FatherName.getText().equals("") | this.Caste.getText().equals("") | this.Address.getText().equals("") | this.EmployeeNumber.getText().equals("") | this.DOB.getValue() == null | this.PCNIC.getText().equals("") | this.PlaceOfBirth.getText().equals("") | this.Nationality.getText().equals("") | this.Grade.getText().equals("") | this.id.getText().equals("")) {
            final String BigError = "Please Fill Following Fields to Continue: \n" + Error;
            this.StudentStatus.setText(BigError);
        }
        else
        {
            Connection con = null;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
                    Statement st= con.createStatement();
                    final String sql1 = "select * from employee where id='" + this.id.getText()+"'";
                    ResultSet rs = st.executeQuery(sql1);
                    
                    if(!rs.next())
                    {
                        final String sql4 = "INSERT INTO employee (Name, FatherName, Caste, Religion, Gender, DOB, Work, Grade, phone, salary, PlaceofBirth, PCNIC, Nationality, Address, id)values(+'" + this.EmployeeName.getText() + "'" + "," + "'" + this.FatherName.getText() + "'" + "," + "'" + this.Caste.getText()  + "'" + "," + "'" + this.Religion.getText() + "'" + "," + "'" + this.Gender.getValue().toString() + "'" + "," + "'" + (this.DOB.getValue()).toString() + "'" + "," + "'" + (this.work.getValue()).toString() + "'" + "," + "'" + this.Grade.getText() + "'" + "," + "'" + this.EmployeeNumber.getText() + "'" + "," + "'" + this.Salary.getText() + "'" + "," + "'" + this.PlaceOfBirth.getText() + "'" + "," + "'" + this.PCNIC.getText() + "'" + "," + "'" + this.Nationality.getText() + "'" + "," + "'" + this.Address.getText() + "'" + "," + "'" + this.id.getText()  + "'" + ")";
                        st.executeUpdate(sql4);
                        this.StudentStatus.setText("Registration was Successfull");
                        this.work.setValue((Object)null);
                        this.EmployeeName.clear();
                        this.FatherName.clear();
                        this.Caste.clear();
                        this.Gender.setValue((Object)null);
                        this.Religion.clear();
                        this.Salary.clear();
                        this.Address.clear();
                        this.EmployeeNumber.clear();
                        this.DOB.setValue(null);
                        this.PCNIC.clear();
                        this.PlaceOfBirth.clear();
                        this.Nationality.clear();
                        this.Grade.clear();
                        this.id.clear();
                        con.close();
                    }
                    else
                    {
                        this.StudentStatus.setText("ID Already Exist \n Choose New One");
                    }
                     
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
