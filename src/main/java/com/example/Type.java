package com.example;

import java.util.HashMap;

public class Type {
    String typeName;
    HashMap<String, Double> typeEffectiveness = new HashMap<String, Double>();

    Type(String typeName) {
        this.typeName = typeName;

        typeEffectiveness.put("Bug", Double.valueOf(1));
        typeEffectiveness.put("Dark", Double.valueOf(1));
        typeEffectiveness.put("Dragon", Double.valueOf(1));
        typeEffectiveness.put("Electric", Double.valueOf(1));
        typeEffectiveness.put("Fairy", Double.valueOf(1));
        typeEffectiveness.put("Fighting", Double.valueOf(1));
        typeEffectiveness.put("Fire", Double.valueOf(1));
        typeEffectiveness.put("Flying", Double.valueOf(1));
        typeEffectiveness.put("Ghost", Double.valueOf(1));
        typeEffectiveness.put("Grass", Double.valueOf(1));
        typeEffectiveness.put("Ground", Double.valueOf(1));
        typeEffectiveness.put("Ice", Double.valueOf(1));
        typeEffectiveness.put("Normal", Double.valueOf(1));
        typeEffectiveness.put("Poison", Double.valueOf(1));
        typeEffectiveness.put("Psychic", Double.valueOf(1));
        typeEffectiveness.put("Rock", Double.valueOf(1));
        typeEffectiveness.put("Steel", Double.valueOf(1));
        typeEffectiveness.put("Water", Double.valueOf(1));

        switch (typeName) {
            case "Bug":
                typeEffectiveness.put("Fire", Double.valueOf(2));
                typeEffectiveness.put("Grass", Double.valueOf(.5));
                typeEffectiveness.put("Fighting", Double.valueOf(.5));
                typeEffectiveness.put("Ground", Double.valueOf(.5));
                typeEffectiveness.put("Flying",Double.valueOf(2));
                typeEffectiveness.put("Rock",Double.valueOf(2));

                break;
        
            case "Dark":
                typeEffectiveness.put("Fighting",Double.valueOf(2));
                typeEffectiveness.put("Psychic",Double.valueOf(0));
                typeEffectiveness.put("Bug",Double.valueOf(2));
                typeEffectiveness.put("Ghost",Double.valueOf(.5));
                typeEffectiveness.put("Dark",Double.valueOf(.5));
                typeEffectiveness.put("Fairy",Double.valueOf(2));

                break;

            case "Dragon":
                typeEffectiveness.put("Fire", Double.valueOf(.5));
                typeEffectiveness.put("Water",Double.valueOf(.5));
                typeEffectiveness.put("Electric",Double.valueOf(.5));
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Ice",Double.valueOf(2));
                typeEffectiveness.put("Dragon",Double.valueOf(2));
                typeEffectiveness.put("Fairy",Double.valueOf(2));

                break;

            case "Electric":
                typeEffectiveness.put("Electric",Double.valueOf(.5));
                typeEffectiveness.put("Flying",Double.valueOf(.5));
                typeEffectiveness.put("Steel",Double.valueOf(.5));
                typeEffectiveness.put("Ground",Double.valueOf(2));

                break;

            case "Fairy":
                typeEffectiveness.put("Dragon",Double.valueOf(0));
                typeEffectiveness.put("Fighting",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Dark",Double.valueOf(.5));
                typeEffectiveness.put("Poison",Double.valueOf(2));
                typeEffectiveness.put("Steel",Double.valueOf(2));

                break;

            case "Fighting":
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Rock",Double.valueOf(.5));
                typeEffectiveness.put("Dark",Double.valueOf(.5));
                typeEffectiveness.put("Flying",Double.valueOf(2));
                typeEffectiveness.put("Psychic",Double.valueOf(2));
                typeEffectiveness.put("Fairy",Double.valueOf(2));

                break;

            case "Fire":
                typeEffectiveness.put("Fire",Double.valueOf(.5));
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Ice",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Steel",Double.valueOf(.5));
                typeEffectiveness.put("Fairy",Double.valueOf(.5));
                typeEffectiveness.put("Water",Double.valueOf(2));
                typeEffectiveness.put("Ground",Double.valueOf(2));
                typeEffectiveness.put("Rock",Double.valueOf(2));

                break;

            case "Flying":
                typeEffectiveness.put("Ground",Double.valueOf(0));
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Fighting",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Electric",Double.valueOf(2));
                typeEffectiveness.put("Ice",Double.valueOf(2));
                typeEffectiveness.put("Rock",Double.valueOf(2));

                break;

            case "Ghost":
                typeEffectiveness.put("Normal",Double.valueOf(0));
                typeEffectiveness.put("Fighting",Double.valueOf(0));
                typeEffectiveness.put("Poison",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Ghost",Double.valueOf(2));
                typeEffectiveness.put("Dark",Double.valueOf(2));

                break;

            case "Grass":
                typeEffectiveness.put("Water",Double.valueOf(.5));
                typeEffectiveness.put("Electric",Double.valueOf(.5));
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Ground",Double.valueOf(.5));
                typeEffectiveness.put("Fire",Double.valueOf(2));
                typeEffectiveness.put("Ice",Double.valueOf(2));
                typeEffectiveness.put("Poison",Double.valueOf(2));
                typeEffectiveness.put("Flying",Double.valueOf(2));
                typeEffectiveness.put("Bug",Double.valueOf(2));

                break;

            case "Ground":
                typeEffectiveness.put("Electic",Double.valueOf(0));
                typeEffectiveness.put("Poison",Double.valueOf(.5));
                typeEffectiveness.put("Rock",Double.valueOf(.5));
                typeEffectiveness.put("Water",Double.valueOf(2));
                typeEffectiveness.put("Grass",Double.valueOf(2));
                typeEffectiveness.put("Ice",Double.valueOf(2));

                break;

            case "Ice":
                typeEffectiveness.put("Ice",Double.valueOf(.5));
                typeEffectiveness.put("Fire",Double.valueOf(2));
                typeEffectiveness.put("Fighting",Double.valueOf(2));
                typeEffectiveness.put("Rock",Double.valueOf(2));
                typeEffectiveness.put("Steel",Double.valueOf(2));

                break;

            case "Normal":
                typeEffectiveness.put("Ghost",Double.valueOf(0));
                typeEffectiveness.put("Fighting",Double.valueOf(2));

                break;

            case "Poison":
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Fighting",Double.valueOf(.5));
                typeEffectiveness.put("Poison",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Fairy",Double.valueOf(.5));
                typeEffectiveness.put("Ground",Double.valueOf(2));
                typeEffectiveness.put("Psychic",Double.valueOf(2));

                break;

            case "Psychic":
                typeEffectiveness.put("Fighting",Double.valueOf(.5));
                typeEffectiveness.put("Psychic",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(2));
                typeEffectiveness.put("Ghost",Double.valueOf(2));
                typeEffectiveness.put("Dark",Double.valueOf(2));

                break;

            case "Rock":
                typeEffectiveness.put("Normal",Double.valueOf(.5));
                typeEffectiveness.put("Fire",Double.valueOf(.5));
                typeEffectiveness.put("Poison",Double.valueOf(.5));
                typeEffectiveness.put("Flying",Double.valueOf(.5));
                typeEffectiveness.put("Water",Double.valueOf(2));
                typeEffectiveness.put("Grass",Double.valueOf(2));
                typeEffectiveness.put("Fighting",Double.valueOf(2));
                typeEffectiveness.put("Ground",Double.valueOf(2));
                typeEffectiveness.put("Steel",Double.valueOf(2));

                break;

            case "Steel":
                typeEffectiveness.put("Poison",Double.valueOf(0));
                typeEffectiveness.put("Normal",Double.valueOf(.5));
                typeEffectiveness.put("Grass",Double.valueOf(.5));
                typeEffectiveness.put("Ice",Double.valueOf(.5));
                typeEffectiveness.put("Flying",Double.valueOf(.5));
                typeEffectiveness.put("Psychic",Double.valueOf(.5));
                typeEffectiveness.put("Bug",Double.valueOf(.5));
                typeEffectiveness.put("Rock",Double.valueOf(.5));
                typeEffectiveness.put("Dragon",Double.valueOf(.5));
                typeEffectiveness.put("Steel",Double.valueOf(.5));
                typeEffectiveness.put("Fairy",Double.valueOf(.5));
                typeEffectiveness.put("Fire",Double.valueOf(2));
                typeEffectiveness.put("Fighting",Double.valueOf(2));
                typeEffectiveness.put("Ground",Double.valueOf(2));

                break;

            case "Water":
                typeEffectiveness.put("Fire",Double.valueOf(.5));
                typeEffectiveness.put("Water",Double.valueOf(.5));
                typeEffectiveness.put("Ice",Double.valueOf(.5));
                typeEffectiveness.put("Steel",Double.valueOf(.5));
                typeEffectiveness.put("Electric",Double.valueOf(2));
                typeEffectiveness.put("Grass",Double.valueOf(2));

                break;
                
            default:
                break;
        }
    }
}
