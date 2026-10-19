package com.example;
//version 5.5

/*
NOTE: missing meloetta_pirouette 
*/

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class randomPokemon extends Application{
    @Override 
    public void start(Stage primaryStage) {
        Scanner input = new Scanner(System.in);

        Pokedex pokedex = new Pokedex();

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.setAlignment(Pos.TOP_CENTER );
        pane.hgapProperty().bind(pane.widthProperty().divide(40));
        pane.setBackground(new Background(new BackgroundFill(Color.color(1, 1, 1), null, null)));
        VBox column1 = new VBox(15);
        VBox column2 = new VBox(15);
        VBox column3 = new VBox(15);

        ImageView imageView1 = new ImageView();
        imageView1.fitWidthProperty().bind(pane.widthProperty().divide(3.5));
        imageView1.setPreserveRatio(true);
        ImageView imageView2 = new ImageView();
        imageView2.fitWidthProperty().bind(pane.widthProperty().divide(3.5));
        imageView2.setPreserveRatio(true);
        ImageView imageView3 = new ImageView();
        imageView3.fitWidthProperty().bind(pane.widthProperty().divide(3.5));
        imageView3.setPreserveRatio(true);

        // menu button to change the background color
        MenuItem blackItem = new MenuItem("Black");
        MenuItem whiteItem = new MenuItem("White");
        MenuItem redItem = new MenuItem("Red");
        MenuItem greenItem = new MenuItem("Green");
        MenuItem blueItem = new MenuItem("Blue");
        MenuItem customItem = new MenuItem("Custom");

        blackItem.setOnAction(e -> pane.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null))));
        whiteItem.setOnAction(e -> pane.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null))));
        redItem.setOnAction(e -> pane.setBackground(new Background(new BackgroundFill(Color.RED, null, null))));
        greenItem.setOnAction(e -> pane.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null))));
        blueItem.setOnAction(e -> pane.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null))));
        customItem.setOnAction(e -> {
            System.out.println("enter three values between 0 - 255");
            int r = input.nextInt();
            int g = input.nextInt();
            int b = input.nextInt();
            pane.setBackground(new Background(new BackgroundFill(Color.color(r/255.0, g/255.0, b/255.0), null, null)));
            });

        MenuButton menuButton = new MenuButton("Change Color");
        menuButton.getItems().addAll(blackItem, whiteItem, redItem, greenItem, blueItem, customItem);

        pane.addRow(1, menuButton);

        column1.getChildren().add(imageView1);
        column2.getChildren().add(imageView2);
        column3.getChildren().add(imageView3);

        Text name1 = new Text(pokedex.pokedex[pokedex.name_index1].name);
        name1.setFont(new Font(25));
        column1.getChildren().add(name1);
        Text attribute1 = new Text();
        attribute1.setFont(new Font(25));
        column1.getChildren().add(attribute1);
        column1.setAlignment(Pos.CENTER);

        Text name2 = new Text(pokedex.pokedex[pokedex.name_index2].name);
        name2.setFont(new Font(25));
        column2.getChildren().add(name2);
        Text attribute2 = new Text();
        attribute2.setFont(new Font(25));
        column2.getChildren().add(attribute2);
        column2.setAlignment(Pos.CENTER);

        Text name3 = new Text(pokedex.pokedex[pokedex.name_index3].name);
        name3.setFont(new Font(25));
        column3.getChildren().add(name3);
        Text attribute3 = new Text();
        attribute3.setFont(new Font(25));
        column3.getChildren().add(attribute3);
        column3.setAlignment(Pos.CENTER);

        pane.addRow(2, column1, column2, column3);

        HBox buttonGroup1 = new HBox(15);
        HBox buttonGroup2 = new HBox(15);
        HBox buttonGroup3 = new HBox(15);
        
        buttonGroup1.setAlignment(Pos.CENTER);
        buttonGroup2.setAlignment(Pos.CENTER);
        buttonGroup3.setAlignment(Pos.CENTER);
        
        Button heightButton = new Button("Height");
        buttonGroup1.getChildren().add(heightButton);
        Button weightButton = new Button("Weight");
        buttonGroup1.getChildren().add(weightButton);
        Button numberButton = new Button("Number");
        buttonGroup2.getChildren().add(numberButton);
        Button japaneseNameButton = new Button("Japanese Name");
        buttonGroup2.getChildren().add(japaneseNameButton);
        Button shinyButton = new Button("Shiny");
        buttonGroup3.getChildren().add(shinyButton);
        Button againButton = new Button("Again");
        buttonGroup3.getChildren().add(againButton);

        Button speciesButton = new Button("Species");
        Button highestStatButton = new Button("Highest Stat");
        Button lowestStatButton = new Button("Lowest Stat");
        
        pane.addRow(3, buttonGroup1, buttonGroup2, buttonGroup3);
        pane.addRow(4, speciesButton, highestStatButton, lowestStatButton);

        // center speciesButton, highestStatButton, lowestStatButton
        GridPane.setHalignment(speciesButton, javafx.geometry.HPos.CENTER);
        GridPane.setHalignment(highestStatButton, javafx.geometry.HPos.CENTER);
        GridPane.setHalignment(lowestStatButton, javafx.geometry.HPos.CENTER);

        pane.vgapProperty().bind(pane.heightProperty().divide(35));

        EventHandler<ActionEvent> heightEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getHeight(pokedex.name_index1).getText());
                attribute2.setText(pokedex.getHeight(pokedex.name_index2).getText());
                attribute3.setText(pokedex.getHeight(pokedex.name_index3).getText());
                
            }
        };
        EventHandler<ActionEvent> weightEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getWeight(pokedex.name_index1).getText());
                attribute2.setText(pokedex.getWeight(pokedex.name_index2).getText());
                attribute3.setText(pokedex.getWeight(pokedex.name_index3).getText());        
            }
        };
        EventHandler<ActionEvent> numberEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getNumber(pokedex.name_index1).getText());
                attribute2.setText(pokedex.getNumber(pokedex.name_index2).getText());
                attribute3.setText(pokedex.getNumber(pokedex.name_index3).getText());
            }
        };
        EventHandler<ActionEvent> japaneseNameEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getJapaneseName(pokedex.name_index1).getText());
                attribute2.setText(pokedex.getJapaneseName(pokedex.name_index2).getText());
                attribute3.setText(pokedex.getJapaneseName(pokedex.name_index3).getText());              
            }
        };
        EventHandler<ActionEvent> shinyEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                imageView1.setImage(pokedex.getShiny(pokedex.name_index1));
                imageView2.setImage(pokedex.getShiny(pokedex.name_index2));
                imageView3.setImage(pokedex.getShiny(pokedex.name_index3));    
            }
        };
        EventHandler<ActionEvent> againEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pokedex.again();

                imageView1.setImage(pokedex.getNormalImage(pokedex.name_index1));
                imageView2.setImage(pokedex.getNormalImage(pokedex.name_index2)); 
                imageView3.setImage(pokedex.getNormalImage(pokedex.name_index3));
                name1.setText(pokedex.getName(pokedex.name_index1).getText());
                name2.setText(pokedex.getName(pokedex.name_index2).getText());
                name3.setText(pokedex.getName(pokedex.name_index3).getText());
                attribute1.setText(null);
                attribute2.setText(null);
                attribute3.setText(null);

            }
        };

        //second row button actions
        EventHandler<ActionEvent> speciesEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getSpecies(pokedex.name_index1).getText());
                attribute2.setText(pokedex.getSpecies(pokedex.name_index2).getText());
                attribute3.setText(pokedex.getSpecies(pokedex.name_index3).getText());             
            }
        };
        EventHandler<ActionEvent> highestStatEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getHighestStat(pokedex.name_index1));
                attribute2.setText(pokedex.getHighestStat(pokedex.name_index2));
                attribute3.setText(pokedex.getHighestStat(pokedex.name_index3));           
            }
        };
        EventHandler<ActionEvent> lowestStatEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getLowestStat(pokedex.name_index1));
                attribute2.setText(pokedex.getLowestStat(pokedex.name_index2));
                attribute3.setText(pokedex.getLowestStat(pokedex.name_index3));              
            }
        };

        heightButton.setOnAction(heightEvent);
        weightButton.setOnAction(weightEvent);
        numberButton.setOnAction(numberEvent);
        japaneseNameButton.setOnAction(japaneseNameEvent);
        shinyButton.setOnAction(shinyEvent);
        againButton.setOnAction(againEvent);

        speciesButton.setOnAction(speciesEvent);
        highestStatButton.setOnAction(highestStatEvent);
        lowestStatButton.setOnAction(lowestStatEvent);

        //dynamically change the sizes of the buttons and text based on the size of the window
            pane.widthProperty().addListener((obs, oldVal, newVal) -> {
                menuButton.setFont(new Font(newVal.doubleValue()/75));
                name1.setFont(new Font(newVal.doubleValue()/50));
                name2.setFont(new Font(newVal.doubleValue()/50));
                name3.setFont(new Font(newVal.doubleValue()/50));
                menuButton.setPrefWidth(newVal.doubleValue()/7);
                attribute1.setFont(new Font(newVal.doubleValue()/50));
                attribute2.setFont(new Font(newVal.doubleValue()/50));
                attribute3.setFont(new Font(newVal.doubleValue()/50));
                heightButton.setPrefWidth(newVal.doubleValue()/10);
                weightButton.setPrefWidth(newVal.doubleValue()/10);
                numberButton.setPrefWidth(newVal.doubleValue()/10);
                japaneseNameButton.setPrefWidth(newVal.doubleValue()/10);
                shinyButton.setPrefWidth(newVal.doubleValue()/10);
                againButton.setPrefWidth(newVal.doubleValue()/10);
                speciesButton.setPrefWidth(newVal.doubleValue()/10);
                highestStatButton.setPrefWidth(newVal.doubleValue()/10);
                lowestStatButton.setPrefWidth(newVal.doubleValue()/10);
                menuButton.setPrefHeight(newVal.doubleValue()/12);
                heightButton.setPrefHeight(newVal.doubleValue()/12);
                weightButton.setPrefHeight(newVal.doubleValue()/12);
                numberButton.setPrefHeight(newVal.doubleValue()/12);
                japaneseNameButton.setPrefHeight(newVal.doubleValue()/12);
                shinyButton.setPrefHeight(newVal.doubleValue()/12);
                againButton.setPrefHeight(newVal.doubleValue()/12);
                speciesButton.setPrefHeight(newVal.doubleValue()/12);
                highestStatButton.setPrefHeight(newVal.doubleValue()/12);
                lowestStatButton.setPrefHeight(newVal.doubleValue()/12);
                heightButton.setFont(new Font(newVal.doubleValue()/75));
                weightButton.setFont(new Font(newVal.doubleValue()/75));
                numberButton.setFont(new Font(newVal.doubleValue()/75));
                japaneseNameButton.setFont(new Font(newVal.doubleValue()/75));
                shinyButton.setFont(new Font(newVal.doubleValue()/75));
                againButton.setFont(new Font(newVal.doubleValue()/75));
                speciesButton.setFont(new Font(newVal.doubleValue()/75));
                highestStatButton.setFont(new Font(newVal.doubleValue()/75));
                lowestStatButton.setFont(new Font(newVal.doubleValue()/75));
            });

        // initialize the stats of all the pokemon
        pokedex.initPokedex();

        //create a scene
        Scene scene = new Scene(pane, 900, 500);
        primaryStage.setTitle("Random Pokemon Generator");
        primaryStage.setScene(scene);
        primaryStage.show();

        againButton.fire();

    }

    public String addLeadingZeros(int number) {
        String numberStr = Integer.toString(number);
        while (numberStr.length() < 3) {
            numberStr = "0" + numberStr;
        }
        return numberStr;
    }

    public static void main(String[] args) {
        launch(args);

    }
}
