package ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {


    @Override
    public void start(Stage stage){


        Dashboard board = new Dashboard();
        Scene scene = new Scene(
                board.getView(),
                1100,
                700
        );


        scene.getStylesheets()
             .add(getClass()
             .getResource("/style.css")
             .toExternalForm());


        stage.setTitle("Library Management System");

        stage.setScene(scene);

        stage.show();

    }


    public static void main(String[] args){

        launch();

    }

}