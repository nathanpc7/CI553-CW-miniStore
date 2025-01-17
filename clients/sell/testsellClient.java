package clients.sell ;

import javafx.application.Application;
import javafx.stage.Stage;

public class testsellClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        sellClient.display(); 
    }

    public static void main(String[] args) {
        launch(args); 
    }
}
