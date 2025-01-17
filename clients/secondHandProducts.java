package clients;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;


public class secondHandProducts {

    public static void display(List<startMenu.Product> soldItems) {
        Stage stage = new Stage();
        stage.setTitle("Second-Hand Products");

        VBox layout = new VBox(10);

        if (soldItems.isEmpty()) {
            layout.getChildren().add(new Label("No second-hand products available."));
        } else {
            layout.getChildren().add(new Label("Second-Hand Products:"));
            for (startMenu.Product product : soldItems) {
                layout.getChildren().add(new Label(product.toString()));
            }
        }

        Button closeButton = new Button("Close");
        closeButton.setOnAction(event -> stage.close());
        layout.getChildren().add(closeButton);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
