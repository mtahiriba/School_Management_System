/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Muhammad Tahir
 */
public class loginController implements Initializable {
    
    @FXML
    private PasswordField password;
    @FXML
    private TextField user_name;
    @FXML
    private Label error;
    @FXML
    private Label connection;
        
    Connection con = null;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
            if(con!=null)
            {
                connection.setText("DataBase is Connected");
            }
        }
        catch(Exception e)
        {
            connection.setText("DataBase is Connected");
        }
    }    

    @FXML
    private void accountlogin(ActionEvent event) throws IOException 
    {
        Statement st;
        try 
        {
            if(user_name.getText().equals("") && password.getText().equals(""))
            {
                error.setText("Please Enter Username and Password");
            }
            else if(user_name.getText().equals(""))
            {
                error.setText("Please Enter Username");
            }
            else if(password.getText().equals(""))
            {
                error.setText("Please Enter Password");
            }
            else
            {
                st = con.createStatement();
                final String sql3 = "Select * from students where Username='" + this.user_name.getText() + "'";
                ResultSet rs= st.executeQuery(sql3);
            
                if (rs.next()) 
                {
                    if(password.getText().equals(rs.getString(16)))
                    {
                        final String sql4 = "update remaimber_data set username='" + this.user_name.getText() + "',password='" + this.password.getText() + "' where id = '1'";
                        st.executeUpdate(sql4);
                        Parent root = FXMLLoader.load(getClass().getResource("/studentdashboard/studentdashboard.fxml"));
                        Scene scene = new Scene(root);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setTitle("MAIN PAGE");
                        stage.setScene(scene);
                        stage.show();
                        con.close();
                    }
                    else
                    {
                        error.setText("Password is invalid!");
                    }
                }
                else
                {
                    final String sql5 = "Select * from admin where Username='" + this.user_name.getText() + "'";
                    ResultSet rs1= st.executeQuery(sql5);
                
                    if(rs1.next())
                    {
                        if(password.getText().equals(rs1.getString(3)))
                        {
                            final String sql4 = "update remaimber_data set username='" + this.user_name.getText() + "',password='" + this.password.getText() + "' where id = '2'";
                            st.executeUpdate(sql4);
                            Parent root = FXMLLoader.load(getClass().getResource("/admin_dashboard/admindashboard.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setTitle("MAINPAGE");
                            stage.setScene(scene);
                            stage.show();
                        }
                    }
                    else
                    {
                        error.setText("Username is invalid!");
                    }
                }
                
            }
            
            
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
        
        
    }
    

    
}
