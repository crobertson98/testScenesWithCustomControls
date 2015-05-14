package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.FlowPaneBuilder;
import javafx.stage.Stage;

public class Main extends Application {

    Button btn1, btn2;
    Label lbl1, lbl2;
    FlowPane fp1, fp2;
    Stage stage;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 250, 150));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
