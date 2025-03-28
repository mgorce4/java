package unilim.info.ihm.tp1.exo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestJavaFX  extends Application {
	
	
	private Button btn;
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane root = new StackPane();
		btn = new Button();
		Scene scene = new Scene(root, 600, 250);
		
		root.getChildren().add(btn);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
