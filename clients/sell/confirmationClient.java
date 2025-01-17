package clients.sell;
import clients.startMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import clients.sell.sellClient;
import clients.sell.finalClient;

public class confirmationClient {

    public static void display(startMenu.Product product) {
        Stage stage = new Stage();
        stage.setTitle("Confirm Product");

        // Display product details
        Label productLabel = new Label("Product: " + product.getName() + ", Price: $" + product.getPrice());

        // Confirm button
        Button confirmButton = new Button("Confirm");
        confirmButton.setOnAction(event -> {
            finalClient.display(product); // Proceed to final client
            stage.close();
        });

        // Back button
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            sellClient.display(); // Return to the sell client
            stage.close();
        });

        // Layout
        VBox layout = new VBox(10, productLabel, confirmButton, backButton);
        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.show();
    }
}