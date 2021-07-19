package com.triangledev;

public class DarkSorcerer {
    BrawlDamage global = new BrawlDamage();
    public String DarkSorcerer = "DarkSorcerer";
    public int health = 100;
    public String power[] = {"Fire-Blast", "Dark-Wave", "Energy-Blast"};

    public double fireBlast = global.damage;
    public double darkWave = global.damage;
    public double energyBlast = global.damage;

    public DarkSorcerer() {}

    public void DarkSorcererStats()
    {
        System.out.println("Name: " + DarkSorcerer);
        System.out.println("Total Health: " + health);
        System.out.println("Power: " + power[0] + ", " + power[1] + ", " + power[2]);
    }
}
