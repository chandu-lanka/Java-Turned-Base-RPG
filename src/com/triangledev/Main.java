package com.triangledev;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Globals global = new Globals();
        Mage mage = global.mage;
        Warrior warrior = global.warrior;
        DarkSorcerer darkSorcerer = global.darkSorcerer;
        Scanner scanner = global.scanner;
        HelpCommand helpCommand = new HelpCommand();
        String character = global.character;

        String characterList[] = global.characterList;

        // game logic starts here
        System.out.println("Welcome To Console Brawl");
        System.out.println("Characters: Warrior, Mage, and DarkSorcerer");

        while (true) {
            System.out.print("Choose Your Character: ");
            character = scanner.next();
            if (character.equals("Quit"))
            {
                break;
            }
            else if (!character.equals(characterList[0]) && !character.equals(characterList[1]) && !character.equals(characterList[2]))
            {
                System.out.println("Sorry not an option");
            }
            else
            {
                switch (character) {
                    case "Mage":
                        mage.MageStats();
                        break;
                    case "Warrior":
                        warrior.WarriorStats();
                        break;
                    case "DarkSorcerer":
                        darkSorcerer.DarkSorcererStats();
                        break;
                }
                System.out.println("Use The Command \"Help\" for help");
                while (true)
                {
                    System.out.print(">> ");
                    String commandLine = scanner.next();
                    // If Command == "Help"
                    if (commandLine.equals("Help")) {
                        helpCommand.Help();
                    }
                    // If Command == "Stats"
                    else if (commandLine.equals("Stats"))
                    {
                        if (character.equals("Mage"))
                        {
                            System.out.println(mage.power[0]);

                            System.out.println(mage.power[1]);

                            System.out.println(mage.power[2]);
                        }

                        else if (character.equals("Warrior"))
                        {
                            System.out.println(warrior.power[0]);

                            System.out.println(warrior.power[1]);

                            System.out.println(warrior.power[2]);
                        }

                        else if (character.equals("DarkSorcerer"))
                        {
                            System.out.println(darkSorcerer.power[0]);

                            System.out.println(darkSorcerer.power[1]);

                            System.out.println(darkSorcerer.power[2]);
                        }
                    }
                    // If Command == "Brawl"
                    else if (commandLine.equals("Brawl"))
                    {
                        Brawl();
                    }
                    // quit to character selection
                    else if (commandLine.equals("Quit"))
                    {
                        break;
                    }
                }
            }
        }
    }

    public static void Brawl()
    {
        Globals global = new Globals();
        Mage mage = global.mage;
        Warrior warrior = global.warrior;
        DarkSorcerer darkSorcerer = global.darkSorcerer;
        String character = global.character;
        Scanner scanner = global.scanner;
        BrawlDamage damageCap = new BrawlDamage();
        Dragon dragon = new Dragon();

        System.out.println("You are fighting " + dragon.name);
        while (true)
        {
            System.out.print(">> ");
            String battle = scanner.next();

            if (character.equals("Mage"))
            {
                if (battle.equals("Power-Shot"))
                {
                    dragon.health -= mage.powerShotDamage;
                    System.out.println("You hit " + dragon.name + " with " + mage.power[0] + " and dealt " + mage.powerShotDamage + " damage");
                    mage.health -= dragon.flameThrowerAttack;
                    System.out.println("You were hit by " + dragon.name + " with " + "Flame Thrower" + " and you were dealt with " + dragon.flameThrowerAttack + " current health " + mage.health);
                }
            }
        }
    }
}