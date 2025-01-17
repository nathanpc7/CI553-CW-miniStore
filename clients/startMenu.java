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

        // The action listener will put the main systems operation behind the buy option
        buyButton.setOnAction(event -> {
            clients.Main.main(new String[]{}); 
        });

        // Add action listener for Sell button- does nothing so far
        sellButton.setOnAction(event -> {
            System.out.println("Sell functionality coming soon!");
        });

        // Simple box layout
        VBox layout = new VBox(10); 
        layout.getChildren().addAll(buyButton, sellButton);

        
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("MiniStore Start Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}