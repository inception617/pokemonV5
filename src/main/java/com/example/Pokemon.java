package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

import javafx.scene.image.Image;

public class Pokemon {
    String name = "name";
    String height = "height";
    String weight = "weight";
    int number = 0;
    String japanese = "japanese";
    int gen = 0;
    Type type1;
    Type type2;
    String species = "species";
    LinkedHashMap<String, Integer> stats = new LinkedHashMap<>();
    String imageName = "default";
    Image shiny;
    Image color;

    Pokemon(String name, int number,int gen) {
        this.name = name;
        this.gen = gen;
        this.number = number;
        this.stats.put("hp", 0);
        this.stats.put("attack", 0);
        this.stats.put("defense", 0);
        this.stats.put("sp. atk", 0);
        this.stats.put("sp. def", 0);
        this.stats.put("speed", 0);
    }

        Pokemon(String name, int number,int gen, String japaneseName) {
        this.name = name;
        this.gen = gen;
        this.number = number;
        this.japanese = japaneseName;
        this.stats.put("hp", 0);
        this.stats.put("attack", 0);
        this.stats.put("defense", 0);
        this.stats.put("sp. atk", 0);
        this.stats.put("sp. def", 0);
        this.stats.put("speed", 0);
    }

        Pokemon(String name, int number,int gen, String japaneseName, String imageName) {
        this.name = name;
        this.gen = gen;
        this.number = number;
        this.japanese = japaneseName;
        this.imageName = imageName;
        this.stats.put("hp", 0);
        this.stats.put("attack", 0);
        this.stats.put("defense", 0);
        this.stats.put("sp. atk", 0);
        this.stats.put("sp. def", 0);
        this.stats.put("speed", 0);
        this.color = new Image("file:Sprites\\color\\" + imageName + ".png");
    }

    Pokemon(String name, int number, String height, String weight, String japanese) {
        this.name = name;
        this.number = number;
        this.japanese = japanese;
        this.height = height;
        this.weight = weight;
        //this.color = new Image("file:color\\" + number + ".png");

    }

    Pokemon(String name, int number, String height, String weight, String japanese, int gen, Type type1, Type type2, String species, LinkedHashMap<String, Integer> stats) {
        this.name = name;
        this.number = number;
        this.japanese = japanese;
        this.height = height;
        this.weight = weight;
        this.gen = gen;
        this.type1 = type1;
        this.type2 = type2;
        this.species = species;
        this.stats = stats;
        //this.color = new Image("file:color\\" + number + ".png");

    }

    Pokemon(String name, int number, String height, String weight, String japanese, String imageName) {
        this.name = name;
        this.number = number;
        this.japanese = japanese;
        this.height = height;
        this.weight = weight;
        this.imageName = imageName;
        this.color = new Image("file:Sprites\\color\\" + imageName + ".png");
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

    public void setStats(LinkedHashMap<String, Integer> stats) {
        if (stats == null) {
            this.stats = null;
            return;
        }
        this.stats = new LinkedHashMap<>();
        for (String key : stats.keySet()) {
            this.stats.put(key, stats.get(key));
        }
    }

    // getter methods for each attribute
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }
    public LinkedHashMap<String, Integer> getStats() {
        return this.stats;
    }


    public void initStats() {
        String filePath = "Database";
        switch (gen) {
            case 1:
                filePath += "\\Gen1.txt";
                break;
            /*
            case 2:
                filePath += "\\Gen2.txt";
                break;
            case 3:
                filePath += "\\Gen3.txt";
                break;
            case 4:
                filePath += "\\Gen4.txt";
                break;
            case 5:
                filePath += "\\Gen5.txt";
                break;
            case 6:
                filePath += "\\Gen6.txt";
                break;
            case 7:
                filePath += "\\Gen7.txt";
                break;
            case 8:
                filePath += "\\Gen8.txt";
                break;
            case 9:
                filePath += "\\Gen9.txt";
                break;
            */
            default:
                //temp
                filePath += "\\Gen1.txt";
                break;
        }
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            String s;
            boolean found = false;
            while((s = fileReader.readLine()) != null) {
                if(s.toLowerCase().equals(name.toLowerCase())) {
                    found = true;
                    continue;
                }

                if(!found) {
                    continue;
                }

                    if(s.startsWith("    type1:")) {
                        type1 = new Type(capitilizeFirstLetter(s.replaceFirst(".*: ", "")));
                    }
                    else if(s.startsWith("    type2:")) {
                        if(!s.equals("    type2:") & !s.equals("    type2: -")) {
                            type2 = new Type(capitilizeFirstLetter(s.replaceFirst(".*: ", "")));
                        }
                        else {
                            type2 = null;
                        }
                    }
                    else if(s.startsWith("    stats:")) {
                        try {
                            for(String key : this.stats.keySet()) {
                                stats.put(key, Integer.parseInt(fileReader.readLine().replaceFirst(".*: ", "")));
                            }
                        } catch (Exception e) {
                            System.out.println("error adding stats to array");
                        }
                    }
                    else if(s.startsWith("    species:")) {
                        species = s.replaceFirst(".*: ", "");
                    }
                    else if(s.startsWith("    height:")) {
                        if(!s.replaceFirst(".*:", "").equals("")) {
                            height = s.replaceFirst(".*:", "");
                        }
                        else {
                            height = "????";
                        }
                    }
                    else if(s.startsWith("    weight:")) {
                        if(!s.replaceFirst(".*:", "").equals("")) {
                            weight = s.replaceFirst(".*:", "");
                        }
                        else {
                            weight = "????";
                        }
                    }
                    // check if the last stat has been initialized
                    else if(!weight.equals("weight")) {
                        break;
                    }

            }

            fileReader.close();
        } catch (Exception e) {
            System.out.println("error reading file: " + e.getMessage());
        }
    }

    private static String capitilizeFirstLetter(String s) {
        s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
        return s;
    }
}