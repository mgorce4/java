package unilim.info.ihm.tp4;

import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginAppSb extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	    try {
	        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("vue/LoginForm.fxml")));
	        Scene scene = new Scene(root, 600, 170);
	
	        primaryStage.setTitle("Login");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    } catch (NullPointerException e) {
	        System.err.println("FXML file not found. Please check the file path: vue/LoginForm.fxml");
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.err.println("An error occurred while loading the FXML file.");
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
			
		

}
