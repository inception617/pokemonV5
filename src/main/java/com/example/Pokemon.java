package com.example;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Pokemon {
    int id = 0;
    int number = 0;
    int gen = 0;
    String name = "name";
    String japaneseName = "japanese";
    String species = "species";
    String height = "height";
    String weight = "weight";
    String highestStat = "high";
    String lowestStat = "low";
    int BST = 0;
    String[] abilities = new String[3];
    String lastMove = "last move";
    String color = "color";
    String shape = "shape";
    String growthRate = "growth rate";
    String[] eggGroups = new String[2];
    String dexEntries = "";
    Image normalImage;
    Image shinyImage;
    Type type1;
    Type type2;

    Pokemon(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setJapanese(String japaneseName) {
        this.japaneseName = japaneseName;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // getter methods for each attribute
    public int getId() {
        return this.id;
    }
    public int getNumber() {
        return this.number;
    }
    public int getGen() {
        return this.gen;
    }
    public String getName() {
        return this.name;
    }
    public String getJapaneseName() {
        return this.japaneseName;
    }
    public String getSpecies() {
        return this.species;
    }
    public String getHeight() {
        return this.height;
    }
    public String getWeight() {
        return this.weight;
    }
    public String getHighestStat() {
        return this.highestStat;
    }
    public String getLowestStat() {
        return this.lowestStat;
    }
    public int getBST() {
        return this.BST;
    }
    public String[] getAbilities() {
        return this.abilities;
    }
    public String getLastMove() {
        return this.lastMove;
    }
    public String getColor() {
        return this.color;
    }
    public String getShape() {
        return this.shape;
    }
    public String getGrowthRate() {
        return this.growthRate;
    }
    public String[] getEggGroups() {
        return this.eggGroups;
    }
    public String getDexEntries() {
        return this.dexEntries;
    }
    public Image getNormalImage() {
        if (normalImage == null) {
            this.normalImage = new Image("file:Sprites\\color\\" + id + ".png");
        }
        return this.normalImage;
    }
    public Image getShinyImage() {
        return new Image("file:Sprites\\shiny\\" + id + ".png");
    }


    public void initStats(String[] attributes) {
        this.number = Integer.parseInt(attributes[1]);
        this.gen = Integer.parseInt(attributes[2]);
        this.japaneseName = attributes[4];
        this.species = attributes[5].replace("\"", "");
        double heightNum = Double.parseDouble(attributes[6]) * 0.328 + .05;                 // convert height from .1 meters to feet and inches
        String feet = String.valueOf((int)(heightNum));   
        String inches = String.valueOf((int)(((heightNum) - (int)(heightNum)) * 12));                           
        this.height = feet + "' " + inches + "\"";
        this.weight = String.valueOf(Double.parseDouble(attributes[7]) * 0.22) + " lbs";    // convert weight from .1 kilograms to lbls
        // use replace to remove the quotes that surround certain attributes
        this.highestStat = attributes[8].replace("\"", "");
        this.lowestStat = attributes[9].replace("\"", "");
        this.BST = Integer.parseInt(attributes[10]);
        this.abilities = attributes[11].replace("\"", "").split(":");
        this.lastMove = attributes[12].replace("\"", "");
        this.color = attributes[13];
        this.shape = attributes[14];
        this.growthRate = attributes[15];
        this.eggGroups = attributes[16].split(":");
        attributes[17] = attributes[17].replace("\"", "");
        attributes[17] = attributes[17].replace("\\n", "\n");
        int n = attributes[17].length();
        int i = 0;
        int maxLineLenght = 74;
        while (i < n) {
                if ( i + maxLineLenght < attributes[17].length()) {
                    String sub = attributes[17].substring(i, i + maxLineLenght);
                    if (sub.contains("\n")) {
                        this.dexEntries += (sub.substring(0, sub.indexOf("\n")+1));
                        i += sub.indexOf("\n") + 2;
                    }
                    else {
                        this.dexEntries += (sub + "\n");
                        i += maxLineLenght;
                    }
                }
                else {
                    this.dexEntries += (attributes[17].substring(i));
                    break;
                }

        }

    }

    private static String capitilizeFirstLetter(String s) {
        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
        return s;
    }
}