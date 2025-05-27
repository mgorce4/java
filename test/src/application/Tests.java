package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Tests extends Application {
	
	private Label lblText;
	private Button btnValider;
	private Group leftGroup1;
	private Group leftGroup2;
	private Group rightGroup;
	private Rectangle startRect;
	private Rectangle endRect;
	private Rectangle sourceRect;
	private VBox vbox;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		vbox = new VBox();
		leftGroup1 = new Group();
		leftGroup2 = new Group();
		leftGroup2.resize(200, 200);
		rightGroup = new Group();
		startRect = new Rectangle(50, 50, 25, 25);
		startRect.setStyle("-fx-fill: red;");
		endRect = new Rectangle(50, 50, 25, 25);
		endRect.setStyle("-fx-fill: green;");
		sourceRect = new Rectangle(50, 50, 25, 25);
		sourceRect.setStyle("-fx-fill: blue;");
		lblText = new Label("Ma bite");

		
		btnValider = new Button("Valider");
		btnValider.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnValider.setText("Berthier!");
                System.out.println("Kathara lstart");
            }
		});
		
		leftGroup1.getChildren().add(startRect);
		leftGroup2.getChildren().add(sourceRect);
		rightGroup.getChildren().add(endRect);
		
		vbox.getChildren().addAll(leftGroup1, leftGroup2);
		root.setLeft(vbox);
		root.setRight(rightGroup);
		root.setTop(lblText);
		root.setCenter(btnValider);
		BorderPane.setAlignment(lblText, Pos.CENTER);
		
		AnimationTimer anim = animateRectangle(sourceRect);
        anim.start();
		
		Scene scene = new Scene(root, 600, 250);
		primaryStage.setTitle("Tests");
		primaryStage.setScene(scene);	
		primaryStage.show();
		manageSourceDragAndDrop(startRect);
		manageTargetDragAndDrop(endRect);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void manageSourceDragAndDrop(Rectangle source) {
		// Écouteur d'événement DRAG_DETECTED
		source.setOnDragDetected(event -> {
			ClipboardContent content = new ClipboardContent();
			content.putString("Rectangle dragged");
			Dragboard dragboard = source.startDragAndDrop(TransferMode.ANY);
			dragboard.setContent(content);
			event.consume();
		});

		source.setOnDragDone(event -> {
			if (event.getEventType() == DragEvent.DRAG_DROPPED) {
				source.setVisible(false); // Hide the source rectangle after dragging
			}
			event.consume();
		});
	}

    public static void manageTargetDragAndDrop(Rectangle target) {
		// Écouteur d'événement DRAG_OVER
		target.setOnDragOver(event -> {
			if (event.getDragboard().hasString()) {
				event.acceptTransferModes(TransferMode.ANY);
			}
			event.consume();
		});

		// Écouteur d'événement DRAG_ENTERED
		target.setOnDragEntered(event -> {
			target.setStyle("-fx-fill: yellow;");
			event.consume();
		});

		// Écouteur d'événement DRAG_EXITED
		target.setOnDragExited(event -> {
			target.setStyle("-fx-fill: green;");
			event.consume();
		});

		// Écouteur d'événement DRAG_DROPPED
		target.setOnDragDropped(event -> {
			String droppedText = event.getDragboard().getString();
			target.setStyle("-fx-fill: green;");
			System.out.println("Dropped: " + droppedText);
			event.setDropCompleted(true);
			event.consume();
		});
    }

	private AnimationTimer animateRectangle(Rectangle rect) {
		rect.setX(0); // Position initiale
		rect.setY(50); // Position initiale

		AnimationTimer animation = new AnimationTimer() {
			@Override
			public void handle(long now) {
				Platform.runLater(() -> {
					if (rect.getX() < 200) {
						rect.setX(rect.getX() + 1); // Mise à jour de la position
					} else {
						stop(); // Arrête l'animation une fois la limite atteinte
					}
				});
			}
		};

		return animation;
	}

}
