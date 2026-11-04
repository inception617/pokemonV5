package com.example;
//version 5.5

import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
        Pokedex pokedex = new Pokedex();

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.setAlignment(Pos.TOP_CENTER );
        pane.hgapProperty().bind(pane.widthProperty().divide(50));
        pane.setBackground(new Background(new BackgroundFill(Color.color(1, 1, 1), null, null)));
        VBox column1 = new VBox(15);
        VBox column2 = new VBox(15);
        VBox column3 = new VBox(15);

        ImageView imageView1 = new ImageView();
        imageView1.fitWidthProperty().bind(pane.widthProperty().divide(4.25));
        imageView1.setPreserveRatio(true);
        ImageView imageView2 = new ImageView();
        imageView2.fitWidthProperty().bind(pane.widthProperty().divide(4.25));
        imageView2.setPreserveRatio(true);
        ImageView imageView3 = new ImageView();
        imageView3.fitWidthProperty().bind(pane.widthProperty().divide(4.25));
        imageView3.setPreserveRatio(true);

        column1.getChildren().add(imageView1);
        column2.getChildren().add(imageView2);
        column3.getChildren().add(imageView3);

        Text name1 = new Text();
        column1.getChildren().add(name1);
        Text attribute1 = new Text();
        ImageView icon1 = new ImageView();
        icon1.fitWidthProperty().bind(pane.widthProperty().divide(20));
        icon1.setPreserveRatio(true);
        HBox attributeBox1 = new HBox(10);
        attributeBox1.setAlignment(Pos.CENTER);
        attributeBox1.getChildren().addAll(icon1, attribute1);
        column1.getChildren().add(attributeBox1);
        column1.setAlignment(Pos.CENTER);

        Text name2 = new Text();
        column2.getChildren().add(name2);
        Text attribute2 = new Text();
        ImageView icon2 = new ImageView();
        icon2.fitWidthProperty().bind(pane.widthProperty().divide(20));
        icon2.setPreserveRatio(true);
        HBox attributeBox2 = new HBox(10);
        attributeBox2.setAlignment(Pos.CENTER);
        attributeBox2.getChildren().addAll(icon2, attribute2);
        column2.getChildren().add(attributeBox2);
        column2.setAlignment(Pos.CENTER);

        Text name3 = new Text();
        column3.getChildren().add(name3);
        Text attribute3 = new Text();
        ImageView icon3 = new ImageView();
        icon3.fitWidthProperty().bind(pane.widthProperty().divide(20));
        icon3.setPreserveRatio(true);
        HBox attributeBox3 = new HBox(10);
        attributeBox3.setAlignment(Pos.CENTER);
        attributeBox3.getChildren().addAll(icon3, attribute3);
        column3.getChildren().add(attributeBox3);
        column3.setAlignment(Pos.CENTER);

        VBox buttonColumn1 = new VBox(10);
        VBox buttonColumn2 = new VBox(10);

        // menu button to change the background color
        MenuButton colorMenuButton = new MenuButton("Background \nColor");

        // menu item that allows a custom color to be set
        MenuItem customItem = new MenuItem("Custom");
        customItem.setOnAction(e -> {
            System.out.println("enter three values between 0 - 255");
            Scanner input = new Scanner(System.in);
            int r = input.nextInt();
            int g = input.nextInt();
            int b = input.nextInt();
            input.close();
            pane.setBackground(new Background(new BackgroundFill(Color.color(r/255.0, g/255.0, b/255.0), null, null)));
            updateFontColor(pane, name1, name2, name3, attribute1, attribute2, attribute3);
            });

        // create menu items with the primary colors from all mainline series games
        String[][] gameColors = {
                {"Pokémon Red", "DA3914"},
                {"Pokémon Green", "24A724"},
                {"Pokémon Blue", "2E50D8"},
                {"Pokémon Yellow", "FFD733"},
                {"Pokémon Gold", "DAA520"},
                {"Pokémon Silver", "C0C0C0"},
                {"Pokémon Crystal", "4FD9FF"},
                {"Pokémon Ruby", "CD2236"},
                {"Pokémon Sapphire", "3D51A7"},
                {"Pokémon Emerald", "009652"},
                {"Pokémon FireRed", "F15C01"},
                {"Pokémon LeafGreen", "9FDC00"},
                {"Pokémon Diamond", "90BEED"},
                {"Pokémon Pearl", "DD7CB1"},
                {"Pokémon Platinum", "A0A08D"},
                {"Pokémon HeartGold", "E8B502"},
                {"Pokémon SoulSilver", "AAB9CF"},
                {"Pokémon Black", "444444"},
                {"Pokémon White", "E1E1E1"},
                {"Pokémon Black 2", "303E51"},
                {"Pokémon White 2", "EBC5C3"},
                {"Pokémon X", "025DA6"},
                {"Pokémon Y", "EA1A3E"},
                {"Pokémon Omega Ruby", "AB2813"},
                {"Pokémon Alpha Sapphire", "26649C"},
                {"Pokémon Sun", "F1912B"},
                {"Pokémon Moon", "5599CA"},
                {"Pokémon Ultra Sun", "E95B2B"},
                {"Pokémon Ultra Moon", "226DB5"},
                {"Pokémon: Let's Go, Pikachu!", "F5DA26"},
                {"Pokémon: Let's Go, Eevee!", "D4924B"},
                {"Pokémon Sword", "00A1E9"},
                {"Pokémon Shield", "BF004F"},
                {"Pokémon Brilliant Diamond", "44BAE5"},
                {"Pokémon Shining Pearl", "DA7D99"},
                {"Pokémon Legends: Arceus", "36597B"},
                {"Pokémon Scarlet", "F34134"},
                {"Pokémon Violet", "8334B7"},
                {"Pokémon Legends: Z-A", "31CA56"},
                {"Pokémon Winds", "66E7A4"},
                {"Pokémon Waves", "096BE4"}
        };
        for (String[] gameColor : gameColors) {
            MenuItem gameColorItem = new MenuItem(gameColor[0]);
            Color backgroundColor = Color.web("#" + gameColor[1]);
            gameColorItem.setOnAction(e -> {
                pane.setBackground(new Background(new BackgroundFill(backgroundColor, null, null)));
                updateFontColor(pane, name1, name2, name3, attribute1, attribute2, attribute3);
            });
            colorMenuButton.getItems().add(gameColorItem);
        }
        colorMenuButton.getItems().add(customItem);
        Button numberButton = new Button("Number");
        Button genButton = new Button("Generation");
        Button japaneseNameButton = new Button("Japanese \nName");
        Button speciesButton = new Button("Species");
        Button heightButton = new Button("Height");
        Button weightButton = new Button("Weight");
        Button eggGroupsButton = new Button("Egg \nGroups");
        Button shinyButton = new Button("Shiny");

        // add the first column of buttons to the pane
        buttonColumn1.getChildren().addAll(colorMenuButton, numberButton, genButton, japaneseNameButton, speciesButton, heightButton, weightButton, eggGroupsButton, shinyButton);
        
        Button againButton = new Button("Again");
        Button highestStatButton = new Button("Highest \nStat");
        Button lowestStatButton = new Button("Lowest \nStat");
        Button BSTButton = new Button("BST");
        Button abilitiesButton = new Button("Abilities");
        Button lastMoveButton = new Button("Last Move");
        Button colorButton = new Button("Color");
        Button shapeButton = new Button("Shape");
        Button dexEntriesButton = new Button("Pokedex \nEntries");

        // add the second column of buttons to the pane
        buttonColumn2.getChildren().addAll(againButton, highestStatButton, lowestStatButton, BSTButton, abilitiesButton, lastMoveButton, colorButton, shapeButton, dexEntriesButton);


        pane.addRow(0, column1, column2, column3, buttonColumn1, buttonColumn2);

        EventHandler<ActionEvent> genEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index1].getGen()));
                attribute2.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index2].getGen()));
                attribute3.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index3].getGen()));              
            }
        };
        EventHandler<ActionEvent> heightEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getHeight(pokedex.name_index1));
                attribute2.setText(pokedex.getHeight(pokedex.name_index2));
                attribute3.setText(pokedex.getHeight(pokedex.name_index3));
                
            }
        };
        EventHandler<ActionEvent> weightEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getWeight(pokedex.name_index1));
                attribute2.setText(pokedex.getWeight(pokedex.name_index2));
                attribute3.setText(pokedex.getWeight(pokedex.name_index3));        
            }
        };
        EventHandler<ActionEvent> eggGroupsEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String string1 = pokedex.getPokedex()[pokedex.name_index1].getEggGroups()[0];
                String string2 = pokedex.getPokedex()[pokedex.name_index2].getEggGroups()[0];
                String string3 = pokedex.getPokedex()[pokedex.name_index3].getEggGroups()[0];

                if (pokedex.getPokedex()[pokedex.name_index1].getEggGroups().length > 1) {
                    string1 += ", " + (pokedex.getPokedex()[pokedex.name_index1].getEggGroups()[1]);
                }
                if (pokedex.getPokedex()[pokedex.name_index2].getEggGroups().length > 1) {
                    string2 += ", " + (pokedex.getPokedex()[pokedex.name_index2].getEggGroups()[1]);
                }
                if (pokedex.getPokedex()[pokedex.name_index3].getEggGroups().length > 1) {
                    string3 += ", " + (pokedex.getPokedex()[pokedex.name_index3].getEggGroups()[1]);
                }
                attribute1.setText(string1);
                attribute2.setText(string2);
                attribute3.setText(string3);
            
            }
        };
        EventHandler<ActionEvent> numberEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getNumber(pokedex.name_index1));
                attribute2.setText(pokedex.getNumber(pokedex.name_index2));
                attribute3.setText(pokedex.getNumber(pokedex.name_index3));
            }
        };
        EventHandler<ActionEvent> japaneseNameEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getJapaneseName(pokedex.name_index1));
                attribute2.setText(pokedex.getJapaneseName(pokedex.name_index2));
                attribute3.setText(pokedex.getJapaneseName(pokedex.name_index3));              
            }
        };
        EventHandler<ActionEvent> shinyEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                imageView1.setImage(pokedex.getShiny(pokedex.name_index1));
                imageView2.setImage(pokedex.getShiny(pokedex.name_index2));
                imageView3.setImage(pokedex.getShiny(pokedex.name_index3));    
            }
        };
        EventHandler<ActionEvent> dexEntriesEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                Stage dexStage = new Stage();
                Pane dexPane = new Pane();
                HBox dexHBox = new HBox(5);
                dexHBox.setPadding(new Insets(10));
                VBox dexCoulmn1 = new VBox();
                VBox dexCoulmn2 = new VBox();
                VBox dexCoulmn3 = new VBox();

                dexCoulmn1.getChildren().add(new Text(pokedex.getName(pokedex.name_index1)));
                dexCoulmn1.getChildren().add(new Text(pokedex.getPokedex()[pokedex.name_index1].getDexEntries()));
                dexCoulmn2.getChildren().add(new Text(pokedex.getName(pokedex.name_index2)));
                dexCoulmn2.getChildren().add(new Text(pokedex.getPokedex()[pokedex.name_index2].getDexEntries()));   
                dexCoulmn3.getChildren().add(new Text(pokedex.getName(pokedex.name_index3)));
                dexCoulmn3.getChildren().add(new Text(pokedex.getPokedex()[pokedex.name_index3].getDexEntries()));             

                dexHBox.getChildren().addAll(dexCoulmn1, dexCoulmn2, dexCoulmn3);
                dexPane.getChildren().add(dexHBox);
                
                Scene dexScene = new Scene(dexPane, 1280, 720);
                dexStage.setTitle("Pokedex Entries");
                dexStage.setScene(dexScene);
                dexStage.show();
            }
        };
        EventHandler<ActionEvent> againEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                pokedex.again();

                imageView1.setImage(pokedex.getNormalImage(pokedex.name_index1));
                imageView2.setImage(pokedex.getNormalImage(pokedex.name_index2)); 
                imageView3.setImage(pokedex.getNormalImage(pokedex.name_index3));
                name1.setText(pokedex.getName(pokedex.name_index1));
                name2.setText(pokedex.getName(pokedex.name_index2));
                name3.setText(pokedex.getName(pokedex.name_index3));
                attribute1.setText(null);
                attribute2.setText(null);
                attribute3.setText(null);
                icon1.setImage(null);
                icon2.setImage(null);
                icon3.setImage(null);

            }
        };

        //second row button actions
        EventHandler<ActionEvent> speciesEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getSpecies(pokedex.name_index1));
                attribute2.setText(pokedex.getSpecies(pokedex.name_index2));
                attribute3.setText(pokedex.getSpecies(pokedex.name_index3));             
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
        EventHandler<ActionEvent> BSTEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index1].getBST()));
                attribute2.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index2].getBST()));
                attribute3.setText(String.valueOf(pokedex.getPokedex()[pokedex.name_index3].getBST()));              
            }
        };
        EventHandler<ActionEvent> abilitiesEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                String string1 = "";
                String string2 = "";
                String string3 = "";
                for (String ability : pokedex.getPokedex()[pokedex.name_index1].getAbilities()) {
                    string1 += ability + "\n";
                }
                for (String ability : pokedex.getPokedex()[pokedex.name_index2].getAbilities()) {
                    string2 += ability + "\n";
                }
                for (String ability : pokedex.getPokedex()[pokedex.name_index3].getAbilities()) {
                    string3 += ability + "\n";
                }

                attribute1.setText(string1);
                attribute2.setText(string2);
                attribute3.setText(string3);
            }
        };
        EventHandler<ActionEvent> lastMoveEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getPokedex()[pokedex.name_index1].getLastMove());
                attribute2.setText(pokedex.getPokedex()[pokedex.name_index2].getLastMove());
                attribute3.setText(pokedex.getPokedex()[pokedex.name_index3].getLastMove());              
            }
        };
        EventHandler<ActionEvent> colorEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getPokedex()[pokedex.name_index1].getColor());
                attribute2.setText(pokedex.getPokedex()[pokedex.name_index2].getColor());
                attribute3.setText(pokedex.getPokedex()[pokedex.name_index3].getColor());              
            }
        };
        EventHandler<ActionEvent> shapeEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                attribute1.setText(pokedex.getPokedex()[pokedex.name_index1].getShape());
                attribute2.setText(pokedex.getPokedex()[pokedex.name_index2].getShape());
                attribute3.setText(pokedex.getPokedex()[pokedex.name_index3].getShape()); 
                
                icon1.setImage(pokedex.getPokedex()[pokedex.name_index1].getShapeIcon());
                icon2.setImage(pokedex.getPokedex()[pokedex.name_index2].getShapeIcon());
                icon3.setImage(pokedex.getPokedex()[pokedex.name_index3].getShapeIcon());
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
        dexEntriesButton.setOnAction(dexEntriesEvent);
        genButton.setOnAction(genEvent);
        eggGroupsButton.setOnAction(eggGroupsEvent);
        BSTButton.setOnAction(BSTEvent);
        abilitiesButton.setOnAction(abilitiesEvent);
        lastMoveButton.setOnAction(lastMoveEvent);
        colorButton.setOnAction(colorEvent);
        shapeButton.setOnAction(shapeEvent);

        //dynamically change the sizes of the buttons and text based on the size of the window
            pane.widthProperty().addListener((obs, oldVal, newVal) -> {
                Font buttonFont = new Font(newVal.doubleValue()/72);
                Font labelFont = new Font(newVal.doubleValue()/45);
                double width = newVal.doubleValue()/7;
                double height = newVal.doubleValue()/21;


                colorMenuButton.setFont(buttonFont);
                colorMenuButton.setPrefWidth(width);

                name1.setFont(labelFont);
                name2.setFont(labelFont);
                name3.setFont(labelFont);
                attribute1.setFont(labelFont);
                attribute2.setFont(labelFont);
                attribute3.setFont(labelFont);

                heightButton.setPrefWidth(width);
                weightButton.setPrefWidth(width);
                numberButton.setPrefWidth(width);
                japaneseNameButton.setPrefWidth(width);
                shinyButton.setPrefWidth(width);
                againButton.setPrefWidth(width);
                speciesButton.setPrefWidth(width);
                highestStatButton.setPrefWidth(width);
                lowestStatButton.setPrefWidth(width);
                dexEntriesButton.setPrefWidth(width);
                genButton.setPrefWidth(width);
                eggGroupsButton.setPrefWidth(width);
                BSTButton.setPrefWidth(width);
                abilitiesButton.setPrefWidth(width);
                lastMoveButton.setPrefWidth(width);
                colorButton.setPrefWidth(width);
                shapeButton.setPrefWidth(width);


                colorMenuButton.setPrefHeight(height);
                heightButton.setPrefHeight(height);
                weightButton.setPrefHeight(height);
                numberButton.setPrefHeight(height);
                japaneseNameButton.setPrefHeight(height);
                shinyButton.setPrefHeight(height);
                againButton.setPrefHeight(height);
                speciesButton.setPrefHeight(height);
                highestStatButton.setPrefHeight(height);
                lowestStatButton.setPrefHeight(height);
                dexEntriesButton.setPrefHeight(height);
                genButton.setPrefHeight(height);
                eggGroupsButton.setPrefHeight(height);
                BSTButton.setPrefHeight(height);
                abilitiesButton.setPrefHeight(height);
                lastMoveButton.setPrefHeight(height);
                colorButton.setPrefHeight(height);
                shapeButton.setPrefHeight(height);

                heightButton.setFont(buttonFont);
                weightButton.setFont(buttonFont);
                numberButton.setFont(buttonFont);
                japaneseNameButton.setFont(buttonFont);
                shinyButton.setFont(buttonFont);
                againButton.setFont(buttonFont);
                speciesButton.setFont(buttonFont);
                highestStatButton.setFont(buttonFont);
                lowestStatButton.setFont(buttonFont);
                dexEntriesButton.setFont(buttonFont);
                genButton.setFont(buttonFont);
                eggGroupsButton.setFont(buttonFont);
                BSTButton.setFont(buttonFont);
                abilitiesButton.setFont(buttonFont);
                lastMoveButton.setFont(buttonFont);
                colorButton.setFont(buttonFont);
                shapeButton.setFont(buttonFont);
            });

        // initialize the stats of all the pokemon
        pokedex.initPokedex();

        //create a scene
        Scene scene = new Scene(pane,1280, 720);
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

    // change the color of the font depending on whether the background is light or dark
    public void updateFontColor(Pane pane, Text name1, Text name2, Text name3, Text attribute1, Text attribute2, Text attribute3) {
        Color textColor;
        Paint paint = pane.getBackground().getFills().get(0).getFill();
        double rgb = ((Color) paint).getRed() + ((Color) paint).getGreen() +((Color) paint).getBlue();
        if (rgb < 1.5) {
            textColor = Color.WHITE;
        }
        else {
            textColor = Color.BLACK;
        }
        name1.setFill(textColor);
        name2.setFill(textColor);
        name3.setFill(textColor);
        attribute1.setFill(textColor);
        attribute2.setFill(textColor);
        attribute3.setFill(textColor);
    }

    public static void main(String[] args) {
        launch(args);

    }
}
