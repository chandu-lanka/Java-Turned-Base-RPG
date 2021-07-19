package com.triangledev;

import java.util.Scanner;

public class Globals {
    public String character = "";
    public Scanner scanner = new Scanner(System.in);
    public Mage mage = new Mage();
    public Warrior warrior = new Warrior();
    public DarkSorcerer darkSorcerer = new DarkSorcerer();
    public String characterList[] = {"Warrior", "Mage", "DarkSorcerer"};
    public String ConfirmList[] = {"Yes", "No"};

    public Globals() {}
}
