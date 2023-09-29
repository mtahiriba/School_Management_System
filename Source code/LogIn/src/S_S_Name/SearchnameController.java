/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S_S_Name;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Muhammad Tahir
 */
public class SearchnameController implements Initializable {

    @FXML
    private TextField namefield;
    @FXML
    private TableView<ModelTable> table;
    @FXML
    private TableColumn<ModelTable, String> RollNumber;
    @FXML
    private TableColumn<ModelTable, String> Name;
    @FXML
    private TableColumn<ModelTable, String> FNmae;
    @FXML
    private TableColumn<ModelTable, String> Caste;
    @FXML
    private TableColumn<ModelTable, String> Gender;
    @FXML
    private TableColumn<ModelTable, String> religion;
    @FXML
    private TableColumn<ModelTable, String> Class;
    @FXML
    private TableColumn<ModelTable, String> Address;
    @FXML
    private TableColumn<ModelTable, String> DOB;
    @FXML
    private TableColumn<ModelTable, String> POB;
    @FXML
    private TableColumn<ModelTable, String> Nationality;
    @FXML
    private TableColumn<ModelTable, String> Lastinstitute;

    String roll;
    int index = -1;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backAction(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/searchstudent/searchstudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SEARCH STUDENT");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void SearchAction(ActionEvent event) 
    {
        this.search();
    }

    private void search()
    {
        ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
        Connection con;
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
            if(con!=null)
            {
                System.out.println("Connection Succesfully");
                Statement st= con.createStatement();
		final String sql3 = "Select * from students where Name='" + this.namefield.getText() + "'";
                ResultSet rs= st.executeQuery(sql3);
                int count =0;
                while(rs.next()) 
                {
                    count++;
                    oblist.add(new ModelTable(""+rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(14),rs.getString(11),rs.getString(12),rs.getString(13)));
                }
		
                if(count == 0)
                {
                    if(index<=-1)
                    {
                        JOptionPane.showMessageDialog(null, "Record Not Found.");
                    }
                }
                
                RollNumber.setCellValueFactory(new PropertyValueFactory<>("RollNumber"));
                Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
                FNmae.setCellValueFactory(new PropertyValueFactory<>("FNmae"));
                Caste.setCellValueFactory(new PropertyValueFactory<>("Caste"));
                Gender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
                religion.setCellValueFactory(new PropertyValueFactory<>("religion"));
                Class.setCellValueFactory(new PropertyValueFactory<>("class1"));
                Address.setCellValueFactory(new PropertyValueFactory<>("Address"));
                DOB.setCellValueFactory(new PropertyValueFactory<>("DOB"));
                POB.setCellValueFactory(new PropertyValueFactory<>("POB"));
                Nationality.setCellValueFactory(new PropertyValueFactory<>("Nationality"));
                Lastinstitute.setCellValueFactory(new PropertyValueFactory<>("Lastinstitute"));
                
                table.setItems(oblist);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    @FXML
    private void deleteRecord(ActionEvent event) 
    {
        index = table.getSelectionModel().getSelectedIndex();
        if(index>-1)
        {
            roll = (RollNumber.getCellData(index).toString());
            Connection con;
            try
            {
                //Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentsystem", "root", "tahir2018");
                if(con!=null)
                {
                    System.out.println("Connection Succesfully");
		}
		Statement st= con.createStatement();
		final String sql3 = "delete from students where RollNumber='" + roll + "'";
                st.executeUpdate(sql3);
                JOptionPane.showMessageDialog(null, "Sucessfully Delete Record Details.");
                this.search();
                index = -1;
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
    }
    
}
