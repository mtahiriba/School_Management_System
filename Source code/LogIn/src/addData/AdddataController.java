/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addData;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class AdddataController implements Initializable {

    @FXML
    private ImageView imagefield;
    @FXML
    private ImageView add_student_field;
    @FXML
    private ImageView add_teacher_field;
    @FXML
    private ImageView add_employee_field;
    @FXML
    private ImageView Back_field;
    
    Image logout_releassed = new Image ("/admin_dashboard/logout.png");
    Image logout_hover = new Image ("/admin_dashboard/logoutred.png");
    Image add_student_releassed = new Image ("/admin_dashboard/addStudent.jpg");
    Image add_student_hover = new Image ("/admin_dashboard/addstudenthover.jpg");
    Image add_teacher_releassed = new Image ("/admin_dashboard/addteacher.jpg");
    Image add_teacher_hover = new Image ("/admin_dashboard/addteacherhover.jpg");
    Image add_employee_releassed = new Image ("/admin_dashboard/addemployee.jpg");
    Image add_employee_hover = new Image ("/admin_dashboard/addemployeehover.jpg");
    Image back_releassed = new Image ("/Search/backbutton.png");
    Image back_hover = new Image ("/Search/backbuttonhover.jpg");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout_released(MouseEvent event) 
    {
        imagefield.setImage(logout_releassed);
    }

    @FXML
    private void logout_hover_remove(MouseEvent event) 
    {
        imagefield.setImage(logout_releassed);
    }

    @FXML
    private void logout_hover(MouseEvent event) 
    {
        imagefield.setImage(logout_hover);
    }

    @FXML
    private void logout_click(MouseEvent event) throws IOException 
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
        imagefield.setImage(logout_hover);
    }

    @FXML
    private void add_student_releassed(MouseEvent event) 
    {
        add_student_field.setImage(add_student_releassed);
    }

    @FXML
    private void add_student_Exited(MouseEvent event) 
    {
        add_student_field.setImage(add_student_releassed);
    }

    @FXML
    private void add_student_entered(MouseEvent event) 
    {
        add_student_field.setImage(add_student_hover);
    }

    @FXML
    private void add_student_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addstudent/addstudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD STUDENT DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void add_student_pressed(MouseEvent event) 
    {
        add_student_field.setImage(add_student_hover);
    }

    @FXML
    private void add_teacher_releassed(MouseEvent event) 
    {
        add_teacher_field.setImage(add_teacher_releassed);
    }

    @FXML
    private void add_teacher_Exited(MouseEvent event) 
    {
        add_teacher_field.setImage(add_teacher_releassed);
    }

    @FXML
    private void add_teacher_entered(MouseEvent event) 
    {
        add_teacher_field.setImage(add_teacher_hover);
    }

    @FXML
    private void add_teacher_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addteacher/addteacher.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD TEACHER DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void add_teacher_pressed(MouseEvent event) 
    {
        add_teacher_field.setImage(add_teacher_hover);
    }

    @FXML
    private void add_employee_released(MouseEvent event) 
    {
        add_employee_field.setImage(add_employee_releassed);
    }

    @FXML
    private void add_employee_exited(MouseEvent event) 
    {
        add_employee_field.setImage(add_employee_releassed);
    }

    @FXML
    private void add_employee_entered(MouseEvent event) 
    {
        add_employee_field.setImage(add_employee_hover);
    }

    @FXML
    private void add_employee_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/addEmployee/addemployee.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD EMPLOYEE DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void add_employee_pressed(MouseEvent event) 
    {
        add_employee_field.setImage(add_employee_hover);
    }

    @FXML
    private void Back_exited(MouseEvent event) 
    {
        Back_field.setImage(back_releassed);
    }


    @FXML
    private void Back_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/admin_dashboard/admindashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADMIN DASHBOARD");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Back_pressed(MouseEvent event) 
    {
        Back_field.setImage(back_hover);
    }

    @FXML
    private void Back_releassed(MouseEvent event) 
    {
        Back_field.setImage(back_releassed);
    }

    @FXML
    private void Back_enetred(MouseEvent event) 
    {
        Back_field.setImage(back_hover);
    }
    
}
