package clients;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class startMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create buttons for Buy and Sell
        Button buyButton = new Button("Buy");
        Button sellButton = new Button("Sell");

        // Add action listener for Buy button to start the main functionality
        buyButton.setOnAction(event -> {
            clients.Main.main(new String[]{}); // Start the main function of the system
        });

        // Add action listener for Sell button (functionality to be implemented later)
        sellButton.setOnAction(event -> {
            System.out.println("Sell functionality coming soon!");
        });

        // Layout the buttons in a VBox
        VBox layout = new VBox(10); // 10px spacing between elements
        layout.getChildren().addAll(buyButton, sellButton);

        // Create the scene and set the stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("MiniStore Start Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}