/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentenrollment;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class StudentenrollmentController implements Initializable {

    @FXML
    private Label AllCourses;
    @FXML
    private Label MyCourses;
    @FXML
    private Label result;
    @FXML
    private TextField key;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EnrollAction(ActionEvent event) 
    {
        if(key.getText().equals(""))
        {
            result.setText("Please Enter Enroll Key");
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
		}
		Statement st= con.createStatement();
		final String sql3 = "select Subject from teacher where SubjectKey = '"+ this.key.getText()+"'";
                ResultSet rs = st.executeQuery(sql3);
                if(rs.next())
                {
                    this.result.setText("Course Enrolled Sucessfully");
                }
                else
                {
                    this.result.setText("Course Not Found");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    @FXML
    private void AllCoursesAction(ActionEvent event) 
    {
        AllCourses.setText("Mathematics\nEnglish\nSindhi\nUrdu\nphysics\nchemistry");
    }

    @FXML
    private void MyCoursesAction(ActionEvent event) 
    {
        MyCourses.setText("Mathematics\nEnglish");
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/studentdashboard/studentdashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("MAIN PAGE");
        stage.setScene(scene);
        stage.show();
    }
    
}
