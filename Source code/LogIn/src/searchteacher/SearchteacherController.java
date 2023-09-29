/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchteacher;

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
public class SearchteacherController implements Initializable {

    @FXML
    private ImageView logout_field;
    @FXML
    private ImageView search_name_field;
    @FXML
    private ImageView search_subject_field;
    @FXML
    private ImageView back_field;

    Image logout_releassed = new Image ("/searchteacher/logout.png");
    Image logout_hover = new Image ("/searchteacher/logoutred.png");
    Image search_name_releassed = new Image ("/searchteacher/searchteachername.jpg");
    Image search_name_hover = new Image ("/searchteacher/searchteachernamehover.jpg");
    Image search_subject_releassed = new Image ("/searchteacher/searchteachersubject.jpg");
    Image search_subject_hover = new Image ("/searchteacher/searchteachersubjecthover.jpg");
    Image back_releassed = new Image ("/searchteacher/backbutton.png");
    Image back_hover = new Image ("/searchteacher/backbuttonhover.jpg");
    
    
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
        Parent root = FXMLLoader.load(getClass().getResource("/S_T_Name/searchteachername.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH TEACHER BY NAME");
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
    
    @FXML
    private void search_subject_released(MouseEvent event) 
    {
        search_subject_field.setImage(search_subject_releassed);
    }

    @FXML
    private void search_subject_exited(MouseEvent event) 
    {
        search_subject_field.setImage(search_subject_releassed);
    }

    @FXML
    private void search_subject_entered(MouseEvent event) 
    {
        search_subject_field.setImage(search_subject_hover);
    }

    @FXML
    private void search_subject_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/S_T_Subject/searchteachersubject.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH TEACHER BY SUBJECT");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_subject_pressed(MouseEvent event) 
    {
        search_subject_field.setImage(search_subject_hover);
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
    private void back_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/Search/search.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void back_pressed(MouseEvent event) 
    {
        back_field.setImage(back_hover);
    }
    
}
