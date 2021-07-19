package com.triangledev;

public class Warrior {
    BrawlDamage global = new BrawlDamage();
    public String Warrior = "Warrior";
    public int health = 100;
    public String power[] = {"Sword-Slash", "Slam", "Arrow-Storm"};

    public double swordSlash = global.damage;
    public double Slam = global.damage;
    public double arrowStorm = global.damage;

    public Warrior() {}

    public void WarriorStats()
    {
        System.out.println("Name: " + Warrior);
        System.out.println("Total Health: " + health);
        System.out.println("Power: " + power[0] + ", " + power[1] + ", " + power[2]);
    }
}
