package clients.sell;

import clients.startMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import clients.sell.confirmationClient;
import clients.startMenu;
import clients.sell.sellClient;

public class finalClient {

    public static void display(startMenu.Product product) {
        // Add the product to the in-memory list of sold items
        startMenu.soldItems.add(product);

        // Create a new stage to display success message
        Stage stage = new Stage();
        stage.setTitle("Product Added");

        // Display success message with product details
        Label successLabel = new Label("Product added successfully!\n" + product);

        // Close button
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> stage.close());

        // Layout
        VBox layout = new VBox(10, successLabel, closeButton);
        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.show();
    }
}
