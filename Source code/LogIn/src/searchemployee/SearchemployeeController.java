/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchemployee;

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
public class SearchemployeeController implements Initializable {

    @FXML
    private ImageView search_work_field;
    @FXML
    private ImageView logout_field;
    @FXML
    private ImageView back_field;
    @FXML
    private ImageView search_name_field;
    
    Image logout_releassed = new Image ("/searchemployee/logout.png");
    Image logout_hover = new Image ("/searchemployee/logoutred.png");
    Image search_name_releassed = new Image ("/searchemployee/searchemployeename.jpg");
    Image search_name_hover = new Image ("/searchemployee/searchemployeenamehover.jpg");
    Image search_work_releassed = new Image ("/searchemployee/searchemployeework.jpg");
    Image search_work_hover = new Image ("/searchemployee/searchemployeeworkhover.jpg");
    Image back_releassed = new Image ("/searchemployee/backbutton.png");
    Image back_hover = new Image ("/searchemployee/backbuttonhover.jpg");
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void search_work_released(MouseEvent event) 
    {
        search_work_field.setImage(search_work_releassed);
    }

    @FXML
    private void search_work_exited(MouseEvent event) 
    {
        search_work_field.setImage(search_work_releassed);
    }

    @FXML
    private void search_work_entered(MouseEvent event) 
    {
        search_work_field.setImage(search_work_hover);
    }

    @FXML
    private void search_work_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/S_E_work/searchemployeework.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH EMPLOYEE BY WORK");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_work_pessed(MouseEvent event) 
    {
        search_work_field.setImage(search_work_hover);
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
        Parent root = FXMLLoader.load(getClass().getResource("/S_E_Name/searchemployeename.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH EMPLOYEE BY NAME");
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
