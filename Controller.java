package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.numberTextField;

import java.io.IOException;

public class Controller {

    @FXML
    Label lbl1;

    @FXML
    Button btn1;

    @FXML
    Label lbl2;

    @FXML
    Button btn2;

    @FXML
    numberTextField txtField1;

    @FXML
    public void handleButtonClick(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == btn1) {
            stage = (Stage) btn1.getScene().getWindow();

            root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        } else {
            stage = (Stage) btn2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
