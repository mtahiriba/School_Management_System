/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editemployee;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class EditemployeeController implements Initializable {

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
    private TextField searchfield;
    @FXML
    private TextField Grade;

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
            Error = String.valueOf(Error) + "ID      \t\t\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.StudentName.getText().equals("")) {
            Error = String.valueOf(Error) + "Name     \t\t";
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
        if (this.ClassName.getText().equals("")) {
            Error = String.valueOf(Error) + "Salary                 \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.Address.getText().equals("")) {
            Error = String.valueOf(Error) + "Address           \t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.GuardianNumber.getText().equals("")) {
            Error = String.valueOf(Error) + "Phone # \t\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.GCNIC.getText().equals("")) {
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
            Error = String.valueOf(Error) + "Grade   \t\t\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.LastInstitute.getText().equals("")) {
            Error = String.valueOf(Error) + "Work  \t\t";
            count++;
            Error = String.valueOf(Error) + checkCount(count);
        }
        if (this.RollNumber.getText().equals("") | this.StudentName.getText().equals("") | this.FatherName.getText().equals("") | this.Caste.getText().equals("") | this.Address.getText().equals("") | this.GuardianNumber.getText().equals("") | this.GCNIC.getText().equals("") | this.PlaceOfBirth.getText().equals("") | this.Nationality.getText().equals("") | this.LastInstitute.getText().equals("")| this.Grade.getText().equals("")) {
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
		final String sql3 = "update employee set Name='" + this.StudentName.getText() + "', FatherName='" + this.FatherName.getText() + "', Caste='" + this.Caste.getText() + "', Religion='" + this.Religion.getText() + "', Salary='" + this.ClassName.getText() + "', Address='" + this.Address.getText() + "', phone='" + this.GuardianNumber.getText() + "', PCNIC='" + this.GCNIC.getText() + "', PlaceofBirth='" + this.PlaceOfBirth.getText() + "', Nationality='" + this.Nationality.getText() + "', Work='" + this.LastInstitute.getText() + "', Grade='" + this.Grade.getText() + "' where id='" + this.RollNumber.getText() + "'";
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
                this.searchfield.clear();
                this.Grade.clear();
                        
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
        this.Grade.clear();
        
        
        if(searchfield.getText().equals(""))
        {
            StudentStatus.setText("Please Enter ID");
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
                    final String sql3 = "Select * from employee where id='" + this.searchfield.getText() + "'";
                    ResultSet rs= st.executeQuery(sql3);
                
                    if(rs.next()) 
                    {
                        this.RollNumber.setText(rs.getString(15));
                        this.StudentName.setText(rs.getString(1));
                        this.FatherName.setText(rs.getString(2));
                        this.Caste.setText(rs.getString(3));
                        this.Religion.setText(rs.getString(4));
                        this.ClassName.setText(rs.getString(10));
                        this.Address.setText(rs.getString(14));
                        this.GuardianNumber.setText(rs.getString(9));
                        this.GCNIC.setText(rs.getString(12));
                        this.PlaceOfBirth.setText(rs.getString(11));
                        this.Nationality.setText(rs.getString(13));
                        this.LastInstitute.setText(rs.getString(7));
                        this.Grade.setText(rs.getString(8));
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
