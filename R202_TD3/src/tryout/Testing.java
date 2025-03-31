package tryout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Testing extends Application{
	
	private Label lblTitle;
	private Label lblNom;
	private Label lblPrenom;
	private Label lblEmail;
	private Label lblPhoto;
	private Label lblNomPhoto;
	private TextField tfNom;
	private TextField tfPrenom;
	private TextField tfEmail;
	private Button btnPhoto;
	private Button btnCreerCarte;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setAlignment(Pos.TOP_CENTER);
		root.setSpacing(10);
		root.setPadding(new Insets(10,10,10,10));
		GridPane gridMid = new GridPane();
		FlowPane flowButn = new FlowPane();
		
		lblTitle = new Label("Saisir ma carte de visite");
		lblTitle.setMaxWidth(Double.MAX_VALUE);
		lblTitle.setAlignment(Pos.CENTER);
		
		lblNom = new Label("Nom : ");
		lblPrenom = new Label("Prénom : ");
		lblEmail = new Label("Email :");
		lblPhoto = new Label("Photo :");
		lblNomPhoto = new Label("_");
		tfNom = new TextField();
		tfPrenom = new TextField();
		tfEmail = new TextField();
		btnPhoto = new Button("Photo");
		btnCreerCarte = new Button("Créer carte");
		
		gridMid.setHgap(10);
		gridMid.setVgap(10);
		gridMid.setAlignment(Pos.CENTER);
		gridMid.add(lblNom, 0, 0);
		gridMid.add(tfNom, 1, 0);
		gridMid.add(lblPrenom, 0, 1);
		gridMid.add(tfPrenom, 1, 1);
		gridMid.add(lblEmail, 0, 2);
		gridMid.add(tfEmail, 1, 2);
		gridMid.add(lblPhoto, 0, 3);
		gridMid.add(lblNomPhoto, 1, 3);
		
		flowButn.setAlignment(Pos.CENTER);
		flowButn.setHgap(20);
		flowButn.getChildren().addAll(btnCreerCarte, btnPhoto);
		
		root.getChildren().addAll(lblTitle, gridMid, flowButn);
		

		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Carte de visite en javaFX");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
