/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

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
public class SearchController implements Initializable {

    @FXML
    private ImageView logout_field;
    @FXML
    private ImageView Search_student_field;
    @FXML
    private ImageView search_teacher_field;
    @FXML
    private ImageView search_employee_field;
    @FXML
    private ImageView back_field;
    
    Image logout_releassed = new Image ("/Search/logout.png");
    Image logout_hover = new Image ("/Search/logoutred.png");
    Image search_student_releassed = new Image ("/Search/searchstudent.jpg");
    Image search_student_hover = new Image ("/Search/searchstudenthover1.jpg");
    Image search_teacher_releassed = new Image ("/Search/searchteacher.jpg");
    Image search_teacher_hover = new Image ("/Search/searchteacherhover.jpg");
    Image search_employee_releassed = new Image ("/Search/iconhover.jpg");
    Image search_employee_hover = new Image ("/Search/icon.jpg");
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

    @FXML
    private void search_student_released(MouseEvent event) 
    {
        Search_student_field.setImage(search_student_releassed);
    }

    @FXML
    private void search_student_exited(MouseEvent event) 
    {
        Search_student_field.setImage(search_student_releassed);
    }

    @FXML
    private void search_student_entered(MouseEvent event) 
    {
        Search_student_field.setImage(search_student_hover);
    }

    @FXML
    private void search_student_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/searchstudent/searchstudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Search Student");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_student_pressed(MouseEvent event) 
    {
        Search_student_field.setImage(search_student_hover);
    }

    @FXML
    private void search_teacher_released(MouseEvent event) 
    {
        search_teacher_field.setImage(search_teacher_releassed);
    }

    @FXML
    private void search_teacher_exited(MouseEvent event) 
    {
        search_teacher_field.setImage(search_teacher_releassed);
    }

    @FXML
    private void search_teacher_entered(MouseEvent event) 
    {
        search_teacher_field.setImage(search_teacher_hover);
    }

    @FXML
    private void search_teacher_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/searchteacher/searchteacher.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Search Teacher");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_teacher_pressed(MouseEvent event) 
    {
        search_teacher_field.setImage(search_teacher_hover);
    }

    @FXML
    private void search_employee_released(MouseEvent event) 
    {
        search_employee_field.setImage(search_employee_releassed);
    }

    @FXML
    private void search_employee_exited(MouseEvent event) 
    {
        search_employee_field.setImage(search_employee_releassed);
    }

    @FXML
    private void search_employee_entered(MouseEvent event) 
    {
        search_employee_field.setImage(search_employee_hover);
    }

    @FXML
    private void search_employee_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/searchemployee/searchemployee.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Search Employee");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_employee_pressed(MouseEvent event) 
    {
        search_employee_field.setImage(search_employee_hover);
    }

    @FXML
    private void back_released(MouseEvent event) 
    {
        back_field.setImage(back_releassed);
    }

    @FXML
    private void back_exited(MouseEvent event) 
    {
        back_field.setImage(back_releassed);
    }

    @FXML
    private void back_entered(MouseEvent event) 
    {
        back_field.setImage(back_hover);
    }

    @FXML
    private void back_click(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/admin_dashboard/admindashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADMIN DASHBOARD");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void back_pressed(MouseEvent event) 
    {
        back_field.setImage(back_hover);
    }
    
}
