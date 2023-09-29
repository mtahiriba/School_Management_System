/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std_edit;

import S_S_Class.ModelTable1;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class EditstudentController implements Initializable {

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
    @FXML
    private TextField searchfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        this.RollNumber.setDisable(true);
    }    

    @FXML
    private void back_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/EditData/editdata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("EDIT DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void submitStudent(ActionEvent event) 
    {
        String Error = "";
        int count = 0;
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
        if (this.Religion.getText().equals("")) {
            Error = String.valueOf(Error) + "Religion          \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.student_user.getText().equals("")) {
            Error = String.valueOf(Error) + "Username                 \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.student_pass.getText().equals("")) {
            Error = String.valueOf(Error) + "Password          \t";
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
        if (this.RollNumber.getText().equals("") | this.StudentName.getText().equals("") | this.FatherName.getText().equals("") | this.Caste.getText().equals("") | this.Address.getText().equals("") | this.GuardianNumber.getText().equals("") | this.GCNIC.getText().equals("") | this.PlaceOfBirth.getText().equals("") | this.Nationality.getText().equals("") | this.LastInstitute.getText().equals("") | this.student_user.getText().equals("") | this.student_pass.getText().equals("")) {
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
		final String sql3 = "update students set Name='" + this.StudentName.getText() + "', FatherName='" + this.FatherName.getText() + "', Caste='" + this.Caste.getText() + "', Religion='" + this.Religion.getText() + "', Class='" + this.ClassName.getText() + "', Address='" + this.Address.getText() + "', GuardianContact='" + this.GuardianNumber.getText() + "', GuardianCNIC='" + this.GCNIC.getText() + "', PlaceOfBirth='" + this.PlaceOfBirth.getText() + "', Nationality='" + this.Nationality.getText() + "', LastSchool='" + this.LastInstitute.getText() + "', Username='" + this.student_user.getText() + "', Password='" + this.student_pass.getText() +"' where RollNumber='" + this.RollNumber.getText() + "'";
                st.executeUpdate(sql3);
                
                this.StudentStatus.setText("Data Update was Successfull");
                this.RollNumber.clear();
                this.StudentName.clear();
                this.FatherName.clear();
                this.Caste.clear();
                this.Religion.clear();
                this.ClassName.clear();
                this.Address.clear();
                this.GuardianNumber.clear();
                this.GCNIC.clear();
                this.PlaceOfBirth.clear();
                this.Nationality.clear();
                this.LastInstitute.clear();
                this.student_user.clear();
                this.student_pass.clear();
                this.searchfield.clear();
                        
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            
                        
                        
        }
        
    }

    @FXML
    private void searchAction(ActionEvent event) 
    {
        this.RollNumber.clear();
        this.StudentName.clear();
        this.FatherName.clear();
        this.Caste.clear();
        this.Religion.clear();
        this.ClassName.clear();
        this.Address.clear();
        this.GuardianNumber.clear();
        this.GCNIC.clear();
        this.PlaceOfBirth.clear();
        this.Nationality.clear();
        this.LastInstitute.clear();
        this.student_user.clear();
        this.student_pass.clear();
                
        if(searchfield.getText().equals(""))
        {
            StudentStatus.setText("Please Enter Roll Number");
        }
        else
        {
            StudentStatus.setText("");
            Connection con;
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
                    Statement st= con.createStatement();
                    final String sql3 = "Select * from students where RollNumber='" + this.searchfield.getText() + "'";
                    ResultSet rs= st.executeQuery(sql3);
                
                    if(rs.next()) 
                    {
                        this.RollNumber.setText(rs.getString(1));
                        this.StudentName.setText(rs.getString(2));
                        this.FatherName.setText(rs.getString(3));
                        this.Caste.setText(rs.getString(4));
                        this.Religion.setText(rs.getString(6));
                        this.ClassName.setText(rs.getString(7));
                        this.Address.setText(rs.getString(8));
                        this.GuardianNumber.setText(rs.getString(9));
                        this.GCNIC.setText(rs.getString(10));
                        this.PlaceOfBirth.setText(rs.getString(11));
                        this.Nationality.setText(rs.getString(12));
                        this.LastInstitute.setText(rs.getString(13));
                        this.student_user.setText(rs.getString(15));
                        this.student_pass.setText(rs.getString(16));
                    }
                    else
                    {
                        StudentStatus.setText("Roll Number Does Not Exist");
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
