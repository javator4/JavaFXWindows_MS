package pl.sda.windows;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import pl.sda.windows.controller.RootController;

import java.io.IOException;

public class App extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/rootview.fxml"));
        fxmlLoader.load();

        RootController rootController = fxmlLoader.getController();
        rootController.setApp(this);
        Parent parent = fxmlLoader.getRoot();
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();



    }

    public void loadOneView() {
        Stage stage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/button1.fxml"));
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();
    }

    public void loadTwoView(){

        Stage stage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/button2.fxml"));
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();
    }
}
