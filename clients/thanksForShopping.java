package clients;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;
import clients.customer.CustomerModel;
public class thanksForShopping {

    public static void display(List<startMenu.Product> purchasedItems) {
        Stage stage = new Stage();
        stage.setTitle("Thanks for Shopping at Nathan's awesome store!");

        VBox layout = new VBox(10);

        //error checking if no items were purchased, else gets the list of purchased items in £
        if (purchasedItems.isEmpty()) {
            layout.getChildren().add(new Label("No items have been purchased."));
        } else {
            layout.getChildren().add(new Label("Purchased Items:"));
            for (startMenu.Product product : purchasedItems) {
                layout.getChildren().add(new Label("Product: " + product.getName() + ", Price: £" + product.getPrice()));
            }
        }
// closes the application - might have to change funcionality of the close function. You have to close both the javafx
        //app and the main application rather than being streamlined.
        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> stage.close());
        layout.getChildren().add(closeButton);

        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
