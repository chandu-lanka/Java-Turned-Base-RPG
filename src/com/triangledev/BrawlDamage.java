package com.triangledev;

public class BrawlDamage {
    public double damage = Math.round(Math.random() * 100);

    public void damageCap()
    {
        if (damage >= 30) {
            damage = 30;
        }
    }
}
