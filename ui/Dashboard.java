package ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Dashboard {


    BorderPane root;


    public Dashboard(){


        root = new BorderPane();


        createLayout();


    }



    private void createLayout(){



        // TOP TITLE

        Label title =
        new Label("📚 Library Management System");


        title.getStyleClass()
             .add("title");



        HBox top =
        new HBox(title);


        top.setPadding(
            new Insets(20)
        );


        root.setTop(top);



        // LEFT MENU


        VBox menu =
        new VBox(20);


        menu.setPadding(
            new Insets(30)
        );


        Button books =
        new Button("📖 Books");


        Button members =
        new Button("👥 Members");


        Button issue =
        new Button("🔄 Issue Book");


        Button returnBtn =
        new Button("↩ Return Book");


        menu.getChildren()
            .addAll(
                books,
                members,
                issue,
                returnBtn
            );



        root.setLeft(menu);




        // CENTER AREA


        Label welcome =
        new Label(
        "Welcome to Library Dashboard"
        );


        welcome.getStyleClass()
               .add("welcome");


        root.setCenter(welcome);



        root.setPadding(
            new Insets(20)
        );


    }



    public BorderPane getView(){

        return root;

    }


}