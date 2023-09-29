/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_dashboard;

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
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class AdmindashboardController implements Initializable {

    @FXML
    private ImageView imagefield;
    @FXML
    private ImageView add_student_field;
    @FXML
    private ImageView add_teacher_field;
    @FXML
    private ImageView add_employee_field;
    @FXML
    private ImageView about_field;
    @FXML
    private ImageView search_field;
    
    Image logout_releassed = new Image ("/admin_dashboard/logout.png");
    Image logout_hover = new Image ("/admin_dashboard/logoutred.png");
    Image add_student_releassed = new Image ("/admin_dashboard/addicon.jpg");
    Image add_student_hover = new Image ("/admin_dashboard/addiconhover.jpg");
    Image add_teacher_releassed = new Image ("/admin_dashboard/edit.jpg");
    Image add_teacher_hover = new Image ("/admin_dashboard/edithover.jpg");
    Image about_releassed = new Image ("/admin_dashboard/about.jpg");
    Image about_hover = new Image ("/admin_dashboard/abouthover.jpg");
    Image search_releassed = new Image ("/admin_dashboard/search.jpg");
    Image search_hover = new Image ("/admin_dashboard/searchhover.jpg");
    
    @FXML
    private Label adminlabel;
    
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
		final String sql3 = "select * from admin inner join remaimber_data on remaimber_data.username = admin.username";
                ResultSet rs = st.executeQuery(sql3);
                if(rs.next())
                {
                    user = rs.getString(4);
                    //System.out.println(user);
                }
                adminlabel.setText("Welcome "+user);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
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
        Parent root = FXMLLoader.load(getClass().getResource("/addData/adddata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("ADD DATA");
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
        Parent root = FXMLLoader.load(getClass().getResource("/EditData/editdata.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("EDIT DATA");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void add_teacher_pressed(MouseEvent event) 
    {
        add_teacher_field.setImage(add_teacher_hover);
    }


    @FXML
    private void about_released(MouseEvent event) 
    {
        about_field.setImage(about_releassed);
    }

    @FXML
    private void about_exited(MouseEvent event) 
    {
        about_field.setImage(about_releassed);
    }

    @FXML
    private void about_entered(MouseEvent event) 
    {
        about_field.setImage(about_hover);
    }

    @FXML
    private void about_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/about/about.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("About us");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void about_pressed(MouseEvent event) 
    {
        about_field.setImage(about_hover);
    }

    @FXML
    private void search_released(MouseEvent event) 
    {
        search_field.setImage(search_releassed);
    }

    @FXML
    private void search_exited(MouseEvent event) 
    {
        search_field.setImage(search_releassed);
    }

    @FXML
    private void search_entered(MouseEvent event) 
    {
        search_field.setImage(search_hover);
    }

    @FXML
    private void search_clicked(MouseEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/Search/search.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("LOGIN");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void search_pressed(MouseEvent event) 
    {
        search_field.setImage(search_hover);
    }
    
    
}
