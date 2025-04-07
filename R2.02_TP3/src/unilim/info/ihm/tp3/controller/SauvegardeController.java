package unilim.info.ihm.tp3.controller;

import java.util.Optional;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import unilim.info.ihm.tp3.model.AchatCondiment;
import unilim.info.ihm.tp3.view.Formulaire;
import unilim.info.ihm.tp3.view.ListeCondiments;

public class SauvegardeController implements EventHandler<MouseEvent> {
    private final Formulaire form;
    private final ListeCondiments condiments;

    public SauvegardeController(Formulaire form, ListeCondiments condiments) {
        this.form = form;
        this.condiments = condiments;
    }

    @Override
    public void handle(MouseEvent event) {
        String nom = form.getNomField().getText().trim();
        String type = form.getTypeField().getText().trim().toLowerCase();
        String price = form.getPriceField().getText().trim();
        String quantity = form.getQuantityField().getText().trim();
        String imagePath = form.getImagePath().getText().trim();

        boolean nomFilled = !nom.isEmpty();
        boolean typeFilled = !type.isEmpty();
        boolean priceFilled = !price.isEmpty();
        boolean quantityFilled = !quantity.isEmpty();
        boolean imageFilled = !imagePath.isEmpty();

        form.getNomError().setVisible(false);
        form.getTypeError().setVisible(false);
        form.getTypeError2().setVisible(false);
        form.getPriceError().setVisible(false);
        form.getQuantityError().setVisible(false);

        if (!nomFilled) form.getNomError().setVisible(true);
        if (!priceFilled) form.getPriceError().setVisible(true);
        if (!quantityFilled) form.getQuantityError().setVisible(true);

        if (!typeFilled) {
            form.getTypeError().setVisible(true);
            form.getTypeError2().setVisible(false);
            return;
        } else if (!type.equals("fruit") && !type.equals("légume")) {
            form.getTypeError2().setVisible(true);
            form.getTypeError().setVisible(false);
            return;
        }

        if (!nomFilled || !priceFilled || !quantityFilled || !imageFilled) {
            showConfirmationDialog();
            return;
        }

        Color color = type.equals("fruit") ? Color.RED : Color.GREEN;

        Image image = new Image(imagePath, 100, 100, true, false);
        ImageView imageView = new ImageView(image);

        AchatCondiment condiment = new AchatCondiment(nom, color, imageView, price, quantity);
        condiments.addCondiment(condiment);
    }

    private void showConfirmationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Erreur de saisie");
        alert.setHeaderText("Il y a une erreur dans la saisie !");
        alert.setContentText("Que souhaitez-vous faire ?");

        ButtonType quitterButton = new ButtonType("Quitter");
        ButtonType chargerExempleButton = new ButtonType("Charger un exemple");

        alert.getButtonTypes().setAll(quitterButton, chargerExempleButton);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent()) {
            if (result.get() == quitterButton) {
                System.exit(0);
            } else if (result.get() == chargerExempleButton) {
                loadDefaultExample();
            }
        }
    }

    private void loadDefaultExample() {
        String nom = "Tomate";
        String type = "fruit";
        String price = "1.50";
        String quantity = "3";
        String imagePath =getClass().getResource("/unilim/info/ihm/tp3/model/bibi.jpg").toExternalForm(); // Assurez-vous que l'image est accessible à cet emplacement

        form.getNomField().setText(nom);
        form.getTypeField().setText(type);
        form.getPriceField().setText(price);
        form.getQuantityField().setText(quantity);
        form.getImagePath().setText(imagePath);
    }
}

