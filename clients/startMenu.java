package clients;

import java.util.ArrayList;
import java.util.List;

import clients.sell.sellClient;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class startMenu extends Application {

    // In-memory database to store sold products
    public static final List<Product> soldItems = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        // Create buttons for Buy and Sell
        Button buyButton = new Button("Buy");
        Button sellButton = new Button("Sell");

        // Add action listener for Buy button to start the main functionality
        buyButton.setOnAction(event -> {
            clients.Main.main(new String[]{}); // start the main function
            secondHandProducts.display(soldItems); // Display second-hand products in a new window
        });
        

        // Add action listener for Sell button to start the sell workflow
        sellButton.setOnAction(event -> {
            sellClient.display(); // Delegates functionality to the SellClient
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

    // Product class to store product information
    public static class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product: " + name + ", Price: $" + price;
        }
    }
}