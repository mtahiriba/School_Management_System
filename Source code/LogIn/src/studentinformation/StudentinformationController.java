/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class StudentinformationController implements Initializable {

    @FXML
    private Label RollNumber;
    @FXML
    private Label Name;
    @FXML
    private Label Fname;
    @FXML
    private Label Caste;
    @FXML
    private Label Religion;
    @FXML
    private Label Gender;
    @FXML
    private Label DOB;
    @FXML
    private Label Class;

    Connection con = null;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
            try
            {    
                //Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");        
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
                    Statement st= con.createStatement();
                    final String sql3 = "select * from students inner join remaimber_data on remaimber_data.username = students.Username";
                    ResultSet rs= st.executeQuery(sql3);
                    
                    if (rs.next()) 
                    {
                        RollNumber.setText(""+rs.getInt(1));
                        Name.setText(rs.getString(2));
                        Fname.setText(rs.getString(3));
                        Caste.setText(rs.getString(4));
                        Religion.setText(rs.getString(6));
                        Gender.setText(rs.getString(5));
                        DOB.setText(rs.getString(14));
                        Class.setText(rs.getString(7));
                        con.close();
                    }

		}
		                
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
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
