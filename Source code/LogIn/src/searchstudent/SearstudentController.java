/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchstudent;

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
public class SearstudentController implements Initializable {

    @FXML
    private ImageView logout_field;
    @FXML
    private ImageView search_roll_number_field;
    @FXML
    private ImageView search_name_field;
    @FXML
    private ImageView search_class_field;
    @FXML
    private ImageView Back_field;
    
    
    Image logout_releassed = new Image ("/searchstudent/logout.png");
    Image logout_hover = new Image ("/searchstudent/logoutred.png");
    Image search_roll_number_releassed = new Image ("/searchstudent/searchstudentname.jpg");
    Image search_roll_number_hover = new Image ("/searchstudent/searchstudentnamehover.jpg");
    Image search_name_releassed = new Image ("/searchstudent/searchstudentroll.jpg");
    Image search_name_hover = new Image ("/searchstudent/searchstudentrollhover.jpg");
    Image search_class_releassed = new Image ("/searchstudent/searchstudentclass.jpg");
    Image search_class_hover = new Image ("/searchstudent/searchstudentclasshover.jpg");
    Image back_releassed = new Image ("/searchstudent/backbutton.png");
    Image back_hover = new Image ("/searchstudent/backbuttonhover.jpg");

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
    private void search_roll_number_released(MouseEvent event) 
    {
        search_roll_number_field.setImage(search_roll_number_releassed);
    }

    @FXML
    private void search_roll_number_exited(MouseEvent event) 
    {
        search_roll_number_field.setImage(search_roll_number_releassed);
    }

    @FXML
    private void search_roll_number_entered(MouseEvent event) 
    {
        search_roll_number_field.setImage(search_roll_number_hover);
    }

    @FXML
    private void search_roll_number_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/S_S_RollNumber/searchrollnumber.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH STUDENT BY ROLL NUMBER");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_roll_number_pressed(MouseEvent event) 
    {
        search_roll_number_field.setImage(search_roll_number_releassed);
    }

    @FXML
    private void search_class_released(MouseEvent event) 
    {
        search_class_field.setImage(search_class_releassed);
    }

    @FXML
    private void search_class_exited(MouseEvent event) 
    {
        search_class_field.setImage(search_class_releassed);
    }

    @FXML
    private void search_class_entered(MouseEvent event) 
    {
        search_class_field.setImage(search_class_hover);
    }

    @FXML
    private void search_class_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/S_S_Class/searchclass.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH STUDENT BY CLASS");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_class_pressed(MouseEvent event) 
    {
        search_class_field.setImage(search_class_hover);
    }

    @FXML
    private void Back_releassed(MouseEvent event) 
    {
        Back_field.setImage(back_releassed);
    }

    @FXML
    private void Back_exited(MouseEvent event) 
    {
        Back_field.setImage(back_releassed);
    }

    @FXML
    private void Back_enetred(MouseEvent event) 
    {
        Back_field.setImage(back_hover);
    }

    @FXML
    private void Back_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/Search/search.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Back_pressed(MouseEvent event) 
    {
        Back_field.setImage(back_hover);
    }

    @FXML
    private void search_name_released(MouseEvent event) 
    {
        search_name_field.setImage(search_name_releassed);
    }

    @FXML
    private void search_name_exited(MouseEvent event) 
    {
        search_name_field.setImage(search_name_releassed);
    }

    @FXML
    private void search_name_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/S_S_Name/searchname.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH STUDENT BY NAME");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void search_name_entered(MouseEvent event) 
    {
        search_name_field.setImage(search_name_hover);
    }

    @FXML
    private void search_name_pressed(MouseEvent event) 
    {
        search_name_field.setImage(search_name_hover);
    }
    
}
