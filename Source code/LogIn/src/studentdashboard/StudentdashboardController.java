/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdashboard;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class StudentdashboardController implements Initializable {

    @FXML
    private Label name_label;
    @FXML
    private ImageView std_info;
    @FXML
    private ImageView course_enroll;
    @FXML
    private ImageView logout_field;
    
    
    Image logout_releassed = new Image ("/studentdashboard/logoutred.png");
    Image logout_hover = new Image ("/studentdashboard/logouthover.png");
    Image std_info_releassed = new Image ("/studentdashboard/addemployee.jpg");
    Image std_info_hover = new Image ("/studentdashboard/addemployeehover.jpg");
    Image std_enroll_releassed = new Image ("/studentdashboard/addemployee.jpg");
    Image std_enroll_hover = new Image ("/studentdashboard/addemployeehover.jpg");

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String user = "";
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
		final String sql3 = "select * from students inner join remaimber_data on remaimber_data.username = students.Username";
                ResultSet rs = st.executeQuery(sql3);
                if(rs.next())
                {
                    user = rs.getString(2);
                    //System.out.println(user);
                }
                name_label.setText("Welcome "+user);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }    

    @FXML
    private void std_info_released(MouseEvent event) 
    {
        std_info.setImage(std_info_releassed);
    }

    @FXML
    private void std_info_exited(MouseEvent event) 
    {
        std_info.setImage(std_info_releassed);
    }

    @FXML
    private void std_info_entered(MouseEvent event) 
    {
        std_info.setImage(std_info_hover);
    }

    @FXML
    private void std_info_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/studentinformation/studentinformation.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("STUDENT INFORMATION");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void std_info_pressed(MouseEvent event) 
    {
        std_info.setImage(std_info_hover);
    }

    @FXML
    private void course_enroll_released(MouseEvent event) 
    {
        course_enroll.setImage(std_enroll_releassed);
    }

    @FXML
    private void course_enroll_exited(MouseEvent event) 
    {
        course_enroll.setImage(std_enroll_releassed);
    }

    @FXML
    private void course_enroll_entered(MouseEvent event) 
    {
        course_enroll.setImage(std_enroll_hover);
    }

    @FXML
    private void course_enroll_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/studentenrollment/studentenrollment.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("COURSE INFORMATION");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void course_enroll_pressed(MouseEvent event) 
    {
        course_enroll.setImage(std_enroll_releassed);
    }

    @FXML
    private void logout_released(MouseEvent event) 
    {
        logout_field.setImage(logout_releassed);
    }

    @FXML
    private void logout_exited(MouseEvent event) 
    {
        logout_field.setImage(logout_releassed);
    }

    @FXML
    private void logout_entered(MouseEvent event) 
    {
        logout_field.setImage(logout_hover);
    }

    @FXML
    private void logout_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/login/login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("LOGIN");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void logout_pressed(MouseEvent event) 
    {
        logout_field.setImage(logout_hover);
    }
    
}
