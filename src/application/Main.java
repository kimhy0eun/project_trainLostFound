package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
	         Scene scene = new Scene(root);
	         
	         primaryStage.setScene(scene);
	 		 primaryStage.setWidth(350);       
			 primaryStage.setHeight(500); 
			 primaryStage.setResizable(false); 
	         primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
