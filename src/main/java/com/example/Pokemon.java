package com.example;

import javafx.scene.image.Image;

public class Pokemon {
    int id = 0;
    int number = 0;
    int gen = 0;
    String name = "name";
    String japanese = "japanese";
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
    String dexEntry = "Pokedex entry";
    String imageName = "default";
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

    public void setJapanese(String japanese) {
        this.japanese = japanese;
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
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }
    public String getHighestStat() {
        return this.highestStat;
    }
    public String getLowestStat() {
        return this.lowestStat;
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
        this.japanese = attributes[4];
        this.species = attributes[5];
        double heightNum = Double.parseDouble(attributes[6]) * 0.328 + 0.2;   // convert height from .1 meters to feet and inches
        String feet = String.valueOf((int)(heightNum));   
        String inches = String.valueOf((int)(heightNum - (int)(heightNum)));                             
        this.height = feet + "' " + inches + "\"";
        this.weight = String.valueOf(Double.parseDouble(attributes[7]) * 0.22) + " lbs";                // convert weight from .1 kilograms to lbls
        this.highestStat = attributes[8];
        this.lowestStat = attributes[9];
        this.BST = Integer.parseInt(attributes[10]);
        this.abilities = attributes[11].split(":");
        this.lastMove = attributes[12];
        this.color = attributes[13];
        this.shape = attributes[14];
        this.growthRate = attributes[15];
        this.eggGroups = attributes[16].split(":");
        this.dexEntry = attributes[17];
    }

    private static String capitilizeFirstLetter(String s) {
        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
        return s;
    }
}