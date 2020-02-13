/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class MenuController implements Initializable {

    @FXML
    private Button btnCuenta;
    @FXML
    private Button btnSignup1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == btnCuenta) {
      
  
                try {

               
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Views/AccountMenu.fxml")));
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            
        }
    }

}
