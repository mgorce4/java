package unilim.info.ihm.tp1.exo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class FormInscriptionFX extends Application {
	
	private Label lblTitle;
	private Label lblBienvenue;
	private Label lblCivilite;
	private Label lblNom;
	private Label lblPrenom;
	private Label lbladresseMail;
	private Label lbladresseMail2;
	private ChoiceBox<String> cbCivilite;
	private TextField tfNom;
	private TextField tfPrenom;
	private TextField tfadresseMail;
	private TextField tfadresseMail2;
	private ComboBox<Object> cbApplication;
	private Button btnSouscrire;
	
	private static final String[] CIVILITY_ITEMS = {"M.", "Mme", "Mlle"};
	public static void main(String[] args) {
		Application.launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 600, 450);
		GridPane gridMid = new GridPane();
		GridPane gridTop = new GridPane();
		HBox bottomBox = new HBox();
		HBox topBox = new HBox();

		
		lblTitle = new Label("Souscrivez à notre newsletter!");
		lblTitle.setUnderline(true);
		lblTitle.setAlignment(Pos.CENTER);
		
		lblBienvenue = new Label("Bienvenue à notre newsletter, inscrivez-vous pour avoir des nouvelles.");
		lblBienvenue.setAlignment(Pos.CENTER);
		
		lblCivilite = new Label("Civilité:");
		cbCivilite = new ChoiceBox<String>();
		cbCivilite.getItems().addAll(CIVILITY_ITEMS);
		cbCivilite.setValue("");
		
		lblNom = new Label("Nom:");
		tfNom = new TextField();
		
		lblPrenom = new Label("Prénom:");
		tfPrenom = new TextField();
		
		lbladresseMail = new Label("Adresse email:");
		tfadresseMail = new TextField();
		
		lbladresseMail2 = new Label("Confirmez votre mail:");
		tfadresseMail2 = new TextField();
		
		btnSouscrire = new Button("Souscrire");
		
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().add(lblTitle);
		
		
		gridTop.add(topBox, 0, 0);
		gridTop.add(lblBienvenue, 0, 1);
		gridTop.setAlignment(Pos.CENTER);
		gridTop.setVgap(10);
		gridTop.setHgap(10);
		gridTop.setPadding(new Insets(10, 0, 10, 0));
		
		gridMid.add(lblCivilite, 0, 0);
		gridMid.add(cbCivilite, 0, 1);
		gridMid.add(lblNom, 0, 2);
		gridMid.add(tfNom, 0, 3);
		gridMid.add(lblPrenom, 1, 2);
		gridMid.add(tfPrenom, 1, 3);
		gridMid.add(lbladresseMail, 0, 4);
		gridMid.add(tfadresseMail, 0, 5);
		gridMid.add(lbladresseMail2, 1, 4);
		gridMid.add(tfadresseMail2, 1, 5);
		gridMid.setVgap(10);
		gridMid.setHgap(10);


		Region spacer = new Region();
		spacer.setPrefWidth(30);

		// Center the button in the bottom HBox
		bottomBox.setAlignment(Pos.CENTER);
		bottomBox.getChildren().add(btnSouscrire);
		bottomBox.setPadding(new Insets(0, 0, 20, 0));
		
		
		root.setTop(gridTop);
		root.setCenter(gridMid);
		root.setBottom(bottomBox); // Set the HBox as the bottom
		root.setLeft(spacer);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

}
