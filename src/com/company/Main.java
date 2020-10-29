package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setName("Bloods");
        boss.setWeapon(weapon);
        weapon.setWeaponName("Samexade");
        weapon.setWeaponType("akatsuki");
        System.out.println("Name: " + boss.getName() + " Health:" + boss.getHealth() + " Damage: " + boss.getDamage()  + " Weapon name: " + weapon.getWeaponName() + " Weapon type: " + weapon.getWeaponType() );
    }
}
