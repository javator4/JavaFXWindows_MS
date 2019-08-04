package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.windows.App;




public class RootController {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    private App app;


    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    public void openFirstWindow(ActionEvent actionEvent){
        this.app.loadOneView();
    }

    @FXML
    public void openSecondWindow(ActionEvent actionEvent) {
        this.app.loadTwoView();
    }

    public void test() {
        System.out.println("ucu");
    }
}
