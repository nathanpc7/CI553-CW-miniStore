package clients;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class secondHandProducts {
	public static final List<startMenu.Product> purchasedItems = new ArrayList<>();
    public static void display(List<startMenu.Product> soldItems) {
        Stage stage = new Stage();
        stage.setTitle("Second-Hand Products");

        VBox layout = new VBox(10);
//if statement to check if nothing has been sold to the system or displays the sold items
        if (soldItems.isEmpty()) {
            layout.getChildren().add(new Label("No second-hand products available."));
        } else {
            layout.getChildren().add(new Label("Second-Hand Products:"));
            for (startMenu.Product product : soldItems) {
            	 layout.getChildren().add(new Label("Product: " + product.getName() + ", Price: £" + product.getPrice()));
            }

            // Input field to buy a product by name
            TextField productNameField = new TextField();
            productNameField.setPromptText("Enter product name to buy");

            Button buyButton = new Button("Buy Product");
            buyButton.setOnAction(event -> {
                String enteredName = productNameField.getText();
                boolean found = false;
                
                //if statement and loop to go through all the items in the list and check it with the user input
                // if names match the item is bought and that specific item is removed from the list
                for (int i = 0; i < soldItems.size(); i++) {
                    startMenu.Product product = soldItems.get(i);
                    if (product.getName().equalsIgnoreCase(enteredName)) {
                        soldItems.remove(i);
                        purchasedItems.add(product);
                        layout.getChildren().add(new Label("Successfully bought: " + product));
                        found = true;
                        break;
                    }
                }
//if not found return appropriate error message.
                if (!found) {
                    layout.getChildren().add(new Label("Product not found."));
                }
            });

            layout.getChildren().addAll(productNameField, buyButton);
        }
// have a button that the user can press to show a list of all the bought items
        Button showThanksForShopping = new Button("Show Purchased Items");
        showThanksForShopping.setOnAction(event -> thanksForShopping.display(purchasedItems));
        layout.getChildren().add(showThanksForShopping);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> stage.close());
        layout.getChildren().add(closeButton);

        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
