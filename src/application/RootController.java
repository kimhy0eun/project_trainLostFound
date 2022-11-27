package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

   @FXML Button btn1;
   
   @Override
   public void initialize(URL arg0, ResourceBundle arg1) {
      // TODO Auto-generated method stub
      
      btn1.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("btn1 이벤트 발생");
         }
         
      });

   }

}