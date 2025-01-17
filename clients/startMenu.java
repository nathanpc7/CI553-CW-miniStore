import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import clients.startMenu; // Ensure this is correct

public class testsellClient {
    public static void display() {
        Stage stage = new Stage();
        stage.setTitle("Sell Product");

        // Input fields for product name and price
        Label nameLabel = new Label("Enter product name:");
        TextField nameField = new TextField();

        Label priceLabel = new Label("Enter product price:");
        TextField priceField = new TextField();

        // Next button to proceed to the ConfirmationClient
        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> {
            String name = nameField.getText();
            double price;
            try {
                price = Double.parseDouble(priceField.getText());
                // Temporary action for testing
                System.out.println("Product Name: " + name + ", Price: " + price);
                stage.close();
            } catch (NumberFormatException e) {
                priceField.setText("Invalid price");
            }
        });

        // Layout the components
        VBox layout = new VBox(10, nameLabel, nameField, priceLabel, priceField, nextButton);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
