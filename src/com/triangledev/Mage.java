package com.triangledev;

public class Mage {
    BrawlDamage global = new BrawlDamage();
    public String Mage = "Mage";
    public int health = 100;
    public String power[] = {"Power-Shot", "Staff-Blast", "Black-Magic"};

    public double powerShotDamage = global.damage;
    public double staffBlast = global.damage;
    public double blackMagic = global.damage;


    public Mage() {}

    public void MageStats()
    {
        System.out.println("Name: " + Mage);
        System.out.println("Total Health: " + health);
        System.out.println("Power: " + power[0] + ", " + power[1] + ", " + power[2]);
    }

    public void MageAttacks()
    {

    }
}
