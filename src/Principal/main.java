
package Principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main extends Application {
   
    @Override
    public void start(Stage stage) throws Exception {
Parent root=FXMLLoader.load(getClass().getResource("Views/Menu.fxml"));
Scene scene= new Scene(root);
stage.setTitle("Proyecto sin nombre");
stage.setScene(scene);
stage.show();
        System.out.println(stage.isShowing());
    } public static void main(String[] args) {
        launch(args);    }

    
}